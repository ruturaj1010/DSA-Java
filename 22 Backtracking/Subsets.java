public class Subsets {
    public static void findSubsets(String str, String set, int i){
        // base case
        if(i == str.length()) {
            if(set.length() == 0) {
                System.out.println("null");
            }else {
                System.out.println(set);
            }
            return;
        }

        // recursion
        // for yes
        findSubsets(str, set+ str.charAt(i), i+1);
        // for no
        findSubsets(str, set, i+1);
    }
    public static void main(String args[]) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
