package com.microsoft.services;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class AddServiceAction extends AnAction {
    public void actionPerformed(AnActionEvent e) {
        AddServiceWizard.run();
    }
}
