public class Main {
    public static void main(String[] args) {
        IntegerSet set = new IntegerSet();
        set.insert(1);
        set.insert(2);
        set.insert(3);
        set.insert(4);
        set.insert(5);

        set.remove(3);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(2));
    }
}
