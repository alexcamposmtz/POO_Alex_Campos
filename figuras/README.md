# Proyecto Figuras

Práctica de Programación Orientada a Objetos en Java. Calcula el perímetro y el área de un cuadrado, un triángulo y un rectángulo usando una clase para guardar los datos y otra con métodos estáticos para las fórmulas.

## Estructura

```
figuras/
└── src/
    ├── App.java       # Programa principal
    ├── Figura.java    # Clase con atributos, constructores, get y set
    └── Formulas.java  # Clase con métodos estáticos de perímetro y área
```

## Clases

### Figura
Representa una figura básica.

- **Atributos (private):** `lado1`, `lado2`, `lado3`, `altura` (todos `double`)
- **Constructores (sobrecarga):**
  - `Figura()`
  - `Figura(lado1)`
  - `Figura(lado1, lado2)`
  - `Figura(lado1, lado2, lado3, altura)`
- **Métodos:** get y set para cada atributo

### Formulas
Solo contiene métodos estáticos, por lo que no se instancia.

| Método | Fórmula |
|---|---|
| `perimetroCuadrado(lado)` | 4 × lado |
| `perimetroTriangulo(lado1, lado2, lado3)` | lado1 + lado2 + lado3 |
| `perimetroRectangulo(base, altura)` | 2 × (base + altura) |
| `areaCuadrado(lado1)` | lado1 × lado1 |
| `areaTriangulo(lado1, altura)` | (lado1 × altura) / 2 |
| `areaRectangulo(lado1, lado2)` | lado1 × lado2 |

### App
Crea tres objetos `Figura` (cuadrado, triángulo y rectángulo), imprime sus valores con los get, los modifica con los set e imprime perímetros y áreas usando `Formulas`.

## Conceptos de POO aplicados

- Clases y objetos
- Encapsulamiento (atributos privados con get y set)
- Constructores y sobrecarga de constructores
- Palabra reservada `this`
- Métodos estáticos
- Colaboración entre clases

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
=== Valores iniciales ===
Cuadrado:   lado1 = 4.0
Triangulo:  lado1 = 3.0, lado2 = 4.0, lado3 = 5.0, altura = 2.4
Rectangulo: base (lado1) = 6.0, altura (lado2) = 3.0

=== Valores despues de los set ===
Cuadrado:   lado1 = 7.0
Triangulo:  lado1 = 6.0, lado2 = 8.0, lado3 = 10.0, altura = 4.8
Rectangulo: base (lado1) = 10.0, altura (lado2) = 5.0

=== Perimetros y areas ===
Cuadrado:   perimetro = 28.0, area = 49.0
Triangulo:  perimetro = 24.0, area = 14.4
Rectangulo: perimetro = 30.0, area = 50.0
```

## Autor

Alejandro Campos Martínez
