package basics;

public class OperatorPrecendence {

    public static void main(String[] args) {
        double a=20.0;
        double b=80.0;
        double result=(a+b)*100;
        System.out.println(result);
        double rem=result%40;
        System.out.println(rem);
        boolean bool=false;
        if(rem==0.0)
           bool=true;
        else
           bool=false;
        System.out.println(bool);
    }
}
