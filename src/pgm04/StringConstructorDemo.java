package pgm04;

public class StringConstructorDemo {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        String s2 = new String("Hello Java");
        System.out.println(s2);

        char[] chars1 = {'s', 'c', 'i', 'e', 'n', 'c', 'e'};
        String s3 = new String(chars1);
        System.out.println(s3);

        char[] chars2 = {'w', 'i', 'n', 'd', 'o', 'w', 's'};
        String s4 = new String(chars2, 0, 4);
        System.out.println(s4);

        byte[] b1 = {97, 98, 99, 100};
        String s5 = new String(b1);
        System.out.println(s5);

        byte[] b2 = {65, 66, 67, 68, 69, 70};
        String s6 = new String(b2, 2, 4);
        System.out.println(s6);

        int[] bytes = new int[]{65, 66, 67, 68};
        System.out.println(new String(bytes, 1, 2));
    }
}
