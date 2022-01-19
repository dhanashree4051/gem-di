package gem.springbootpetclinic.gempetclinicproject.services;

import gem.springbootpetclinic.gempetclinicproject.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>
{
    Owner findByLastName(String lastName);
}
