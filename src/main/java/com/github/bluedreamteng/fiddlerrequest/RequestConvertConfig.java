package com.github.bluedreamteng.fiddlerrequest;

import com.alibaba.fastjson.JSON;
import com.github.bluedreamteng.setting.RequestConvertSetting;
import com.intellij.openapi.project.Project;

import java.util.List;

public class RequestConvertConfig {
    private final String urlTarget;

    private final String urlTargetReplaceValue;

    private final List<String> requestHeaderWhiteList;

    public RequestConvertConfig(RequestConvertSetting requestConvertSetting) {
        this.urlTarget = requestConvertSetting.urlTarget;
        this.urlTargetReplaceValue = requestConvertSetting.urlTargetReplaceValue;
        this.requestHeaderWhiteList = JSON.parseArray(requestConvertSetting.requestHeaderWhiteList,String.class);
    }

    public String getUrlTarget() {
        return urlTarget;
    }

    public String getUrlTargetReplaceValue() {
        return urlTargetReplaceValue;
    }

    public List<String> getRequestHeaderWhiteList() {
        return requestHeaderWhiteList;
    }
}
