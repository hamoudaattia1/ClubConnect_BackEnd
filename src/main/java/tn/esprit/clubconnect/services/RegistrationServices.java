package tn.esprit.clubconnect.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.clubconnect.entities.Registration;
import tn.esprit.clubconnect.repositories.IRegistrationRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class RegistrationServices implements IRegistrationServices {
    IRegistrationRepository registrationRepository;

    @Override
    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    @Override
    public Registration findById(Integer idR) {
        return registrationRepository.findById(idR).orElse(null);
    }

    @Override
    public Registration save(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public void deleteById(Integer idR) {
        registrationRepository.deleteById(idR);
    }
}



