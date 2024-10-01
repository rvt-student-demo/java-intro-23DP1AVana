package lv.rvt;
import java.util.Scanner;

public class Devisable {

        public static void main(String[] args) {
            divisibleByThreeInRange(2, 10);
        }
        public static void divisibleByThreeInRange(int arg1, int arg2) {
            for(int i=arg1; i<(arg2+1);i++){
                if (i % 3 == 0){
                        System.out.println(i);
                }
            }
        }
}
    
