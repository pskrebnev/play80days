package org.play80days.factory;

import com.microsoft.playwright.Page;

import org.play80days.ui.page.BasePage;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tahanima
 */
@Slf4j
public final class BasePageFactory {

    private BasePageFactory() {}

    public static <T extends BasePage> T createInstance(final Page page, final Class<T> clazz) {
        try {
            BasePage instance = clazz.getDeclaredConstructor().newInstance();

            instance.setAndConfigurePage(page);
            instance.initComponents();

            return clazz.cast(instance);
        } catch (Exception e) {
            log.error("BasePageFactory::createInstance", e);
        }

        throw new NullPointerException("Page class instantiation failed.");
    }
}
