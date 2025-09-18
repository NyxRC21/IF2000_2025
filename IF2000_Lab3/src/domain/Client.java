/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Ríos
 */
public class Client {

    protected String idNumber;
    protected String name;
    protected String phone;
    protected String address;

    public Client(String idNumber, String name, String phone, String address) {
        this.idNumber = idNumber;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "\n----------------"
                + "\nPerson:" 
                + "\n ID=" + getIdNumber() 
                +"\n lastName=" + getName()
                +"\n Phone=" + getPhone()
                +"\n Address=" + getAddress();
    }
}