import java.math.BigInteger;


public class Main {
    public static void main(String[] args) {

        System.out.println(Solution.zeros(10));






        }

    public class Solution {
        public static int zeros(int n) {




            int zero_count = 0;
            BigInteger factorial = BigInteger.ONE;
            for (int k = n; k > 0; k--) {
                factorial = factorial.multiply(BigInteger.valueOf(k));
            }

      
            String string = String.valueOf(factorial);



            //////////////////////////
            StringBuilder  sb =new  StringBuilder();

            char[] nnn = string.toCharArray();
            for (int j = nnn.length-1; j > 0 ; j--) {
                sb.append(nnn[j]);


            }
            for (int k = 0; k < sb.length(); k++) {

                if(sb.charAt(k) == '0'){
                    zero_count++;

                }else if (sb.charAt(k) != '0'){
                    break;
                }





            }

            return zero_count;
        }
    }



}
