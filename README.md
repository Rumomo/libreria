**Ejercicio 1**. Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. La clase debe guardar el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados. La clase contendrá los siguientes métodos:
- Constructor por defecto.
-  Constructor con parámetros.
- Métodos setters y getters.
- Método prestamo() que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para prestar.
- Devuelve true si se ha podido realizar la operación y false en caso contrario.
- Método devolucion() que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar la operación y false en caso contrario.
- Método toString() para mostrar los datos de los libros. Este método se heredada de Object y lo debemos modificar (override) para adaptarlo a la clase Libro. Escribe un programa para probar el funcionamiento de la clase Libro.

Crear un programa principal que cree los siguientes libros: 
- Libro 1:
o Autor: Miguel de Cervantes.
o Nombre: El Quijote de La Mancha.
o Ejemplares: 2.  
- Libro 2:
o Autor: Arturo Pérez Reverte.
o Nombre: El Capitán Alatriste.
o Ejemplares: 1.
**Nota**: Se pueden crear otros libros si se quiere.
  Emular un sistema de préstamo y devolución para los libros antes mencionados. No tiene por qué crearse un menú.
**Subirlo a la plataforma en formato PDF junto a su código fuente.** 
