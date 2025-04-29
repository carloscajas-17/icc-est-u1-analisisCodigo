import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado:el metodo retrona un arrelgo de enteros vacios linea 21
    //Solucion: Cmabiar el return para que segrese la variable "arreglo"
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: Fue en el if donde el signo esta de forma incorrecta "<"
    //Arreglo: Se modifico el signo de comparacion">""

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado: Es en el segundo for ya que falta un parametro que es restar1 "j<n"
    //Corregido: En el segundo for se resta n-1 en for de j"j<n-1"
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }
   

    // Método de selección con errores
    // Error encontrado: Este metodo falta que retorne ya que esta vacio
    //Corregido: Se  hizo  que retorne el arreglo" return arreglo";

    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }

        return arreglo;


    }

    // Método de selección con errores
    // Error encontrado: Es al sumar el j ,en este caso se estaba restando"j--"
    //Corregio: Se cambio de digno en el segundo for la parte donde j se resta en este caso se suma "j++"
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }
    

    // Método de selección con errores
    // Error encontrado: Estaba mal las igualaciones faltaba de hacer cambios en ciertas lineas de codigo"int smallerNumber =arreglo[indiceMinimo]" y la liena de "arreglo[indiceMinimo] = smallerNumber;
    //Corregido= Se hizo el cambio en ciertos lineas de igual  donde "int smallerNumber =arreglo[indiceMinimo];" y "arreglo[i] = smallerNumber;" ya que tenia una logica incorrecta de comparar
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber =arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }
    
    

    // Método de inserción con errores
    // Error encontrado: Esta en en while donde el signo esta mal"<" ya que se quiere de orden ascendente y se encuentre en descendente
    //Corregido : Se cambio el signo de comparacion de ">" ya que ahor aetsa de forma ascendete    
     public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i > 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }
   
     

    // Método de inserción con errores
    // Error encontrado: Se encontro en el for donde se uso el while
    //Corregido: Se cambio el for por el while para que no tenga dificultad al momento de realizar
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];

            int i = j - 1;
            while (j >= 0 && arreglo[j] > actual;) {
                arreglo[j + 1] = arreglo[j];
            }
            arreglo[i + 1] = actual;
        }
        return arreglo;
    }
        }  

    // Método de inserción con errores
    // Error encontrado:
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j;

            while (i > 0 && arreglo[i] < key) {
                arreglo[i + 1] = arreglo[i];
                i++;
            }
            arreglo[i + 1] = key;
        }
        return new int[] { 15, 34, 1, 2, 5, 6, 7, 10 };
    }

}
