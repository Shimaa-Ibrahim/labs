<?php
require_once __DIR__.'/vendor/autoload.php';

session_start();

$client = new Google_Client();
$client->setAuthConfig('client_secrets.json');
$client->addScope(Google_Service_Drive::DRIVE_METADATA_READONLY);

if (isset($_SESSION['access_token']) && $_SESSION['access_token']) {
  $client->setAccessToken($_SESSION['access_token']);
  $drive = new Google_Service_Drive($client);
  $files = $drive->files->listFiles(array())->getItems();
  echo "files:";
  echo json_encode($files);
} else {
  $redirect_uri = 'http://' . $_SERVER['HTTP_HOST'] . '/redirect.php';
  header('Location: ' . filter_var($redirect_uri, FILTER_SANITIZE_URL));
}