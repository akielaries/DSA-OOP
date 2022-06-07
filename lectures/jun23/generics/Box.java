public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
   }

    public T get() {
        return t;
   }

    public static void main(String[] args) {
    
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        Box<Character>characterBox = new Box<Character>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));
        characterBox.add(new Character('A'));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
        System.out.printf("Character Value :%c\n", characterBox.get());
   }
}
