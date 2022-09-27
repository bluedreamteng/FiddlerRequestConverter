package com.github.bluedreamteng.fiddlerrequest;

import com.github.bluedreamteng.notification.Notifier;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.ide.CopyPasteManager;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.awt.datatransfer.DataFlavor;

public class FiddlerRequestConvertAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        String fiddlerSession = CopyPasteManager.getInstance().getContents(DataFlavor.stringFlavor);
        if(StringUtils.isEmpty(fiddlerSession)) {
            return;
        }
        FiddlerRequest fiddlerRequest;
        try {
            fiddlerRequest = new FiddlerRequest(fiddlerSession);
        } catch (ParseException parseException) {
            Notifier.notifyError(e.getProject(),parseException.getMessage());
            return;
        }
        String restClientRequestContent = fiddlerRequest.convertToRestClientRequest();
        Editor editor = e.getData(PlatformDataKeys.EDITOR);
        if (editor == null)
            return;
        CaretModel caretModel=editor.getCaretModel();
        WriteCommandAction.runWriteCommandAction(e.getProject(),
                () -> editor.getDocument().insertString(caretModel.getOffset(), restClientRequestContent));
    }

}
