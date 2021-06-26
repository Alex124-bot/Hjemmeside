package business.entities;

public class User {
    private int id; // just used to demo retrieval of autogen keys in UserMapper
    private String name;
    private String street;
    private String town;
    private int zipCode;
    private String email;
    private String password; // Should be hashed and secured
    private int phone;
    private String role;

    public User(String name, String street, String town, int zipCode, String email, String password, int phone, String role) {
        this.name = name;
        this.street = street;
        this.town = town;
        this.zipCode = zipCode;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.role = role;
    }

    public User(String name, String street, String town, int zipCode, String email, String password, int phone) {
        this.name = name;
        this.street = street;
        this.town = town;
        this.zipCode = zipCode;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public User(int id, String name, String street, String town, int zipCode, String email, int phone, String role) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.town = town;
        this.zipCode = zipCode;
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}