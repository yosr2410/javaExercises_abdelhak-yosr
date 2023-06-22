package fr.abdelhak.myApi.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.abdelhak.myApi.model.User;
import fr.abdelhak.myApi.service.UserService;

//Annotation
@RestController
//Class
public class UserController {
private UserService userService;
// constructeur
public UserController(UserService userService) {
   this.userService = userService;
}
   //Annotation 
   @GetMapping("/user") 

   public User getUser(@RequestParam int id){
    User user = userService.getUser(id);
    return user;
   }
}
