package com.sub_project.PhoneService.service;

import com.sub_project.PhoneService.entity.Phone;
import com.sub_project.PhoneService.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService{
    @Autowired
    private PhoneRepository phoneRepository;
    @Override
    public List<Phone> getListPhone() {
        return phoneRepository.findAll();

    }

    @Override
    public Phone getPhone(int id) {
        return phoneRepository.findById(id).get();

    }

    @Override
    public void addPhone(Phone phone) {
        phoneRepository.save(phone);

    }

    @Override
    public void updatePhone(int id, Phone phone) {
        phone.setId(id);
        phoneRepository.save(phone);
    }

    @Override
    public void deletePhone(int id) {
        phoneRepository.deleteById(id);

    }
}
