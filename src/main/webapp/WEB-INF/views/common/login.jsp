<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../common/common_head.jsp"/>
<body>
<div id="wrapper">
<div id="container">
	<img src="${img}/login.png" alt="" /><br />
	<mark style="color: red;">*ID는 숫자포함 8자 이내</mark><br />
<form id="login_box" name="login_box" >
         <!--do 서블릿  -->
         <fieldset class="form-edit">
            <legend>로그인</legend>
            <span class="login-span">ID</span> 
            <input type="text" id="input_id" name="input_id" /><br /> <label>PASSWORD</label>
            <input type="password"id="input_password" name="input_password" /><br />
            <br /> 
            <input type="reset" value="CANCEL" />
     		<input type="hidden" name="action" value="login">
            <input type="hidden" name="page" value="main">
            <input type="submit" id="loginBtn" value="로그인"  class="submit-pink">
         </fieldset>
      </form>
	
</div>
<footer >
		<div>
			<p>Posted by: hayun kim</p>
			<p>Contact information: <a href="mailto:someone@example.com">
			someone@hanbit.com</a>.</p>
			</div>
		</footer>
	</div>
	<script>
	app.auth.init();
	
	</script>
</body>
</html>