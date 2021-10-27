package ar.edu.ub.dc.compilador_aritmetico;

import java_cup.runtime.Symbol;
import java.lang.Character;

%%

%public

%class Scanner

%standalone

%cup

%line

%column

Identifier = [ABC][:jletterdigit:]*

%%
"+" { return new Symbol(sym.MAS); }
"-" { return new Symbol(sym.MENOS); }
"*" { return new Symbol(sym.POR); }
"/" { return new Symbol(sym.DIVISION); }
"%" { return new Symbol(sym.MODULO); }
";" { return new Symbol(sym.PUNTOYCOMA); }
"(" { return new Symbol(sym.LPAREN); }
")" { return new Symbol(sym.RPAREN); }
"begin" { return new Symbol(sym.INICIO); }
"end" { return new Symbol(sym.FIN); }
"=" { return new Symbol(sym.ASIGNACION); }
"print" { return new Symbol(sym.IMPRIMIR); }
{Identifier} { return new Symbol(sym.IDENTIFIER, yytext());}
[:digit:]+ { return new Symbol(sym.NUMERO, new Integer(yytext())); }
[ \t\r\n]+ {;}
. { System.out.println("Error lexico."+yytext()+"-"); }