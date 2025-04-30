
class MetodosOrdenamiento:
    

    def sortByBubble(self,arreglo):
        arreglo= arreglo.copy()
        n = len(arreglo) #tamaño del arreglo
        for i in range(n):   #que recorrra el tamaño del arreglo
            for j in range(i+1,n):
                if arreglo[i]>arreglo[j]:
                    arreglo[i],arreglo[j]=arreglo[j],arreglo[i]
                    
        return arreglo