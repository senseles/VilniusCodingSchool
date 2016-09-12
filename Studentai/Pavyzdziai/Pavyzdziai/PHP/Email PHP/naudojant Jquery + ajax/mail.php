<?php

if(!empty($_POST)){
	
 $data['success'] = true;
    //your email adress 
    $emailTo = "daniel@vilniusCoding.com"; 
    //from email adress
    $emailTo = "daniel@vilniusCoding.com"; 
    //email subject
    $emailSubject = "VSC";
    $name = $_POST["name"];
    $email = $_POST["email"];
    $comment = $_POST["comment"];
    $tel = $_POST["tel"];
	
        $message = "Vardas/Pavadinimas: $name<br>
			  E.pastas: $email<br>
			  Telefonas: $tel<br>
			  Zinute: $comment";
			  
			  
        $headers = "From: <$emailFrom>" . "\r\n";
		
        mail($emailTo, $emailSubject, $message, $headers);
    
} 
?>