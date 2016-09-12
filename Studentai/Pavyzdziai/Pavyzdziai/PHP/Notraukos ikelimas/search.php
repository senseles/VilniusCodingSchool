<!DOCTYPE html>
<?php
		
$db = mysqli_connect('mysql.hostinger.lt', 'u181116428_proj', 'project', 'u181116428_proj');
        $msg="";
        $sql="select * from images";
		
		 $result = mysqli_query($db, $sql);

    if ($result->num_rows > 0) {
        // output data of each row
        while ($row = $result->fetch_assoc()) {

				$id=$row['id'];
                    $name=$row['name'];
                    $image=$row['image'];

                  $msg.= '<a href="search.php?id='.$id.'"><img src="data:image/jpeg;base64,'.base64_encode($row['image']). ' " />   </a>';

        }
    }	
        else
            $msg.="Query failed";
?>
<div>
<?php
echo $msg;
?>
</div>