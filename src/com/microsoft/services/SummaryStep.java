package com.microsoft.services;

import com.intellij.ui.wizard.WizardNavigationState;
import com.intellij.ui.wizard.WizardStep;

import javax.swing.*;

/**
 * Created by rajave on 9/16/2014.
 */
public class SummaryStep extends WizardStep<AddServiceWizardModel> {
    private JPanel rootPanel;
    private JEditorPane editorSummary;
    private final AddServiceWizardModel model;

    public SummaryStep(final String title, final String summary, AddServiceWizardModel model) {
        super("Azure Services Activity", title, null);
        this.model = model;
        editorSummary.setText(summary);
    }

    @Override
    public JComponent prepare(WizardNavigationState state) {
        rootPanel.revalidate();
        return rootPanel;
    }
}
