package Incriment_decriment;

//int i=19, j=29, k;
//
//k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
//
//        System.out.println("i="+i);
//        System.out.println("j="+j);
//        System.out.println("k="+k);



public class P06 {

        public static void main(String[] args) {
            int i = 19, j = 29, k;

            System.out.println("Initial values: i=" + i + ", j=" + j);

            int step1 = i--;   // use 19, then i=18
            System.out.println("Step1: i-- → used=" + step1 + ", i=" + i);

            int step2 = i++;   // use 18, then i=19
            System.out.println("Step2: i++ → used=" + step2 + ", i=" + i);

            int step3 = --j;   // j=28, use 28
            System.out.println("Step3: --j → used=" + step3 + ", j=" + j);

            int step4 = ++j;   // j=29, use 29
            System.out.println("Step4: ++j → used=" + step4 + ", j=" + j);

            int step5 = --i;   // i=18, use 18
            System.out.println("Step5: --i → used=" + step5 + ", i=" + i);

            int step6 = j--;   // use 29, then j=28
            System.out.println("Step6: j-- → used=" + step6 + ", j=" + j);

            int step7 = ++i;   // i=19, use 19
            System.out.println("Step7: ++i → used=" + step7 + ", i=" + i);

            int step8 = j++;   // use 28, then j=29
            System.out.println("Step8: j++ → used=" + step8 + ", j=" + j);

            // Now calculate the final result
            k = step1 - step2 + step3 - step4 + step5 - step6 + step7 - step8;

            System.out.println("\nFinal Values:");
            System.out.println("i=" + i);
            System.out.println("j=" + j);
            System.out.println("k=" + k);
        }
    }


