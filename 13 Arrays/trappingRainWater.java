public class trappingRainWater {

    public static int trapWater(int heights[]) {

        if (heights.length <= 2) {
            return 0;
        }

        int leftMax[] = new int[heights.length];
        int rightMax[] = new int[heights.length];

        for (int i = 0; i < leftMax.length; i++) {
            if (i == 0) {
                leftMax[i] = heights[i];
            } else {
                leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
            }
        }

        for (int i = rightMax.length - 1; i >= 0; i--) {
            if (rightMax.length - 1 == i) {
                rightMax[i] = heights[i];
            } else {
                rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
            }
        }

        int tw = 0;

        for (int i = 0; i < heights.length; i++) {
            tw = tw + (Math.min(rightMax[i], leftMax[i]) - heights[i]);
        }

        return tw;
    }

    public static void main(String[] args) {
        int heights[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println(trapWater(heights));
    }
}
