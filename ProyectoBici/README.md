## Getting Started
# Proyecto Bicicleta

Práctica de Programación Orientada a Objetos en Java. Se construye la clase `Bicicleta` con atributos privados, constructores sobrecargados, getters y setters, un método `pasear` sobrecargado y un método `toString`, y se prueba desde una clase principal `App`.

**Universidad Autónoma de Nayarit** · Unidad Académica de Economía · Licenciatura en Informática
**Materia:** Programación Orientada a Objetos

## Estructura

```
ProyectoBici/
└── src/
    ├── App.java        # Programa principal
    └── Bicicleta.java  # Clase Bicicleta
```

## Clase Bicicleta

**Atributos (private):**

| Atributo | Tipo |
|---|---|
| `marca` | `String` |
| `color` | `String` |
| `numeroDeCoronas` | `int` |
| `deporte` | `String` |
| `precio` | `double` |

**Constructores (sobrecarga):**

- `Bicicleta()`
- `Bicicleta(marca, deporte, precio)`
- `Bicicleta(marca, color, numeroDeCoronas, deporte, precio)`

**Métodos:**

- `get` y `set` para cada atributo
- `pasear(String lugar)`: muestra en qué lugar se está paseando
- `pasear()`: muestra un mensaje general
- `toString()`: devuelve los datos de la bicicleta como texto

## Clase App

Contiene el método `main` y sigue los pasos de la práctica:

1. Crea un objeto `Bicicleta` por cada constructor.
2. Asigna con los setters los datos que cada objeto no tiene.
3. Invoca las dos versiones del método `pasear`.
4. Imprime los datos de cada objeto con `toString()`.

## Conceptos de POO aplicados

- Clases y objetos
- Encapsulamiento (atributos privados con getters y setters)
- Constructores y sobrecarga de constructores
- Sobrecarga de métodos (`pasear`)
- Palabra reservada `this`
- Método `toString`

## Cómo ejecutarlo

Requiere tener instalado el JDK.

Desde la carpeta `src`:

```
javac *.java
java App
```

O desde VS Code, con el botón **Run** sobre el método `main` de `App.java`.

## Ejemplo de salida

```
Estoy paseando en la bicicleta
Estoy paseando en la bicicleta por el parque lineal
Estoy paseando en la bicicleta por la ciudad
Bicicleta [marca=Mongoose, color=Negro, numeroDeCoronas=2, deporte=BMX Freestyle, precio=6500.0]
Bicicleta [marca=WeThePeople, color=Azul, numeroDeCoronas=2, deporte=Ruta, precio=8500.5]
Bicicleta [marca=BSD, color=Rojo, numeroDeCoronas=3, deporte=Montaña, precio=12000.0]
```

## Autor

Alejandro Campos Martínez
