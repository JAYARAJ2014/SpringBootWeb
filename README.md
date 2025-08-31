# Sample Spring Web App

- From https://start.spring.io/ configure your root project (Use Spring Web as dependency here.)
- Install dependencies
  - spring-boot-starter-web
  - tomcat-jasper (This should be the same version as of your Tomcat)
- Create a Controller class by decorating it with @Controller Annotation
- Create an Action method decorated by    @RequestMapping annotation and specifying the route
- Return the name of the JSP file where the view is defined. (This will fail if you dont have jasper installed)
- Run and access the page frm browser using http://localhost:8080
   
    