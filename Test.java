public class Test {
    public static void main(String[] args) {
        int [] numerators = {10, 20, 30, 40};
        int [] denominator = {1, 2, 0, 4};
        for (int i = 0; i < numerators.length; i++){
            System.out.println(divide(numerators[i], denominator[i]));
        }
        System.out.println("Good Job :)");
        }
        public static int divide(int a, int b){
        try {
            return a/b;
        } catch(ArithmeticException e){ //you can also put various catch block and it wil execute accordingly. Even you can put Exception.
            System.out.println(e);
            return -1;
        }
    }
}