package fr.abdelhak.myApi.service;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import fr.abdelhak.myApi.model.User;

@Service
public class UserService {
    private ArrayList<User> users;
public UserService(){
    this.users = new ArrayList<User>();

    this.users.add(new User(0,"Yosr", 34));
    this.users.add(new User(1,"Ayoub", 3));
    this.users.add(new User(2,"Fatima", 50));

}
//methode getUser
public User getUser(int id) {
    for (User user : this.users) {
        if (user.getId() == id) {
            return user;
        }  
    }
    return null;
}
public User creatUser(String name, int age){
    User user = new User(users.size(), name, age);
    return user;
}
public User createUser(String name, int age) {
    return null;
}
public User updateUser(int id, String name, int age){
  User user = getUser(id);
  user.setName(name);
  user.setAge(age);
  return user;

} 
public User deleteUser(int id){

    for (int index = 0; index < users.size(); index++) {
        if (users.get(index).getId() == id) {
        this.users.remove(index);   
return users.get(index);
}   
}
return null;
}
}