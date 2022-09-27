package com.github.bluedreamteng.setting;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.project.Project;
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
    private final Project project;


    public RequestConvertSettingConfigurable(Project project) {
        this.project = project;
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
        RequestConvertSetting requestConvertSetting = RequestConvertSetting.getInstance(project);
        return (requestConvertSettingComponent.getEnableConvertRule() != requestConvertSetting.enableConvertRule) ||
                !requestConvertSettingComponent.getUrlTarget().equals(requestConvertSetting.urlTarget) ||
                !requestConvertSettingComponent.getUrlTargetReplaceValue().equals(requestConvertSetting.urlTargetReplaceValue) ||
                !requestConvertSettingComponent.getRequestHeaderWhiteList().equals(requestConvertSetting.requestHeaderWhiteList);
    }

    @Override
    public void apply() {
        RequestConvertSetting requestConvertSetting = RequestConvertSetting.getInstance(project);
        requestConvertSetting.enableConvertRule = requestConvertSettingComponent.getEnableConvertRule();
        requestConvertSetting.urlTarget = requestConvertSettingComponent.getUrlTarget();
        requestConvertSetting.urlTargetReplaceValue = requestConvertSettingComponent.getUrlTargetReplaceValue();
        requestConvertSetting.requestHeaderWhiteList = requestConvertSettingComponent.getRequestHeaderWhiteList();
    }

    @Override
    public void reset() {
        RequestConvertSetting requestConvertSetting = RequestConvertSetting.getInstance(project);
        requestConvertSettingComponent.setEnableConvertRule(requestConvertSetting.enableConvertRule);
        requestConvertSettingComponent.setUrlTarget(requestConvertSetting.urlTarget);
        requestConvertSettingComponent.setUrlTargetReplaceValue(requestConvertSetting.urlTargetReplaceValue);
        requestConvertSettingComponent.setRequestHeaderWhiteList(requestConvertSetting.requestHeaderWhiteList);

    }

    @Override
    public void disposeUIResources() {
        requestConvertSettingComponent = null;
    }

}
