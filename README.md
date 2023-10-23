# Basic Thymeleaf Project

This project is a simple example of using Thymeleaf in a Spring Boot application. It involves the following steps:

1. **Controller Creation**: A controller is created to handle requests.

2. **Endpoint Definition**: Inside the controller, an endpoint is defined using the `@GetMapping` annotation.

3. **Data for Thymeleaf**: In this endpoint, a variable is created to hold data that will be passed to a Thymeleaf template. You can write it as follows:

   ```java
   @GetMapping("/your-path")
   public String yourMethod(Model model) {
       // Add data to the model
       model.addAttribute("key1", someValue1);
    model.addAttribute("theData", new Date());
       // Return the name of the Thymeleaf template
       return "template-name";
   }
   ```

"Steps to Create a Thymeleaf-Powered Web Page in Spring Framework"

1. HTML Template Creation:

   - Create an HTML file under /resources/templates.

2. HTML Template with XML Namespace:

   - A new XML namespace is introduced into the HTML template. A namespace can contain a set of new elements, attributes, or rules associated with it.

   - The namespace is added to the HTML document with a namespace prefix and a URI (Uniform Resource Identifier).

   - In this project, the Thymeleaf namespace is added as follows:
       <html xmlns:th="http://www.thymeleaf.org">

   - The namespace prefix (in this case, "th") is used to avoid writing the full namespace URI every time an element or attribute from that namespace is used.

3. CSS Setup:

   - Create a new folder named "css" under /resources/static.

   - Create a CSS file within the "css" folder.

     ```CSS
     .format1 {
     color: black;
     font-weight: bold;
     }

     ```

   - Reference the CSS file in the Thymeleaf template:

       <link rel="stylesheet" th:href="@{/css/demo.css}" />

4. To display theData (the model attribute which will be passed to the view) in your HTML template, you can use Thymeleaf syntax like this:

        <p th:text="'The time on the server is ' + ${theData}" class="format1"></p>
