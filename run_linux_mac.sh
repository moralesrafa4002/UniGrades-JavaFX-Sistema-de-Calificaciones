# Fase 5 — Persistencia XML

## Decisión técnica

El proyecto utiliza persistencia en XML para cumplir el requerimiento de guardar datos mediante archivos o base de datos.

Se eligió XML porque Java incluye herramientas estándar para leer y escribir este formato mediante `DocumentBuilder` y `Transformer`, sin necesidad de instalar una base de datos externa.

## Archivo principal

```text
data/university-data.xml
```

## Funcionamiento

Cuando la aplicación inicia:

1. Busca el archivo XML.
2. Si no existe, lo crea con datos de prueba.
3. Si existe, carga la información.
4. Cuando se agregan o editan datos, se guardan nuevamente en XML.

## Ventaja

El sistema puede ejecutarse en cualquier computadora con Java y Maven, sin requerir MySQL, SQLite u otro servidor de base de datos.
