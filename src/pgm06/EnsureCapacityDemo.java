package pgm06;

// 2. ensureCapacity() and setLength()

class EnsureCapacityDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("MVJCE ISE");
        System.out.println("Before ensureCapacity " + "method capacity = " + str.capacity());
        str.ensureCapacity(42);
        System.out.println("After ensureCapacity" + "method capacity = " + str.capacity());
    }
}

