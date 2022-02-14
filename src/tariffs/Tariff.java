package tariffs;

public class Tariff {

    private final String name;
    private final int cost;
    private final int subscribers;
    private final boolean unlimitedInternet;
    private final boolean unlimitedCalls;
    private final boolean freeMessages;
    private final boolean onlineCinema;

    public Tariff(String name, int cost,
                  int subscribers, boolean unlimitedInternet,
                  boolean unlimitedCalls, boolean freeMessages,
                  boolean onlineCinema) {
        this.name = name;
        this.cost = cost;
        this.subscribers = subscribers;
        this.unlimitedInternet = unlimitedInternet;
        this.unlimitedCalls = unlimitedCalls;
        this.freeMessages = freeMessages;
        this.onlineCinema = onlineCinema;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public boolean isUnlimitedInternet() {
        return unlimitedInternet;
    }

    public boolean isUnlimitedCalls() {
        return unlimitedCalls;
    }

    public boolean isFreeMessages() {
        return freeMessages;
    }

    public boolean isOnlineCinema() {
        return onlineCinema;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", subscribers=" + subscribers +
                ", unlimitedInternet=" + unlimitedInternet +
                ", unlimitedCalls=" + unlimitedCalls +
                ", freeMessages=" + freeMessages +
                ", onlineCinema=" + onlineCinema +
                '}';
    }
}
