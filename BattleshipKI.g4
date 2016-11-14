grammar BattleshipKI;

// das spielfeld file
file : row* EOF ;

// dieser einleitungs satz plus koordinate plus der punkt am ende. dann zeilenumbruch
row : zufallsSatz(LineBreak | EOF) | einleitungsSatz koordinate end(LineBreak | EOF) ;

// einleitungssatz kp ob das so geht mit den ''
einleitungsSatz : 'Der Computer feuert auf ';

// Zufallsfeuer
zufallsSatz : 'Der Computer feuert per Zufall auf eine noch nicht getroffene Zelle.';

// Punkt am ENde
end : '.' ;

// mögliche Zeilenumbrüche
LineBreak : '\r'?'\n' | '\r' ;

// Die kordinate besteht immer aus einem Buchstaben und einer ziffer zb. A8
koordinate : Buchstabe Ziffer ;

//alle goßbuchstaben, oder wie man das alphabet darstellt...
Buchstabe: [A-Z];

//alle ziffern oder wie man einen zahlenraum darstellt...
Ziffer: [0-9];