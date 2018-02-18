<#ftl encoding='UTF-8'>
<#--<#import 'spring.ftl' as spring>-->
<#--<@spring.bind "model"/>-->
<html>
<body>
<h1>Залогиниться</h1>
<form method="post" action="/signIn">
    <input type="text" name="email" placeholder="E-mail">
    <input type="password" name="password" placeholder="Пароль">
    <input type="submit">
</form>

<a href="/signUp">Зарегаться</a>
</body>
</html>