grammar atribuicao;

// gramatica
init: cmd+;

cmd: cmdLer | cmdEscrever | cmdDeclara | cmdAtribuicao | cmdFor | cmdEnquanto | cmdSe | cmdExpressao;

cmdExpressao: expressao fim;

cmdDeclara: (tipo var fim);

cmdAtribuicao: tipo? var operadorAtribuicao ((var | num | string | booleano | ) | expressao)fim;

cmdLer: 'leia(' var ');';

cmdEscrever: 'escreva(' (string | var) ');';

cmdSe: 'se' leftPar expressao operadorComparacao expressao rightPar leftChaves cmd+ rightChaves cmdSenaoSe* cmdSenao*;

cmdSenaoSe: 'senao se' leftPar expressao operadorComparacao expressao rightPar leftChaves cmd+ rightChaves;

cmdSenao: 'senao' leftChaves cmd+ rightChaves;

cmdFor: 'para' leftPar inicializaFor testeFor atualizaFor rightPar leftChaves cmd+ rightChaves;

cmdEnquanto: 'enquanto' leftPar ((expressao operadorComparacao expressao) | booleano) rightPar leftChaves cmd+ rightChaves;

inicializaFor: tipo? var operadorAtribuicao num fim;
testeFor: var operadorComparacao num fim;
atualizaFor: var operadorAtribuicao expressao;

expressao: expressao mais termo | expressao menos termo | termo;
termo: termo mult fator | termo div fator | fator;
fator: num | var | leftPar expressao rightPar;

operadorAtribuicao: '=';
operadorComparacao: '>' | '>=' | '<' | '<=' |  '!=' | '==';

leftPar: '(';
rightPar: ')';
leftChaves: '{';
rightChaves: '}';

mais: '+';
menos: '-';
mult: '*';
div: '/';
operadorMatematico: mais | menos | mult | div;

tipo: 'booleano' | 'int' | 'flutuante' | 'texto';

booleano: booleanoTrue | booleanoFalse;
booleanoTrue: 'true';
booleanoFalse: 'false';

fim: ';';

string: String;
var: ID;
num: NumInt | NumFloat;

// expressoes regulares
ID: [a-zA-Z]+;
NumInt: [0-9]+;
NumFloat: [0-9]+(.[0-9]+);
String: '"' [a-zA-Z0-9 ]+ '"';
Ws: [\t\r\n ]+ -> skip;