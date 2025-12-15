package interfaces.communicationservice;

public class Client {
    public static void main(String[] args) {
        UserCommunicationService u = new UserCommunicationService();
        u.sendEmail("Meenakshi", " is my best friend forever");
        u.sendNotification(" kumar12", " Meenakshi's Id");
    }
}
