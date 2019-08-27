package pl.achrzanowski.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.achrzanowski.Entity.Person;
import pl.achrzanowski.Repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons(){

        List<Person> personList = new ArrayList<Person>();

        for(Person person: personRepository.findAll())
            personList.add(person);

        return personList;

    }

    public void savePerson(Person person){
        personRepository.save(person);
    }
}
