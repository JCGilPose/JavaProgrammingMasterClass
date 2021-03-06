public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String name) {
        firstName = name;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public void setAge(int years) {
        if (years < 0 || years > 100) {
            age = 0;
        }
        else {
            age = years;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        }
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        return (firstName + " " + lastName);
    }
}
