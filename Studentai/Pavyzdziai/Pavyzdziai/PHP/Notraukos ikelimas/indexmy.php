<?php

$conn = mysqli_connect('mysql.hostinger.lt', 'u181116428_proj', 'project', 'u181116428_proj'); // prisijungimas prie db 
	
if(isset($_POST['retrive']))
{ 
    header("location:search.php");

}


if(isset($_POST['submit']))
{
if(isset($_FILES['image'])) {
        $name=$_POST['image_name'];
      
        $fp=addslashes(file_get_contents($_FILES['image']['tmp_name'])); //Darbas su failais
        }
                // Musu sql
                $sql = "INSERT INTO images (`name`,`image`)VALUES('{$name}','{$fp}');";
				
				if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

}  
?>