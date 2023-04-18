import ibadts.Collection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean FLAG = true;
        int T = 0;
        int NUMBER;
        Collection<Integer> NUMBERS = new Collection<>();

        Scanner scan = new Scanner(System.in);

        while (FLAG) {
            NUMBER = scan.nextInt();
            if (NUMBER<=0)
                FLAG = false;
            else {
                NUMBERS.addItem (NUMBER);
                T = NUMBER;}
        }

        while (NUMBERS.hasNext())
        {
            NUMBER = NUMBERS.getNext();
            if (NUMBER>T)
                System.out.println(NUMBER);
        }

    }
}