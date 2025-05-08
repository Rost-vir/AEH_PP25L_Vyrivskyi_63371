package pl.pp;

public class PersonalInfo {
    private String name;
    private String email;
    private String phone;
    private String accountNumber;
    private double balance;

    public PersonalInfo(String name, String email, String phone, String accountNumber, double balance) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static PersonalInfo createDefaultUser() {
        return new PersonalInfo("Name", "Mail", "123-456-789", "1234567890", 1000.0);
    }

    // get
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // set
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

