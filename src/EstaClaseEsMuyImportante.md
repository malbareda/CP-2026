# EstaClaseEsMuyImportante — L'esquelet de tot programa

[🏠 Índex](../README.md) · [Següent ➡️](MiPrimerPrograma.md)

Fitxer: `src/EstaClaseEsMuyImportante.java`

---

## 🧱 El programa més petit possible

```java
public class EstaClaseEsMuyImportante {
	
	public static void main(String[] args) {
		System.out.println("si");
	}

}
```

**Sortida per consola:**

```
si
```

Aquest és l'"esquelet" que **tots** els programes tindran. Peça a peça:

| Tros de codi | Què vol dir |
|--------------|-------------|
| `public class EstaClaseEsMuyImportante` | Creo una **classe** que es diu `EstaClaseEsMuyImportante`. El nom ha de ser **exactament igual** que el del fitxer (`EstaClaseEsMuyImportante.java`), majúscules incloses. |
| `{` ... `}` (les de fora) | Tot el que hi ha entre aquestes claus és "dins de la classe". |
| `public static void main(String[] args)` | El **main**: el punt on comença el programa. Quan premo Run ▶️, Java busca aquesta línia i comença a executar per aquí. De moment és una fórmula que s'escriu sempre igual. |
| `{` ... `}` (les de dins) | Tot el que hi ha entre aquestes claus és el que fa el programa. |
| `System.out.println("si");` | Imprimeix `si` per la consola. |
| `;` | Cada **instrucció** acaba amb punt i coma. És com el punt final d'una frase. |

> [!TIP]
> A Eclipse, escriu `main` + `Ctrl + Espai` i t'escriu sol el `public static void main(String[] args)`. Escriu `syso` + `Ctrl + Espai` i t'escriu `System.out.println();`.

## 📦 Les claus `{ }` són com capses una dins l'altra

```
┌─ public class EstaClaseEsMuyImportante { ───────────────┐
│                                                         │
│   ┌─ public static void main(String[] args) { ───────┐  │
│   │                                                  │  │
│   │      System.out.println("si");                   │  │
│   │                                                  │  │
│   └─ } ──────────────────────────────────────────────┘  │
│                                                         │
└─ } ─────────────────────────────────────────────────────┘
```

> [!WARNING]
> Cada `{` ha de tenir la seva `}`. Si en falta una, Eclipse marca error. Per això es fa servir el **sagnat** (tabulació): perquè es vegi a simple vista què està dins de què.

> [!WARNING]
> Si canvio el nom de la classe però no el del fitxer (o al revés), Eclipse dona error: *"The public type ... must be defined in its own file"*. Per canviar el nom: clic dret a la classe → **Refactor → Rename**, i Eclipse canvia les dues coses alhora.

---

## ✅ Resum

- Tot programa: `public class Nom { public static void main(String[] args) { ... } }`
- El nom de la classe = nom del fitxer.
- El programa comença al `main`.
- Cada instrucció acaba amb `;`.
