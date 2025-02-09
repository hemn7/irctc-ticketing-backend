package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;
import java.util.Map;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Train {
    private String trainId;
    private String pnrNo;
    private List<List<String>> seats;
    private Map<String,String> stationTimes;
    private List<String> listOfStations;
    public Train() {}
    public Train(String trainId, String pnrNo, List<List<String>> seats, Map<String,String> stationTimes, List<String> listOfStations) {
        this.trainId=trainId;
        this.pnrNo=pnrNo;
        this.seats=seats;
        this.stationTimes=stationTimes;
        this.listOfStations=listOfStations;
    }

    //Getters and Setters

    public String getTrainId() {
        return trainId;
    }

    public String getPnrNo() {
        return pnrNo;
    }

    public List<String> getListOfStations() {
        return listOfStations;
    }

    public Map<String, String> getStationTimes() {
        return stationTimes;
    }

    public List<List<String>> getSeats() {
        return seats;
    }

    public void setStationTimes(Map<String, String> stationTimes) {
        this.stationTimes = stationTimes;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public void setSeats(List<List<String>> seats) {
        this.seats = seats;
    }

    public void setListOfStations(List<String> listOfStations) {
        this.listOfStations = listOfStations;
    }

    public void setPnrNo(String pnrNo) {
        this.pnrNo = pnrNo;
    }
}
