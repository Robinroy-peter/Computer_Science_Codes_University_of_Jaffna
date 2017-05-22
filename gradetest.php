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
	<body>
	<h1>Student Data Base</h1>
	 <table style="width:100%">
	  <tr>
		<th>Name</th>
		<th>Maths</th>
		<th>Chemistry</th>
		<th>Physics</th>
	  </tr>
	  <tr>
		<td>Kamala</td>
		<td>90</td>
		<td>65</td>
		<td>80</td>
	  </tr>
	  <tr>
		<td>john</td>
		<td>72</td>
		<td>50</td>
		<td>86</td>
	  </tr>
	  <tr>
		<td>vimal</td>
		<td>56</td>
		<td>50</td>
		<td>45</td>
	  </tr>
	  <tr>
		<td>mala</td>
		<td>80</td>
		<td>45</td>
		<td>30</td>
	  </tr>
	</table> 
	<br><br>
	<?php
		echo "<h2>Grade Result</h2>";
		$grade ="";
		$Avg = round((90+65+80)/3);
			if($Avg>75)
				$grade ="Verygood";
			elseif($Avg>65)
				$grade ="Good";
			elseif($Avg>55)
				$grade ="Pass";
			elseif($Avg<55)
				$grade ="Fail";
		$grade1 ="";
		$Avg1 = round((72+50+86)/3);
			if($Avg1>75)
				$grade1 ="Verygood";
			elseif($Avg1>65)
				$grade1 ="Good";
			elseif($Avg1>55)
				$grade1 ="Pass";
			elseif($Avg1<55)
				$grade1 ="Fail";
		$grade2 ="";
		$Avg2 = round((56+50+45)/3);
			if($Avg2>75)
				$grade2 ="Verygood";
			elseif($Avg2>65)
				$grade2 ="Good";
			elseif($Avg2>55)
				$grade2 ="Pass";
			elseif($Avg2<55)
				$grade2 ="Fail";
		$grade3 ="";
		$Avg3 = round((80+45+30)/3);
			if($Avg3>75)
				$grade3 ="Verygood";
			elseif($Avg3>65)
				$grade3 ="Good";
			elseif($Avg3>55)
				$grade3 ="Pass";
			elseif($Avg3<55)
				$grade3 ="Fail";
		?>
		 <table style="width:100%">
	  <tr>
		<th>Name</th>
		<th>Avarage</th>
		<th>Grade</th>
	  </tr>
	  <tr>
		<td>Kamala</td>
		<td><?php echo $Avg ?></td>
		<td><?php echo $grade?></td>
	  </tr>
	  <tr>
		<td>john</td>
		<td><?php echo $Avg1 ?></td>
		<td><?php echo $grade1?></td>
	  </tr>
	  <tr>
		<td>vimal</td>
		<td><?php echo $Avg2 ?></td>
		<td><?php echo $grade2 ?></td>
	  </tr>
	  <tr>
		<td>mala</td>
		<td><?php echo $Avg3 ?></td>
		<td><?php echo $grade3 ?></td>
	  </tr>
	</table>
	</body>
</html> 