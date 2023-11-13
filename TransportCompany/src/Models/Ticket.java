package Models;

import java.util.Date;

public class Ticket {
    private long id;
    private int departureZone;
    private int arrivalZone;
    private int routeNumber;
    private Date departureTime;
    private Date arrivalTime;
    private double price;
    private int place;
    private boolean isUsed;

    public Ticket(int routeNumber, int place, double price, Date departureTime, boolean isUsed) {
        this.routeNumber = routeNumber;
        this.place = place;
        this.price = price;
        this.departureTime = departureTime;
        this.isUsed = isUsed;
    }

    public long getId() {
        return id;
    }

    public int getDepartureZone() {
        return departureZone;
    }

    public void setDepartureZone(int departureZone) {
        this.departureZone = departureZone;
    }

    public int getArrivalZone() {
        return arrivalZone;
    }

    public void setArrivalZone(int arrivalZone) {
        this.arrivalZone = arrivalZone;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    public int getPlace() {
        return place;
    }

    public boolean getUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        this.isUsed = used;
    }
}
