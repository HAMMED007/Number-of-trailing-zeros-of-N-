import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


    }


    public class BinaryArrayToNumber{
        public static int ConvertBinaryArrayToInt(List<Integer> binary){





            StringBuilder sb = new StringBuilder ();
            for (int i = 0; i < binary.size(); i++) {
                sb.append(binary.get(i));
            }

            String myString = String.valueOf(sb);

            int decimal=Integer.parseInt(myString,2);


            return decimal;
        }


    }

}