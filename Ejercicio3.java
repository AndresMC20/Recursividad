public class Ejercicio3 {

    public static int sumaVector(int vector[], int num){
        int suma;

        if(num < 0){
            suma = 0;
        }else{
            suma = vector[num] + sumaVector(vector, num-1);
        }

        return suma;
    }

}
 