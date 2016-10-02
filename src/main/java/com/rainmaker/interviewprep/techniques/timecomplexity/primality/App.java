package com.rainmaker.interviewprep.techniques.timecomplexity.primality;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for (int a0 = 0; a0 < p; a0++) {
            int n = in.nextInt();
            if(is_prime(n))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }

    private static boolean is_prime(int number) {
        if( number <= 1)
            return false;
        else if (number <= 3)
            return true;
        else if (number % 2 == 0 || number % 3 == 0)
            return false;

        int holder = 5;
        while(holder*holder <= number) {
            if (number % holder == 0 || number % holder +2 ==0)
                return false;
            holder = holder +1;
        }

        return true;
    }
}
