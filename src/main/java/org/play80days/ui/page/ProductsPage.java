package org.play80days.ui.page;

import com.microsoft.playwright.Locator;
import io.qameta.allure.Step;
import org.play80days.factory.BasePageFactory;
import org.play80days.ui.component.Header;
import org.play80days.ui.component.SideNavMenu;

public final class ProductsPage extends BasePage {

  private Header header;
  private SideNavMenu sideNavMenu;

  @Override
  public void initComponents() {
    header = new Header(page);
    sideNavMenu = new SideNavMenu(page);
  }

  @Step("Get title of the 'Products' page")
  public Locator getTitle() {
    return page.locator(".title");
  }

  @Step("Click on 'Logout' button from side navigation menu")
  public LoginPage clickOnLogout() {
    header.clickOnHamburgerIcon();
    sideNavMenu.clickOnLogout();

    return BasePageFactory.createInstance(page, LoginPage.class);
  }
}
