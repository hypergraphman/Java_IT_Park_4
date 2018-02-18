<#ftl encoding='UTF-8'>
<#--<#import 'spring.ftl' as spring>-->
<#--<@spring.bind "model" />-->
<#include "menu.ftl">
<html>
<head>
    <title>Новости школы</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>E-mail</th>
        <th>Nickname</th>
    </tr>
    <#list model.users as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.email}</td>
            <#if user.nickname??>
                <td>${user.nickname}</td>
            </#if>
            <#--<td>${user.registrationTime}</td>-->
        </tr>
    </#list>
</table>
</body>
</html>