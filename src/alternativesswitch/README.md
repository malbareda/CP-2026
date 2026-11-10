# 📦 `alternativesswitch` — El `switch`

[🏠 Índex general](../../README.md) · [⬆️ src](../README.md)

Una altra manera de fer **alternatives** (com l'`if` de [alternativesifs](../alternativesifs/README.md)). El `switch` és més còmode quan compares **una sola variable** amb **molts valors concrets** (dies de la setmana, mesos, opcions d'un menú...).

```java
switch (variable) {
	case valor1:
		// si variable == valor1
		break;          // ⚠️ sense break, cau al case de sota
	case valor2, valor3:
		// si és valor2 o valor3
		break;
	default:
		// si no és cap dels anteriors
}
```

## 📄 Apunts d'aquest paquet

| Classe | Apunt | De què va |
|--------|-------|-----------|
| `exempleNum` | [exempleNum.md](exempleNum.md) | `switch` amb `int`: dies i estacions, `break` i caiguda, `case 12, 1, 2:`, `i++`, `sc.close()` |
| `exempleString` | [exempleString.md](exempleString.md) | `switch` amb `String`: `case "cafe":`, majúscules i accents |

## 🗂️ Altres paquets

| Paquet | De què va |
|--------|-----------|
| [src (default package)](../README.md) | Fonaments: `main`, `println`, variables |
| [elScanner](../elScanner/README.md) | Llegir del teclat amb l'`Scanner` |
| [ProblemasIntroJoel](../ProblemasIntroJoel/README.md) | Primers exercicis: Hello World i Pa amb tomàquet |
| [alternativesifs](../alternativesifs/README.md) | `if`, `else if`, operadors lògics i el residu `%` |
| [ProblemasJOEL](../ProblemasJOEL/README.md) | Exercicis amb `if`: les Eleccions |
| [introbucles](../introbucles/README.md) | Bucles: el `while` |
