package com.sub_project.PhoneService.controller;

import com.sub_project.PhoneService.entity.Phone;
import com.sub_project.PhoneService.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phones")
public class PhoneRestController {
    @Autowired
    private PhoneService phoneService;
    @GetMapping("/")
    public List<Phone> getListPhone(){
        return phoneService.getListPhone();
    }
    @GetMapping("/{id}")
    public Phone getBook(@PathVariable("id") int id){
        return phoneService.getPhone(id);
    }

    @PostMapping("/")
    public String addFaculty(@RequestBody Phone phone){
        try{
            phoneService.addPhone(phone);
            return "Add Success";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @PutMapping("/{id}")
    public String updateFaculty(@PathVariable("id") int id, @RequestBody Phone phone){
        try{
            phoneService.updatePhone(id, phone);
            return "Update Success";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @DeleteMapping ("/{id}")
    public String deleteFaculty(@PathVariable("id") int id){
        try{
            phoneService.deletePhone(id);
            return "Success";
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
