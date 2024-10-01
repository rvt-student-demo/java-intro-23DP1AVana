package lv.rvt;
import java.util.Scanner;
public class moreloops {
public static void main(String[] args) {
Scanner vnk = new Scanner(System.in);
Integer sum=0;
Integer num=0;
double avr= 0;
int even=0;
int odd=0;
System.out.println("Give Numbers !");
while(true){
    int input= Integer.valueOf(vnk.nextLine());
    if(input == -1){
    break;
    

}
    sum+=input;
    num+=1;
    if(input % 2 == 0){
        even++;
    }
    else{
        odd++;
    }

}
avr=sum/num;
System.out.println("THX! BYE!");
System.out.println("Sum is "+ sum);
System.out.println("Numbers "+ num);
System.out.println("Avrage ;"+ avr);
System.out.println("Even :"+even);
System.out.println("Odd :"+odd);

}}