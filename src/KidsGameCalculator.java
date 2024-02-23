import java.util.Scanner;

public class KidsGameCalculator extends GameCalculator{
    Scanner sc=new Scanner(System.in);
    @Override
    public void hesapla(){
        int puan=sc.nextInt();
        double manPoint=puan*1.2;
        System.out.println(manPoint);

    }

}
