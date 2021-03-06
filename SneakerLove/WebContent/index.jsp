<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sneaker Shop</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/main-header-style.css" rel="stylesheet">
<style>
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}
</style>
</head>
<body>
	<div class="container">
		<div class="main-header">

			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<!-- Titel und Schalter werden f�r eine bessere mobile Ansicht zusammengefasst -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
							<span class="sr-only">Navigation ein-/ausblenden</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
					</div>

					<!-- Alle Navigationslinks, Formulare und anderer Inhalt werden hier zusammengefasst und k�nnen dann ein- und ausgeblendet werden -->
					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li><a href="#">Impressum</a></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="Profil.jsp">Profil</a></li>
							<li><a href="Login.jsp">Login</a></li>

						</ul>
					</div>
					<!-- /.navbar-collapse -->
				</div>
				<!-- /.container-fluid -->
			</nav>
		</div>
		<div class="jumbotron">
			<h1>Sneaker Shop!</h1>
			<p>Hier finden Sie die neuesten Sneaker und mehr!</p>
			<p>
				<a class="btn btn-primary btn-lg" href="#" role="button">Mehr
					erfahren</a>
			</p>
		</div>


		<nav class="navbar fixed-top navbar-default">
			<div class="container-fluid">
				<!-- Titel und Schalter werden f�r eine bessere mobile Ansicht zusammengefasst -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Navigation ein-/ausblenden</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Sneaker Shop</a>
				</div>

				<!-- Alle Navigationslinks, Formulare und anderer Inhalt werden hier zusammengefasst und k�nnen dann ein- und ausgeblendet werden -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#">Home <span class="sr-only">(aktuell)</span></a></li>
						<li><a href="#">Shop</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Men� <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Aktion</a></li>
								<li><a href="#">Andere Aktion</a></li>
								<li><a href="#">Irgendwas anderes</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">Abgetrennter Link</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">Noch ein abgetrennter Link</a></li>
							</ul></li>
					</ul>
					<form class="navbar-form navbar-right" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Suchen">
						</div>
						<button type="submit" class="btn btn-default">Los</button>
					</form>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
	</div>
	<!-- ${KUNDE.vorname} -->
</body>
</html>