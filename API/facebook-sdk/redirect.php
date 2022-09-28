<?php
if(!session_id()) {
    session_start();
}

error_reporting(E_ALL); 

require_once __DIR__ . '/vendor/autoload.php';
require_once 'config.php';
 
$fb = new Facebook\Facebook([
    'app_id' => FB_APP_ID,
    'app_secret' => FB_APP_SECRET,
    'default_graph_version' => 'v2.10',
    ]);

$helper = $fb->getRedirectLoginHelper();

try {
      $accessToken = $helper->getAccessToken();
      $response = $fb->get('/me/posts?limit=12', (string) $accessToken);
      $posts = $response->getGraphEdge()->asArray();
      
      //get 12 posts
      // echo '<pre>';
      //   print_r($posts);
      // echo '</pre>';

      $posts_reactions = [];
      foreach ($posts as $post) {
        $id = $post['id'];
        $response = $fb->get("/$id?fields=reactions.summary(total_count)", (string) $accessToken);
        array_push($posts_reactions,$response->getDecodedBody());
      }
      
      // sort array of posts acoording to number of reactions
      function cmp($a, $b){
        if ($a['reactions']['summary']['total_count'] == $b['reactions']['summary']['total_count']) {
          return 0;
      }
      return ($a['reactions']['summary']['total_count'] > $b['reactions']['summary']['total_count']) ? -1 : 1;
      }

    // Sort and print the resulting array
      usort($posts_reactions,'cmp');
      echo "*****************************sorted posts ************************************";
      echo '<pre>';
        print_r($posts_reactions);
      echo '</pre>';

    $highest_id = $posts_reactions[0]['id'];
    $highest_post = $fb->get("/$highest_id", (string) $accessToken);

    echo "*****************************highest post************************************";
    echo "<br>The post with higher number of reactions is: ";
    echo '<pre>';
    print_r($highest_post->getDecodedBody());
  echo '</pre>';


} catch(Facebook\Exceptions\FacebookResponseException $e) {
    echo 'Graph returned an error: ' . $e->getMessage();
  exit;
} catch(Facebook\Exceptions\FacebookSDKException $e) {
  echo 'Facebook SDK returned an error: ' . $e->getMessage();
  exit;
}


$_SESSION['fb_access_token'] = (string) $accessToken;
