package com.zcj.domain;

import java.io.Serializable;

/**
 * @Since2017/5/23 ZhaCongJie@HF
 */
public class User implements Serializable{
    private String userId;
    private String avatar;
    private String nickName;
    private String gender;
    // 省份
    private String province;
    // 是否是A类账户
    private Boolean isCertifyGradeA;
    // 支付宝userId
    private String aliPayUserId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Boolean getCertifyGradeA() {
        return isCertifyGradeA;
    }

    public void setCertifyGradeA(Boolean certifyGradeA) {
        isCertifyGradeA = certifyGradeA;
    }

    public String getAliPayUserId() {
        return aliPayUserId;
    }

    public void setAliPayUserId(String aliPayUserId) {
        this.aliPayUserId = aliPayUserId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", avatar='" + avatar + '\'' +
                ", nickName='" + nickName + '\'' +
                ", gender='" + gender + '\'' +
                ", province='" + province + '\'' +
                ", isCertifyGradeA=" + isCertifyGradeA +
                ", aliPayUserId='" + aliPayUserId + '\'' +
                '}';
    }
}
