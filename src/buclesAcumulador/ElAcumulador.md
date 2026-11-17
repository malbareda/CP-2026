# ElAcumulador — Comptadors i acumuladors

[🏠 Índex](../../README.md) · [📦 Paquet](README.md) · [⬅️ Anterior](../ProblemasJOEL/segonDeBucles.md)

Fitxer: `src/buclesAcumulador/ElAcumulador.java`

---

## El codi

```java
package buclesAcumulador;

import java.util.Random;
import java.util.Scanner;

public class ElAcumulador {
	
	public static void main(String[] args) {
		
		//contador
		//tipo: int
		//funcion: contar
		//a++; o a--;
		
		//Acumulador
		//tipo: int, double, String
		//funcion: acumular
		//acc = acc + ALGO    o   acc = acc - ALGO;
		
		System.out.println("acumulador estatico");
		//me llegan 5 numeros
		//tengo que sumarlos
		Scanner sc = new Scanner(System.in);
		int acc = 0;
		for(int i=0;i<5;i++) {
			int numero = sc.nextInt();
			acc = acc + numero;
		}
		System.out.println(acc);
		
		System.out.println("acumulador hasta que pasa algo");
		//me llegan numeros hasta que leo un numero negativo
		//tengo que sumarlos
		int acc2 = 0;
		int numero = sc.nextInt();
		while(numero>=0) {
			acc2 = acc2+numero;
			numero = sc.nextInt();
		}
		System.out.println(acc2);
		
		
		System.out.println("acumulador negativo");
		
		int perrosCalientes = 100;
		Random r = new Random();
		while(perrosCalientes>0) {
			System.out.println("viene un cliente");
			int numeroAleatorio = r.nextInt(0,21);
			perrosCalientes = perrosCalientes - numeroAleatorio;
			System.out.println("me quedan "+perrosCalientes+" perros");
		}
		
		
	}

}
```

**Exemple d'execució** (escric `1 2 3 4 5` i després `10 20 -1`):

```
acumulador estatico
15
acumulador hasta que pasa algo
30
acumulador negativo
viene un cliente
me quedan 83 perros
viene un cliente
me quedan 67 perros
...
viene un cliente
me quedan 3 perros
viene un cliente
me quedan -2 perros
```

