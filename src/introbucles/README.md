# 📦 `introbucles` — Bucles: repetir coses

[🏠 Índex general](../../README.md) · [⬆️ src](../README.md)

Fins ara el programa feia cada línia **com a màxim una vegada**. Amb els **bucles**, un tros de codi es pot **repetir** mentre es compleixi una condició.

```java
while(condicio) {
	// es repeteix mentre la condició sigui true
	// ⚠️ alguna cosa de dins ha de fer canviar la condició
}
```

Dos usos típics:

| Ús | Exemple |
|----|---------|
| **Comptador** | `int a = 1; while(a<10) { ...; a++; }` → del 1 al 9 |
| **Verificar / llegir fins a...** | llegir fora, `while(num != 0) { ...; num = sc.nextInt(); }` |

## 📄 Apunts d'aquest paquet

| Classe | Apunt | De què va |
|--------|-------|-----------|
| `IntroduccioWhile` | [IntroduccioWhile.md](IntroduccioWhile.md) | `if` vs `while`, bucle infinit, comptador amb `a++`, bucle per verificar |

## 🗂️ Altres paquets

| Paquet | De què va |
|--------|-----------|
| [src (default package)](../README.md) | Fonaments: `main`, `println`, variables |
| [elScanner](../elScanner/README.md) | Llegir del teclat amb l'`Scanner` |
| [ProblemasIntroJoel](../ProblemasIntroJoel/README.md) | Primers exercicis: Hello World i Pa amb tomàquet |
| [alternativesifs](../alternativesifs/README.md) | `if`, `else if`, operadors lògics i el residu `%` |
| [ProblemasJOEL](../ProblemasJOEL/README.md) | Exercicis amb `if`: les Eleccions |
| [alternativesswitch](../alternativesswitch/README.md) | El `switch` |
