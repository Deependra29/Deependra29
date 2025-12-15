package Encapsulation;

public class PatientClient {
    public static void main(String[] args) {

        Patient patient = new Patient();

        patient.setName("Deependra");
        patient.setAge(26);
        patient.setDisease("Mental problem ");
        patient.setReason("Due to one mental girl(Meenakshi Singh) who came into my life ");

        System.out.println("Patient name is : " + patient.getName());
        System.out.println("Patient age is : " + patient.getAge());
        System.out.println("Patient disease name  is : " + patient.getDisease());
        System.out.println("Patient disease name  is : " + patient.getReason());
    }
}
