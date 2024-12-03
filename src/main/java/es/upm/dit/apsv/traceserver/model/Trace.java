package es.upm.dit.apsv.traceserver.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

@Getter @Setter @NoArgsConstructor @ToString

public class Trace {

    @Id

    private String traceId;

    private String truck;

    private long lastSeen;

    private double lat;

    private double lng;


  

    public Trace(String traceId, String truck, long lastSeen, double lat, double lng) {
        this.traceId = traceId;
        this.truck = truck;
        this.lastSeen = lastSeen;
        this.lat = lat;
        this.lng = lng;
    }




    public String getTraceId() {
        return traceId;
    }




    public String getTruck() {
        return truck;
    }




    public long getLastSeen() {
        return lastSeen;
    }




    public double getLat() {
        return lat;
    }




    public double getLng() {
        return lng;
    }




    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }




    public void setTruck(String truck) {
        this.truck = truck;
    }




    public void setLastSeen(long lastSeen) {
        this.lastSeen = lastSeen;
    }




    public void setLat(double lat) {
        this.lat = lat;
    }




    public void setLng(double lng) {
        this.lng = lng;
    }
                  
}
