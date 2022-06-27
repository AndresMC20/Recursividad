public class Ejercicio4 {

    public static String cadena(String palabra, int posicion){

        String invertida;

        if(posicion == 0){
            invertida = String.valueOf(palabra.charAt(posicion));
        }else{
            invertida = String.valueOf(palabra.charAt(posicion)) + cadena(palabra, posicion-1);
        }

        return invertida;

    }
    
}
