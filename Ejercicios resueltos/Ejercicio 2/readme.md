Este ejercicio se debe resolver utilizando doble dispatching

El doble dispatching (Double Dispatch) es un patrón de diseño que permite que un método se seleccione en tiempo de ejecución según dos tipos de objetos involucrados en una operación, en lugar de solo uno (como ocurre en la sobrecarga de métodos o el polimorfismo estándar).

📌 ¿Por qué es útil?
El polimorfismo en Java y otros lenguajes orientados a objetos generalmente se basa en el tipo de la instancia sobre la que se llama un método, pero ignora el tipo del argumento. Con el doble dispatching, se puede seleccionar un método basándose tanto en el tipo del objeto receptor como en el tipo del argumento.
