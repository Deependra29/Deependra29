package Encapsulation;

public class Patient {
    private String name;
    private int age;
    private String disease;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    private String reason;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2) {
            this.name = name;
        } else
            System.out.println("Invalid name");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("The age is invalid");
        }
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;

    }

}