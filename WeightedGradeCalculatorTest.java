# Fase 7 — Guía para defensa individual

## ¿Qué arquitectura usa el sistema?

Usa una arquitectura MVC con separación por capas: UI, Controller, Service, Repository y Persistence.

## ¿Dónde está la lógica del promedio final?

Está en `WeightedGradeCalculator.java`, que implementa la interfaz `GradeCalculatorStrategy`.

## ¿Cómo se controla el acceso por roles?

El login se realiza en `AuthService`. Después, `MainController` revisa el tipo de usuario y abre el panel correspondiente.

## ¿Dónde se guardan los datos?

Los datos se guardan en `data/university-data.xml` mediante la clase `XmlDatabase`.

## ¿Qué patrones de diseño se usaron?

- Singleton: `SessionManager`.
- Strategy: `GradeCalculatorStrategy` y `WeightedGradeCalculator`.
- Repository: `RepositoryContext`.

## ¿Qué pasa si una calificación no está entre 0 y 10?

El sistema lanza una validación controlada y muestra una alerta. No se cierra la aplicación.

## ¿Cómo se valida que los porcentajes sumen 100?

En `AcademicService.agregarMateria`, antes de guardar la materia se valida que `porcentajeParciales + porcentajeActividades == 100`.
