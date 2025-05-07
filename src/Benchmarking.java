import java.util.Random;

public class Benchmarking {
    private MetodosOrdenamiento metodosOrdenamiento;
    public Benchmarking(){
       long inicioMillis=System.currentTimeMillis();//Llama al método System.currentTimeMillis().

        //Ese método devuelve el tiempo actual en milisegundos (milésimas de segundo) desde la "época Unix", es decir, desde el 1 de enero de 1970.
        
        //El valor que devuelve es un número long (entero grande).
        
        //Ese valor se guarda en la variable inicioMillis.
        //2K38---El problema surge cuando este contador de 32 bits alcanza su límite máximo, lo que ocurre a las 03:14:07 UTC del 19 de enero de 2038. 

        long inicioNano= System.nanoTime();

       System.out.println(inicioMillis);
    
        System.out.println(inicioNano);
        metodosOrdenamiento= new MetodosOrdenamiento();
        //int [] arreglo= generarArregloAleatorio(i:10000);
        
        int [] arreglo= generarArregloAleatorio(100000);
        Runnable tarea =()-> metodosOrdenamiento.burbujaTradicional(arreglo);
        double tiempoNano= medirConCurrentTime(tarea);
        double tiempoMillis= medirConNanoTime(tarea);
        System.out.println("Tiempo en nano"+tiempoNano);
        System.out.println("Timepo de Miliis"+tiempoMillis);
        


    }


    //private int []  generarArregloAleatorio(int i){
     //   return new int [] {};
   // }



    private int []  generarArregloAleatorio(int tamano){
        int [] arreglo = new int [tamano];
        Random random = new Random();
        for (int i=0 ; i < tamano;i++){
            arreglo [i]= random.nextInt(100_000);
        }
      return arreglo;
    }

        
    //TIEMPO USANDO nanoTime( en segundos)
    public double medirConNanoTime(Runnable tarea){

        long inicio=System.nanoTime();
        tarea.run();
        long fin =System.nanoTime();
        return (fin -inicio)/1_000_000_000.0;

        
    }
    // TIEMPO USANDO currentTime (en segundos )
    public double medirConCurrentTime(Runnable tarea){
        long inicio=System.currentTimeMillis();
        tarea.run();
        long fin =System.currentTimeMillis();
        return (fin -inicio)/1000.0;



    }
    

    
}
