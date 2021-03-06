<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html lang="zxx">

<head>
	<title>forget password</title>
	<!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords" content="Triple Forms Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>

	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />

	<link href="css/font-awesome.min.css" rel="stylesheet">

	<link href="//fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext"
	 rel="stylesheet">

</head>

<body>
	<div class="main-bg">
		<!-- title -->
		<h1></h1>
		<!-- //title -->
		<div class="sub-otp">
			<div class="image-style">

			</div>
			<!-- vertical tabs -->
			<div class="forget-tab">
				
				<article>
						<form id="login" class="input-group" method="post" action="check_otp">
							<h3 class="legend">Reset password</h3>
						
							<div class="input">
								<span class="fa fa-key" aria-hidden="true"></span>
								<input name="otp" type="tel" placeholder="Enter Your Otp"  required />
							</div>
							<button type="submit" class="btn submit">Reset</button>
							<a href="#" class="bottom-text-w3ls"> ${msg}</a>  
						</form>
					</article>
			</div>
			<!-- //vertical tabs -->
			<div class="clear"></div>
		</div>
		<!-- copyright -->
		<div class="copyright">
			<h2>
				<a href="http://w3layouts.com" target="_blank"></a>
			</h2>
		</div>
		<!-- //copyright -->
	</div>

</body>

</html>
