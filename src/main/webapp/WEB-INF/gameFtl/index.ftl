<#import "head.ftl" as h>
<@h.head title="">
<form action="" class="am-form">
    <fieldset>
        <legend>自动跳转登陆界面</legend>
    </fieldset>
</form>
<script>
        window.open("${aliUrl!}","_self");
</script>
</@h.head>