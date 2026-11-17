# 📦 `buclesAcumulador` — Acumular dins dels bucles

[🏠 Índex general](../../README.md) · [⬆️ src](../README.md)

Dins d'un bucle sovint cal **guardar un resultat que va creixent (o decreixent)** volta a volta: el total d'una suma, el que queda d'una cosa... Això és un **acumulador**.

```java
int acc = 0;                    // 1️⃣ fora del bucle, amb valor inicial
for(int i=0;i<5;i++) {
	int numero = sc.nextInt();
	acc = acc + numero;         // 2️⃣ dins: hi afegeixo el valor nou
}
System.out.println(acc);        // 3️⃣ després del bucle: el resultat
```

| | Comptador | Acumulador |
|---|---|---|
| Canvia | d'1 en 1 (`a++`) | el que arribi (`acc = acc + ALGO`) |
| Serveix per | comptar | sumar / restar / enganxar text |

## 📄 Apunts d'aquest paquet

| Classe | Apunt | De què va |
|--------|-------|-----------|
| `ElAcumulador` | [ElAcumulador.md](ElAcumulador.md) | Comptador vs acumulador, sumar 5 números (`for`), sumar fins a un negatiu (`while`), restar frankfurts amb `Random` |

## 🗂️ Altres paquets

| Paquet | De què va |
|--------|-----------|
| [src (default package)](../README.md) | Fonaments: `main`, `println`, variables |
| [elScanner](../elScanner/README.md) | Llegir del teclat amb l'`Scanner` |
| [ProblemasIntroJoel](../ProblemasIntroJoel/README.md) | Primers exercicis: Hello World i Pa amb tomàquet |
| [alternativesifs](../alternativesifs/README.md) | `if`, `else if`, operadors lògics i el residu `%` |
| [ProblemasJOEL](../ProblemasJOEL/README.md) | Exercicis: Eleccions (`if`) i casos de prova (bucles) |
| [alternativesswitch](../alternativesswitch/README.md) | El `switch` |
| [introbucles](../introbucles/README.md) | Bucles: `while` i `for` |
