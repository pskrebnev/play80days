package org.play80days.ui.page;

import static org.play80days.config.ConfigurationManager.config;

import com.microsoft.playwright.Page;

import io.qameta.allure.Step;

/**
 * @author tahanima
 */
public abstract class BasePage {

    protected Page page;

    public void setAndConfigurePage(final Page page) {
        this.page = page;

        page.setDefaultTimeout(config().timeout());
    }

    public void initComponents() {}

    @Step
    public byte[] captureScreenshot() {
        return page.screenshot();
    }
}
