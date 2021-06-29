<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div class="banner two">
		<div class="container">
			<div class="banner-navigation">
					<div class="logo">
						<a href="index.jsp"><h1>Matrimonial<span> Portal</span></h1></a>
						
						
					</div>
					<span class="menu"></span>
						<div class="top-menu">
								<ul class="nav">
									<li>
										<form>
										<ul class="searchform">
										<li><input type="text" placeholder="Search users by name..." name="name" id="searchbar"></li>
										</ul>
										</form>
									</li>
									<li class="hvr-sweep-to-bottom"><a href="index.jsp">Home</a></li>
									<li class="hvr-sweep-to-bottom"><a href="aboutus.jsp">About Us</a></li>
									<li class="hvr-sweep-to-bottom"><a href="contact.jsp">Contact Us</a></li>
								</ul>
								<div class="clearfix"></div>
						</div>
								<script>
									$("span.menu").click(function(){
										$(".top-menu ul").slideToggle("slow" , function(){
										});
									});
								</script>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
