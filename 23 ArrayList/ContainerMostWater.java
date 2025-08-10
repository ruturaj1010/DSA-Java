import java.util.ArrayList;

public class ContainerMostWater {

    public static void MostWaterContainerBrute(ArrayList<Integer> height) {
        int MaxWater = 0;
        int index1 = 0, index2 = 0;

        for (int i = 0; i < height.size() - 1; i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int currWater = Math.min(height.get(i), height.get(j)) * (j - i);
                if (currWater > MaxWater) {
                    index1 = i;
                    index2 = j;
                }
                MaxWater = Math.max(MaxWater, currWater);
            }
        }

        System.out.println("Max water found at index " + index1 + " and " + index2 + " is " + MaxWater);
    }

    public static void MostWaterContainer2Pointer(ArrayList<Integer> height) {
        int maxWater = 0;

        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            int currWater = Math.min(height.get(lp), height.get(rp)) * (rp - lp);

            maxWater = Math.max(maxWater, currWater);

            if (height.get(lp) <= height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        System.out.println("Maxwater stored in container is " + maxWater);
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        MostWaterContainerBrute(height);

        MostWaterContainer2Pointer(height);
    }
}
