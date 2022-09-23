import Notification.Message.Email.Email;
import Notification.Message.Message;
import Notification.Message.SMS.SMS;
import Notification.Notification;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Message> messages=new ArrayList<>();
        messages.add(new SMS());
        messages.add(new Email());

        Notification notification=new Notification(messages);
        notification.sender();
    }
}