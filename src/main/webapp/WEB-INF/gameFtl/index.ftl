<#import "head.ftl" as h>
<@h.head title="">
<form action="" class="am-form">
    <fieldset>
        <legend>H5 原生表单验证</legend>
        <div class="am-form-group">
            <label for="doc-vld-name">用户名：</label>
            <input type="text" id="doc-vld-name" minlength="3" placeholder="输入用户名" class="am-form-field" required/>
        </div>
    </fieldset>
</form>
</@h.head>