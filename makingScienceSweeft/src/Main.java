// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(Tasks.singleNumber(new int[]{0,1}));
        System.out.println(Tasks.minSplit(4));
        System.out.println(Tasks.notContains(new int[]{2,3,4,5,7}));
        System.out.println(Tasks.addBinary("1011", "1011"));
        System.out.println(Tasks.countVariants(20));

        MyStructure<Integer> customDS = new MyStructure<>();
        customDS.add(1);
        customDS.add(2);
        customDS.add(3);

        System.out.println("Initial elements:");
        customDS.printElements();

        customDS.delete(2);
        System.out.println("After deleting 2:");
        customDS.printElements();

        customDS.add(4);
        System.out.println("After adding 4:");
        customDS.printElements();
    }
}
