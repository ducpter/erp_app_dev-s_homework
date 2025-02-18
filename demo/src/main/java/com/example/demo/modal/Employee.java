package com.example.demo.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// @Entity annotation defines that a 
// class can be mapped to a table
@Entity 
public class Employee {
  
    // @ID This annotation specifies 
    // the primary key of the entity.
    @Id 
  
    // @GeneratedValue This annotation 
    // is used to specify the primary 
    // key generation strategy to use
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private long id;
    private String name;
    private String city;

    public Employee() {
        super();
    }
    public Employee(String name, String city) {
        super();
        this.name = name;
        this.city = city;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getId() { // Thêm getter cho id
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
