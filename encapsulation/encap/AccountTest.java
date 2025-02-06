package encapsulation.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account Lee = new Account();
        Lee.setName("Novi");
        Lee.setSave(1000);
        Lee.setPassword("424291");

        System.out.println("Name: " + Lee.getName() + "  Save: " +Lee.getSave() +
        "  Password: " + Lee.getPassword());
    }

}
