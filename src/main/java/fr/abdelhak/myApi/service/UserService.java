package fr.abdelhak.myApi.service;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import fr.abdelhak.myApi.model.User;

@Service
public class UserService {
    private ArrayList<User> users;
public UserService(){
    this.users = new ArrayList<User>();

    this.users.add(new User(1,"Yosr", 34));
    this.users.add(new User(2,"Ayoub", 3));
    this.users.add(new User(3,"Fatima", 50));
}
public User getUser(int id) {
    for (User user : this.users) {
        if (user.getId() == id) {
            return user;
        }  
    }
    return null;
}

}
