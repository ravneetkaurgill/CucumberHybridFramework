Feature: Registration functionality

Scenario: User creates an account only with mandatory fields
Given User navigates to Register Account page
When  User enters the details into below fields
|firstName    |Ravneet                     |
|lastName     |kaur                        |
|telephone    |7658868672                  |
|password     |9january1992                |
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User creates an account with all fields
Given User navigates to Register Account page
When  User enters the details into below fields
|firstName    |Ravneet                     |
|lastName     |kaur                        |
|telephone    |7658868672                  |
|password     |9january1992                |
And User selects Yes for Newsletter
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User creates a duplicate account
Given User navigates to Register Account page
When  User enters the details into below fields with duplicate email
|firstName    |Ravneet                     |
|lastName     |kaur                        |
|email        |ravneetkaurgill123@gmail.com|
|telephone    |7658868672                  |
|password     |9january1992                |
And User selects Yes for Newsletter
And User selects Privacy Policy
And User clicks on Continue button
Then User should get a proper warning about duplicate email

Scenario: User creates an account without filling any details
Given User navigates to Register Account page
When User dont enter any details into field 
And User clicks on Continue button
Then User should get proper warning messages for every mandatory field