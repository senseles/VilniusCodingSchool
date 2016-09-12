
<?php 
if(isset($_POST['submit'])){
	$to = $_POST['to_send'];
	echo $to;

    $from = $_POST['email']; // this is the sender's Email address
	
	if(empty($from)){
	 echo 'dsjfhs';
	}
	else{
		echo 'kitas text';
	}
    $first_name = $_POST['first_name'];
    $last_name = $_POST['last_name'];
	
    $subject = "Form submission";
    $message = $first_name . " " . $last_name . " Kazkoks norimas tekstas:" . "\n\n" . $_POST['message'];

    $headers = "From:" . $from;
    mail($to,$subject,$message,$headers);
    echo "Mail'as issiustas. Aciu Jums " . $first_name . "";
    }
?>
<!DOCTYPE html>
<html> 
<head>
<title>Form Submited - Email Send</title>
</head>
<body>

<form action="" method="post">
Gavejas: <input type="number" name="to_send"><br>
Vardas: <input type="text" name="first_name"><br>
Pavarde: <input type="text" name="last_name"><br>
Siuntejas: <input type="text" name="email"><br>
Zinute:<br><textarea rows="5" name="message" cols="30"></textarea><br>
<input type="submit" name="submit" value="Submit">
</form>

</body>
</html> 
