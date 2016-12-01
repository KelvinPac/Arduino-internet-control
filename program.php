<?php
    $title = $_POST["state"]; //You have to get the form data
  
    $file = fopen('state.txt', 'w+'); //Open your .txt file
    ftruncate($file, 0); //Clear the file to 0bit
    $content = $title. PHP_EOL;
    fwrite($file , $content); //Now lets write it in there
    fclose($file ); //Finally close our .txt
    die(header("Location: ".$_SERVER["HTTP_REFERER"]));
?>