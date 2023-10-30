public class NumberOfEmployees {
    public static void main(String[] args) {
        int quantityProgrammers = 3;
        int quantityTestersForProgrammers = 1; // кол-во тестеров на одного программиста
        int quantitySupports = 2; // кол-во поддержки на обработку жалоб по поводу кода 1 программиста.
        int totalTesters = quantityProgrammers * quantityTestersForProgrammers;
        int totalSupports = quantityProgrammers * quantitySupports;
        int totalEmployees = quantityProgrammers + totalTesters + totalSupports;

        System.out.println("Требуемое кол-во тестировщиков на проекта = " + totalTesters);
        System.out.println("Требуемое кол-во специалистов поддержки = " + totalSupports);
        System.out.println("Общее кол-во сотрудников требуемое на проекте = " + totalEmployees);
    }
}
