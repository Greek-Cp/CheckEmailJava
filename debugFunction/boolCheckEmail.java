package appLib.debugFunction;

import java.util.Scanner;

@FunctionalInterface
interface test{
    boolean checkEmail(String data);
}

public class boolCheckEmail {
    private static String ObjectString;
    /*
    *@FUNCTION INPUT STRING
     */
    static String inputString(String data){
            if(data.isEmpty() != true){
                return data;
            } else{
                System.err.print("Data Is Empty!");
            }
        return data;
    }
    static String[] inputString(String[]arr){
        String str[] = arr;
        if(arr.length == 0){
            return arr;
        } else{
            System.err.print("Arr Is zero!");
        }
        return str;
    }

    static <T> T inputString(T data){
        if(data.toString().isEmpty() != true){
            return data;
        } else{
            System.err.print("Data Is Empty!");
        }
        return data;
    }

    /*
    @FUNCTION input
     */
    static int inputNumber(int number){
        int num = number;
        return num;
    }
    static int[] inputNumber(int[]number){
        int num[] = number;
        if(num.length != 0){
            return num;
        } else{
            System.err.print("Index Array Zero !");
        }
        return num;
    }
    static <T> T inputNumber(T number){
        if(number.toString().length() != 0){
            return number;
        }
        else{
            System.err.print("Zero!");
        }
        return number;
    }

    static boolean charCheck(char data[]){
        char p[] = new char[data.length];
        boolean state = false;
        for(int i = 0; i<= data.length- 1; i++){

            if(data[i] !=  64){
                state = false;
            } else{
                state = true;
            }
        }
        return state;
    }
    static boolean charCheck(char datas){
        boolean state = false;
        if( datas != 64){
            state = false;
        } else{
            state = true;
        }
        return  state;
    }

    static boolean isEmail(String data){

        char cpy[] = new char[data.length()];
        for(int i = 0; i < cpy.length ; i++){
            cpy[i] = data.charAt(i);
        }
        boolean isEmail = false;
        for(int b = 0; b<= cpy.length - 1; b++){
            System.out.println(cpy[b]);
            if(cpy[b] != (char) 64){
                isEmail = false;
            } else{
                isEmail = true;
                return  isEmail;
            }
        }
        return  isEmail;
    }
    static boolean isEmail(char[]Str,int length){
        boolean isEmail = false;
        for(int o = 0; o < length; o++){
            if(Str[o] != (char) 64){
                isEmail = false;
            } else {
                isEmail = true;
                return  isEmail;
            }
        }
        return  isEmail;
    }
    static int[] parseStrToIntChar(String Str){
        char[] cpy = new char[Str.length()];
        for(int b = 0; b< Str.length(); b++){
            cpy[b ] = Str.charAt(b);
        }
        int arr[] = new int[cpy.length];
        for(int i = 0; i < cpy.length; i++){
            arr[i] = (int) cpy[i];
        }
        return  arr;
    }
    static char[] parseStrToChar(String str){
        char cpy[] = new char[str.length()];
        for(int b = 0; b< str.length(); b++){
            cpy[b] = str.charAt(b);
        }
        return  cpy;
    }
    static char[] reverseString(String str){
        char p[] = new char[str.length()];
        for(int iterationLoop = 0; iterationLoop < p.length; iterationLoop++){
            p[iterationLoop] = str.charAt(iterationLoop);
        }
        //reverse
        int len = p.length;
        char cpyRev[] = new char[p.length];
        for(int s = 0; s < p.length; s++){
            p[len - 1] = cpyRev[s];
            len--;
        }
        return cpyRev;
    }

    static char[] sortChar(char Cpy[] ) {
        char temp;
        for (int b = 0; b < Cpy.length; b++) {
            for (int i = 1; i < Cpy.length - b; i++) {
                if (Cpy[i - 1] > Cpy[i]) {
                    temp = Cpy[i - 1];
                    Cpy[i - 1] = Cpy[i];
                    Cpy[i] = temp;
                }
            }
        }
        return Cpy;
    }

    static int[] sortNumber(int nums[]){
        int temp;
        for(int s = 0; s < nums.length; s++){
            for(int b = 1 ; b < nums.length - s; b++ ){
                if(nums[b - 1] > nums[b]){
                    temp = nums[b -1 ];
                    nums[b - 1] = nums[b];
                    nums[b] = temp;
                }
            }
        }
        return nums;
    }

    static int generateId(int nRange){
        int p = (int) (Math.random() * nRange);
    return p;
    }

    public static void main(String[] args) {

        /*
        * TEST DATA
        *
         */
        Scanner user = new Scanner(System.in);

        System.out.print("Input Email: ");
        String myEmail = inputString(user.nextLine());
        boolean isEmax = isEmail(myEmail);
        System.out.print(isEmax);

    }
}
