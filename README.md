# FUCHIBOOOL ⚽

Sistema de gestión de torneo de fútbol que organiza participantes por categorías de edad utilizando estructuras de datos personalizadas.

## 📋 Descripción

FUCHIBOOOL es una aplicación Java que gestiona el registro y clasificación de participantes en un torneo de fútbol. El sistema utiliza una **cola** para el registro de participantes y **pilas** para clasificarlos según su edad en diferentes categorías.

## 🎯 Características

- **Registro de participantes**: Utiliza una cola (FIFO) para registrar participantes en el orden de llegada
- **Clasificación por edad**: Organiza automáticamente los participantes en tres categorías:
  - **Sub-7**: Niños de 7 años o menos
  - **Sub-9**: Niños de 8 y 9 años
  - **Sub-11**: Niños de 10 y 11 años
- **Información de participantes**: Cada participante incluye:
  - Nombre
  - Edad
  - Posición (Portero/a, Delantero/a, Defensa)
  - Número de camiseta

## 🏗️ Estructura del Proyecto

```
FUCHIBOOOL/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── fuchiboool/
│                       ├── FUCHIBOOOL.java          # Clase principal
│                       ├── Participante.java        # Modelo de participante
│                       ├── Cola.java                # Estructura de datos cola genérica
│                       ├── ColaParticipantes.java   # Cola especializada para participantes
│                       ├── Pila.java                # Estructura de datos pila genérica
│                       └── PilaFichas.java          # Pila especializada para fichas
└── pom.xml                                          # Configuración Maven
```

## 🔧 Requisitos

- **Java**: Versión 23 o superior
- **Maven**: Para la gestión de dependencias y compilación

## 🚀 Compilación y Ejecución

### Compilar el proyecto

```bash
cd FUCHIBOOOL
mvn clean compile
```

### Ejecutar la aplicación

```bash
mvn exec:java
```

O compilar y ejecutar el JAR:

```bash
mvn clean package
java -cp target/FUCHIBOOOL-1.0-SNAPSHOT.jar com.mycompany.fuchiboool.FUCHIBOOOL
```

## 📊 Estructuras de Datos

### Cola (Queue)
Implementación de una cola genérica usando listas enlazadas:
- `encolar(T dato)`: Agrega un elemento al final de la cola
- `desencolar()`: Remueve y retorna el elemento del frente
- `estaVacia()`: Verifica si la cola está vacía
- `getTamano()`: Retorna el tamaño de la cola
- `imprimirCola()`: Imprime todos los elementos de la cola

### Pila (Stack)
Implementación de una pila genérica usando listas enlazadas:
- `apilar(T dato)`: Agrega un elemento en la cima de la pila
- `desapilar()`: Remueve y retorna el elemento de la cima
- `estaVacia()`: Verifica si la pila está vacía
- `getTamano()`: Retorna el tamaño de la pila

## 📝 Ejemplo de Uso

El programa registra participantes y los clasifica automáticamente:

```java
// Registro de participantes en la cola
cola.encolar(new Participante("Mario Chaves", 7, "Portero", 33));
cola.encolar(new Participante("Samuel Rodríguez", 9, "Delantero", 10));
// ... más participantes

// Clasificación automática por edad
while (!cola.estaVacia()) {
    Participante p = cola.desencolar();
    if (p.getEdad() <= 7) {
        sub7.apilar(p);
    } else if (p.getEdad() <= 9) {
        sub9.apilar(p);
    } else {
        sub11.apilar(p);
    }
}
```

## 👤 Autor

**Fabia**

## 📄 Licencia

Este proyecto utiliza la licencia por defecto de NetBeans.

---

⚽ ¡Disfruta organizando tu torneo de fútbol!

