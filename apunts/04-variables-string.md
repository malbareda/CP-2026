# 04 · Variables `String`: text i concatenació

[⬅️ Anterior](03-variables-int.md) · [Índex](README.md) · [Següent ➡️](05-scanner.md)

Fitxer: `src/VariablesString.java`

---

## El codi

```java
public class VariablesString {
	
	public static void main(String[] args) {
		
		String s = "hola";
		
		String r = "cosa";
		
		//el + serveix per concatenar Strings
		System.out.println(s+" "+r+" "+s);		
	
		
	}

}
```

**Sortida per consola:**

```
hola cosa hola
```

---

## 📦 Declarar Strings

```java
		String s = "hola";
		
		String r = "cosa";
```

```
           ┌──────────┐            ┌──────────┐
   String  │    s     │    String  │    r     │
           ├──────────┤            ├──────────┤
           │  "hola"  │            │  "cosa"  │
           └──────────┘            └──────────┘
```

- Mateixa fórmula de sempre: `TIPUS NOM_VARIABLE = VALOR_INICIAL;`
- El tipus és `String` (amb **S majúscula**).
- El valor és text → **sempre entre cometes dobles** `" "`.

> [!WARNING]
> `String s = hola;` (sense cometes) dona error: Java pensaria que `hola` és el nom d'una variable que no existeix.

---

## ➕ El `+` amb textos: concatenar

```java
		//el + serveix per concatenar Strings
```

**Concatenar** = enganxar un text darrere l'altre.

- Amb números, `+` **suma**: `4 + 3` → `7`
- Amb textos, `+` **enganxa**: `"hola" + "cosa"` → `"holacosa"`

### Pas a pas

```java
		System.out.println(s+" "+r+" "+s);
```

Java substitueix cada variable pel seu valor i va enganxant d'esquerra a dreta:

```
  s   +  " "  +   r    +  " "  +   s
  │      │        │       │        │
"hola" + " "  + "cosa" +  " "  + "hola"
  └──┬───┘
  "hola "
     └──────┬───────┘
       "hola cosa"
            └────────┬───────┘
              "hola cosa "
                     └─────────┬──────┘
                       "hola cosa hola"
```

| Tros | Què és | Valor |
|------|--------|-------|
| `s` | variable (sense cometes) | `hola` |
| `" "` | text: **un espai** | ` ` |
| `r` | variable (sense cometes) | `cosa` |
| `" "` | text: **un espai** | ` ` |
| `s` | variable (sense cometes) — es pot repetir! | `hola` |

### Per què calen els `" "`?

El `+` enganxa **sense afegir res pel mig**. Si no poso els espais:

```java
		System.out.println(s+r+s);
```

```
holacosahola
```

> [!TIP]
> Els espais **del codi** (fora de les cometes) no surten mai a la consola: `s+" "+r` i `s + " " + r` fan exactament el mateix. Els únics espais que s'imprimeixen són els que estan **dins** de cometes.

---

## 🔀 Barrejar text i números

El `+` també serveix per enganxar text amb un número. El número es converteix en text:

```java
		int a = 10;
		System.out.println("a val " + a);
```

```
a val 10
```

> [!WARNING]
> Compte amb l'ordre! Java va d'esquerra a dreta:
>
> | Codi | Sortida | Per què |
> |------|---------|---------|
> | `System.out.println(4 + 3 + " pomes");` | `7 pomes` | primer `4 + 3` (dos números → suma = 7), després enganxa el text |
> | `System.out.println("pomes " + 4 + 3);` | `pomes 43` | primer `"pomes " + 4` → text `"pomes 4"`; després `+ 3` enganxa → `"pomes 43"` |
> | `System.out.println("pomes " + (4 + 3));` | `pomes 7` | els parèntesis es calculen primer |

---

## ✅ Resum

- `String` = text, sempre entre `" "`, amb **S** majúscula.
- Entre textos, `+` **concatena** (enganxa), no suma.
- El `+` no posa espais: s'han d'afegir a mà amb `" "`.
- Una variable es pot fer servir tantes vegades com vulguis (`s` surt dues vegades).
