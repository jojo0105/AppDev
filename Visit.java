/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdev;

import java.util.Date;

/**
 * Assignment 1
 * @author George Aziz 2070513
 * For Application Development 2 (Mobile) - Winter 2022
 * 
 * A Visit class that represents the customer info and the date and the purchased
 * he did in the beauty salon
 */
public class Visit {
    
    private Customer customer;
    private Date date;
    private double serviceExpenses;
    private double productExpenses;

    /**
     * A visit constructor with the name of the customer and the date
     * @param name the customer name
     * @param date the date 
     */
    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    /**
     * Gets the customer name
     * @return the customer name
     */
    public String getName() {
        return customer.getName();
    }

    /**
     * Sets the name of the customer
     * @param name the new name of the customer 
     */
    public void setName(String name) {
        this.customer.setName(name);
    }
    
    /**
     * Gets the customer
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the customer
     * @param customer the new customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Gets the service expenses
     * @return the service expenses
     */
    public double getServiceExpenses() {
        return serviceExpenses;
    }

    /**
     * Sets the service expenses
     * @param serviceExpenses the new service expenses
     */
    public void setServiceExpenses(double serviceExpenses) {
        this.serviceExpenses = serviceExpenses;
    }

    /**
     * Gets the product expenses
     * @return the product expenses
     */
    public double getProductExpenses() {
        return productExpenses;
    }

    /**
     * Sets the product expenses
     * @param productExpenses the new product expenses
     */
    public void setProductExpenses(double productExpenses) {
        this.productExpenses = productExpenses;
    }
    
    /**
     * Gets the total expenses
     * @return the total expenses
     */
    public double getTotalExpense() {
        return  (serviceExpenses - (serviceExpenses * 
                DiscountRate.getServiceDiscountRate(customer.getMemberType()))) +
                (productExpenses - (productExpenses * 
                DiscountRate.getProductDiscountRate(customer.getMemberType())));

    }

    /**
     * A to string
     * @return the string to print the visit info 
     */
    @Override
    public String toString() {
        return "Visit{" + "customer= " + customer + ", date= " + date + 
                ", serviceExpenses= " + serviceExpenses + ", productExpenses= " + productExpenses + '}';
    }
    
    public static void main(String[] args) {
        Date date = new Date();
        Visit v1 = new Visit("George", date);
        v1.getCustomer().setMemberType("Premium");
        v1.setProductExpenses(4.5);
        v1.setServiceExpenses(8.5);
        v1.setProductExpenses(1.5);
        System.out.println(v1.toString());
        System.out.println("Total expense made by " + v1.getName()+ " = " + v1.getTotalExpense());
                
    }
}
