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
import org.play80days.annotation.IValidation;
import org.play80days.dto.LoginDto;
import org.play80days.ui.page.ProductsPage;


@Feature("Login Test")
public class LoginTest extends BaseTest {

  private static final String CSV_PATH = "login.csv";

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
  @Story("User enters correct login credentials")
  @Owner("I'm owner")
  @Description(
      "Test that verifies user gets redirected to 'Products' page after submitting correct login credentials")
  @ParameterizedRepeatedIfExceptionsTest
  @IDataSource(id = "TC-1", fileName = CSV_PATH, clazz = LoginDto.class)
  public void testCorrectLoginCredentials(final LoginDto data) {
    ProductsPage productsPage = loginPage.loginAs(data.getUsername(), data.getPassword());

    assertThat(productsPage.getTitle()).hasText("Products");
  }

  @IValidation
  @Story("User enters incorrect login credentials")
  @Owner("I'm owner")
  @Description(
      "Test that verifies user gets error message after submitting incorrect login credentials")
  @ParameterizedRepeatedIfExceptionsTest
  @IDataSource(id = "TC-2", fileName = CSV_PATH, clazz = LoginDto.class)
  public void testIncorrectLoginCredentials(final LoginDto data) {
    loginPage.loginAs(data.getUsername(), data.getPassword());

    assertThat(loginPage.getErrorMessage()).hasText(data.getErrorMessage());
  }

  @IValidation
  @Story("User keeps the username blank")
  @Owner("I'm owner")
  @Description(
      "Test that verifies user gets error message after submitting login credentials where the username is blank")
  @ParameterizedRepeatedIfExceptionsTest
  @IDataSource(id = "TC-3", fileName = CSV_PATH, clazz = LoginDto.class)
  public void testBlankUserName(final LoginDto data) {
    loginPage.open().typePassword(data.getPassword()).submitLogin();

    assertThat(loginPage.getErrorMessage()).hasText(data.getErrorMessage());
  }

  @IValidation
  @Story("User keeps the password blank")
  @Owner("I'm owner")
  @Description(
      "Test that verifies user gets error message after submitting login credentials where the password is blank")
  @ParameterizedRepeatedIfExceptionsTest
  @IDataSource(id = "TC-4", fileName = CSV_PATH, clazz = LoginDto.class)
  public void testBlankPassword(final LoginDto data) {
    loginPage.open().typeUsername(data.getUsername()).submitLogin();

    assertThat(loginPage.getErrorMessage()).hasText(data.getErrorMessage());
  }

  @IValidation
  @Story("User is locked out")
  @Owner("I'm owner")
  @Description(
      "Test that verifies user gets error message after submitting login credentials for locked out user")
  @ParameterizedRepeatedIfExceptionsTest
  @IDataSource(id = "TC-5", fileName = CSV_PATH, clazz = LoginDto.class)
  public void testLockedOutUser(final LoginDto data) {
    loginPage.loginAs(data.getUsername(), data.getPassword());

    assertThat(loginPage.getErrorMessage()).hasText(data.getErrorMessage());
  }
}
