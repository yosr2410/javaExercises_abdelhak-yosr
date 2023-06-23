package fr.abdelhak.myApi.Controller;
import java.net.URI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.abdelhak.myApi.model.Animal;
import fr.abdelhak.myApi.service.AnimalService;

//Annotation
@RestController
//Class
public class AnimalController {
private AnimalService animalService;
// constructeur
public AnimalController(AnimalService animalService) {
   this.animalService = animalService;
}
//Annotation 
@GetMapping("/animal") 

   public Animal getAnimal(@RequestParam int id){
    Animal animal = animalService.getAnimal(id);
    return animal;
   }
@PostMapping("/animal")
public Animal createAnimal(@RequestBody AnimalRequest body){
   Animal animal = animalService.updateAnimal(0, body.getName(),body.getType(),body.getWeight());
   return animal;
}

@PutMapping("/animal")
public Animal updateAnimal(@RequestParam int id, @RequestBody AnimalRequest body){
Animal animal = animalService.updateAnimal(id, body.getName(), body.getType(), body.getWeight());
return animal;
}

@DeleteMapping("/animal")
public Animal updateAnimal(@RequestParam int id){
Animal animal = animalService.deleteAnimal(id);
return animal;
}
public class ResponseEntity<T>
@RequestMapping("/animal")
 public ResponseEntity<String> animal() {
   URI location = ...;
   HttpAnimals responseAnimals = new HttpAnimals();
   responseAnimals.setLocation(location);
   responseAnimals.set("MyResponseAnimal", "MyValue");
   return new ResponseEntity<String>("Hello World", responseAnimals, HttpStatus.CREATED);
 }
}   

