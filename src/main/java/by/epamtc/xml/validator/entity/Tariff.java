package by.epamtc.xml.validator.entity;

import java.util.LinkedList;
import java.util.List;

public class Tariff {

    private String id;
    private String name;
    private String connectPrice;
    private String smsPrice;
    private List<Call> callList = new LinkedList<Call>();

    public Tariff(){}

    public Tariff(String id, String name, String connectPrice, String smsPrice, List<Call> callList) {
        this.id = id;
        this.name = name;
        this.connectPrice = connectPrice;
        this.smsPrice = smsPrice;
        this.callList = callList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConnectPrice() {
        return connectPrice;
    }

    public void setConnectPrice(String connectPrice) {
        this.connectPrice = connectPrice;
    }

    public String getSmsPrice() {
        return smsPrice;
    }

    public void setSmsPrice(String smsPrice) {
        this.smsPrice = smsPrice;
    }

    public List<Call> getCallList() {
        return callList;
    }

    public void setCallList(List<Call> callList) {
        this.callList = callList;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", connectPrice='" + connectPrice + '\'' +
                ", smsPrice='" + smsPrice + '\'' +
                ", callList=" + callList +
                '}';
    }
}
