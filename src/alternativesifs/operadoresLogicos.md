# operadoresLogicos — Comparar i combinar condicions

[🏠 Índex](../../README.md) · [⬅️ Anterior](ElTeuAmicElseIf.md) · [Següent ➡️](../ProblemasJOEL/Eleccions2020.md)

Fitxer: `src/alternativesifs/operadoresLogicos.java`

---

## El codi

```java
package alternativesifs;

public class operadoresLogicos {
	
	public static void main(String[] args) {
		
		//operador aritmetico, suma es int = int+int;
		
		
		int a = 4;
		int b = 5;
		
		//operador logico es el que el resultado es un booleano
		boolean masGrande = a > b;
		System.out.println("masGrande? "+masGrande);
		boolean masPequeño = a < b;
		System.out.println("masPqueño "+masPequeño);
		boolean masGrandeOIgual = a >= b;
		System.out.println("masGrandeoIgual? "+masGrandeOIgual);
		boolean masPequeñoOIgual = a <= b;
		System.out.println("masPequeñooIgual? "+masPequeñoOIgual);
		boolean igual = a == b; // == implica "igual que"
		System.out.println("igual? "+igual);
		boolean desigual = a != b;
		System.out.println("desigual "+desigual);
		
		boolean contrari = !igual; //! inverteix la variable booleana
		System.out.println("contrari "+contrari);
		
		
		
		//OR  || <- altGr+1
		//SUMAR BOOLEANS
		//en l'or, si un dels dos es true, aleshores es true, si els dos son falses, aleshores es false
		boolean or = true || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false;
		System.out.println("or "+or);
		//AND  &&  (shift+6)
		//en l'and, nomes es true si TOTS son true. Si un no ho es, és false
		boolean and = true && true && false;
		System.out.println("and "+and);
		
		
		int num = 0;
		if(num > 0 && num < 100) {
			System.out.println("num entre 0 i 100");
		}else {
			System.out.println("nope");
		}
		
	}

}
```

**Sortida per consola:**

```
masGrande? false
masPqueño true
masGrandeoIgual? false
masPequeñooIgual? true
igual? false
desigual true
contrari true
or true
and false
nope
```

---

## 🧮 Operador aritmètic vs operador lògic

```java
		//operador aritmetico, suma es int = int+int;
```

```java
		//operador logico es el que el resultado es un booleano
```

| Tipus d'operador | Exemples | Què dona com a resultat | Exemple |
|------------------|----------|-------------------------|---------|
| **Aritmètic** | `+` `-` `*` `/` `%` | un **número** | `4 + 5` → `9` |
| **Lògic** (de comparació) | `>` `<` `>=` `<=` `==` `!=` | un **`boolean`** (`true`/`false`) | `4 > 5` → `false` |

Un operador lògic és com fer una **pregunta de sí o no**: "4 és més gran que 5?" → No → `false`.

> [!TIP]
> Com que el resultat és un `boolean`, es pot **guardar en una variable `boolean`** (com fa aquest codi) o es pot posar **directament dins d'un `if`**. Aquestes dues coses són equivalents:
>
> ```java
> boolean masGrande = a > b;
> if(masGrande) { ... }
> ```
> ```java
> if(a > b) { ... }
> ```

---

## ⚖️ Els 6 operadors de comparació

Amb `a = 4` i `b = 5`:

| Codi | Es llegeix | Pregunta | Resultat | Imprimeix |
|------|-----------|----------|:--------:|-----------|
| `a > b` | més gran que | 4 > 5 ? | `false` | `masGrande? false` |
| `a < b` | més petit que | 4 < 5 ? | `true` | `masPqueño true` |
| `a >= b` | més gran **o igual** que | 4 ≥ 5 ? | `false` | `masGrandeoIgual? false` |
| `a <= b` | més petit **o igual** que | 4 ≤ 5 ? | `true` | `masPequeñooIgual? true` |
| `a == b` | igual que | 4 = 5 ? | `false` | `igual? false` |
| `a != b` | diferent de | 4 ≠ 5 ? | `true` | `desigual true` |

> [!WARNING]
> **`=` i `==` NO són el mateix!**
>
> | | Significat | Exemple |
> |---|---|---|
> | `=` | **guardar** un valor a una variable | `a = 4;` → "a passa a valer 4" |
> | `==` | **preguntar** si són iguals | `a == b` → "a és igual que b?" → `true`/`false` |
>
> `// == implica "igual que"`. Si escrius `if(a = b)` Eclipse dona error.

> [!WARNING]
> - `>=` i `<=`: primer el `>`/`<` i **després** el `=`. `=>` o `=<` donen error.
> - Sense espai pel mig: `> =` dona error.
> - `!=` és "diferent": exclamació + igual.

### Com s'imprimeix un `boolean` amb text

```java
		System.out.println("masGrande? "+masGrande);
```

