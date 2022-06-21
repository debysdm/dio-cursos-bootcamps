//Solição 1 - PALÍNDROMO

function verificapalindromo(string) {
    if (!string) return;

   return string.split("").reverse().join("") === string;
}

//Solição 2 - PALÍNDROMO
function verificapalindromo2(string){
    if (!string) return;

    for (let i = 0; i < string.length / 2; i++) {
        if (string[i] !== string[string.length - 1 - i]) {
            return console.log(false);
        }
    }

    return console.log(true);
}

verificapalindromo2("ovo");
