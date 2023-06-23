package fr.abdelhak.myApi.service;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import fr.abdelhak.myApi.model.Animal;

@Service
public class AnimalService {
    private ArrayList<Animal> animals;
public AnimalService(){
    this.animals = new ArrayList<Animal>();

    this.animals.add(new Animal(0,"Yosr", null, 34));
    this.animals.add(new Animal(1,"Ayoub", null, 3));
    this.animals.add(new Animal(2,"Fatima", null, 50));

}
//methode getAnimals
public Animal getAnimal(int id) {
    for (Animal animal : this.animals) {
        if (animal.getId() == id) {
            return animal;
        }  
    }
    return null;
}
public Animal creatAnimal(String name, String type,int weight){
    Animal animal = new Animal(animals.size(), name, type, weight);
    return animal;
}
public Animal createAnimal(String name, String type,int weight) {
    return null;
}
public Animal updateAnimal(int id, String name, String type,int weight){
  Animal animal = getAnimal(id);
  animal.setName(name);
  animal.setType(type);
  animal.setWeight(weight);
  return animal;

} 
public Animal deleteAnimal(int id){

    for (int index = 0; index < animals.size(); index++) {
        if (animals.get(index).getId() == id) {
        this.animals.remove(index);   
return animals.get(index);
}   
}
return null;
}
}   

