package me.mohammedriazkhan.controller.employee;

import me.mohammedriazkhan.domain.employee.Doctor;
import me.mohammedriazkhan.repository.employee.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository doctorService;

    @PostMapping("/new")
    public Doctor create(@RequestBody Doctor doc){

        return doctorService.save(doc);
    }

    @GetMapping(path = "/find/{id}")
    public Optional<Doctor> findById(@PathVariable int id){

        return doctorService.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Doctor doc){

        doctorService.save(doc);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable int id){

        doctorService.deleteById(id);
    }

    @GetMapping("/getAll")
    public Set<Doctor> getAll(){
        return (Set<Doctor>) doctorService.findAll();
    }


}
