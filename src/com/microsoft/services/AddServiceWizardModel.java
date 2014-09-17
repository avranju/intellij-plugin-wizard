package com.microsoft.services;

import com.intellij.openapi.application.ApplicationNamesInfo;
import com.intellij.ui.wizard.WizardModel;

public class AddServiceWizardModel extends WizardModel {
    private final ServiceType[] serviceTypes;
    private final String SUMMARY_SAMPLE = "<html> <head> </head> <body style=\"font-family: sans serif;\"> <p style=\"margin-top: 0\"><b>Summary:</b></p> <ol> <li>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</li> <li>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</li> <li>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Mollit anim id est laborum.</li> </ol> </body> </html>";

    public AddServiceWizardModel(ServiceType[] serviceTypes) {
        super(ApplicationNamesInfo.getInstance().getFullProductName() + " - Add Microsoft Service Wizard");
        this.serviceTypes = serviceTypes;
        initSteps();
    }

    private void initSteps() {
        add(new AzureMobileServiceStep("Azure Mobile Service", this));
        add(new NotificationHubStep("Notification Hub", this));
        add(new SummaryStep("Summary", SUMMARY_SAMPLE, this));
    }
}
