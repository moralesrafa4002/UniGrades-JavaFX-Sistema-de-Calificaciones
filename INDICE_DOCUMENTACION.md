digraph MVC {
    rankdir=TB;
    node [shape=box, style=filled, fillcolor="#eef5ff", color="#1e3354"];
    UI [label="UI JavaFX\nLoginView / Dashboards"];
    Controller [label="Controller\nMainController"];
    Service [label="Service\nAuthService / AcademicService / GradeService"];
    Repository [label="Repository\nRepositoryContext"];
    XML [label="Persistence\nXmlDatabase + university-data.xml"];
    UI -> Controller -> Service -> Repository -> XML;
}
