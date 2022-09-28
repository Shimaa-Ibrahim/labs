<?php
 include 'config.php';
error_reporting(E_ALL); 
if(!function_exists('curl_init')){
throw new Exception("PHP Curl extension is not present");
}else{
    echo "curl exists";
}

if (!function_exists('json_decode')) {
throw new Exception('PHP JSON extension is not present.');

}else{
    echo "json exists";
}

?>
<html>
    <head>
        <title>Login Facebook</title>
    </head>
    <body>
    <h1>WHAT</h1>
        <a href="https://www.facebook.com/v3.2/dialog/oauth?client_id=<?php echo FB_APP_ID ?>&redirect_uri=<?php echo FB_REDIRECT_URL ?>&state=localhost">Login With Facebook</a>
    </body>
</html>