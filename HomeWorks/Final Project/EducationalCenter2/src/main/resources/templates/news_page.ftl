<#ftl encoding='UTF-8'>
<#include "menu.ftl">
<html>
<head>
    <title>Новости школы</title>
</head>
<body>
    <#if model.user.role.name() == "TEACHER">
        <a href="/news/add">Добавить новость</a>
    </#if>
    <#list model.news as news>
        <div>
            <div>Тема: ${news.title}</div>
            <div>${news.text}</div>
            <div>Автор: ${news.user.nickname}</div>
        </div>
    </#list>
</body>
</html>