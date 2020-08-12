package spring.project.petclinicproject.services;

import java.util.Set;
import spring.project.petclinicproject.model.Vet;

public interface VetService {

  Vet findById(Long id);

  Vet save(Vet vet);

  Set<Vet> findAll();

}
