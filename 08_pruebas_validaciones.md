# Fase 2 — Modelo de datos

## Entidades principales

### Universidad

Representa la institución académica principal.

Campos:

- `id`
- `nombre`

### Carrera

Representa un programa académico dentro de la universidad.

Campos:

- `id`
- `nombre`
- `idUniversidad`

### Semestre

Representa el nivel o periodo académico en el que se ubican las materias.

Campos:

- `id`
- `numero`

### Materia

Representa una asignatura de una carrera y semestre específico.

Campos:

- `id`
- `nombre`
- `idCarrera`
- `idSemestre`

### Usuario

Representa la cuenta de acceso al sistema.

Campos:

- `id`
- `nombre`
- `correo`
- `password`
- `tipo`

### Alumno

Extiende la información académica de un usuario tipo alumno.

Campos:

- `idUsuario`
- `matricula`
- `idCarrera`

### Profesor

Extiende la información laboral de un usuario tipo profesor.

Campos:

- `idUsuario`
- `numeroEmpleado`

### Grupo

Relaciona una materia con un profesor en un periodo específico.

Campos:

- `id`
- `idMateria`
- `idProfesor`
- `periodo`
- `nombreGrupo`

### Inscripción

Relaciona un alumno con un grupo.

Campos:

- `id`
- `idAlumno`
- `idGrupo`

### ConfiguraciónEvaluacion

Define las reglas de evaluación de una materia.

Campos:

- `id`
- `idMateria`
- `porcentajeParciales`
- `porcentajeActividades`
- `calificacionMinima`
- `faltasMaximas`

### Calificación

Almacena las calificaciones del alumno dentro de una inscripción.

Campos:

- `id`
- `idInscripcion`
- `parcial1`
- `parcial2`
- `parcial3`
- `actividades`
- `faltas`
- `promedioFinal`
- `estatus`

## Relación general

Una universidad tiene carreras. Las carreras tienen materias. Las materias pertenecen a semestres. Los profesores imparten grupos. Los alumnos se inscriben en grupos. Cada inscripción tiene una calificación. Cada materia tiene una configuración de evaluación.
