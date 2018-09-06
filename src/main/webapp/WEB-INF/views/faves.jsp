<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add to Favorites</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/lux/bootstrap.min.css">
</head>
<body>
<nav id = "navebar" class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Movie Search Engine</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor02" aria-controls="navbarColor02" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor02">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/favorites">Favorites</a>
      </li>
    </ul>
    <form action ="/results" class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" name = "keyword" type="text" placeholder="Search">
      <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
<div class="jumbotron">
<h1>Your Favorites</h1>
<table class="table table-hover" border="1">
		<!-- ${personinfo} is a list  coming from the PersonController-->
		<!-- this for each loop works just like an enhanced for loop in java -->
	<tr class ="table-success">
		<th scope="row">Title</th>
		<th scope="row">Release Date</th>
		<th scope="row">Overview</th>
		<th scope="row">Click to Remove from Favorites</th>
		
		</tr>
		<c:forEach var="b" items="${movies}">
			<tr class="table-info">
				<td>${b.title}</td>
				<td>${b.releasedate}</td>
				<td>${b.overview}</td>
				
				<td><a href="${b.id}/delete"><button class="btn btn-outline-info">Remove</button></a></td>
			</tr>
		</c:forEach>
	</table>

</div>
<script>
window.onscroll = function() {myFunction()};

var navbar = document.getElementById("navbar");
var sticky = navbar.offsetTop;

function myFunction() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky")
  } else {
    navbar.classList.remove("sticky");
  }
}
</script>
</body>
</html>