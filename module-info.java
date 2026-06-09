# Fase 8 — Pruebas y validaciones

## Casos probados

| Caso | Resultado esperado |
|---|---|
| Login correcto de administrador | Abre panel de administración |
| Login incorrecto | Muestra alerta de error |
| Profesor registra calificación válida | Guarda y recalcula promedio |
| Profesor captura calificación mayor a 10 | Muestra alerta y no guarda |
| Administrador crea materia con porcentajes 70/30 | Guarda correctamente |
| Administrador crea materia con porcentajes 80/30 | Muestra error |
| Alumno consulta calificaciones | Visualiza solo sus datos |

## Manejo de errores

El sistema usa validaciones para evitar fallos no controlados. Los errores se muestran mediante alertas de JavaFX.

## Importancia para la evaluación

Estas validaciones reducen el riesgo de penalizaciones durante la demostración, porque los datos incorrectos no cierran la aplicación y se manejan con mensajes claros.
