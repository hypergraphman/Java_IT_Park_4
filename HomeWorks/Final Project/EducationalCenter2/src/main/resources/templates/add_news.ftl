<#ftl encoding='UTF-8'>
<#--<#include "menu.ftl">-->
<html>
<head>
    <title>Новости школы</title>
</head>
<body>
<h1>Добавить новость</h1>
<form method="post" action="/news/add">
    <input type="text" name="title" placeholder="Тема">
    <input type="text" name="text" placeholder="Кратко опишите новость">
    <input type="submit">
</form>
<a href="/news">К новостям</a>
</body>
</html>