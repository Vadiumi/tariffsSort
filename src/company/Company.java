package company;

import tariffs.Tariff;

import java.util.List;

public abstract class Company {

    private final String name;
    private final List<Tariff> tariffs;

    public Company(String name, List<Tariff> tariffs) {
        this.name = name;
        this.tariffs = tariffs;
    }

    public String getName() {
        return name;
    }

    public List<Tariff> getTariffs() {
        return tariffs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", tariffs=" + tariffs +
                '}';
    }
}
