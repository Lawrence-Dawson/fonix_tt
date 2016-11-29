## Fonix Tech Test

**The challenge:**

"The high level description of the challenge is to create a web application that allows a user to register their credentials and password. When the user logs into the application they are required to verify via SMS Two Factor Authentication (2FA)."

**My Approach:**

- Get the two basic web pages 'sign up' and 'sign in' working with a button directing to either one from the initial view.
- Attached a MYSql Database.
- Create the 'User' model.
- Write code to interpret the 'sign up' forms post request and use it to create a new User record in the database
- **This was as far as I got**

**With more time I would continue with the following approach:**

- Enable records to be retrieved from the database
- Add basic form submission validation, checking that password and confirmation password match
- Enable hashing of passwords
- Add mobile number field to the sign up form
- Add Zensend authorisation
- Add direction to new authorisation webpage
- Add form for authorisation code input
- Link form submi to either Welcome page or redirect to sign up



**Achieved:**

- Installed Webcat Server
- Home page has two choices, 'sign in' and 'sign up'
- Both buttons lead to new web pages that contain forms
- Both sign in and sign up pages forms submit to their own servlet
- MySQL database connection working and integrated
- User Model is ready
- Initial code for using form data from Sign Up form to create a new user is complete but getting error

**To install and run:**

- Create a local directory with a name of your choosing
- Clone this repository into that new repository
- Open the repository with your favourite Java IDE
- Run the application by clicking on the 'Run' button (You may need to add a server to do this)
- Visit "http://localhost:8080/fonix_tt/"

**Not Achieved:**

- Create a User record in the database
- Retrieve a User record from the database
- SMS authorisation

**Difficulties:**

I found this project difficult to achieve for a number of reasons.

- I had never used java before.
- There are hundreds of frameworks and approaches that can be used to create this application.
- I spent a long time researching different approaches, often trying small 'hello world' like apps using different resources and frameworks such as Spring.
- I initially tried to use the Spring framework because the MVC structure is something that I have used before. However I found it confusing, the documentation wasn't always clear to me and resouces online were often aimed at people more experienced than myself with Java.
- I eventually settled on a basic and 'old school' approach, using servlets instead of a controller.
- Progress was slow, I spent around a day and a half in total on this test.
