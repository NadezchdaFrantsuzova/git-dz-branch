public class Main {
    public static void main(String[] args) {

        int [] sales = {300, 10, 190, 350, 90, 50};
        SalesManager salesManager = new SalesManager(sales);

        System.out.println("Максимальное количество продаж: " + salesManager.max());
        System.out.println("Среднее обрезанное количество продаж: " + salesManager.medium());
    }
}
