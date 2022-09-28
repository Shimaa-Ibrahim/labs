<?php

if (!session_id()) {
    session_start();    
}
require_once __DIR__ . '/vendor/autoload.php';
require __DIR__. '/config.php';
error_reporting(E_ALL); 

?>

<html>
    <head>
        <title></title>
    </head>
    <body>
<a href="https://www.linkedin.com/oauth/v2/authorization?response_type=code&client_id=<?=CLIENT_ID?>&redirect_uri=<?= REDIRECT_URL?>&scope=r_emailaddress r_liteprofile">Login with Linkedin</a>
    </body>
</html>