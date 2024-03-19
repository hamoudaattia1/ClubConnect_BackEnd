package tn.esprit.clubconnect.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idU;
    String firstName;
    String lastName;
    String email;
    String password;
    String pseudoname;
    @Enumerated(EnumType.STRING)
    Role role;

    @OneToMany(mappedBy = "user")
    Set<Reclamation> reclamations;

    @ManyToMany
    Set<Club> clubs;




}
