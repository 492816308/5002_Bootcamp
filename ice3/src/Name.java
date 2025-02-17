public class Name {

    private String firstName;
    private String lastName;

    public Name() {
        firstName = "";
        lastName = "";
    }

    public Name(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }

    public String getFullName(String fiName, String laName) {
        return fiName + " " + laName;
    }
}
