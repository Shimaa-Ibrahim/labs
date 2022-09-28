<?php
    if(!session_id()) {
        session_start();
    }
    require_once __DIR__ . '/vendor/autoload.php';
    require __DIR__. '/config.php';

     
    $fb = new Facebook\Facebook([
        'app_id' => FB_APP_ID,
        'app_secret' => FB_APP_SECRET,
        'default_graph_version' => 'v2.10',
        ]);

    # login.php
    $helper = $fb->getRedirectLoginHelper();
    $permissions = ['email', 'user_likes', 'user_posts']; // optional
    $loginUrl = $helper->getLoginUrl(FB_REDIRECT_URL, $permissions);
    echo '<a href="' . $loginUrl . '">Log in with Facebook!</a>';

?>