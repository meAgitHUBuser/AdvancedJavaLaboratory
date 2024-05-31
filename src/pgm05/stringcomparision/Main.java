package pgm05.stringcomparision;

// 2. regionMatches()

class Main {
    public static void main(String[] args) {
        String str1 = new String("This is regionMatches() example");
        String str2 = new String("region");
        String str3 = new String("world");
        System.out.println("str1 and str2 region matches: " + str1.regionMatches(8, str2, 0, 6));
        System.out.println("str1 and str3 region matches: " + str1.regionMatches(8, str3, 0, 6));
    }
}
