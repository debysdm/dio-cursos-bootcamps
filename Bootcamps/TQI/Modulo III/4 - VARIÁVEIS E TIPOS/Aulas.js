//Exemplo de Hoisting

/* numberOne = 1;

console.log(numberOne + 2);

var numberOne; */

//EXEMPLO DE USO DE VAR E LET

/*var nome = "Maria";
var sobrenome = "Silva";

if (nome === "Maria") {
    var nome = "Ana";
    let sobrenome = "Souza";
}

console.log(nome, sobrenome);*/
// NESSE EXEMPLO O CONSOLE IRÁ MOSTRAR COMO RESULTADO "ANA SILVA", VISTO QUE A VAR SOBRENOME É GLOBAL E A LET SERÁ SÓ EXIBIDA NO BLOCO.

//CONSOLE.LOG DENTRO DO BLOCO

/*var nome = "Maria";
var sobrenome = "Silva";

if (nome === "Maria") {
    let nome = "Ana";
    let sobrenome = "Souza";

    console.log(nome, sobrenome);
}

console.log(nome, sobrenome);*/

//NESSE EXEMPLO FOI APRESENTADO "ANA SOUZA" E "MARIA SILVA"


//**CONTANTE**

//COMO DECLARAR
//NÃO PODE REDECLARAR E NEM REATRIBUIR

/*const MEU_NOME = "Deborah";

console.log(MEU_NOME);*/