<?php 
if(isset($_GET['submit'])){
	$to = $_GET['to_send'];
    $from = $_GET['email']; // this is the sender's Email address
    $first_name = $_GET['first_name'];
    $last_name = $_GET['last_name'];
	
    $subject = "Form submission";
    $message = $first_name . " " . $last_name . " Kazkoks norimas tekstas:" . "\n\n" . $_GET['message'];

    $headers = "From:" . $from;
    mail($to,$subject,$message,$headers);
    echo "Mail'as issiustas. Aciu Jums " . $first_name . "";
    }
?>

<!DOCTYPE html>
<head>
<title>Form submission</title>
</head>
<body>

<form action="" method="get">
Gavejas: <input type="text" name="to_send"><br>
Vardas: <input type="text" name="first_name"><br>
Pavarde: <input type="text" name="last_name"><br>
Siuntejas: <input type="text" name="email"><br>
Zinute:<br><textarea rows="5" name="message" cols="30"></textarea><br>
<input type="submit" name="submit" value="Submit">
</form>

</body>
</html> 