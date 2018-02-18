<#ftl encoding='UTF-8'>
<a href="/news">Новости</a>
<a href="/profile">Профайл</a>
<a href="/tests">Тесты</a>
<#if model.user.role.name() == "TEACHER">
<a href="/users">Пользователи</a>
</#if>
<a href="/logout">Выход</a>
<br>