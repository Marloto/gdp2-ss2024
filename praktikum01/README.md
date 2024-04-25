# Notes

## Git

- Konsolenbasiert: über git-scm.com die Werkzeuge laden, falls nicht vorhanden
- Alternativ über Eclipse
- Neues Projekt mit README oder/und .gitignore auf BitBucket erzeugen (alternativ GitHub od. GitLab)
- Zurück zu Eclipse -> Window -> Show Perspective -> Other od. direkt Git
- Im Git-Perspective, Clone Repository (links, grüner Pfeil auf Zylinder mit Wolke)
- Clone URI
- URI einfügen (von BitBucket), rest wird ausgefüllt
- Access Token von BitBucket notwendig, zusammen mit Username
- Branch sollte angezeigt werden (sonst ist das Repo nicht initalisiert), meist main
- Ordner lokal auswählen, nicht im Workspace
- Repo öffnen und rechtsklick auf Worktree -> show in system explorer
- Kopieren Sie das aktuelle VA-Projekt in das Repo (zurück in Java-Perspective) und per Rechtsklick Show in -> System explorer
- Löschen des alten Projektes im Eclipse (nicht den Hacken setzen zum Löschen im System)
- Rechts Klick Import (od. über File-Menü) "Existing Project into Workspace", Ordner vom Repo auswählen und importieren
- Rechtsklick auf Projekt -> Team bietet dann alle Möglichkeiten im Git-Kontext
- .gitignore könnte .classpath, .settings, .project, auf GitIgnore bedeutet, dass das 
  Projekt auf einem neuen Rechner "erstellt" werden muss und nicht importiert wird