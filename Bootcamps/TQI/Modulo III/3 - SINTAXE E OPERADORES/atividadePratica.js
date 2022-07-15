// CRIAR FUNÇÃO QUE RECEBE DOIS NÚMEROS COMO PARÂMETROS.
function comparaNumeros(num1, num2) {
    //PRIMEIRA FRASE SOLICITADA "OS NUMEROS" NUM1 "E" NUM2 "SÃO/NÃO SÃO IGUAIS"
    const primeiraFrase = criaPrimeiraFrase(num1, num2);
    //SEGUNDA FRASE SOLICITADA " SUA SOMA É" SOMA ", QUE É MENOR/MAIOR QUE 10 E MAIOR/MENOR QUE 20"
    const segundaFrase = criaSegundaFrase(num1, num2);

    return `${primeiraFrase} ${segundaFrase}`;
}

//FUNÇÃO DA PRIMEIRA FRASE - VERIFICAR SE OS NUMEROS SÃO IGUAIS

function criaPrimeiraFrase(num1, num2) {
    let primeiraFrase = `Os números ${num1} e ${num2}`;
    let simNao = 'não';

    if (num1 === num2) {
        simNao = '';
    }

    return `${primeiraFrase} ${simNao} são iguais.`;
}

//FUNÇÃO DA SEGUNDA FRASE - VERIFICAR SE A SOMA É MAIOR/MENOR QUE 10 E MAIOR/MENOR QUE 20

function criaSegundaFrase(num1, num2) {
    const soma = num1 + num2;
    let comparaDez = 'menor';
    let comparaVinte = 'menor';

    if (soma > 10) {
        comparaDez = 'maior';
    }

    if (soma > 20) {
        comparaVinte = 'maior';
    }

    return `Sua soma é ${soma}, que é ${comparaDez} do que 10 e ${comparaVinte} do que 20.`;
}

//Entrada de dados

console.log(comparaNumeros(10, 30));