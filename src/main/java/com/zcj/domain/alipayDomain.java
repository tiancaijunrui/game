package com.zcj.domain;

import java.util.Map;

/**
 * @Since2017/5/23 ZhaCongJie@HF
 */
public class alipayDomain {
    private Map<String,Map<String,Object>> alipay_system_oauth_token_response;
    private String sign;

    public Map<String, Map<String, Object>> getAlipay_system_oauth_token_response() {
        return alipay_system_oauth_token_response;
    }

    public void setAlipay_system_oauth_token_response(Map<String, Map<String, Object>> alipay_system_oauth_token_response) {
        this.alipay_system_oauth_token_response = alipay_system_oauth_token_response;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
