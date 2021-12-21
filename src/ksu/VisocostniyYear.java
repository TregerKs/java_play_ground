package ksu;

public class VisocostniyYear {
    //public static int leapYearCount(int year) {
    public static void main(String[] args) {
        int year = 0;
        for (int i = 1; i < 2021; i++) {
            boolean b = i % 100 > 0;
            boolean c = i % 4 == 0;
            boolean d = i % 400 == 0;
            if ((c & b) || d) {
                year++;
            }
        }
        System.out.println("годов было " + year);
        //     return year;
    }
}
