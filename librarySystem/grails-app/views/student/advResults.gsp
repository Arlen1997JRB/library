<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title> Advanced Search </title>

	<asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
</head>
<body>
	
	<div class="row">

		<h1> Advanced Search</h1>
		<h3> Advanced Results</h3>
	<p> searched 
	for students matching <em>${term}</em>.
	Found <strong>${books.size()}</strong> books.
	</p>

	<ul>

	<g:each var="book" in="${books}">

		<li><g:link controller="book" action="show"
	id="${book.id}">${book.title}</g:link></li>

	</g:each>

	</ul>

	<g:link action='advSearch'> Search Again</g:link>
	</div>
</body>
</html
	
