<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Home Page</title>
	<style type="text/css"><%@include file="/jsp/resources/css/font-awesome.css"%></style>
	<style type="text/css"><%@include file="/jsp/resources/css/bootstrap.min.css"%></style>
	<style type="text/css"><%@include file="/jsp/resources/css/style.css"%></style>


</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light bg-transparent" id="gtco-main-nav">
	<div class="container"><a href="#" class="navbar-brand">LZW Compression</a>

		<div id="my-nav" class="collapse navbar-collapse">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="#">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="#services">Services</a></li>
				<li class="nav-item"><a class="nav-link" href="#about">About</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<a href="login" class="btn btn-outline-dark my-2 my-sm-0 mr-3 text-uppercase">login</a>
				<a href="register" class="btn btn-info my-2 my-sm-0 text-uppercase">sign
				up</a>
			</form>
		</div>
	</div>
</nav>
<div class="container-fluid gtco-banner-area">
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h1> We promise to bring
					the best <span>Compress</span> for
					your File. </h1>
				<p>Lempel?Ziv?Welch(LZW) is a universal lossless data compression algorithm created by Abraham Lempel, Jacob Ziv, and Terry Welch. It is the one of the most popular algorithm to compress files.</p>
				<a href="upload">Let's Try<i class="fa fa-angle-right" aria-hidden="true"></i></a></div>
			<div class="col-md-6">
				<div class="card"><img class="card-img-top img-fluid" src="images/banner-img.png"></div>
			</div>
		</div>
	</div>
</div>
<div class="container-fluid gtco-feature" id="services">
	<div class="container">
		<div class="row">
			<div class="col-md-7">
				<div class="cover">
					<div class="card">
						<svg class="back-bg" width="100%" viewBox="0 0 900 700" style="position:absolute; z-index: -1">
							<defs>
								<linearGradient id="PSgrad_01" x1="64.279%" x2="0%" y1="76.604%" y2="0%">
									<stop offset="0%" stop-color="rgb(1,230,248)" stop-opacity="1"></stop>
									<stop offset="100%" stop-color="rgb(29,62,222)" stop-opacity="1"></stop>
								</linearGradient>
							</defs>
							<path fill-rule="evenodd" opacity="1" fill="url(#PSgrad_01)" d="M616.656,2.494 L89.351,98.948 C19.867,111.658 -16.508,176.639 7.408,240.130 L122.755,546.348 C141.761,596.806 203.597,623.407 259.843,609.597 L697.535,502.126 C748.221,489.680 783.967,441.432 777.751,392.742 L739.837,95.775 C732.096,35.145 677.715,-8.675 616.656,2.494 Z"></path>
						</svg>
						<!-- *************-->

						<svg width="100%" viewBox="0 0 700 500">
							<clipPath id="clip-path">
								<path d="M89.479,0.180 L512.635,25.932 C568.395,29.326 603.115,76.927 590.357,129.078 L528.827,380.603 C518.688,422.048 472.661,448.814 427.190,443.300 L73.350,400.391 C32.374,395.422 -0.267,360.907 -0.002,322.064 L1.609,85.154 C1.938,36.786 40.481,-2.801 89.479,0.180 Z"></path>
							</clipPath>
							<!-- xlink:href for modern browsers, src for IE8- -->
							<image clip-path="url(#clip-path)" xlink:href="images/word-map.png" width="100%" height="465" class="svg__image"></image>
						</svg>
					</div>
				</div>
			</div>
			<div class="col-md-5">
				<h2>Our compression system use our Server to not tired your computer</h2>
				<p> Server-side scripting prevents increasing of the load as it does not require plugins or browser scripting technology (such as Javascript). Overloading leads to problems like slow loading, high CPU usage, and even freezing.</p>
				<p>
					<small>It is used to create pages dynamically on the fly. Based on the user interaction, new pages can instantly be created.
					</small>
				</p>
				<a href="register">Create An Account<i class="fa fa-angle-right" aria-hidden="true"></i></a></div>
		</div>
	</div>
</div>
<div class="container-fluid gtco-features" id="about">
	<div class="container">
		<div class="row">
			<div class="col-lg-4">
				<h2> Explore The Services<br>
					We Offer For You </h2>
				<a href="register">Create an Account<i class="fa fa-angle-right" aria-hidden="true"></i></a></div>
			<div class="col-lg-8">
				<svg id="bg-services" width="100%" viewBox="0 0 1000 800">
					<defs>
						<linearGradient id="PSgrad_02" x1="64.279%" x2="0%" y1="76.604%" y2="0%">
							<stop offset="0%" stop-color="rgb(1,230,248)" stop-opacity="1"></stop>
							<stop offset="100%" stop-color="rgb(29,62,222)" stop-opacity="1"></stop>
						</linearGradient>
					</defs>
					<path fill-rule="evenodd" opacity="0.102" fill="url(#PSgrad_02)" d="M801.878,3.146 L116.381,128.537 C26.052,145.060 -21.235,229.535 9.856,312.073 L159.806,710.157 C184.515,775.753 264.901,810.334 338.020,792.380 L907.021,652.668 C972.912,636.489 1019.383,573.766 1011.301,510.470 L962.013,124.412 C951.950,45.594 881.254,-11.373 801.878,3.146 Z"></path>
				</svg>
				<div class="row">
					<div class="col">
						<div class="card text-center">
							<div class="oval"><img class="card-img-top" src="images/web-design.png" alt=""></div>
							<div class="card-body">
								<h3 class="card-title">On server System</h3>
								<p class="card-text">Server-side scripting does not depend on browser processing as all the processing is performed on the server side</p>
							</div>
						</div>
						<div class="card text-center">
							<div class="oval"><img class="card-img-top" src="images/marketing.png" alt=""></div>
							<div class="card-body">
								<h3 class="card-title">Reliable</h3>
								<p class="card-text">As the scripting is done on the server, it is not sent back to the browser, which prevents it from being cloned, copied, or scrutinized for hacking vulnerabilities</p>
							</div>
						</div>
					</div>
					<div class="col">
						<div class="card text-center">
							<div class="oval"><img class="card-img-top" src="images/seo.png" alt=""></div>
							<div class="card-body">
								<h3 class="card-title">Faster</h3>
								<p class="card-text">Converting time of your files often reduced</p>
							</div>
						</div>
						<div class="card text-center">
							<div class="oval"><img class="card-img-top" src="images/graphics-design.png" alt=""></div>
							<div class="card-body">
								<h3 class="card-title">Encrypted</h3>
								<p class="card-text">An increased security is ensured for user privacy</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

















</body></html>