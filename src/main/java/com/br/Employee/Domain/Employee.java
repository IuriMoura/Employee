package com.br.Employee.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Entity(name="employee")
@Table(name="employee")
@EqualsAndHashCode(of = "id")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String first_name;
    private String last_name;
    private String email;
    private LocalDate date_joined;

    public Employee(RequestEmployee request){
        this.first_name = request.first_name();
        this.last_name = request.last_name();
        this.email = request.email();
        this.date_joined = LocalDate.now();
    }
}
