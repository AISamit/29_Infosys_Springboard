package day4;
public class Generic<T> {
    private T input;

    public Generic(T input) {
        this.input = input;
    }

    public void showObjectType() {
        System.out.println("Object Type is " + input.getClass().getName());
    }

    public static void main(String[] args) {
        // Example usage with String
        Generic<String> genClassString = new Generic<>("Input");
        genClassString.showObjectType();

        // Example usage with Integer
        Generic<Integer> genClassInteger = new Generic<>(123);
        genClassInteger.showObjectType();
    }
}
