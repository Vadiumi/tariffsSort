public class Main {

    /**
     *This program can sort telephone company tariffs by cost and features
     */
    public static void main(String[] args) {
        TariffSort tariffSort = new TariffSort();
        System.out.println("sorting by parameters:");
        tariffSort.searchYourTariff(true, false, false, true);
        System.out.println("sorting by cost:");
        tariffSort.searchYourTariff(30);
    }
}
