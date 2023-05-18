# Tavola kanban 1° settimana

## - Ho imparato alcuni rudimenti che valgono indipendentemente dal linguaggio di programmazione utilizzato

> In tutti i linguaggi esistono **variabili** e **costanti**
> Posso dichiarare una variabile specificando il tipo (ad esempio Int) e impostando un nome

int a

Posso anche assegnare un valore specifico ad una variabile così:

inta a = 1

## - Ci sono diversi tipi di variabili ed alcune volte capita che java capisca quale variabile vorrei utilizzare

> Ad esempio l'input dell'utente viene sempre interpretato come una stringa e quindi se voglio effettuare delle operazioni devo specificare alcune cose aggiuntive tipo
> .nextInt che si utilizza con variabili intere altrimenti genera un errore

## - Ho imparato che ogni linguaggio di programmazione però ha una sua sintassi specifica

> Ad esempio in java le istruzioni terminano con ; oppure il nome della classe in Java deve corrispondere al nome del file .java tipo come:

`public class Perimetro {}`

## - Ho imparato che i blocchi di codice sono raggruppati all'interno di parentesi graffe

> Ad esempio un programma java vuoto tipo il nostro layout ha comunque due parti fisse che sono la classe ad esempio il metodo main

```
public class layout
{
  public static void main(String[] args)
  {
  }
}
```

## - Ho imparato che è importantissimo gestire la formattazione del documento in modo le parentesi graffe siano allineate verticalmente (apertura chiusura)

```
public class layout
{
  public static void main(String[] args)
  {
  }
}
```

## - Ho imparato che per inserire il codice in un documento .md come questo è meglio includere il codice in una sezione che inizia e finisca con tre backticks ``` che si fanno con ALT 96.

```
{
  public static void main(String[] args)
  {
  }
}
```

## - Ho imparato che c'è un formato creato apposra per fare di files read.me di documentazione del codice

> Ad esempio è possibile formattare il testo impostando alcuni attributi come il grasseeo o il corsivo
> **Corsivo** _Italic_

## - Ho consultato per informazioni aggiuntive per i formati md i siti:

[markdownguide](https://www.markdownguide.org/cheat-sheet/#overview)

## - Ho imparato che altri programmatori hanno messo a disposizione la loro esperienza lavorativo sul sito jetbrains.com

> si possovono vedere sotto forma di grafico gli utilizzi di vari linguaggi e le tendenze nel mondo della programmazione

## - Ho imparato ad utilizzare un sistema di versionamento del codice che permette di avere un ambiente di lavoro più sicuro, condividendo e collaborando con gli altri.

> ad esempio ho creato una repository e tramite specifici comandi ho caricato alcuni files che ho creato e li ho aggiunti area di versionamento **staging area**

## - Ho anche imparato che questi comandi devono essere riprodotti in una determinata sequenza

> ad esempio i comandi per effettuare un aggiornamento di contenuto sono

```
git add *nome file*
git commit -m "*commento*"
git push -u origin main
```

## - Ci sono anche altri comandi che invece servono a verificare lo stato della nostra origine e della nostra reposity

> git log e git status

## - Ho imparato che il codice java deve essee compilato per poter essere eseguito successivamente con questi due comandi

javac _nome file_.java

java _nome file_

## - Ho imparato che non posso eseguire o compilare un codice o files che non sono nella stessa rotta del comando, cioè i comandi vanno eseguiti proprio

nella rotta dove ho salvato il file da eseguire/compilare

## - Esistono comandi per muoversi nelle cartelle

```
  > cd _nome cartella o file_
  > cd .. per tornare indietro di una cartella
  > mkdir _nome della cartella_ mi permettte di creare una cartella
  > code _nome file_ crea nuovo file
```

### - altri comandi utili sono anche

**ls** che ci mostra il contenuto di una cartella

**cd** e trascinare la cartella permette di muoversi drettamente nella cartella

## - Ho configurato l'area di lavoro installando JDK (librerie che ci permettono di utilizzare java) e come IDE Visual Studio Code

> ho subito scoperto che da solo non è in grado di gestire un linguaggio specifico come java ho installato delle estensioni

## - Ho risolto problemi diversi legati alla confugurazione

> Non funzionavano le highlight sintax e ho usato siti come stackoverflow, chatgpt,

## - Per far leggere degli input al programma devo importare in java una classe **Scanner**

> `Scanner input = new Scanner(System.in);`

## - Per selezionare gli ultimi comandi eseguiti nel terminale posso utilizzare le freccette e scorrere tra di essi

## - Per modificare il programma, volendo escluderne delle parti, posso utilizzare le slash (// o /\* \*/) dei commenti, che escludono parte di codice senza cancellarlo

int a = input.nextInt();

    //System.out.print("+");

    int b = input.nextInt();

    /*int a = 1;
    int b = 2;
    int c = a + b;
    */

    //System.out.print("La somma è " + c);
    System.out.print(a + b);

## - Per formattare il documento Shift + ALT + f

> la formattazione sposta però le parentesi graffe se sono allineate e sistema le righe vuote.

## - Per concatenare, ad esempio nei messaggi stampati con sout, si utilizza il +

> Posso concatenare stringhe e variabili che ho dichiarato a parti testuali.

`("■ L'area del quadrato è " + area + " cm²");`

## - Per ridurre al minimo il codice posso eseguire operazioni direttamente nell'area di Printing ad esempio:

> System.out.println("■ Il perimetro del quadrato è " + `lato * 4 ` + " cm");

## - In formato markdown posso creare far contenere a delle parti di testo dei link utilizzando:

> `[title](https://www.example.com)`

### - O immagini con

> `![alt text](image.jpg)`

## - Per uscire dal terminale:

> Ctrl c
