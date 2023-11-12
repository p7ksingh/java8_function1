// the process of converting primative to wrraper object is called AutoBoxing

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PrimativePredicateDemo {
    public static void main(String[] args) {

        int[] x = { 10, 20, 30, 40, 50, 61 };

        Predicate<Integer> p = i -> i % 2 == 0;
        for (int x1 : x) {
            // System.out.println(p.test(x1));
            if (p.test(x1)) {
              //  System.out.println(x1);

            }
        }
        // IntPredicate
        //every where primative
        IntPredicate ip = i -> i%2==0; //result is integer
        for(int x1 : x){
            if(ip.test(x1)){ // x1 is int value
                System.out.println(x1);
        }

    }
    }
}
