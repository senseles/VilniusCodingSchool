<?php

if(!empty($_POST)){
	
	$emailTo="daniel@vilniusCoding.com";
	$emailSubject="test";
	     
	$FName=$_POST["FName"];
	$LName=$_POST["LName"];
	$Email=$_POST["Email"];
	$text=$_POST["message"];
	
		$body="Vardas/Pavarde: $FName / $LName <br><br> Zinute: $text <br> From: $Email";
	
		$headers = "From: <$Email>" . "\r\n";
		
		
	mail($emailTo,$emailSubject,$body,$header);
	
} 
?>