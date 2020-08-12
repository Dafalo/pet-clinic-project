package spring.project.petclinicproject.services;

import java.util.Set;
import spring.project.petclinicproject.model.Pet;

public interface PetService {

  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();
}
