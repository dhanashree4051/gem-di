package gem.springbootpetclinic.gempetclinicproject.services.map;

import gem.springbootpetclinic.gempetclinicproject.model.Pet;
import gem.springbootpetclinic.gempetclinicproject.services.CrudService;
import gem.springbootpetclinic.gempetclinicproject.services.PetService;

import java.util.Set;


public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService
{
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object)
    {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }
}
