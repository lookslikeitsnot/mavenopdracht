<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<!doctype html>
<html>
<head>
<title></title>
</head>
<body>
	<h1>RESULTAAT</h1>
	${adres.straat} ${adres.huisnummer}, bus ${adres.busnummer}
	<br /> ${adres.postcode} ${adres.gemeente}
</body>
</html>