<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to University of SHU</title>
    <asset:stylesheet src="home.css"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>  

    <div id="content" role="main">

    <div class="row">

    <div class="first">
	<h3>Book info</h3>

<p>this is the book</p>

	<button type="button" class="btn btn-success">

		<g:link controller="book" action="create"> Book</g:link>
	</button>
</div>

    <div class="second">
	<h3>Course info</h3>

<p>this is the Course</p>

	<button type="button" class="btn btn-success">

		<g:link controller="course" action="create"> Course</g:link>
	</button>
</div>

    <div class="first">
	<h3>Student info</h3>

<p>this is the student</p>

	<button type="button" class="btn btn-success">

		<g:link controller="student" action="create"> Student</g:link>
	</button>
</div>

    <div class="second">
	<h3> library info</h3>

<p>this is the library</p>

	<button type="button" class="btn btn-success">

		<g:link controller="library" action="create"> Library</g:link>
	</button>
</div>

    <div class="first">
	<h3>Librarian info</h3>

<p>this is the librarian</p>

	<button type="button" class="btn btn-success">

		<g:link controller="librarian" action="create"> Librarian</g:link>
	</button>
</div>

</div>
</div>
</body>
</html>



