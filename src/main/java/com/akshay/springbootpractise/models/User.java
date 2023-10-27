package com.akshay.springbootpractise.models;

import lombok.Getter;

@Getter
public class User {

    /**
     * -- GETTER --
     *  get field
     *
     */
    private int id;
    /**
     * -- GETTER --
     *  get field
     *
     */
    private String name;
    /**
     * -- GETTER --
     *  get field
     *
     */
    private String email;


    /**
     * set field
     *
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * set field
     *
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set field
     *
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
