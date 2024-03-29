package org.example.resortspringboot.Customer;

import java.time.LocalDate;

public class Customer {
    private long id;
    private String lastName;
    private String firstName;
    private String DriverLicense;
    private String phoneNumber;
    private String email;
    private LocalDate DoB;
    private int age;

    public Customer(long id, String lastName, String firstName, String driverLicense, String phoneNumber, String email, LocalDate DoB,int age) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.DriverLicense = driverLicense;
        this.phoneNumber = phoneNumber;
        this.DoB = DoB;
        this.email = email;
        this.age = age;
    }

    public Customer(String lastName, String firstName, String driverLicense, String phoneNumber, String email, LocalDate doB, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.DriverLicense = driverLicense;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.DoB = doB;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDriverLicense() {
        return DriverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        DriverLicense = driverLicense;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDoB() {
        return DoB;
    }

    public void setDoB(LocalDate doB) {
        DoB = doB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", DriverLicense='" + DriverLicense + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", DoB=" + DoB +
                ", age=" + age +
                '}';
    }
}
