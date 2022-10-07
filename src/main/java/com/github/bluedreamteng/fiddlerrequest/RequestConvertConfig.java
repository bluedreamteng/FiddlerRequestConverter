package com.github.bluedreamteng.fiddlerrequest;

import java.util.List;
import java.util.Map;

public class RequestConvertConfig {
    private final Map<String,String> urlTargets;

    private final List<String> requestHeaderWhiteList;

    public RequestConvertConfig(Map<String,String> urlTargets,List<String> requestHeaderWhiteList) {
        this.urlTargets = urlTargets;
        this.requestHeaderWhiteList = requestHeaderWhiteList;
    }

    public Map<String,String> getUrlTargets() {
        return urlTargets;
    }

    public List<String> getRequestHeaderWhiteList() {
        return requestHeaderWhiteList;
    }
}
