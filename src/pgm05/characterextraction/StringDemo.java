package pgm05.characterextraction;

// 4. toCharArray( )

class StringDemo {
    public static void main(String[] args) {
        String str = " Java was developed by James Gosling";
        char[] retval = str.toCharArray();
        System.out.println("Converted value to character array = ");
        System.out.println(retval);
    }
}
