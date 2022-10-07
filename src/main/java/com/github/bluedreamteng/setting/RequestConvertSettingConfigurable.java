package com.github.bluedreamteng.setting;

import com.intellij.openapi.options.Configurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Provides controller functionality for project settings.
 *
 * @author ztf
 */
public class RequestConvertSettingConfigurable implements Configurable {

    private RequestConvertSettingComponent requestConvertSettingComponent;


    public RequestConvertSettingConfigurable() {
        requestConvertSettingComponent = new RequestConvertSettingComponent();
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "Request Convert";
    }

    @Override
    public JComponent getPreferredFocusedComponent() {
        return requestConvertSettingComponent.getPreferredFocusedComponent();
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        requestConvertSettingComponent = new RequestConvertSettingComponent();
        return requestConvertSettingComponent.getPanel();
    }

    @Override
    public boolean isModified() {
        RequestConvertSetting requestConvertSetting = RequestConvertSetting.getInstance();
        return (!requestConvertSettingComponent.getUrlTargetList().equals(requestConvertSetting.urlTargetList) ||
                !requestConvertSettingComponent.getRequestHeaderWhiteList().equals(requestConvertSetting.requestHeaderWhiteList));
    }

    @Override
    public void apply() {
        RequestConvertSetting requestConvertSetting = RequestConvertSetting.getInstance();
        requestConvertSetting.urlTargetList = requestConvertSettingComponent.getUrlTargetList();
        requestConvertSetting.requestHeaderWhiteList = requestConvertSettingComponent.getRequestHeaderWhiteList();
    }

    @Override
    public void reset() {
        RequestConvertSetting requestConvertSetting = RequestConvertSetting.getInstance();
        requestConvertSettingComponent.setUrlTargetList(requestConvertSetting.urlTargetList);
        requestConvertSettingComponent.setRequestHeaderWhiteList(requestConvertSetting.requestHeaderWhiteList);

    }

    @Override
    public void disposeUIResources() {
        requestConvertSettingComponent = null;
    }

}
