public class Ejercicio2 {

    public static int MCD(int num1, int num2){

        int total;

        if(num1 == num2){
            total = num1;
        }else{
            if(num2 > num1){
                total = MCD(num1, num2-num1);
            }else{
                total = MCD(num1-num2, num2);
            }
        }
        
        return total;

    }
    
}
