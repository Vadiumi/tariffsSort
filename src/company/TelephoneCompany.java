package company;

import tariffs.Tariff;

import java.util.List;

public class TelephoneCompany extends Company {

    public TelephoneCompany(List<Tariff> tariffs) {
        super("TelephoneCompany", tariffs);
    }
}
