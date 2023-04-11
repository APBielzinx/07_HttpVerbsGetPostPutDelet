package br.com.erudio;



import br.com.erudio.model.Person;
import br.com.erudio.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.logging.Logger;


@RestController
@RequestMapping("/person")
public class PersonController {


    @Autowired
    private PersonServices services;

    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)


    public Person findById(@PathVariable(value = "id") String id) throws Exception {


        return services.findById(id);

    }

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)


    public Person create(@RequestBody Person person) throws Exception {


        return services.create(person);

    }

    @RequestMapping(
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)


    public Person update(@RequestBody Person person) throws Exception {


        return services.update(person);

    }



    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)


    public List<Person> findAll() {


        return services.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)

    public void delete(@RequestBody  String id) throws Exception {


    services.delete(id);


    }
}
