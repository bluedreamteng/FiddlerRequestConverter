package com.github.bluedreamteng.setting;


import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.project.Project;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@State(
        name = "com.github.bluedreamteng.fiddlerrequest.RequestConvertSetting",
        storages = {@Storage("requestconvertsetting.xml")}
)
public class RequestConvertSetting implements PersistentStateComponent<RequestConvertSetting> {

    public String urlTarget = "";

    public String urlTargetReplaceValue = "";

    public String requestHeaderWhiteList = "";

    public static RequestConvertSetting getInstance(Project project) {
        return ServiceManager.getService(project, RequestConvertSetting.class);
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
}
