package ksu;

public class StringPointers {
    public static void main(String[] args) {
        String a = "картон";
        String b = a;
        a = "хрюша";
        a = a.toUpperCase();
        System.out.println(a);
        System.out.println(System.identityHashCode(a));
        System.out.println(b);
        System.out.println(System.identityHashCode(b));

    }
}
