# Automation Testing Project for NopCommerce Website

This project contains automated test scripts for the NopCommerce website. The tests are written in Java using the Selenium framework. The project follows the Page Object Model (POM) design pattern and uses TestNG for test execution and assertions.

## Tools Used
- Selenium WebDriver: Web automation library for interacting with web elements.
- TestNG: Testing framework for organizing and executing tests.
- Page Object Model (POM): Design pattern for maintaining test scripts and page objects separately.
- Assertions: Used to validate expected outcomes of test executions.

## Test Cases

### ValidRegistration
- Description: Verify that a user can register with valid details.
- Steps:
  1. Navigate to the registration page.
  2. Fill in the registration form with valid user details.
  3. Submit the registration form.
- Assertion:
  - Verify that the registration is successful.

### InValidRegistration_IncorrectEmail
- Description: Verify that registration fails when using an incorrect email format.
- Steps:
  1. Navigate to the registration page.
  2. Fill in the registration form with an incorrect email format.
  3. Submit the registration form.
- Assertion:
  - Verify that the registration fails.

### InValidRegistration_PasswordDoNotMatch
- Description: Verify that registration fails when the passwords do not match.
- Steps:
  1. Navigate to the registration page.
  2. Fill in the registration form with valid user details but mismatched passwords.
  3. Submit the registration form.
- Assertion:
  - Verify that the registration fails.

### ValidLogin
- Description: Verify that a registered user can log in with valid credentials.
- Steps:
  1. Navigate to the login page.
  2. Enter valid credentials (email and password).
  3. Click on the login button.
- Assertion:
  - Verify that the login is successful.

### InvalidLogin_UnRegisteredUser
- Description: Verify that login fails for an unregistered user.
- Steps:
  1. Navigate to the login page.
  2. Enter invalid credentials (email of an unregistered user and any password).
  3. Click on the login button.
- Assertion:
  - Verify that the login fails.

### Logout Test
- Description: Verify that a logged-in user can successfully log out from the NopCommerce website.
- Steps:
  1. Click on the logout button.
- Assertion:
  - Verify that the logout is successful.

### ValidChangePassword
- Description: Verify that a logged-in user can successfully change their password.
- Steps:
  1. Navigate to the change password page.
  2. Enter the current password, new password, and confirm new password.
  3. Click on the change password button.
- Assertion:
  - Verify that the password is changed successfully.

### InValidChangePassword_OldPasswordDoNotMatch
- Description: Verify that changing password fails when the old password is incorrect.
- Steps:
  1. Navigate to the change password page.
  2. Enter an incorrect old password, new password, and confirm new password.
  3. Click on the change password button.
- Assertion:
  - Verify that changing password fails.

### AddToCart_Jewelry
- Description: Verify that a user can add a jewelry product to the shopping cart.
- Steps:
  1. Navigate to the jewelry product page.
  2. Click on the add to cart button.
- Assertion:
  - Verify that the jewelry product is added to the cart.

### AddToCart_DigitalDownloads
- Description: Verify that a user can add a digital download product to the shopping cart.
- Steps:
  1. Navigate to the digital download product page.
  2. Click on the add to cart button.
- Assertion:
  - Verify that the digital download product is added to the cart.

### AddToCart_NikeSBZoom
- Description: Verify that a user can add a Nike SB Zoom product to the shopping cart.
- Steps:
  1. Navigate to the Nike SB Zoom product page.
  2. Click on the add to cart button.
- Assertion:
  - Verify that the Nike SB Zoom product is added to the cart.

### Search On Product Test
- Description: Verify that a user can search for a product on the NopCommerce website.
- Steps:
  1. Enter a search query in the search bar.
  2. Click on the search button.

### CheckOutProcessTest
- Description: Verify that a user can complete the checkout process on the NopCommerce website.
- Steps:
  1. Add a product to the shopping cart.
  2. Proceed to the checkout page.
  3. Fill in the shipping and payment details.
  4. Click on the place order button.

## Contact

If you have any questions, suggestions, or issues related to this project, please feel free to contact us. We welcome your feedback and contributions.

- Email: byomarwael@gmail.com

