package br.edu.ifpb.educad.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "course")
public class Course implements Serializable {
    private static final long serialVersionUID = -1358145327397413208L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq")
    @SequenceGenerator(name = "course_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

    @ManyToOne(cascade = {CascadeType.REFRESH})
    private Institution institution;

    @Column(name = "created_date", updatable = false)
    @CreatedDate
    private LocalDate createdDate;

    @Column(name = "modified_date")
    @LastModifiedDate
    private LocalDate modifiedDate;


    public Long getId() {
        return id;
    }

}