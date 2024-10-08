package lv.rvt;

public class printStars {

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println();
        printSquare(5);
        System.out.println();
        printRectangle(17, 3);
        System.out.println();
        printTriangle(4);
    }

    public static void printStars(int stars){
        for(int i=0;i<stars;i++){
            System.out.print("*");
        }
    System.out.println();
    }   

    public static void printSquare(int size){
        for(int s=0; s<size; s++){
            for(int a=0;a<size;a++){
                System.out.print("*");
            }
                System.out.println();
        }

    }
    public static void printRectangle(int width, int height){
        for(int h=0;h<height;h++ ){
            printStars(width);
        }
    }
    public static void printTriangle(int size){
        for(int x=0;x<=size;x++){
            printStars(x);
        }
    }
}
