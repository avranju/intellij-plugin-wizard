package com.microsoft.services;

import com.intellij.ui.wizard.WizardNavigationState;
import com.intellij.ui.wizard.WizardStep;

import javax.swing.*;

/**
 * Created by rajave on 9/16/2014.
 */
public class NotificationHubStep extends WizardStep<AddServiceWizardModel> {
    private JPanel rootPanel;
    private JList listServices;
    private JTextField textSenderID;
    private JTextField textConnectionString;
    private JTextField textHubName;
    private AddServiceWizardModel model;

    public NotificationHubStep(final String title, AddServiceWizardModel model) {
        super("Azure Services Activity", title, null);
        this.model = model;
    }

    @Override
    public JComponent prepare(WizardNavigationState state) {
        rootPanel.revalidate();
        return rootPanel;
    }
}
