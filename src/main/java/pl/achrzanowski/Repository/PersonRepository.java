package pl.achrzanowski.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.achrzanowski.Entity.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {}
