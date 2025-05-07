
class MetodosOrdenamiento:
    

    def sortByBubble(self,arreglo):
        arreglo= arreglo.copy() # el punto copy es --para copiar el arreglo 
        n = len(arreglo) #tamaño del arreglo
        for i in range(n):   #que recorrra el tamaño del arreglo
            for j in range(i+1,n):
                if arreglo[i]>arreglo[j]:
                    arreglo[i],arreglo[j]=arreglo[j],arreglo[i]
                    
        return arreglo
    def sort_seleccion(self, array):
        n = len(array)
        for i in range(n):
            indice_minimo = i
            for j in range(i + 1, n):
                if array[j] < array[indice_minimo]:
                    indice_minimo = j
        # Intercambio de valores
                array[i], array[indice_minimo] = array[indice_minimo], array[i]
                return array