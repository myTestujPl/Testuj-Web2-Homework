public class Ex5 {
    public static void main(String[] args) {
        countCircle(5);
        countCircle(6.7);
    }

    public static void countCircle (double r){
        System.out.println("Circuit: " +2 * Math.PI * r ); // mogliście zamiast Math.PI użyć też zaokrąglenia 3.14
        System.out.println("Area: "+Math.PI * r * r);
    }
}
