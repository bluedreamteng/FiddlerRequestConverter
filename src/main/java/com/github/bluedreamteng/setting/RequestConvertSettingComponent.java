package com.github.bluedreamteng.setting;

import com.intellij.util.ui.FormBuilder;

import javax.swing.*;

public class RequestConvertSettingComponent {
    private final JPanel myMainPanel;
    private final JTextField urlTargetList;
    private final JTextField requestHeaderWhiteList;


    public RequestConvertSettingComponent() {
        urlTargetList = new JTextField();
        requestHeaderWhiteList = new JTextField();

        myMainPanel = FormBuilder.createFormBuilder()
                .addLabeledComponent("Url目标特征值:", urlTargetList)
                .addLabeledComponent("请求头白名单:", requestHeaderWhiteList)
                .addComponentFillVertically(new JPanel(), 0)
                .getPanel();
    }

    public JPanel getPanel() {
        return myMainPanel;
    }

    public JComponent getPreferredFocusedComponent() {
        return urlTargetList;
    }

    public void setUrlTargetList(String value) {
        urlTargetList.setText(value);
    }

    public String getUrlTargetList() {
        return urlTargetList.getText();
    }

    public void setRequestHeaderWhiteList(String value) {
        requestHeaderWhiteList.setText(value);
    }

    public String getRequestHeaderWhiteList() {
        return requestHeaderWhiteList.getText();
    }
}
