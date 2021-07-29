package appLib.debugFunction;

public class boolTest {
    static boolean test(int data){
        boolean t = false;
        if( data == 0){
            return t = true;
        }
        return t;
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
    public static void main(String[]args){
        boolean b = test(0);
        System.err.print(b);
        char ex[] = {'@','H'};
        char p = '@';
        boolean arrCheck = charCheck(ex[0]);
        System.err.println(arrCheck);
    }
}
