<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h1>SIGN IN</h1>
<form action="/signIn" method="post">
    <div>
        <input type="email" name="email" placeholder="EMAIL">
    </div>
    <div>
        <input type="password" name="password" placeholder="PASSWORD">
    </div>
    <div>
        <label>
            <input type="checkbox" name="remember-me">remember me
        </label>
    </div>
    <div>
    <input type="submit" value="SIGN IN">
    </div>
</form>
</body>
</html>