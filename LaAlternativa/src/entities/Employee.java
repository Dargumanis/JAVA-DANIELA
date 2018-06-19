/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author alulab14
 */
public class Employee {

    private int id;
    private String dni;
    private String name; 
    private String surname;
    private String address; 
    private String phoneNumber; 
    private String email; 
    private String password; 
    private int type; 
    private int changePassword;

    public Employee(String dni, String name, String surname, String address, String phoneNumber, String email, String password, int type) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.type = type;
    }
   
    
    public Employee(int id, String dni, String name, String surname, String address, String password, String email, String phoneNumber, int type) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }
    
    public Employee(int id, String dni, String name, String surname, String address, String phoneNumber, String email, String password, int type, int changePassword) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.type = type;
        this.changePassword = changePassword;
    }
    
    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the changePassword
     */
    public int getChangePassword() {
        return changePassword;
    }

    /**
     * @param changePassword the changePassword to set
     */
    public void setChangePassword(int changePassword) {
        this.changePassword = changePassword;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