*(La part dels frankfurts surt **diferent cada vegada** que l'executes, perquè fa servir números aleatoris.)*

---

## 🧮 Comptador vs acumulador

```java
		//contador
		//tipo: int
		//funcion: contar
		//a++; o a--;
		
		//Acumulador
		//tipo: int, double, String
		//funcion: acumular
		//acc = acc + ALGO    o   acc = acc - ALGO;
```

| | **Comptador** | **Acumulador** |
|---|---|---|
| Per a què | **Comptar** quantes vegades passa una cosa | **Sumar** (o restar) valors que van arribant |
| Tipus | `int` | `int`, `double`, `String`... |
| Com canvia | Sempre d'**1 en 1**: `a++` o `a--` | De **qualsevol quantitat**: `acc = acc + ALGO` |
| Exemple | quants números he llegit | quant sumen els números que he llegit |

```
  Comptador:   0 → 1 → 2 → 3 → 4         (sempre +1)
  Acumulador:  0 → 3 → 10 → 12 → 30      (+3, +7, +2, +18: el que arribi)
```

> [!NOTE]
> El comptador és un cas particular d'acumulador: és un acumulador que **sempre suma 1**. `a++` és el mateix que `a = a + 1`.

> [!TIP]
> Un acumulador de **`String`** va enganxant text: `String acc = ""; acc = acc + "hola ";`... Fa servir la concatenació de [VariablesString](../VariablesString.md).

### Les 3 regles de tot acumulador

1. **Es crea FORA del bucle**, abans de començar.
2. **S'inicialitza amb un valor neutre**: `0` per sumar (`""` per a text).
3. **Dins del bucle**, s'hi afegeix el valor nou: `acc = acc + ALGO`.

> [!WARNING]
> Si el crees **dins** del bucle (`int acc = 0;` dins del `for`), es torna a posar a 0 a cada volta i **no acumula res**.

---

## 1️⃣ Acumulador estàtic: sumar 5 números

```java
		System.out.println("acumulador estatico");
		//me llegan 5 numeros
		//tengo que sumarlos
		Scanner sc = new Scanner(System.in);
		int acc = 0;
		for(int i=0;i<5;i++) {
			int numero = sc.nextInt();
			acc = acc + numero;
		}
		System.out.println(acc);
```

"Estàtic" perquè **sabem quants números arriben** (5) → `for` (mira [introduccioFor](../introbucles/introduccioFor.md)).

### Traça amb `1 2 3 4 5`

| Volta (`i`) | Llegeix `numero` | `acc` abans | `acc = acc + numero` | `acc` després |
|:-----------:|:----------------:|:-----------:|:--------------------:|:-------------:|
| — | — | — | `int acc = 0;` | **0** |
| 0 | 1 | 0 | 0 + 1 | **1** |
| 1 | 2 | 1 | 1 + 2 | **3** |
| 2 | 3 | 3 | 3 + 3 | **6** |
| 3 | 4 | 6 | 6 + 4 | **10** |
| 4 | 5 | 10 | 10 + 5 | **15** |

Després del bucle: `System.out.println(acc);` → **`15`**.

> [!NOTE]
> El `println(acc)` va **fora** (després) del bucle: volem el total **al final**, no cada suma parcial. Si el poséssim dins, imprimiria `1` `3` `6` `10` `15`.

---

## 2️⃣ Acumulador "fins que passa alguna cosa"

```java
		System.out.println("acumulador hasta que pasa algo");
		//me llegan numeros hasta que leo un numero negativo
		//tengo que sumarlos
		int acc2 = 0;
		int numero = sc.nextInt();
		while(numero>=0) {
			acc2 = acc2+numero;
			numero = sc.nextInt();
		}
		System.out.println(acc2);
```

Ara **no sabem quants números arriben**: es llegeix fins que surti un negatiu → `while`, amb el patró del bucle per verificar de [IntroduccioWhile](../introbucles/IntroduccioWhile.md):

- **llegir fora** el primer número;
- `while(numero>=0)` → la condició d'**estar dins** ("mentre no sigui negatiu");
- **llegir dins**, al final, el següent número.

> [!NOTE]
> El negatiu fa de "senyal de final": **no se suma**. Quan es llegeix, el `while` comprova la condició, dona `false` i surt abans de sumar-lo.

> [!NOTE]
> Aquí es pot tornar a escriure `int numero` sense error perquè el `numero` del `for` d'abans **només existia dins del `for`** (igual que passa amb la `i`).

### Per què un acumulador nou (`acc2`)?

```java
		int acc2 = 0;
```

L'`acc` de la part 1️⃣ **ja val 15**. Si continuéssim sumant a `acc`, el resultat sortiria **inflat**: amb `10 20 -1` donaria `15 + 10 + 20 = 45` en lloc de `30`. Per això es crea **un acumulador nou, començant a 0**.

### Traça amb `10 20 -1`

| Llegeix | `numero>=0`? | `acc2` |
|:-------:|:------------:|:------:|
| — | — | **0** |
| 10 | ✅ | 0 + 10 = **10** |
| 20 | ✅ | 10 + 20 = **30** |
| -1 | ❌ surt | 30 |

Després del bucle: `System.out.println(acc2);` → **`30`**.

> [!WARNING]
> Error típic: crear `acc2` però, per costum, continuar escrivint `acc` a dins del bucle. El codi **compila igual**, però suma a l'acumulador antic. Pista: Eclipse avisa en groc que `acc2` **no es fa servir** (*"The value of the local variable acc2 is not used"*). Aquests avisos grocs sovint amaguen errors així!

---

## 3️⃣ Acumulador negatiu: els frankfurts 🌭

```java
		System.out.println("acumulador negativo");
		
		int perrosCalientes = 100;
		Random r = new Random();
		while(perrosCalientes>0) {
			System.out.println("viene un cliente");
			int numeroAleatorio = r.nextInt(0,21);
			perrosCalientes = perrosCalientes - numeroAleatorio;
			System.out.println("me quedan "+perrosCalientes+" perros");
		}
```

Ara l'acumulador **resta**: `acc = acc - ALGO`. Tinc 100 frankfurts; cada client se n'endú uns quants; mentre me'n quedin, continuo venent.

- **Inici**: `100`, no `0`. L'acumulador comença amb el que tinc.
- **Canvi**: `perrosCalientes = perrosCalientes - numeroAleatorio;` (en resta).
- **Condició**: `perrosCalientes>0` (mentre me'n quedin).

### Nou: `Random`, números aleatoris

```java
import java.util.Random;
...
		Random r = new Random();
...
			int numeroAleatorio = r.nextInt(0,21);
```

Funciona igual que l'`Scanner`:

| | `Scanner` | `Random` |
|---|---|---|
| Import | `import java.util.Scanner;` | `import java.util.Random;` |
| Crear-lo | `Scanner sc = new Scanner(System.in);` | `Random r = new Random();` |
| Fer-lo servir | `sc.nextInt()` → el que escriu l'usuari | `r.nextInt(0,21)` → un número a l'atzar |

`r.nextInt(0,21)` dona un número a l'atzar **del 0 al 20**: el primer número **sí** hi entra, l'últim **no** (igual que `i<21` als `for`).

> [!TIP]
> Per a un dau: `r.nextInt(1,7)` → de l'1 al 6.

> [!NOTE]
> Com que els números són aleatoris, **cada execució és diferent**: un dia s'acaben en 8 clients, un altre en 13. Fins i tot pot venir un client que no s'endugui res (`0`), i llavors surt `me quedan 100 perros`.

### ⚠️ Per què pot acabar en negatiu? (tema comentat a classe)

> [!IMPORTANT]
> Aquest comportament **es deixa així a propòsit**: és un tema que va sortir a classe. El codi **no** està corregit.

A l'exemple d'execució, l'última línia és `me quedan -2 perros`. Quedaven 3 frankfurts, el client en va voler 5, i `3 - 5 = -2`. El programa **no comprova** si en queden prou abans de restar: la condició `perrosCalientes>0` només es mira **a l'inici de cada volta**, no abans de fer la resta.

| `perrosCalientes` | Client vol | Resta | `>0`? |
|:-----------------:|:----------:|:-----:|:-----:|
| 5 | 2 | **3** | ✅ continua |
| 3 | 5 | **-2** | ❌ surt |

> [!TIP]
> Per evitar-ho, es podria fer servir un `if` dins del bucle: si el client en vol més dels que queden, se li donen només els que queden.

---

## ✅ Resum

- **Comptador**: compta d'1 en 1 (`a++`). **Acumulador**: suma o resta el que arribi (`acc = acc + ALGO`).
- L'acumulador es crea **fora** del bucle, amb un valor inicial (`0` per sumar).
- Sabem quants valors arriben → `for`. No ho sabem (fins a un negatiu, fins que s'acabin...) → `while`.
- `Random r = new Random();` + `r.nextInt(0,21)` → número aleatori del 0 al 20.
- Si necessites començar una suma nova, fes un **acumulador nou** (`acc2`) i **fes-lo servir a tot arreu** (sumar i imprimir).
- Un acumulador que resta pot passar "de llarg" i acabar en negatiu: la condició del `while` només es comprova a l'inici de cada volta.
