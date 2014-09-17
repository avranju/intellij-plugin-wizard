package com.microsoft.services;

import com.intellij.openapi.project.Project;
import com.intellij.ui.wizard.WizardDialog;

import javax.swing.*;
import java.awt.*;

public class AddServiceWizard extends WizardDialog<AddServiceWizardModel> {
    public AddServiceWizard() {
        super(true, true, new AddServiceWizardModel(new ServiceType[] {
                ServiceType.AzureMobileService,
                ServiceType.AzureNotificationHub
        }));
    }

    public static void run() {
        new AddServiceWizard().show();
    }

    @Override
    protected Dimension getWindowPreferredSize() {
        return new Dimension(600, 350);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AddServiceWizard.run();
            }
        });
    }
}
