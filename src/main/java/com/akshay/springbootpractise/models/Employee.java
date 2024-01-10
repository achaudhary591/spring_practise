package com.akshay.springbootpractise.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
}
