<?php

    if (!session_id()) {
        session_start();    
    }

    if (isset($_GET['code'])) {    
        $code = $_GET['code'];
    }

    require_once __DIR__ . '/vendor/autoload.php';
    require __DIR__. '/config.php';
    error_reporting(E_ALL); 

    $client = new \GuzzleHttp\Client();
    $response = $client->post('https://api.linkedin.com/oauth/v2/accessToken',
    [
        'form_params' => [
            'grant_type' => 'authorization_code',
            'code'=> $code,
            'redirect_uri' => REDIRECT_URL,
            'client_id' => CLIENT_ID,
            'client_secret' => CLIENT_SECRET
            ]
        
    ]);
    echo $body = $response->getBody();
    $token = json_decode($body);
    $_SESSION["access_token"] = $token->access_token;
    $url = 'https://api.linkedin.com/v2/me';

    echo '<br><br>***************************************<br><br>';
    $user_profile = $client->get($url,
    [
        'query' => ['oauth2_access_token'=> $token->access_token]
    ]);

    $body = $user_profile->getBody();
    $profile = json_decode($body);
    echo json_encode($profile, JSON_PRETTY_PRINT);



?>
