public class Ex6 {
    public static void main(String[] args) {
        System.out.println(cubePower(6));
        System.out.println(squareRoot(25));
    }

    public static double cubePower(double number) {
        return Math.pow(number, 3);
    }

    public static double squareRoot(double number){
        return Math.pow(number, 0.5);
    }
}
