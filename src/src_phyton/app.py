
from datetime import datetime
from matplotlib import pyplot as plt
from benchmarking import Benchmarking
from metodos_Ordenamiento import MetodosOrdenamiento
from datetime import datetime
if __name__ == "__main__":
    print("Funciona")
    Benchmarking()

    print("Instancias")
    metodos_instancia = MetodosOrdenamiento()
    benchmarking = Benchmarking()

    tamanios = [500, 1000, 2000]
    resultaods = []

    for tem in tamanios:
        arereglo_base = benchmarking.build_arreglo(tem)
        metodos = {
            "Burbuja": metodos_instancia.sortByBubble,  # no se pone ()
            "Seleccion": metodos_instancia.sort_seleccion
        }

        for nombre, metodo in metodos.items():  # .items las tupla con dos valores
            tiempo = benchmarking.medir_tiempo(metodo, arereglo_base)
            tuplaResultado = (tem, nombre, tiempo)
            resultaods.append(tuplaResultado)

    # print solo una vez, fuera del for
    print(f"{'Tamaño':<10} {'Método':<15} {'Tiempo (segundos)':<12}")
    print("-" * 37)
    for resultado in resultaods:
        tem, nombre, tiempo = resultado
        print(f"{tem:<10} {nombre:<15} {tiempo:<12.6f}")

    tiempos_by_metodo = {
        "Burbuja": [],
        "Seleccion": []
    }

    for tem, nombre, tiempo in resultaods:
        tiempos_by_metodo[nombre].append(tiempo)

    plt.figure(figsize=(10, 6))

    for nombre, tiempos in tiempos_by_metodo.items():  # nombre y lista de tiempos
        plt.plot(tamanios, tiempos, label=nombre, marker="o")  # CORREGIDO: era 'tiempo'

       # Agregar fecha y hora en el título del gráfico
    ahora = datetime.now().strftime("%d/%m/%Y %H:%M:%S")
    plt.title("Comparativa de tiempos de métodos de ordenamiento\n"
          "Autor: Andrés Cajas - Fecha y hora: " + ahora)
    plt.xlabel("Tamaño obetnido")
    plt.ylabel("Tamaño Obtenido")
    plt.grid()
    plt.legend()
    plt.tight_layout()
    plt.show()

