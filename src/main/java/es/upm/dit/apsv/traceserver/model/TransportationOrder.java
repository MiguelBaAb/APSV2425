package es.upm.dit.apsv.traceserver.model;

public class TransportationOrder {  

    private String toid;

    private String truck;

    private long originDate;

    private double originLat;

    private double originLong;

    private long dstDate;

    private double dstLat;

    private double dstLong;

    private long lastDate;

    private double lastLat;

    private double lastLong;

    private int st;

    public String getToid() {
        return toid;
    }

    public String getTruck() {
        return truck;
    }

    public long getOriginDate() {
        return originDate;
    }

    public double getOriginLat() {
        return originLat;
    }

    public double getOriginLong() {
        return originLong;
    }

    public long getDstDate() {
        return dstDate;
    }

    public double getDstLat() {
        return dstLat;
    }

    public double getDstLong() {
        return dstLong;
    }

    public long getLastDate() {
        return lastDate;
    }

    public double getLastLat() {
        return lastLat;
    }

    public double getLastLong() {
        return lastLong;
    }

    public int getSt() {
        return st;
    }

    public void setToid(String toid) {
        this.toid = toid;
    }

    public void setTruck(String truck) {
        this.truck = truck;
    }

    public void setOriginDate(long originDate) {
        this.originDate = originDate;
    }

    public void setOriginLat(double originLat) {
        this.originLat = originLat;
    }

    public void setOriginLong(double originLong) {
        this.originLong = originLong;
    }

    public void setDstDate(long dstDate) {
        this.dstDate = dstDate;
    }

    public void setDstLat(double dstLat) {
        this.dstLat = dstLat;
    }

    public void setDstLong(double dstLong) {
        this.dstLong = dstLong;
    }

    public void setLastDate(long lastDate) {
        this.lastDate = lastDate;
    }

    public void setLastLat(double lastLat) {
        this.lastLat = lastLat;
    }

    public void setLastLong(double lastLong) {
        this.lastLong = lastLong;
    }

    public void setSt(int st) {
        this.st = st;
    }
    
    public double distanceToDestination(){
        return Math.sqrt(Math.pow(this.dstLat - this.lastLat, 2)+ Math.pow(this.dstLong - this.lastLong, 2));
    }
}