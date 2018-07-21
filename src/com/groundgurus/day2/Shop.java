package com.groundgurus.day2;

/**
 *
 * @author Jhomar
 */
public class Shop {

    private String name;
    private String[] items;
    private String address;
    private int numberOfEmployees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        if(numberOfEmployees > 0){
        this.numberOfEmployees = numberOfEmployees;
    }
        else{
            System.err.println("The number is invalid");
        }
    }

    
    public Shop() {
    }

    public Shop(String name, String[] items, String address, int numberOfEmployees) {
        this.name = name;
        this.items = items;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String findByItemName(String name) {
        return "";
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("Number of Employees: " + numberOfEmployees);
        System.out.println("Address: " + address);
    }
}
