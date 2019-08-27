package pl.achrzanowski.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.achrzanowski.Entity.Person;
import pl.achrzanowski.Service.PersonService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PersonRestController {

    @Autowired
    private PersonService personService;

    @PostMapping("/add")
    private Person saveNewPerson(@Valid @RequestBody Person person){

        personService.savePerson(person);

        return person;

    }

    @GetMapping("/list")
    private List<Person> getAllPersons(){
        return personService.getAllPersons();
    }
}
