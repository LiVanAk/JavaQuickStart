package encapsulation.encap;

public class Account {
    private String name;
    private double save;
    private String password;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.length() > 1 && name.length() < 5) {
            this.name = name;
            System.out.println("Name set successfully.");
        }
        else {
            this.name = "Lee";
            System.out.println("Nameset failed, default to Lee.");
        }
    }

    public double getSave() {
        return save;
    }
    public void setSave(double save) {
        if (save > 0) {
            this.save = save;
        }
        else {
            this.save = 0;
        }
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        }
        else {
            this.password = "000000";
            System.out.println("Wrong password set.");
        }
    }
    
}
