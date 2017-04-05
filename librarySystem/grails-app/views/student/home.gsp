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

		<g:link controller="bookReview" action="create"> Book Review</g:link>
	</button>
</div>

    <div class="second">
	<h3>Course info</h3>

<p>this is the Course</p>

	<button type="button" class="btn btn-success">

		<g:link controller="bookReview" action="index"> Book Review</g:link>
	</button>
</div>

    <div class="first">
	<h3>Student info</h3>

<p>this is the student</p>

	<button type="button" class="btn btn-success">

		<g:link controller="book" action="index"> Books in library</g:link>
	</button>
</div>
