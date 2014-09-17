package com.microsoft.services;

import com.intellij.ui.wizard.WizardNavigationState;
import com.intellij.ui.wizard.WizardStep;

import javax.swing.*;

/**
 * Created by rajave on 9/16/2014.
 */
public class AzureMobileServiceStep extends WizardStep<AddServiceWizardModel> {
    private final AddServiceWizardModel model;
    private JPanel rootPanel;
    private JList listServices;
    private JTable mobileServices;
    private JButton buttonAddService;
    private JButton buttonEdit;

    public AzureMobileServiceStep(final String title, final AddServiceWizardModel model) {
        super("Azure Services Activity", title, null);
        this.model = model;
    }

    @Override
    public JComponent prepare(WizardNavigationState state) {
        rootPanel.revalidate();
        return rootPanel;
    }
}
