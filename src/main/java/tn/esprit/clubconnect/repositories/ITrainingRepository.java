package tn.esprit.clubconnect.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.clubconnect.entities.Training;

public interface ITrainingRepository extends CrudRepository<Training, Integer> {
}
