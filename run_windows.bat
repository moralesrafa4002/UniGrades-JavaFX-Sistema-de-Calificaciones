# Fase 4 — Patrones de diseño implementados

## Singleton — SessionManager

El patrón Singleton se utiliza para mantener una única instancia de sesión activa.

Archivo:

```text
src/main/java/com/rafa/unigrades/pattern/SessionManager.java
```

Función:

- Guardar el usuario autenticado.
- Consultar quién inició sesión.
- Cerrar sesión.

Código clave:

```java
public static SessionManager getInstance() {
    if (instance == null) {
        instance = new SessionManager();
    }
    return instance;
}
```

## Strategy — GradeCalculatorStrategy

El patrón Strategy permite separar la fórmula de cálculo del promedio final.

Archivos:

```text
GradeCalculatorStrategy.java
WeightedGradeCalculator.java
```

Función:

- Calcular el promedio final.
- Determinar estatus académico.
- Permitir cambiar la fórmula en el futuro sin modificar la interfaz.

## Repository — RepositoryContext

El patrón Repository se aplica para separar el acceso a datos del resto del sistema.

Archivo:

```text
RepositoryContext.java
```

Función:

- Centralizar el acceso al `DataStore`.
- Guardar cambios usando `XmlDatabase`.
- Evitar que las pantallas manipulen directamente la persistencia.
