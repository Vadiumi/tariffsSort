import company.Company;
import company.TelephoneCompany;
import tariffs.Tariff;

import java.util.Arrays;
import java.util.List;

public class TariffSort {

    private List<Company> companyList;

    public TariffSort() {
        init();
    }

    private void init() {
        List<Tariff> tariffList = Arrays.asList(
                new Tariff("Start", 7,
                        12000, false,
                        false, false, false),
                new Tariff("Basic", 20,
                        15000, false,
                        true, true, false),
                new Tariff("InternetUnlimited", 35,
                        9000, true,
                        false, false, true),
                new Tariff("CallsUnlimited", 10,
                        13500, false,
                        true, false, false),
                new Tariff("MessagesUnlimited", 10,
                        7000, false,
                        false, true, false),
                new Tariff("AllInclusive", 50,
                        4500, true,
                        true, true, true)
        );
        companyList = Arrays.asList(
                new TelephoneCompany(tariffList)
        );
    }

    public void searchYourTariff(boolean unlimitedInternet, boolean unlimitedCalls, boolean freeMessages, boolean onlineCinema) {
        for (Company company : companyList) {
            for (Tariff tariff : company.getTariffs()) {
                if (tariff.isUnlimitedInternet() == unlimitedInternet &&
                        tariff.isUnlimitedCalls() == unlimitedCalls &&
                        tariff.isFreeMessages() == freeMessages &&
                        tariff.isOnlineCinema() == onlineCinema
                ) {
                    printTariff(tariff);
                }
            }
        }
    }

    public void searchYourTariff(int maxCost) {
        for (Company company : companyList) {
            for (Tariff tariff : company.getTariffs()) {
                if (maxCost >= tariff.getCost()) {
                    printTariff(tariff);
                }
            }
        }
    }

    private void printTariff(Tariff tariff) {
        System.out.println(tariff);
    }
}
