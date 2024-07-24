package org.play80days.util;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;

import org.play80days.factory.BrowserFactory;
import org.play80days.config.ConfigurationManager;

/**
 * @author tahanima
 */
public final class BrowserManager {

    private BrowserManager() {}

    public static Browser getBrowser(final Playwright playwright) {
        return BrowserFactory.valueOf(ConfigurationManager.config().browser().toUpperCase()).createInstance(playwright);
    }
}
