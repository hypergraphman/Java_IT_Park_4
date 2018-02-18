<#ftl encoding='UTF-8'>
<#include "menu.ftl">
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<h1>Ваш профиль</h1>
<h2>${model.user.email}</h2>
<#if model.user.nickname??>
<h2>${model.user.nickname}</h2>
</#if>
<a href="/logout">Выход</a>