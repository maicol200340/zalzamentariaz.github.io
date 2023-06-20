## Descripción del Problema

---
---

El objetivo de este proyecto es desarrollar un sistema de gestión de productos para una tienda. Actualmente, el proceso de registro y seguimiento de los productos se realiza de forma manual, lo que conlleva a errores y dificultades en el cálculo de estadísticas relevantes.
![image](https://github.com/MiguelSanchez12/Zalzamentaria.github.io/assets/136994004/1b76d330-5874-4bd3-a3be-0582aa583fed)

---
---
![image](https://github.com/MiguelSanchez12/Zalzamentaria.github.io/assets/136994004/9f1a97ba-b0b2-4054-b870-3c2a83d992ff)

**Título del Caso de Uso:** Gestión de productos en una tienda

**Actor Principal:** Coordinador de la tienda

**Breve Descripción:** El coordinador de la tienda puede gestionar los productos, registrando su información y calculando estadísticas. Puede ingresar el nombre, código, precio y cantidad de cada producto. El sistema registra las compras, calcula el precio total de cada una y muestra la información de los productos, así como el promedio del precio total de las compras.

**Flujo Básico:**

1. El coordinador de la tienda ingresa el nombre, código, precio y cantidad de cada producto.
2. El sistema registra la información de cada producto y calcula el precio total multiplicando el precio por la cantidad.
3. El sistema calcula el precio total de todas las compras y el promedio del precio total.
4. El sistema muestra la información de cada producto, incluyendo su nombre, código, precio, cantidad y precio total.
5. El sistema muestra el promedio del precio total de las compras.
---
---

Algoritmo CoordinadorTienda
    Definir numCompras Como Entero
    Definir productos[numCompras] Como Cadena
    Definir precioTotalCompras Como Real
    Definir promedioPrecioTotal Como Real

    Mostrar "Registro de productos en la tienda"

    Para i = 1 hasta 3
        Mostrar "Compra ", i

        Mostrar "Nombre del producto: "
        Leer productos[i].nombre

        Mostrar "Código del producto: "
        Leer productos[i].codigo

        Mostrar "Precio del producto: "
        Leer productos[i].precio

        Mostrar "Cantidad que va a llevar: "
        Leer productos[i].cantidad

        productos[i].precioTotal = productos[i].precio * productos[i].cantidad
        precioTotalCompras = precioTotalCompras + productos[i].precioTotal
    FinPara

    promedioPrecioTotal = precioTotalCompras / 3

    Mostrar "Promedio del precio total de las compras: ", promedioPrecioTotal
FinAlgoritmo

