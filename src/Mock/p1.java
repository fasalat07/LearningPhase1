package Mock;

public class p1 {
    public static void main(String[] args) {


        int i = 6, j = 5,  k;
        k = i-- - (i++ * --j) - ++j + --i - (j-- + ++i) - j++;
        System.out.println(k);
        System.out.println(i);
        System.out.println(j);

    }
}

//   k = i-- - (i++ * --j) - ++j + --i - (j-- + ++i) - j++;
//        //  6 - (6*4)-5 + 6 + 6 -(4 +6)-5
//            6 - 24 - 5 +6 +6 - 10-5
//             - 18 +1 -4 -5
//             -17 - 9
//              -25