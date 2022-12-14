package se331.rest.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String name;
    String surname;
    String age;
    String hometown;
    String status;
    @ManyToOne
    Doctor doctor;
    @OneToMany(mappedBy = "commentTo")
    @Builder.Default
    List<Comment> comments = new ArrayList<>();
    @ManyToMany
    @Builder.Default
    List<Vaccine> vaccines = new ArrayList<>();
    @ElementCollection
    List<String> imageUrls;

}
