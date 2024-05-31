package pgm06;

class JavaExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("BeginnersBook");
        System.out.println("Old Sequence: " + sb);
        System.out.println("Old length: " + sb.length());
        sb.setLength(21);
        System.out.println("New Sequence: " + sb);
        System.out.println("New length: " + sb.length());
    }
}

