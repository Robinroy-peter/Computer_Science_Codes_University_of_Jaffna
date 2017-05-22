<html>
	<body>
		<?php
		echo "Switch Conditions Test<br>";
			$d=date("D");
			switch($d)
			{
				case "Mon":
					echo "Today is Monday<br>";
					break;
				case "Tue":
					echo "Today is Tuesday<br>";
					break;
				case "Wed":
					echo "Today is Wednesday<br>";
					break;
				case "Thu":
					echo "Today is Thuersday<br>";
					break;
				case "Fri":
					echo "Today is Friday<br>";
					break;
				case "Sat":
					echo "Today is Saturday<br>";
					break;
				case "Sun":
					echo "Today is Sunday<br>";
					break;
				default :
					echo "Wrong Entry<br>";
			}
		?>
	</body>
</html> 