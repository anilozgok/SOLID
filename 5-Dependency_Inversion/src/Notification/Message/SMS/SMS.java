package Notification.Message.SMS;

import Notification.Message.Message;

public class SMS implements Message {
    @Override
    public void sendMessage() {
        sendSMS();
    }
    private void sendSMS(){
        //logic
        System.out.println("sendSMS logic.");
    }
}
