# HelloWorld — El primer exercici

[🏠 Índex](../../README.md) · [⬅️ Anterior](../MiPrimerPrograma.md) · [Següent ➡️](../Variables.md)

Fitxer: `src/ProblemasIntroJoel/HelloWorld.java`

---

## El codi

```java
package ProblemasIntroJoel;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(lo que quieras imprimir);
		System.out.println("Hello World");
		
		
	}

}
```

**Sortida per consola:**

```
Hello World
```

---

## Línia a línia

### `package ProblemasIntroJoel;`

Aquesta classe està dins la carpeta `src/ProblemasIntroJoel/`. Quan una classe és dins d'una carpeta (un **package**), la primera línia ho ha de dir. Més detalls al [README](../../README.md#-els-packages-carpetes-dins-de-src).

### `// TODO Auto-generated method stub`

És un comentari que **Eclipse posa sol** quan crees la classe marcant la casella del `main`. `TODO` vol dir "per fer" (*to do*). No fa res i es pot esborrar.

### `//System.out.println(lo que quieras imprimir);`

La "plantilla" de com s'usa el `println`: dins dels parèntesis va el que vols imprimir. Com que té `//` davant, és un **comentari** i no s'executa.

### `System.out.println("Hello World");`

L'única línia que fa alguna cosa: imprimeix `Hello World`.

> [!NOTE]
> "Hello World" és, per tradició, el primer programa que es fa en qualsevol llenguatge: el mínim per comprovar que tot funciona.

---

## ✅ Resum

- Si la classe és dins d'una carpeta → `package NomCarpeta;` a la primera línia.
- El `// TODO ...` l'afegeix Eclipse; és un comentari i es pot treure.
- `System.out.println(lo que quieras imprimir);`
