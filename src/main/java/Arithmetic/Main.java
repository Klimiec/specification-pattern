package Arithmetic;


import Arithmetic.composite.Number;

public class Main {

    public static void main(String[] args) {

        Number a = new Number(3);
        Number b = new Number(5);
        Number c = new Number(2);
        Number d = new Number(4);

        /*  sum = 3 + 5 + 2 + 4 = 14  */
        int sum = a.add(b).add(c).add(d).value();
        System.out.println(sum);

        /*  var = 3 + 5 * 2 + 4=  17  */
        int var = a.add( b.multiplyBy(c)).add(d).value();
        System.out.println(var);

        /*  var = 5 - 3 + 2 = 4 */
        var = b.minus(a).add(c).value();
        System.out.println(var);

    }

}
