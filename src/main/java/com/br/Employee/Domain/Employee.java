package com.br.Employee.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

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
    public Employee(){
    }

    public String getId() {
        return this.id;
    }

    public LocalDate getDate_joined() {
        return date_joined;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getEmail() {
        return email;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
