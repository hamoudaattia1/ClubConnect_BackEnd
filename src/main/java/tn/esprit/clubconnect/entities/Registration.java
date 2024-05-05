package tn.esprit.clubconnect.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Registrations")
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idR;

    @Column(nullable = false, length = 100)
    private String studentName;

    @Column(nullable = false, length = 100)
    private String studentLastName;

    @Column(nullable = false, length = 100)
    private String studentEmail;

    @Column(nullable = false, length = 20)
    private String studentPhone;

    @Column(nullable = false, length = 255)
    private String studentAddress;

    @Column(nullable = false, length = 255)
    private String studentSkills;

    @Column(nullable = false, length = 255)
    private String studentMotivation;

}