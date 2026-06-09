# Fase 1 — Requerimientos funcionales

## Requerimientos del profesor

El profesor puede iniciar sesión, visualizar sus grupos asignados y registrar calificaciones parciales, actividades y faltas. El sistema calcula automáticamente el promedio final y determina si el alumno aprueba o reprueba.

## Requerimientos del alumno

El alumno puede iniciar sesión y consultar sus calificaciones. No puede modificar datos. Su panel muestra parciales, actividades, faltas, promedio final y estatus.

## Requerimientos del administrador

El administrador puede administrar la información principal del sistema, incluyendo carreras, materias, profesores, alumnos, grupos, inscripciones y calificaciones. También puede configurar porcentajes de evaluación.

## Restricciones importantes

- Los porcentajes de evaluación deben sumar 100%.
- Las calificaciones deben estar entre 0 y 10.
- Las faltas no pueden ser negativas.
- Cada usuario solo puede entrar a su panel correspondiente.
- Las operaciones inválidas deben mostrar mensajes de error sin cerrar la aplicación.
