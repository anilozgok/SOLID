package Notification.Message.Email;

import Notification.Message.Message;

public class Email implements Message {
    @Override
    public void sendMessage() {
        sendEmail();
    }
    private void sendEmail(){
        //logic
        System.out.println("sendEmail logic.");
    }
}
