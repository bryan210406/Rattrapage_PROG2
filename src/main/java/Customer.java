import java.time.LocalDate;

public class Customer {
    private String lastname;
    private String firstname;
    private LocalDate birthDate;
    private String email;
    private String phoneNumber;
    private String address;

    public Customer(String lastname, String firstname, LocalDate birthDate, String email, String phoneNumber, String address){
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
