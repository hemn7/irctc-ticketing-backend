package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticket {
    private String ticketId;
    private String source;
    private String destination;
    private String userId;
    private String dateOfTravel;
    private Train train;
    public Ticket() {}
    public Ticket(String ticketId, String source, String destination, String userId, String dateOfTravel, Train train) {
        this.ticketId=ticketId;
        this.source=source;
        this.destination=destination;
        this.userId=userId;
        this.dateOfTravel=dateOfTravel;
        this.train=train;
    }

    //Getters and Setters

    public String getUserId() {
        return userId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Train getTrain() {
        return train;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDateOfTravel() {
        return dateOfTravel;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDateOfTravel(String dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

}

