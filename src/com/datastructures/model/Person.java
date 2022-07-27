package com.datastructures.model;

public class Person implements Comparable<Person> {

    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private String ip_address;
    private String country;
    private String country_code;
    private String currency;
    private String currency_code;

    public Person(int id, String first_name, String last_name, String email, String gender, String ip_address,
                  String country, String country_code, String currency, String currency_code) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.ip_address = ip_address;
        this.country = country;
        this.country_code = country_code;
        this.currency = currency;
        this.currency_code = currency_code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", ip_address='" + ip_address + '\'' +
                ", country='" + country + '\'' +
                ", country_code='" + country_code + '\'' +
                ", currency='" + currency + '\'' +
                ", currency_code='" + currency_code + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (!first_name.equals(person.first_name)) return false;
        if (!last_name.equals(person.last_name)) return false;
        if (!email.equals(person.email)) return false;
        if (!gender.equals(person.gender)) return false;
        if (!ip_address.equals(person.ip_address)) return false;
        if (!country.equals(person.country)) return false;
        if (!country_code.equals(person.country_code)) return false;
        if (!currency.equals(person.currency)) return false;
        return currency_code.equals(person.currency_code);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + first_name.hashCode();
        result = 31 * result + last_name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + gender.hashCode();
        result = 31 * result + ip_address.hashCode();
        result = 31 * result + country.hashCode();
        result = 31 * result + country_code.hashCode();
        result = 31 * result + currency.hashCode();
        result = 31 * result + currency_code.hashCode();
        return result;
    }

    @Override
    public int compareTo(Person o) {
        if (this.equals(o)) return 0;
        if (first_name.equals(o.getFirst_name())) return 0;
        return first_name.compareTo(o.getFirst_name());
    }
}
