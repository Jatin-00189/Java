public class Main {
    public static void main(String[] args){
        Calculater cal = new Calculater();
        cal.sum(21,23);
        cal.multi(21,21);
        cal.diff(100,20);
        cal.devide(100,25);
    }
}

class Calculater{
    Calculater(){
        System.out.println("Your calculater is Ready ! . ");
    }

    public void sum(double a , double b){
        System.out.print(a + " + " + b + " = ");
        System.out.print(a+b );

    }

    public void multi(double a , double b){
        System.out.println(" ");
        System.out.println(a * b);
    }

    public void devide(double a , double b){
        if(a == 0 || b == 0){
            System.out.println("Can't devide by Zero");
        }else{
            System.out.println(a / b);
        }
    }

    public void diff(double a ,double b){
        System.out.println(a - b);
    }

}
