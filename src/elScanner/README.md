# 📦 `elScanner` — Llegir del teclat

[🏠 Índex general](../../README.md) · [⬆️ src](../README.md)

Fins ara els valors estaven escrits al codi i el programa feia sempre el mateix. Amb l'**`Scanner`** el programa s'espera que l'usuari escrigui alguna cosa i la guarda en una variable.

```java
import java.util.Scanner;                    // a dalt de tot
Scanner sc = new Scanner(System.in);         // un cop
int a = sc.nextInt();                        // llegir un enter
double d = sc.nextDouble();                  // llegir un decimal (amb coma pel teclat!)
String linea = sc.nextLine();                // llegir una línia de text
```

## 📄 Apunts d'aquest paquet

| Classe | Apunt | De què va |
|--------|-------|-----------|
| `TuAmigoElScanner` | [TuAmigoElScanner.md](TuAmigoElScanner.md) | `import`, `nextInt`, `nextDouble`, `nextLine` i el `sc.nextLine();` solt |

## 🗂️ Altres paquets

| Paquet | De què va |
|--------|-----------|
| [src (default package)](../README.md) | Fonaments: `main`, `println`, variables |
| [ProblemasIntroJoel](../ProblemasIntroJoel/README.md) | Primers exercicis: Hello World i Pa amb tomàquet |
| [alternativesifs](../alternativesifs/README.md) | `if`, `else if`, operadors lògics i el residu `%` |
| [ProblemasJOEL](../ProblemasJOEL/README.md) | Exercicis amb `if`: les Eleccions |
