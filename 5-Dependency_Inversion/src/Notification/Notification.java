package Notification;

import Notification.Message.Message;

import java.util.List;

public class Notification {

    List<Message> messages;

    public Notification(List<Message> messages) {
        this.messages = messages;
    }

    public void sender(){
        for(Message message:messages){
            message.sendMessage();
        }
    }
}
