# 📦 `alternativesifs` — Prendre decisions

[🏠 Índex general](../../README.md) · [⬆️ src](../README.md)

Fins ara el programa feia **totes** les línies, de dalt a baix. Amb les **alternatives** (`if`) el programa pot **triar** quin camí segueix segons una condició (`true` / `false`).

```java
if(condicio) {
	// si és true
} else if(altraCondicio) {
	// si la primera és false i aquesta true
} else {
	// si cap ho és
}
```

Per fer les condicions calen els **operadors lògics** (`>`, `==`, `&&`, `||`...), i el residu **`%`** és molt útil dins dels `if` (per exemple, per saber si un número és parell).

## 📄 Apunts d'aquest paquet

| Classe | Apunt | De què va |
|--------|-------|-----------|
| `ElTeuAmicIf` | [ElTeuAmicIf.md](ElTeuAmicIf.md) | `if` / `else`: dos camins, sempre se'n fa un |
| `ElTeuAmicElseIf` | [ElTeuAmicElseIf.md](ElTeuAmicElseIf.md) | `else if`: més camins, només entra al **primer** `true` |
| `operadoresLogicos` | [operadoresLogicos.md](operadoresLogicos.md) | `>` `<` `>=` `<=` `==` `!=`, el `!`, OR `\|\|` i AND `&&` |
| `modulos` | [modulos.md](modulos.md) | `/` i `%`, parells/senars, divisió entera vs decimal, `long`, passar segons a anys |

## 🗂️ Altres paquets

| Paquet | De què va |
|--------|-----------|
| [src (default package)](../README.md) | Fonaments: `main`, `println`, variables |
| [elScanner](../elScanner/README.md) | Llegir del teclat amb l'`Scanner` |
| [ProblemasIntroJoel](../ProblemasIntroJoel/README.md) | Primers exercicis: Hello World i Pa amb tomàquet |
| [ProblemasJOEL](../ProblemasJOEL/README.md) | Exercicis amb `if`: les Eleccions |
