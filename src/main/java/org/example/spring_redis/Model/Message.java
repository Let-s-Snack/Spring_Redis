package org.example.spring_redis.Model;

public class Message {
    private String message;
    private int cont;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public Message() {}

    public Message(String message) {
        this.message = message;
    }
    public Message(int cont) {
        this.cont = cont;
    }
    public Message(String message, int cont) {
        this.message = message;
        this.cont = cont;
    }


    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", cont=" + cont +
                '}';
    }
}
