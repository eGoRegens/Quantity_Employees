public class NumberOfEmployees {
    public static void main(String[] args) {
        final int quantityProgrammers = 3;
        final int quantityTestersForProgrammers = 1; // кол-во тестеров на одного программиста
        final int quantitySupports = 2; // кол-во поддержки на обработку жалоб по поводу кода 1 программиста.
        final int totalTesters = quantityProgrammers * quantityTestersForProgrammers;
        final int totalSupports = quantityProgrammers * quantitySupports;
        final int totalEmployees = quantityProgrammers + totalTesters + totalSupports;

        System.out.println("Требуемое кол-во тестировщиков на проекта = " + totalTesters);
        System.out.println("Требуемое кол-во специалистов поддержки = " + totalSupports);
        System.out.println("Общее кол-во сотрудников требуемое на проекте = " + totalEmployees);
    }
}