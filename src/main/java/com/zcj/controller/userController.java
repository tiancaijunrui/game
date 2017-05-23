package com.zcj.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.request.AlipayUserUserinfoShareRequest;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.alipay.api.response.AlipayUserUserinfoShareResponse;
import com.zcj.utils.gameConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Since2017/4/18 ZhaCongJie@HF
 */
@Controller
@RequestMapping("/user")
public class userController {
    @RequestMapping(value = "/toLogin")
    public ModelAndView toLogin(HttpServletRequest request, HttpServletResponse response){
        String url = "https://openauth.alipay.com/oauth2/publicAppAuthorize.htm?app_id="+ gameConstants.APP_ID+"&scope="+gameConstants.SCOPE
                +"&redirect_uri="+gameConstants.REDIRECT_URI;
        request.setAttribute("aliUrl",url);
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest request,HttpServletResponse response) throws AlipayApiException {
        String auth_code = request.getParameter("auth_code");
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", gameConstants.APP_ID, gameConstants.APP_PRIVATE_KEY, "json", "UTF-8", gameConstants.ALIPAY_PUBLIC_KEY, "RSA2");
        AlipaySystemOauthTokenResponse responseEx = getAccessToken(alipayClient,auth_code);
        String dataBody = responseEx.getBody();
        if (!dataBody.contains("refresh_token")) {
            return new ModelAndView("index");
        }
        dataBody = dataBody.replace("(", "").replace(")", "").replace("{", "").replace("}", "").replace("\'", "").replace("\"", "");;
        String[] contentArray = dataBody.split(",");
        String accessToken = null;
        for (String param : contentArray) {
            if (param.contains("access_token")) {
                String[] paramArray = param.split(":");
                accessToken = paramArray[paramArray.length-1];
            }
        }
        System.out.print(responseEx.getBody());
        AlipayUserUserinfoShareRequest request1 = new AlipayUserUserinfoShareRequest();
        AlipayUserUserinfoShareResponse response1 = alipayClient.execute(request1, accessToken);//在请求方法中传入上一步获得的access_token
        if(response1.isSuccess()){
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }
        return new ModelAndView("index");
    }

    private AlipaySystemOauthTokenResponse getAccessToken(AlipayClient alipayClient, String authCode) throws AlipayApiException {

        AlipaySystemOauthTokenRequest request1 = new AlipaySystemOauthTokenRequest();//创建API对应的request类
        request1.setGrantType("authorization_code");
        request1.setCode(authCode);
        AlipaySystemOauthTokenResponse response1 = alipayClient.execute(request1);//通过alipayClient调用API，获得对应的response类
        return response1;
    }
}
