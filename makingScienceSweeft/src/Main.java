public class Main {
    public static void main(String[] args) {
        //First task
        System.out.println(Tasks.singleNumber(new int[]{0,1}));
        //Second task 
        System.out.println(Tasks.minSplit(4));
        //Third task
        System.out.println(Tasks.notContains(new int[]{2,3,4,5,7}));
        //Fourth task
        System.out.println(Tasks.addBinary("1011", "1011"));
        //Fifth task
        System.out.println(Tasks.countVariants(20));
        //Sixth task
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
