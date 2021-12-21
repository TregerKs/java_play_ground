package ksu.mis;

public class Mis {
    public static void main(String[] args) {
    // создаем сотрудника
        Staff doctorIvanovII = new Staff("doctor", "Ivanov Ivan Ivanovich", 66, 350, 4, 30 );
        doctorIvanovII.agePosition();
        doctorIvanovII.salaryPosition();
    }
}
