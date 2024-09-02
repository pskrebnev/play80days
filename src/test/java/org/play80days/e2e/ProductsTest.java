package org.play80days.e2e;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import io.github.artsok.ParameterizedRepeatedIfExceptionsTest;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.play80days.annotation.IDataSource;
import org.play80days.annotation.ISmoke;
import org.play80days.dto.ProductsDto;

@Feature("Products Test")
public class ProductsTest extends BaseTest {

  private static final String CSV_PATH = "products.csv";

  @BeforeEach
  public void setUp(TestInfo testInfo) {
    createBrowserContextAndPageAndLoginPageInstances(testInfo);
  }

  @Attachment(value = "Failed Test Case Screenshot", type = "image/png")
  protected byte[] captureScreenshotOnFailure() {
    return loginPage.captureScreenshot();
  }

  @AfterEach
  public void closeBrowserContextSession() {
    browserContext.close();
  }

  @ISmoke
  @Story("Logging out from Products page should redirect to Login page")
  @Owner("I'm owner")
  @Description("Test that verifies user gets redirected to 'Login' page after logging out")
  @ParameterizedRepeatedIfExceptionsTest
  @IDataSource(id = "TC-1", fileName = CSV_PATH, clazz = ProductsDto.class)
  public void testSuccessfulLogout(final ProductsDto data) {
    loginPage.loginAs(data.getUsername(), data.getPassword()).clickOnLogout();

    assertThat(page).hasURL(data.getUrl());
  }
}
