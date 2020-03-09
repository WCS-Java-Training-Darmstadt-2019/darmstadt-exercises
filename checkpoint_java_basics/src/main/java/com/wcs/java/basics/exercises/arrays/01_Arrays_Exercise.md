1.
Implementiere die main Methode von ArraysExercise und beachte code Kommentare

2.
Lege eine Funktion an zum Finden aller PRIMZAHLEN unterhalb einer Grenze

Eine effiziente Methode, alle Primzahlen unterhalb einer vorgegebenen Grenze zu finden, ist das nach dem griechischen Mathematiker 
Eratosthenes von Kyrene benannte Sieb des Eratosthenes. 
Dabei schreiben Sie zunächst alle Zahlen auf, die kleiner als die Grenze sind. 
Dann gehen Sie diese Liste durch, angefangen bei der 2, der per Definition kleinsten Primzahl. 
Für jede Zahl, die Sie bearbeiten, streichen Sie alle Vielfachen dieser Zahl aus. B
ei der 2 streichen Sie also 4, 6, 8, 10 ... Ist eine Zahl bereits ausgestrichen, müssen Sie sie nicht weiter beachten, 
denn dann sind alle ihre Vielfachen ebenfalls gestrichen. 

Haben Sie alle Zahlen bearbeitet, dann sind die übrigen, nicht ausgestrichenen Zahlen Primzahlen, 
denn sie waren durch keine andere Zahl teilbar.
,
Implementieren Sie das Sieb des Eratosthenes in Java auf Basis von Arrays. 
Ihre Implementierung soll die Obergrenze als Parameter erhalten und ein int[] zurückgeben, das genau alle Primzahlen enthält, 
die kleiner oder gleich dieser Grenze sind. 

Die Obergrenze soll dabei maximal 100.000 betragen, denn wenn Sie alle Werte bis In- teger.MAX_VALUE – 8 erlauben, 
dann müssen Sie die Speichereinstellungen des Java- Prozesses anpassen: Das Array würde 4 GB Speicher belegen. 