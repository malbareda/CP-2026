# 📦 `introbucles` — Bucles: repetir coses (`while` i `for`)

[🏠 Índex general](../../README.md) · [⬆️ src](../README.md)

Fins ara el programa feia cada línia **com a màxim una vegada**. Amb els **bucles**, un tros de codi es pot **repetir** mentre es compleixi una condició.

```java
while(condicio) {
	// es repeteix mentre la condició sigui true
	// ⚠️ alguna cosa de dins ha de fer canviar la condició
}

for(int i = INICI; CONDICIO; INCREMENT) {
	// el mateix, amb el comptador en una sola línia
}
```

Usos típics:

| Ús | Exemple |
|----|---------|
| **Comptador** | `int a = 1; while(a<10) { ...; a++; }` → del 1 al 9 |
| **Verificar / llegir fins a...** | llegir fora, `while(num != 0) { ...; num = sc.nextInt(); }` |
| **De l'inici al final** (millor amb `for`) | `for(int i=0; i<5; i++) { ... }` → del 0 al 4 |

## 📄 Apunts d'aquest paquet

| Classe | Apunt | De què va |
|--------|-------|-----------|
| `IntroduccioWhile` | [IntroduccioWhile.md](IntroduccioWhile.md) | `if` vs `while`, bucle infinit, comptador amb `a++`, bucle per verificar |
| `introduccioFor` | [introduccioFor.md](introduccioFor.md) | `for`: inici, condició i increment en una línia; final/inici per teclat, cap enrere, `i=i*2`... |

## 🗂️ Altres paquets

| Paquet | De què va |
|--------|-----------|
| [src (default package)](../README.md) | Fonaments: `main`, `println`, variables |
| [elScanner](../elScanner/README.md) | Llegir del teclat amb l'`Scanner` |
| [ProblemasIntroJoel](../ProblemasIntroJoel/README.md) | Primers exercicis: Hello World i Pa amb tomàquet |
| [alternativesifs](../alternativesifs/README.md) | `if`, `else if`, operadors lògics i el residu `%` |
| [ProblemasJOEL](../ProblemasJOEL/README.md) | Exercicis: Eleccions (`if`) i casos de prova (bucles) |
| [alternativesswitch](../alternativesswitch/README.md) | El `switch` |
| [buclesAcumulador](../buclesAcumulador/README.md) | Acumuladors dins dels bucles |
