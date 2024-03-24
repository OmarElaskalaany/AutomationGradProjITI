# Automated Testing Project for NopCommerce

This project contains automated test scripts for the NopCommerce website. The tests are written in Java using the Selenium framework. The project follows the Page Object Model (POM) design pattern and uses TestNG for test execution and assertions.

## Tools Used
- Selenium WebDriver: Web automation library for interacting with web elements.
- TestNG: Testing framework for organizing and executing tests.
- Page Object Model (POM): Design pattern for maintaining test scripts and page objects separately.
- Assertions: Used to validate expected outcomes of test executions.

## Test Cases

### Registration Test
- Description: Verify that a user can successfully register on the NopCommerce website.
- Steps:
  1. Navigate to the registration page.
  2. Fill in the registration form with valid user details.
  3. Submit the registration form.

### Login Test
- Description: Verify that a registered user can log in to the NopCommerce website.
- Steps:
  1. Navigate to the login page.
  2. Enter valid credentials (email and password).
  3. Click on the login button.

### Logout Test
- Description: Verify that a logged-in user can successfully log out from the NopCommerce website.
- Steps:
  1. Click on the logout button.

### Change Password Test
- Description: Verify that a logged-in user can change their password on the NopCommerce website.
- Steps:
  1. Navigate to the change password page.
  2. Enter the current password, new password, and confirm new password.
  3. Click on the change password button.

### Add Address Test
- Description: Verify that a logged-in user can add a new address to their account on the NopCommerce website.
- Steps:
  1. Navigate to the address book page.
  2. Click on the add new address button.
  3. Fill in the address details.
  4. Click on the save address button.

### Add To Cart Test
- Description: Verify that a user can add a product to the shopping cart on the NopCommerce website.
- Steps:
  1. Navigate to the product page.
  2. Click on the add to cart button.

### Search On Product Test
- Description: Verify that a user can search for a product on the NopCommerce website.
- Steps:
  1. Enter a search query in the search bar.
  2. Click on the search button.

### Check Out Process Test
- Description: Verify that a user can complete the checkout process on the NopCommerce website.
- Steps:
  1. Add a product to the shopping cart.
  2. Proceed to the checkout page.
  3. Fill in the shipping and payment details.
  4. Click on the place order button.

