package me.mohammedriazkhan.controller.employee;

import me.mohammedriazkhan.domain.employee.Cleaner;
import me.mohammedriazkhan.factory.employee.CleanerFactory;
import me.mohammedriazkhan.service.employee.impl.CleanerServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/cleaner")
public class CleanerController {

    @Autowired
    private CleanerServiceImpl service;

    @PostMapping("/new")
    public Cleaner create(@RequestBody Cleaner clean){

        Cleaner cleaner = CleanerFactory.getCleaner(1);

        return service.create(cleaner);
    }

    @GetMapping(path = "/find/{id}")
    public Cleaner findById(@PathVariable int id){

        Cleaner cleaner = service.read(id);

        return cleaner;
    }

    @PutMapping("/update")
    public void update(@RequestBody Cleaner cleaner){

        service.update(cleaner);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable int id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<Cleaner> getAll(){
        return service.getAll();
    }

}
