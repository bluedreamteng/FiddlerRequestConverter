package com.github.bluedreamteng.setting;

import com.alibaba.fastjson.JSON;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

@State(
        name = "com.github.bluedreamteng.fiddlerrequest.RequestConvertSetting",
        storages = {@Storage("requestconvertsetting.xml")}
)
public class RequestConvertSetting implements PersistentStateComponent<RequestConvertSetting> {

    public String urlTargetList = "";

    public String requestHeaderWhiteList = "";

    public static RequestConvertSetting getInstance() {
        return ServiceManager.getService(RequestConvertSetting.class);
    }

    @Nullable
    @Override
    public RequestConvertSetting getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull RequestConvertSetting state) {
        XmlSerializerUtil.copyBean(state, this);
    }

    public Map<String, String> getUrlTargetList() {
        return JSON.parseObject(urlTargetList, Map.class);
    }

    public List<String> getRequestHeaderWhiteList() {
        return JSON.parseArray(requestHeaderWhiteList, String.class);
    }
}
