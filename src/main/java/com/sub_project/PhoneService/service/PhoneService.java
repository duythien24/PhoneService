package com.sub_project.PhoneService.service;

import com.sub_project.PhoneService.entity.Phone;

import java.util.List;

public interface PhoneService {
    List<Phone> getListPhone();

    Phone getPhone(int id);

    void addPhone(Phone phone);

    void updatePhone(int id, Phone phone);

    void deletePhone(int id);
}
