<?php
		
// sukurimas connection
$conn = new mysqli('mysql.hostinger.lt', 'u181116428_proj ', 'project', 'u181116428_proj '); // prisijungimas prie db 
// Connection patikrinimas
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 
// aprasomas insertas == phpMysql
$sql = "INSERT INTO MyGuests (firstname, lastname, email)
VALUES ('John', 'Doe', 'john@example.com')";
// $conn->query($sql) == insert, update, modify komandoms
// mysqli_query($conn, $sql)  == select, delete
if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>