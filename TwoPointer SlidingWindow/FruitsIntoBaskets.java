import java.util.HashMap;

public class FruitsIntoBaskets {

    public static int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < fruits.length; right++) {

            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // shrink window if more than 2 fruit types
            while (map.size() > 2) {

                int leftFruit = fruits[left];
                map.put(leftFruit, map.get(leftFruit) - 1);

                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] fruits = {1, 2, 3, 2, 2};

        System.out.println("Max fruits collected: " + totalFruit(fruits));
    }
}

