package maintainstudents.model;

public class Student {
    private String firstname;
    private String lastname;

    private String email;
    private String postalAddress;
    private int matriculationNumber;

    public Student() {
    }

    public Student(String firstname, String lastname, String email, String postalAddress, int matriculationNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.postalAddress = postalAddress;
        this.matriculationNumber = matriculationNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }
}
