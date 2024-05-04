package tn.esprit.clubconnect.services;

import tn.esprit.clubconnect.entities.Registration;

import java.util.List;

public interface IRegistrationServices {

    List<Registration> findAll();

    Registration findById(Integer idR);

    Registration save(Registration registration);

    void deleteById(Integer idR);
}
