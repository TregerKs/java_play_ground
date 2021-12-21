package ksu;

public class YourExMethod {
    public static void main (String[] args) {
        YourEx angela = new YourEx();
        angela.bornEars = 1990;
        angela.visits = 2;
        YourEx anna = angela;
        anna.minuses = "Кривой нос";
        anna.howManyYears = anna.HowManyYearsF();
        angela.visits = angela.visits + 1;
        System.out.println("Анна " + anna.howManyYears);
    }

}