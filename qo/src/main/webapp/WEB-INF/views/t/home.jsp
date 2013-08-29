<!DOCTYPE HTML>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.3.1/jquery.mobile-1.3.1.min.css" />
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="http://code.jquery.com/mobile/1.3.1/jquery.mobile-1.3.1.min.js"></script>
	<title>Your Website</title>
</head>

<body>
<P>${controllerMessage}</P>
<P>${controllerMessage1}</P>
<P>${controllerMessage2}</P>
<form>

     <label for="text-1">Text input:</label>
     <input name="text-1" id="text-1" value="" type="text">
     <label for="text-3">Text input: data-clear-btn="true"</label>
     <input data-clear-btn="true" name="text-3" id="text-3" value="" type="text">
</form>
<p> View: <a href="?site_preference=normal">Normal</a> | <a href="?site_preference=mobile">Mobile</a></p>
	</body>
</html>