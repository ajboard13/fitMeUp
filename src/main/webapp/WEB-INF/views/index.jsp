<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <title>login and register form</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">

    <link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css'>

    <link rel="stylesheet" href="resources/css/style.css">


</head>

<body>
<div class="wrapper">
    <div class="login is-active">
        <div class="profile"><i class="fa fa-camera fa-2x"></i></div>
        <div class="form-element">
            <a href="http://github.com/login/oauth/authorize?client_id=562161c07d5f44826394"><button>Sign in with slack!</button></a>
        </div>
        <div class="form-element">
            <span><i class="fa fa-envelope"></i></span><input type="email" placeholder="Your Email Address"/>
        </div>
        <div class="form-element">
            <span><i class="fa fa-lock"></i></span><input type="password" placeholder=" Password"/>
        </div>
        <a href="/logIn"><button class="btn-login">login</button></a>
    </div>

    <div class="register down">
        <div class="form-element">
            <a href="http://github.com/login/oauth/authorize?client_id=562161c07d5f44826394"><button>Sign up with slack!</button></a>
        </div>
        <div class="form-element">
            <span><i class="fa fa-user"></i></span><input type="text" placeholder="Full Name"/>
        </div>
        <div class="form-element">
            <span><i class="fa fa-envelope"></i></span><input type="email" placeholder="Your Email Address"/>
        </div>
        <div class="form-element">
            <span><i class="fa fa-lock"></i></span><input type="password" placeholder="Password"/>
        </div>
        <div class="form-element">
            <span><i class="fa fa-lock"></i></span><input type="password" placeholder="Re-Enter Password"/>
        </div>
        <a href="/signUp"><button class="btn-register">register</button></a>
    </div>

    <div class="login-view-toggle">
        <div class="sign-up-toggle is-active">Don't have an account? <a href="#">Sign Up</a></div>
        <div class="login-toggle">Already have an account? <a href="#">Login</a></div>
    </div>
</div>
<script src='https://code.jquery.com/jquery-2.2.4.min.js'></script>

<script src="resources/js/index.js"></script>

</body>
</html>

