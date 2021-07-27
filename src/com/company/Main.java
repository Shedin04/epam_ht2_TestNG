package com.company;

class Main {
    private Main(){}
    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int value) {
        if (value<=0) throw new IllegalArgumentException();
        int result = 0;
        for (; value>0; value/=10)
        {
            if (value%2 == 1) result +=value%10;
        }
        return result;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int value) {
        if (value<=0)  throw new IllegalArgumentException();
        return Integer.bitCount(value);
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int task3(int value) {
        if (value<=0) { throw new IllegalArgumentException(); }
        int a1 = 0;
        int a2 = 1;
        int a3;
        if (value==1) {return 0;}
        int result = 1;
        for (int i = 2; i < value; i++) {
            a3 = a1 + a2;
            a1=a2; a2=a3;
            result = result + a3;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(task1(1234));
        System.out.println(task2(14));
        System.out.println(task3(8));
    }
}
