package spring.project.petclinicproject.services;

import java.util.Set;
import spring.project.petclinicproject.model.Owner;

public interface OwnerService {

  Owner findByLastName(String lastName);

  Owner findById(Long id);

  Owner save(Owner owner);

  Set<Owner> findAll();

}
