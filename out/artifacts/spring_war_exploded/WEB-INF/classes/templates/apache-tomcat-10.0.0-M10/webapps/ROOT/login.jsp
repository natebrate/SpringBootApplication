<%@ page language="java" contentType="text/html" %>
<!DOCTYPE html>
<html lang="en"> <!--indicating the language is English-->
<head>
    <title>System Login</title> <!--PAGE TITLE-->
    <!-- Required meta tags-->
    <meta http-equiv="Content-Type" charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Vendor CSS-->
    <!--===============================================================================================-->
    <link rel="icon" type="image/png" href="resources/images/icons/favicon.ico"/>
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/css/bootstrap.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="resources/vendor/animate/animate.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="resources/vendor/css-hamburgers/hamburgers.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="resources/vendor/select2/select2.min.css">
    <!--===============================================================================================-->

    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="resources/css/util.css">
    <link rel="stylesheet" type="text/css" href="resources/css/main.css">
    <!--===============================================================================================-->
</head>
<body>

<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100">
            <div class="login100-pic js-tilt" User Login>
                <img src="resources/images/img-01.png" alt="IMG">
            </div>

            <!-- contain the login in form for spring boot security configuration-->
            <form class="login100-form validate-form">
					<span class="login100-form-title " th:inline="text">
						Member Login [[${httpServletRequest.remoteUser}]]
					</span>
                <form th:action="@{/logout}" method="post">
                    <div class="wrap-input100 validate-input" data-validate="Valid email is required: ex@abc.xyz">
                        <label>
                            <input class="input100" type="text" name="email" placeholder="Email">
                        </label>
                        <span class="focus-input100"></span>
                        <span class="symbol-input100">
                                <i class="fa fa-envelope" aria-hidden="true"></i>
                            </span>
                    </div>

                    <!--Obtain a user password-->
                    <div class="wrap-input100 validate-input" data-validate="Password is required">
                        <label>
                            <input class="input100" type="password" name="pass" placeholder="Password">
                        </label>
                        <span class="focus-input100"></span>
                        <span class="symbol-input100">
                                <i class="fa fa-lock" aria-hidden="true"></i>
                            </span>
                    </div>
                </form>

                <div class="container-login100-form-btn">
                    <button class="login100-form-btn">
                        Login
                    </button>
                </div>

                <!-- USER INPUT OPERATIONS-->
                <div class="text-center p-t-12">
						<span class="txt1">
							Forgot
						</span>
                    <a class="txt2" href="#">
                        Username / Password?
                    </a> <!--obtain a passworrd-->
                </div>

                <div class="text-center p-t-136">
                    <a class="txt2" href="#">
                        Create your Account
                        <i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
                    </a>
                </div>
            </form>
        </div>
    </div>
</div>

<!-- Scripts to run when the wepage has loaded-->
<!--===============================================================================================-->
<script src="resources/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="resources/vendor/bootstrap/js/popper.js"></script>
<script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="resources/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
<script src="resources/vendor/tilt/tilt.jquery.min.js"></script>
<script>
    $('.js-tilt').tilt({
        scale: 1.1
    })
</script>
<!--===============================================================================================-->
<!-- MAIN JS SCRIPT-->
<script src="resources/js/main1.js"></script>

</body>
</html>