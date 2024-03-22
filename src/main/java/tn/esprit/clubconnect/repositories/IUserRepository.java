package tn.esprit.clubconnect.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.clubconnect.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

}
