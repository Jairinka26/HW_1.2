public class Main {
    public static void main(String[] args)
    {
       sumOrMultiply (3,5);
    }
    private static void sumOrMultiply (float a, float b){
        if (a%2==0)
            System.out.println("Произведение "+a+" на "+b+" равно "+a*b);
        else
            System.out.println("Сумма чисел "+a+" и "+b+" равно "+(a+b));
    }
}
