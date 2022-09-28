package com.github.bluedreamteng.setting;

import com.intellij.util.ui.FormBuilder;

import javax.swing.*;

public class RequestConvertSettingComponent {
    private final JPanel myMainPanel;
    private final JTextField urlTarget;
    private final JTextField urlTargetReplaceValue;
    private final JTextField requestHeaderWhiteList;


    public RequestConvertSettingComponent() {
        urlTarget = new JTextField();
        urlTargetReplaceValue = new JTextField();
        requestHeaderWhiteList = new JTextField();

        myMainPanel = FormBuilder.createFormBuilder()
                .addLabeledComponent("Url目标特征值:", urlTarget)
                .addLabeledComponent("Url目标特征值替换值:", urlTargetReplaceValue)
                .addLabeledComponent("请求头白名单:", requestHeaderWhiteList)
                .addComponentFillVertically(new JPanel(), 0)
                .getPanel();
    }

    public JPanel getPanel() {
        return myMainPanel;
    }

    public JComponent getPreferredFocusedComponent() {
        return urlTarget;
    }

    public void setUrlTarget(String value) {
        urlTarget.setText(value);
    }

    public String getUrlTarget() {
        return urlTarget.getText();
    }

    public void setUrlTargetReplaceValue(String value) {
        urlTargetReplaceValue.setText(value);
    }

    public String getUrlTargetReplaceValue() {
        return urlTargetReplaceValue.getText();
    }

    public void setRequestHeaderWhiteList(String value) {
        requestHeaderWhiteList.setText(value);
    }

    public String getRequestHeaderWhiteList() {
        return requestHeaderWhiteList.getText();
    }
}
