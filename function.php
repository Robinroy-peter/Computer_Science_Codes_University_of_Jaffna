<html>
	<Style>
	table, th, td {
		border: 2px solid blue;
		color:red;
		text-align : center;
	}
	body{
			background-color:lightyellow;
	}
 h2{
	 text-align : center;
	 color:red
 }	
  h1{
	 text-align : center;
	 color:red
 }
	</Style>
	<?php
	$Names=array(array("Kamala",90,65,80),
			array("John",72,50,86),
			array("Vimal",56,50,45),
			array("Mala",80,45,30),
			);
		
		function total1($array,$rownum){
			$sub = 4;
			$total=0;
			for($i=1;$i<$sub;$i++){
				$total += $array[$rownum][$i];
			}
			return $total;
		}
		
		function avg($array,$rownum){
			$sub = 4;
			$avg=0;
			for($i=1;$i<$sub;$i++){
				$avg += $array[$rownum][$i];
			}
			$avg/=3;
			return $avg;
		}
		
		// echo gradetest(avg($Names,$i)
		echo "<h2>Grade Result</h2>";
		function gradetest($avg){
		$grade ="";
			if($avg>55)
				$grade ="Pass";
			elseif($avg<55)
				$grade ="Fail";
			return $grade;
		}
		?>
	<body>
	<h1>Student Marks Data Base</h1>
	 <table style="width:100%">
	 
	  <tr>
		<th>Name</th>
		<th>Maths</th>
		<th>Chemistry</th>
		<th>Physics</th>
	  </tr>
	  <?php
	  for($row=0;$row<4;$row++){
		  echo "<tr>";
			  for($col=0;$col<4;$col++){
				echo "<td>".$Names[$row][$col]."</td>";
			  }
		 echo "</tr>";
	  }?>
	</table> 
	<br><br>
	<table style="width:100%">
	  <tr>
		<th>Name</th>
		<th>Total</th>
		<th>Avarage</th>
		<th>Grade</th>
	  </tr>
	 <?php
	  for($row=0;$row<4;$row++){
		  echo "<tr>";
		  echo "<td>".$Names[$row][0]."</td>";
		  echo "<td>".total1($Names,$row)."</td>";
		  echo "<td>".round(avg($Names,$row))."</td>";
		  echo "<td>".gradetest(avg($Names,$row))."</td>";	  
		  echo "</tr>";
	  }?>
	</table>
	</body>
</html> 