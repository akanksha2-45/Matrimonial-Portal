<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!--/contact-section-->

<div class="contact">
    <div class="container">

        <h3>Contact US</h3>
        <div class="contact-content">

            <ul class="contact-grids">
                <li class="contact-grid phone">
                    <i class="icon11"> </i>
                    <h4>Phone</h4>
                    <h5>9826672585</h5>
                </li>
                <li class="contact-grid">
                    <i class="icon12"> </i>
                    <h4>Mail</h4>
                    <h5>matrimonial@gmail.com</h5>
                </li>
                <li class="contact-grid">
                    <a href=""><i class="icon13"> </i></a>
                    <h4>Twitter</h4>
                    <h5>@matrimonial</h5>
                </li>
                <li class="contact-grid fb">
                    <a href=""><i class="icon14"> </i></a>
                    <h4>Facebook</h4>
                    <h5>wed</h5>
                </li>
                <div class="clearfix"> </div>
            </ul>
              <%@include file="components/message.jsp" %>

            <form action="ContactServlet" method="post">
                <input type="text" class="textbox" name="name" value=" Your Name" onfocus="this.value = '';" onblur="if (this.value == '') {
                            this.value = 'Your Name';
                        }">
                <input type="text" class="textbox" name="email" value="Your E-Mail" onfocus="this.value = '';" onblur="if (this.value == '') {
                            this.value = 'Your E-Mail';}">
                <div class="clear"> </div>
                <div>
                    <textarea name="Message" placeholder="Message" onfocus="this.value = '';" onblur="if (this.value == '') {
                                this.value = 'Your Message ';}">Your Message</textarea>
                </div>	
                <div class="submit"> 
                    <input type="submit" value="SEND " />
                </div>
            </form>
        </div>
    </div>	
</div>	