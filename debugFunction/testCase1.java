package appLib.debugFunction;

public class testCase1 {
    private static String ObjectString;

    static String inputString(String data){
        if(data.equals(ObjectString)){
            if(data.isBlank() != false){
                return data;
            } else{
                try{
                    System.out.println("Hello");
                } catch (NullPointerException e){
                    System.err.print("Data Is Empty!");
                }
            }
        }
        return data;
    }
        /*
0 index -> [47]1 index -> [48]
2 index -> [49]3 index -> [50]4 index -> [51]
5 index -> [52]6 index -> [53]7 index -> [54]
8 index -> [55]9 index -> [56]
nStart = 47;
nEnd = 56;
nStart < nEnd; range number

         */

    static void generateCode(){
        int n = 47;
        for(n = n; n <= 56; n++){
            //arr[c] == (char)47
            System.out.print("arr[c] == (char) " + n + "||");
        }
    }
//    static boolean isNumberString(Integer Data){
//        int array = (int) Data;
////        char[] arr = new char[Data.length()];
////        boolean isNum = false;
////        for(int i = 0; i<= Data.length() - 1; i++){
////            arr[i] = Data.charAt(i);
////        }
//        for(int c = 0; c<= Data.length - 1; c++){
//            if(arr[c] == (char) 47||arr[c] == (char) 48||arr[c] == (char) 49||arr[c] == (char) 50||arr[c] == (char) 51||arr[c] == (char) 52||arr[c] == (char) 53||arr[c] == (char) 54||arr[c] == (char) 55||arr[c] == (char) 56){
//                return isNum = true;
//            } else {
//                return isNum = false;
//            }
//        }
//        char p = 0;
//
//        return  isNum;
//    }
    static void generateChar(){
        char t = 0;
        for(int i = 0; i <= 120; i++){
            t++;
            System.out.print(t + " index -> [" + i + "]");
            if(i % 3 == 0){
                System.out.println();
            }
        }
    }
    public void testEquals(Object O){
        String StrObject = (String) O;
//        if(O.)
//        Integer IntObject = (int) O;

        if(O == StrObject){
            System.out.println("Object O Equals String" + O);
        } else if( O.equals(1)){
            System.out.println("Object O Equals Integer" + O);
        } else {
            System.out.println("not same");
        }
    }
    public static void main(String[] args) {
        generateChar();
            inputString("Hello World");
            String Hello = "Hello";
            testCase1 check = new testCase1();
            check.testEquals(Hello);
            generateCode();
    }
}
