public class directions {
    public static void shortestPath(String str) {
        int x = 0 , y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            } else if (str.charAt(i) == 'N') {
                y++;
            } else {
                y--;
            }
        }
        int xySq = (x*x) + (y*y);
        float distance = (float) Math.sqrt(xySq);
        System.out.println("The shortest distance from origin ( "+ x + ", " + y +" ) is " + distance  );
    }

    public static void main(String args[]) {
        String str = "WNEENESENNN";
        shortestPath(str);
    }
}