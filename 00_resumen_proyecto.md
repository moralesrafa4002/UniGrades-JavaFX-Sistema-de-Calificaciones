digraph Login {
    rankdir=TB;
    node [shape=box, style=rounded, color="#1e3354"];
    A [label="Abrir aplicación"];
    B [label="Login"];
    C [label="Validar credenciales"];
    D [label="Panel administrador"];
    E [label="Panel profesor"];
    F [label="Panel alumno"];
    G [label="Alerta de error"];
    A -> B -> C;
    C -> D [label="ADMIN"];
    C -> E [label="PROFESOR"];
    C -> F [label="ALUMNO"];
    C -> G [label="incorrecto"];
}
