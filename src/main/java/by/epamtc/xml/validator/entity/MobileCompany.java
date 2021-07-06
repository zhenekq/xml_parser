package by.epamtc.xml.validator.entity;

import java.util.LinkedList;
import java.util.List;

public class MobileCompany {
    private String companyName;
    private String foundationDate;
    private List<Tariff> tariff = new LinkedList<Tariff>();


    public MobileCompany() {}

    public MobileCompany(String companyName, String foundationDate, List<Tariff> tariff) {
        this.companyName = companyName;
        this.foundationDate = foundationDate;
        this.tariff = tariff;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(String foundationDate) {
        this.foundationDate = foundationDate;
    }

    public List<Tariff> getTariff() {
        return tariff;
    }

    public void setTariff(List<Tariff> tariff) {
        this.tariff = tariff;
    }

    @Override
    public String toString() {
        return "MobileCompany{" +
                "companyName='" + companyName + '\'' +
                ", foundationDate='" + foundationDate + '\'' +
                ", tariff=" + tariff +
                '}';
    }
}

