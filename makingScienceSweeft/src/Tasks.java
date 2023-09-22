import java.util.*;

public class Tasks {
    public static int singleNumber(int[] nums){
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(countMap.containsKey(nums[i])){
                int count = countMap.get(nums[i]);
                countMap.put(nums[i], ++count);
            }else{
                countMap.put(nums[i], 1);
            }
        }
        int result = 0;
        for(var num : countMap.keySet()){
            if(countMap.get(num) == 1){
                result = num;
            }
        }
        return result;
    }
    public static int minSplit(int amount){
        var numbersOfMonets = 0;
        var n = 0;
        var monets = new int[] {50, 20, 10, 5};

        for (int monet : monets) {
            n = amount / monet;
            numbersOfMonets += n;
            if (amount % monet == 0) {
                return numbersOfMonets;
            }
            else{
                amount -= monet * n;
            }
        }
        return numbersOfMonets + amount;
    }


    public static int notContains(int[] array) {
//        Arrays.sort(array);
//        int smallest = 1;
//        for(var num : array){
//            if(num <= smallest){
//                smallest = num + 1;
//            }else{
//                break;
//             }
//        }
//        return smallest;
        var numSet = new HashSet<Integer>();

        for (var num : array){
            numSet.add(num);
        }
        int smallest = 1;
        while(numSet.contains(smallest)){
            smallest++;
        }

        return smallest;
    }
    public static String addBinary(String x, String y) {
        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);

        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);

        return result;
    }
    public static int countVariants(int stearsCount) {
        if(stearsCount < 3) {
            return stearsCount;
        } else {
            return countVariants(stearsCount - 1) + countVariants(stearsCount - 2);
        }
    }

}
