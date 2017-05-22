<html>
	<body>
		<?php
		echo "IF Conditions Test<br>";
			$d=date("D");
			if($d=="Mon")
				echo "Have a nice weekend<br>";
			elseif($d=="Sun")
				echo "Have a nice Sunday<br>";
			else
				echo "Have a nice day<br>";
		?>
	</body>
</html> 