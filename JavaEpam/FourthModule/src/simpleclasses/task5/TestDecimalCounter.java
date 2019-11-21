package simpleclasses.task5;

public class TestDecimalCounter {
    public static void main(String[] args) {
        System.out.println("Default initializing");
        DecimalCounter decimalCounter = new DecimalCounter();
        System.out.println(decimalCounter.getCount());

        System.out.println("Arbitrary value initializing in border");
        decimalCounter = new DecimalCounter(5);
        System.out.println(decimalCounter.getCount());

        System.out.println("Arbitrary value initializing out of border");
        decimalCounter = new DecimalCounter(15);
        System.out.println(decimalCounter.getCount());

        System.out.println("Arbitrary value setting out of border");
        decimalCounter.setCount(15);
        System.out.println(decimalCounter.getCount());

        System.out.println("Arbitrary value setting in border");
        decimalCounter.setCount(4);
        System.out.println(decimalCounter.getCount());

        System.out.println("Decreasing value");
        for (int i = 0; i < 15; i++) {
            decimalCounter.decreaseCount();
            System.out.println(decimalCounter.getCount());
        }

        System.out.println("Increasing value");
        for (int i = 0; i < 15; i++) {
            decimalCounter.increaseCount();
            System.out.println(decimalCounter.getCount());
        }
    }
}
