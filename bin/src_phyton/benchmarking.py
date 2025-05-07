import random 
import time
 # import metodos_Ordenamiento    

from metodos_Ordenamiento import MetodosOrdenamiento
class Benchmarking:
    def __init__(self):
        print("Bench inicialziado ")

    def ejemplo(self):
        self.mO=MetodosOrdenamiento()

        arreglo=self.build_arreglo(10000)
        self.mOrdenamiento=MetodosOrdenamiento()
        arreglo=self.build_arreglo(1000)# mediante el self se acced a todos los metodos y ase que diga ese tu tienes los metodos de cada clase
        tarea=lambda: self.mOrdenamiento.sortByBubble(arreglo)
        tiempoMillies=lambda: self.contar_con_current_time_milles(tarea)
        tiempoNano=lambda: self.contar_con_nano_time(tarea)


        print(f"Tiempo en milisegundos: {tiempoMillies:.6f}")
        print(f"Tiempo en nanosegundos: {tiempoNano:.6f}")

       #print(f"Tiempo {tiempoMillies}")
       #print(f"Tiempo {tiempoNano}")

       #tarea=() ->

    



    def build_arreglo(self,tamano):
        array=[ ]
        for i in range(tamano):
            n=random.randint(0,999)
            array.append(n)

        return array 
  

    #import time
    #ejecutar tarea tarea()

    # x=time.time(
    

    def contar_con_current_time_milles(self,tarea):
        inicio=time.time()
        tarea()
        fin=time.time()
        return fin-inicio

       
       #pass# continua a la siguiente liena y no de error

       


    # x=time.time_ns()
    def contar_con_nano_time(self,tarea):
        inicio = time.time_ns()
        tarea()
        fin = time.time_ns()
        return(fin-inicio)/1_000_000_000.0
    

    def medir_tiempo(sel,tim,array):
        inicio=time.perf_counter()
        tim(array)
        fin=time.perf_counter()
        return fin-inicio    
    



  

   
    





        