package Entity.Address;

import Entity.User.User;

public class Address {

    private long id;
    private String street;
    private String city;
    private String country;
    private String Apartment;
    private int Flat_Number;

    //getters and setters

    public long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getApartment() {
        return Apartment;
    }

    public void setApartment(String apartment) {
        Apartment = apartment;
    }

    public int getFlat_Number() {
        return Flat_Number;
    }

    public void setFlat_Number(int flat_Number) {
        Flat_Number = flat_Number;
    }
}
