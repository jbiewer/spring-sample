package com.springsample.model;

/**
 * To make data serialization/storage easier, we can make models of non-primitive data.
 * This class models a 'member' of a team, having information about their name and the school
 * they go to.
 *
 * Getters/Setters are required to allow for serialization of the model by Spring.
 */
public class Member {
    private String name;
    private String school;

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
