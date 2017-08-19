/**
 * Created by jc428928 on 18/08/17.
 */
public class Percentages{

    public static void main(String[] args){
        double a = 1.0;
        double b = 10.0;
        computePercent(a,b);
        }
    public static void computePercent(double a,double b){
        System.out.println(a+" is "+((a/b)*100)+ " percent of "+b);
    }
}
