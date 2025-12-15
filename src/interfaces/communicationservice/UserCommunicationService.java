package interfaces.communicationservice;

public class UserCommunicationService implements EmailService,NotificationService{


    @Override
    public void sendNotification(String id, String msg) {
        System.out.println("This is sendNotification : " + msg + id);
    }

    @Override
    public void sendEmail(String to, String massege) {
        System.out.println("This is sendEmail : " + to + massege);

    }
}
