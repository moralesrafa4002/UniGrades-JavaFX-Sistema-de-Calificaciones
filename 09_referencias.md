# Fase 3 — Arquitectura MVC y capas

## Arquitectura general

El sistema se organizó con una arquitectura inspirada en MVC y separación por capas.

```text
UI JavaFX
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
XML Persistence
```

## Capa UI

Contiene las pantallas JavaFX. Su función es mostrar información y recibir datos del usuario.

Archivos principales:

- `LoginView.java`
- `AdminDashboardView.java`
- `ProfesorDashboardView.java`
- `AlumnoDashboardView.java`

## Capa Controller

Coordina la navegación y el flujo general de la aplicación.

Archivo principal:

- `MainController.java`

## Capa Service

Contiene la lógica de negocio. Por ejemplo, autenticación, altas académicas, inscripción y cálculo de calificaciones.

Archivos principales:

- `AuthService.java`
- `AcademicService.java`
- `GradeService.java`

## Capa Repository/Persistence

Administra la carga y guardado de datos.

Archivos principales:

- `RepositoryContext.java`
- `XmlDatabase.java`

## Beneficio de la arquitectura

La interfaz no modifica directamente el archivo XML. Las pantallas llaman a los servicios y los servicios utilizan la capa de persistencia. Esto reduce acoplamiento y facilita explicar el flujo del sistema durante la defensa individual.
