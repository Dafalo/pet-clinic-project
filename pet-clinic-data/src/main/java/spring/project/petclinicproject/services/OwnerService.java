package spring.project.petclinicproject.services;

import spring.project.petclinicproject.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
