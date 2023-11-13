package Models;

import java.util.List;

public class User {
    private long id;
    private String userName;
    private List<Ticket> tickets;
    private long hashPassword;
    private long cardNumber;

    public User(long id, String userName, long hashPassword, long cardNumber) {
        this.id = id;
        this.userName = userName;
        this.hashPassword = hashPassword;
        this.cardNumber = cardNumber;
    }
    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public long getHashPassword() {
        return hashPassword;
    }

    public long getCardNumber() {
        return cardNumber;
    }

}
