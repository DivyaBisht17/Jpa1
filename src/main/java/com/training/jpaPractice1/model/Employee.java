package com.training.jpaPractice1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="employee_data")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private  long id;
    private  String name;
    private  long phoneNo;

}
