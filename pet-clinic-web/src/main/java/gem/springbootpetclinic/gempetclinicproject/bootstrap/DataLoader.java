package gem.springbootpetclinic.gempetclinicproject.bootstrap;

import gem.springbootpetclinic.gempetclinicproject.model.Owner;
import gem.springbootpetclinic.gempetclinicproject.model.Vet;
import gem.springbootpetclinic.gempetclinicproject.services.OwnerService;
import gem.springbootpetclinic.gempetclinicproject.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{
    private final OwnerService ownerService;
    private final VetService vetService;
   // private final PetService petService;

    public DataLoader(OwnerService ownerService, VetService vetService)
    {
       // petService = new PetServiceMap();
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception
    {
        Owner owner1 = new Owner();
        owner1.setFirstName("Dhanashree");
        owner1.setLastName("Chorghe");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Pramod");
        owner2.setLastName("Patil");
        ownerService.save(owner2);

        System.out.println("Loaded Owners.......");

        Vet vet1 = new Vet();
        vet1.setFirstName("Clause");
        vet1.setLastName("Morgen");
        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setFirstName("Helly");
        vet2.setLastName("joseph");
        vetService.save(vet2);

        System.out.println("Loaded Vets.......");

//        Pet pet1 = new Pet();
//        pet1.setId(1L);
//        petService.save(pet1);
//
//        Pet pet2 = new Pet();
//        pet2.setId(2L);
//        petService.save(pet2);
//
//        System.out.println("Loaded Pets.......");
    }
}
