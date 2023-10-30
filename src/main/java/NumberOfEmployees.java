public class NumberOfEmployees {
    public static void main(String[] args) {
        final int QUANTITY_PROGRAMMERS = 3;
        final int RATIO_TESTERS = 1; // кол-во тестеров на одного программиста
        final int RATIO_SUPPORTS = 2; // кол-во поддержки на обработку жалоб по поводу кода 1 программиста.
        final int TOTAL_TESTERS = QUANTITY_PROGRAMMERS * RATIO_TESTERS;
        final int TOTAL_SUPPORTS = QUANTITY_PROGRAMMERS * RATIO_SUPPORTS;
        final int TOTAL_EMPLOYEES = QUANTITY_PROGRAMMERS + TOTAL_TESTERS + TOTAL_SUPPORTS;

        System.out.println("Требуемое кол-во тестировщиков на проекта = " + TOTAL_TESTERS);
        System.out.println("Требуемое кол-во специалистов поддержки = " + TOTAL_SUPPORTS);
        System.out.println("Общее кол-во сотрудников требуемое на проекте = " + TOTAL_EMPLOYEES);
    }
}