grammar BattleshipKI;

// Befehlsdatei-Format
file : row* EOF ;

// Entweder Zufall oder Koordinatenangabe
row : zufallsSatz(LineBreak | EOF) | einleitungsSatz koordinate end(LineBreak | EOF) ;

// Anfang Koordinateneingabe
einleitungsSatz : 'Der Computer feuert auf ';

// Zufallsfeuer
zufallsSatz : 'Der Computer feuert per Zufall auf eine noch nicht getroffene Zelle.';

// Punkt am Ende
end : '.' ;

// mögliche Zeilenumbrüche
LineBreak : '\r'?'\n' | '\r' ;

// Die Koordinate besteht immer aus einem Buchstaben und einer Ziffer zb. A8
koordinate : Buchstabe Ziffer ;

// Gültige Zeilen
Buchstabe: 'A'..'G' ;

// Gültige Spalten
Ziffer: [1-7];