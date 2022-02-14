/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdev;

/**
 * Assignment 1
 * @author George Aziz 2070513
 * For Application Development 2 (Mobile) - Winter 2022
 * 
 * A Customer class that represents the customer of the beauty salon
 */
public class Customer {
    
    private String name;
    private boolean member = false;
    private String memberType;

    /**
     * A constructor that initialize a customer with only the name 
     * @param name the name of the customer
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the customer
     * @return the name of the customer
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of a customer
     * @param name the new name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * checks if the customer is member or not
     * @return whether he is a member or not
     */
    public boolean isMember() {
        return member;
    }

    /**
     * Sets whether a customer is a member or not 
     * @param member if he is a member or not
     */
    public void setMember(boolean member) {
        this.member = member;
    }

    /**
     * Gets the member type of the customer
     * @return the member type
     */
    public String getMemberType() {
        return memberType;
    }

    /**
     * Sets the member type of the customer
     * @param memberType the new member type
     */
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    /**
     * A to string
     * @return the string to print the customer info 
     */
    @Override
    public String toString() {
        return "Customer{" + "name= " + name + ", member= " + member + 
                ", memberType= " + memberType + '}';
    }
}
