# Proyecto Estudiantes

Práctica de Programación Orientada a Objetos en Java. Se construye la clase `Estudiante`, que almacena los datos básicos de un estudiante, y se prueba desde una clase principal `App` con tres objetos.

**Universidad Autónoma de Nayarit** · Unidad Académica de Economía · Licenciatura en Informática
**Materia:** Programación Orientada a Objetos

## Estructura

```
Estudiantes/
└── src/
    ├── App.java         # Programa principal
    └── Estudiante.java  # Clase Estudiante
```

## Clase Estudiante

**Atributos (private):**

| Atributo | Tipo |
|---|---|
| `matricula` | `String` |
| `nombre` | `String` |
| `carrera` | `String` |
| `semestre` | `int` |

**Métodos:**

- `get` y `set` para cada atributo
- `mostrarInformacion()` (`void`): imprime en la consola el nombre, la matrícula y la carrera del estudiante
- `obtenerNivelSemestre()` (`String`): **retorna** el nivel según el semestre, sin imprimirlo:

| Semestre | Nivel |
|---|---|
| 1 a 3 | Nivel básico |
| 4 a 6 | Nivel intermedio |
| 7 a 9 | Nivel avanzado |
| Otro valor | Semestre no válido |

## Clase App

Contiene el método `main` y realiza lo siguiente:

1. Crea tres objetos `Estudiante`.
2. Asigna sus datos con los métodos `set`.
3. Imprime los datos con los métodos `get`.
4. Ejecuta `mostrarInformacion()`.
5. Ejecuta `obtenerNivelSemestre()` y muestra en la consola el valor que retorna.

## Datos de prueba

| Matrícula | Nombre | Carrera | Semestre |
|---|---|---|---|
| 2026001 | Ana López García | Sistemas Computacionales | 2 |
| 2026002 | Carlos Ramírez Torres | Sistemas Computacionales | 2 |
| 2026003 | María Fernanda Gómez | Sistemas Computacionales | 2 |

## Conceptos de POO aplicados

- Abstracción
- Encapsulamiento (atributos privados con getters y setters)
- Clases y objetos
- Palabra reservada `this`
- Métodos que realizan una acción (`void`) y métodos que retornan un valor
- Estructuras condicionales (`if / else if`)

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
===== ESTUDIANTE 1 =====
Estudiante: Ana López García
Matrícula: 2026001
Carrera: Sistemas Computacionales
Semestre: 2
Nivel: Nivel básico

===== ESTUDIANTE 2 =====
Estudiante: Carlos Ramírez Torres
Matrícula: 2026002
Carrera: Sistemas Computacionales
Semestre: 2
Nivel: Nivel básico

===== ESTUDIANTE 3 =====
Estudiante: María Fernanda Gómez
Matrícula: 2026003
Carrera: Sistemas Computacionales
Semestre: 2
Nivel: Nivel básico
```

## Autor

Alejandro Campos Martínez
