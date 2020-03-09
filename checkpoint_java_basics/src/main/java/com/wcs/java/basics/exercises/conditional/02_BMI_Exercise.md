In dieser Übung sollen Sie einen BMI-(Body-Mass-Index-)Rechner implementieren. 

Dazu müssen zunächst Größe und Gewicht des Benutzers abgefragt werden. 
Aus diesen Angaben können Sie den BMI nach der Formel 

BMI = Gewicht ÷ Grösse * Grösse berechnen. 

Sie benötigen das Gewicht in Kilogramm und die Größe in Metern, aber es ist etwas einfacher, 
die Größe in Zentimetern eingeben zu lassen und umzurechnen, S
ie müssen sich so nicht um das Eingabeformat der Dezimalzahl kümmern. 
Das Programm soll den berechneten BMI und eine Einordnung nach Tabelle 
ausgeben.

| BMI | Kategorie |
| < 18,5 | Untergewicht|
| 18,5–25 | Normalgewicht |
| 25–30 | Übergewicht| 
| >30| schweres Übergewicht| 
 

Die Kategorisierung soll natürlich mit einem if-else-Statement realisiert werden. D
enken Sie auch darüber nach, welche Datentypen Sie verwenden sollten, und be- 
denken Sie, welche Ergebnistypen Ihre Berechnungen haben. 
