<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	<div class="signup-section">
		<div class="container">
		 <h3>Login Here</h3>
	      <div class="login-signup-form">
	      <div class="col-sm-3">	      
	      </div>
	      
				<div class="col-md-6 login text-center">
					                                    <%@include file="components/message.jsp" %>

					<form action="LoginServlet" method="post">
					<div class="cus_info_wrap">
						<label class="labelTop">
						Email:
						<span class="require">*</span>
						</label>
						<input type="text" name="email" value="">
					</div>
					<div class="clearfix"></div>
					<div class="cus_info_wrap">
						<label class="labelTop">
						Password:
						<span class="require">*</span>
						</label>
						<input type="password" value="" name="password">
					</div>
					<div class="clearfix"></div>
					
				<div class="botton1">
					<input type="submit" value="SIGNIN" class="botton">
				</div>
				
				<%
						String msg = request.getParameter("msg");
						if(msg!=null)
						{
					%>
					<p class="text-danger">	<%=msg %></p>
					<%
					}%>
				</form>
				
			</div>
		</div>
</div>
        </div>
