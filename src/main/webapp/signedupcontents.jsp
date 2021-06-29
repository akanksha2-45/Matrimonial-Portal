<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!-- Register section-->

<div class="signup-section">

    <div class="container">
        <h3>Register Here</h3>
        <div class="login-signup-form">
            <div class="col-sm-3"> 
            </div>

            <div class="col-md-6 sign-up text-center">
                                    <%@include file="components/message.jsp" %>

                <form action="RegisterServlet" method="post" ">

                    <div class="cus_info_wrap">
                        <label class="labelTop">
                            Name:
                            <span class="require">*</span>
                        </label>
                        <input type="text" name="name" value="" required>
                    </div>
                    <div class="cus_info_wrap gender">
                        <label class="labelTop">
                            Gender:
                            <span class="require">*</span>
                        </label>
                        <input type="radio" value="M" name="gender" required> M <input type="radio" value="F" name="gender" required> F
                    </div>

                    <div class="cus_info_wrap">
                        <label class="labelTop">
                            Religion:
                            <span class="require">*</span>
                        </label>
                        <select name="religion" required>
                            <option>Hindu</option>
                            <option>Sikh</option>
                            <option>Muslim</option>
                            <option>Christian</option>
                            <option>Jain</option>
                            <option>Buddhist</option>
                        </select>
                    </div>
                    <div class="cus_info_wrap">
                        <label class="labelTop">
                            Mother tongue:
                            <span class="require">*</span>
                        </label>
                        <select name="mothertongue" required>
                            <option>Odia</option>
                            <option>Hindi</option>
                            <option>English</option>
                            <option>Tamil</option>
                            <option>Telugu</option>
                            <option>Bengali</option>
                            <option>Marathi</option>
                            <option>Urdu</option>
                            <option>Gujurati</option>
                            <option>Punjabi</option>
                        </select>
                    </div>
                    <div class="cus_info_wrap">
                        <label class="labelTop">
                            Cast
                            <span class="require">*</span>
                        </label>
                        <select name="cast" required>
                            <option>Brahmin</option>
                            <option>Gopal</option>
                            <option>Khandayat</option>
                            <option>Kshatryia</option>
                            <option>Vaishya</option>
                            <option>Shudra</option>
                            <option>Dalit</option>
                        </select>
                    </div>
                    <div class="cus_info_wrap">
                        <label class="labelTop">
                            Mobile Number:
                            <span class="require">*</span>
                        </label>
                        <input type="number" value="" name="phone" required>
                    </div>
                    <div class="cus_info_wrap">
                        <label class="labelTop">
                            Address:
                            <span class="require">*</span>
                        </label>
                        <input type="text" value="" name="address" required>
                    </div>
                    <div class="cus_info_wrap">
                        <label class="labelTop">
                            Email Id:
                            <span class="require">*</span>
                        </label>
                        <input type="text" value="" name="email" required>
                    </div>
                    <div class="clearfix"></div>
                    <div class="cus_info_wrap">
                        <label class="labelTop">
                            Password:
                            <span class="require">*</span>
                        </label>
                        <input type="password" value="" name="password" required>
                    </div>
                    <div class="clearfix">


                        <div class="botton1 two">
                            <input type="submit" value="REGISTER HERE" class="btn btn-warning">
                            <%                                            String msg = request.getParameter("msg");
                                if (msg != null) {
                            %>
                            <p class="text-danger">	<%=msg%></p>
                            <%
                                }
                            %>
                            <br/>
                            &nbsp;
                            <br/>
                        </div>
                </form>
            </div>
            <div class="col-sm-3"> 
            </div>

            <div class="clearfix"></div>
        </div>
    </div>
</div>
</div>