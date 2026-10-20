# 00 · Estructura del projecte, Eclipse i Git

[⬅️ Índex](README.md) · [Següent ➡️](01-primer-programa.md)

## 🗂️ Què hi ha dins la carpeta del projecte

```
CP-2026/
├── .gitignore            ← diu a Git quins fitxers NO ha de guardar
├── .project              ← fitxer d'Eclipse (configuració del projecte)
├── .classpath            ← fitxer d'Eclipse (on és el codi, quina versió de Java)
├── .settings/            ← més configuració d'Eclipse
├── apunts/               ← aquests apunts
├── src/                  ← 💡 EL MEU CODI (.java)  → el que escric jo
│   ├── MiPrimerPrograma.java
│   ├── Variables.java
│   ├── VariablesInt.java
│   ├── VariablesString.java
│   ├── EstaClaseEsMuyImportante.java
│   ├── elScanner/                 ← un "package" (carpeta)
│   │   └── TuAmigoElScanner.java
│   └── ProblemasIntroJoel/        ← un altre "package"
│       ├── HelloWorld.java
│       └── PaAmbTomaquet.java
└── bin/                  ← ⚙️ CODI COMPILAT (.class) → el genera Eclipse sol
```

> [!NOTE]
> Els fitxers que comencen amb punt (`.project`, `.classpath`, `.gitignore`...) són fitxers "ocults". No els toques a mà: els gestiona Eclipse (o Git).

## ⚙️ `src` vs `bin`: de `.java` a `.class`

Jo escric codi que entén una persona (`.java`). L'ordinador no l'executa directament: primer s'ha de **compilar** (traduir) a un format que entén Java (`.class`).

```mermaid
flowchart LR
    A["✍️ src/MiPrimerPrograma.java<br/>(ho escric jo)"] -- "Eclipse compila<br/>(cada cop que guardo)" --> B["⚙️ bin/MiPrimerPrograma.class<br/>(ho genera Eclipse)"]
    B -- "Run ▶️" --> C["🖥️ Consola<br/>Lecuhga<br/>Hola<br/>Escarola"]
```

- Cada vegada que guardo (`Ctrl + S`), Eclipse torna a compilar i reescriu els `.class`.
- Per tant, els `.class` **no cal guardar-los a Git**: es poden tornar a generar sempre.

## 📦 Els packages (carpetes dins de `src`)

Quan una classe està dins d'una carpeta de `src`, la primera línia del fitxer ha de dir en quina carpeta (package) és:

```java
package ProblemasIntroJoel;
```

```java
package elScanner;
```

| Fitxer | Primera línia |
|--------|---------------|
| `src/MiPrimerPrograma.java` | *(cap, està directament a `src`)* — és el "default package" |
| `src/elScanner/TuAmigoElScanner.java` | `package elScanner;` |
| `src/ProblemasIntroJoel/HelloWorld.java` | `package ProblemasIntroJoel;` |

> [!WARNING]
> Si el nom del `package` no coincideix amb el nom de la carpeta, Eclipse marca error en vermell.

## 🙈 El `.gitignore`

El fitxer `.gitignore` (a l'arrel del projecte) conté:

```gitignore
# Fitxers compilats per Eclipse (.class): es regeneren sols, no es pugen
bin/
```

- Cada línia és un patró de fitxers/carpetes que Git **ignorarà**.
- `bin/` → ignora tota la carpeta `bin` i el que hi hagi a dins.
- Les línies que comencen amb `#` són comentaris (com el `//` de Java).

> [!NOTE]
> El `.gitignore` només afecta fitxers que Git **encara no seguia**. Com que abans ja s'havien pujat alguns `.class`, s'han hagut de treure del seguiment amb:
>
> ```bash
> git rm -r --cached bin
> ```
>
> `--cached` vol dir "treu-ho de Git però **no ho esborris del disc**". La carpeta `bin` continua existint al meu ordinador; simplement Git ja no la mira.

## 📝 Commits amb missatges que s'entenguin

Un commit és una "foto" del projecte en un moment. El missatge serveix per saber què vaig canviar.

| ❌ Malament | ✅ Bé |
|------------|------|
| `a` | `Primer programa amb println` |
| `aaa` | `Exemples de variables int` |
| `aa` | `Exercici PaAmbTomaquet amb Scanner` |

D'aquí a un mes, "aaa" no em dirà res. "Exercici PaAmbTomaquet amb Scanner", sí.
