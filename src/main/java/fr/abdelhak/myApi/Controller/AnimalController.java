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



@GetMapping("/animalResponse")
 public ResponseEntity<Animal>  animal(@RequestParam int id) {
    Animal animal = animalService.getAnimal(id);
if(animal != null && animal.getId() != 0){
   return new ResponseEntity<Animal>(animal, HttpStatus.ACCEPTED);
}
  return new ResponseEntity<Animal>(animal, HttpStatus.NOT_ACCEPTABLE);
 }
@GetMapping("/animalResponse2")
 public ResponseEntity<Animal> animal2(@RequestParam int id) {
    Animal animal = animalService.getAnimal(id);
if(animal != null && animal.getId() != 0){
   return new ResponseEntity<Animal>(animal, HttpStatus.CREATED);
}
  return new ResponseEntity<Animal>(animal, HttpStatus.NOT_MODIFIED);
 }
 @GetMapping("/animalResponse3")
 public ResponseEntity<Animal> animal3(@RequestParam int id) {
    Animal animal = animalService.getAnimal(id);
if(animal != null && animal.getId() != 0){
   return new ResponseEntity<Animal>(animal, HttpStatus.CONTINUE);
}
  return new ResponseEntity<Animal>(animal, HttpStatus.NOT_EXTENDED); // IL FAUT UN LOGIN ET MOT DE PASSE 
 }
} 

  

