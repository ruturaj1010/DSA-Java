public class operator {
 public static void main(String[] args){
    // int x = 2, y = 5;
    // int exp1 = (x * y / x);
    // int exp2 = (x * (y / x));

    // System.out.print(exp1 + " , ");
    // System.out.print(exp2);



    int x, y, z , t;
    x = y = z = 2;
    x += y;
    y -= z;
    z /= (x + y);
    t = 4/2;
    System.out.println(x + " " + y + " " + z + " " + t);
 }
}