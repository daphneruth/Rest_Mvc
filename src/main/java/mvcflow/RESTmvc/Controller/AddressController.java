package mvcflow.RESTmvc.Controller;


import mvcflow.RESTmvc.Model.Repository.AddressRepository;
import mvcflow.RESTmvc.Model.Entity.AddressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository addRepository;

    @GetMapping("/getAddress")
    public List<AddressEntity> getEmployees(){
        return addRepository.findAll();
    }

}
