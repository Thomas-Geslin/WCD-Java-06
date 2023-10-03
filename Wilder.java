public class Wilder {
    private String firstname;
    private boolean present;

    public Wilder(String firstname, boolean present) {
        this.firstname = firstname;
        this.present = present;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public String whoAmI() {
        return "My name is " + getFirstname() + " and I am " + (isPresent() ? "present" : "not present");
    }
}