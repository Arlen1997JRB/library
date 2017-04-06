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
	
	<formset>

		<legend> advanced search for students</legend>

	<table>

	<g:form action="advResults">

	<tr>
	
		<td> Name</td>
		<td><g:textField name="name"/></td>

	</tr>

	<tr>

		<td> Username </td>
		<td><g:textField name="userName"/></td>

	</tr>

	<tr>

		<td> Student ID</td>
		<td><g:textField name="studentId"/></td>

	</tr>

	<tr>

		<td> Query Type:</td>
		<td><g:radioGroup name="queryType" labels="['and','or', 'not']"

	values="['and','or','not']" value="and">
	
	${it.radio}${it.label}

		</g:radioGroup>

		</td>
	</tr>

	<tr>
		</td>
		<td>

		<g:submitButton name="search" value="search"/></td>

	</tr>

	</g:form>

	</table>
	</formset>
	</div>
</body>
</html>