És una concatenació (mira [VariablesString](../VariablesString.md)): el text `"masGrande? "` + el valor de la variable (`false`) → `masGrande? false`. El text entre cometes és el que hi he escrit jo (per això surt `masPqueño` sense la `e`: Java imprimeix exactament el que hi ha entre cometes).

> [!NOTE]
> Java accepta la `ñ` en noms de variables (`masPequeño`), però **no és recomanable**: en alguns ordinadors o consoles es veu com `masPeque�o`. Millor fer servir només lletres sense accents (`masPequeno`).

---

## 🔄 El `!` (NOT): girar un booleà

```java
		boolean contrari = !igual; //! inverteix la variable booleana
```

| `igual` | `!igual` |
|:-------:|:--------:|
| `true` | `false` |
| `false` | `true` |

`igual` val `false` → `!igual` val **`true`** → imprimeix `contrari true`.

> [!NOTE]
> Fixa't que `!igual` dona el mateix que `a != b`. És la mateixa pregunta feta de dues maneres.

---

## ➕ L'OR `||`: "algun"

```java
		//OR  || <- altGr+1
		//SUMAR BOOLEANS
		//en l'or, si un dels dos es true, aleshores es true, si els dos son falses, aleshores es false
```

- S'escriu amb **dues barres verticals** `||`. Al teclat espanyol/català: **`AltGr + 1`** (dues vegades).
- Es llegeix "**o**": *"això **o** allò"*.
- És `true` si **almenys un** és `true`.

| A | B | `A \|\| B` |
|:---:|:---:|:---:|
| `true` | `true` | `true` |
| `true` | `false` | `true` |
| `false` | `true` | `true` |
| `false` | `false` | `false` ⬅️ l'únic cas `false` |

```java
		boolean or = true || false || false || ... || false;
```

Hi ha **un sol `true`** i un munt de `false`. Com que amb un `true` n'hi ha prou → **`or true`**. No importa quants `false` hi hagi.

> [!TIP]
> Per això "SUMAR BOOLEANS": pensa `true` = 1 i `false` = 0. Si la suma és més gran que 0 → `true`.

---

## ✖️ L'AND `&&`: "tots"

```java
		//AND  &&  (shift+6)
		//en l'and, nomes es true si TOTS son true. Si un no ho es, és false
		boolean and = true && true && false;
```

- S'escriu amb **dos ampersands** `&&`. Al teclat: **`Shift + 6`** (dues vegades).
- Es llegeix "**i**": *"això **i** allò"*.
- És `true` **només si tots** són `true`.

| A | B | `A && B` |
|:---:|:---:|:---:|
| `true` | `true` | `true` ⬅️ l'únic cas `true` |
| `true` | `false` | `false` |
| `false` | `true` | `false` |
| `false` | `false` | `false` |

`true && true && false` → n'hi ha un de `false` → **`and false`**.

> [!TIP]
> Seguint la idea de "sumar": l'AND és com **multiplicar** (`true` = 1, `false` = 0). Amb un sol 0, tot dona 0.

> [!WARNING]
> Són **dobles**: `||` i `&&`. Amb una sola (`|`, `&`) també compila però fa una cosa una mica diferent. De moment, **sempre dobles**.

---

## 🎯 Ús real: comprovar un interval

```java
		int num = 0;
		if(num > 0 && num < 100) {
			System.out.println("num entre 0 i 100");
		}else {
			System.out.println("nope");
		}
```

Vull saber si `num` està entre 0 i 100. Són **dues** preguntes que s'han de complir **alhora** → `&&`.

```
   num > 0     &&     num < 100
   0 > 0              0 < 100
   false      &&      true
   └──────────┬──────────┘
            false   →  else  →  "nope"
```

| `num` | `num > 0` | `num < 100` | `&&` | Imprimeix |
|:-----:|:---------:|:-----------:|:----:|-----------|
| 0 | `false` | `true` | `false` | `nope` |
| 50 | `true` | `true` | `true` | `num entre 0 i 100` |
| 100 | `true` | `false` | `false` | `nope` |
| -5 | `false` | `true` | `false` | `nope` |

> [!NOTE]
> `0` i `100` **no** compten com a "entre" perquè he fet servir `>` i `<`. Si els volgués incloure: `num >= 0 && num <= 100`.

> [!WARNING]
> En mates s'escriu `0 < num < 100`, però **en Java no es pot**: s'ha de partir en dues comparacions unides amb `&&`.

> [!NOTE]
> Per convenció, els noms de classe en Java comencen amb **majúscula** (`OperadoresLogicos`). `operadoresLogicos` funciona igual, però Eclipse/els profes ho poden marcar com a mala pràctica.

---

## ✅ Resum

- Comparadors: `>` `<` `>=` `<=` `==` `!=` → donen `boolean`.
- `=` guarda, `==` pregunta.
- `!` gira: `true` ↔ `false`.
- `||` (OR, `AltGr+1`): `true` si **algun** ho és.
- `&&` (AND, `Shift+6`): `true` només si **tots** ho són.
- Interval: `num > 0 && num < 100`.
