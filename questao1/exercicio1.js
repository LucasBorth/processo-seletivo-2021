function ePrimo(numero){
    // Ver se houve a entrada
    if (num == null){
        window.alert("Nenhuma entrada recebida :(");

        return false;
    }

    // Ver se a entrada é um número inteiro
    if (Number.isInteger(numero) != true){
        window.alert("A entrada não é um número inteiro :(");

        return false;
    }

    // Ver se o número é maior que 1 e menor que 100
    if (!((numero >= 1) && (numero <= 100))){
        window.alert("O número informado não está entre 1 e 100 :(");

        return false;
    }

    // Ver se o número é primo (Dividores)
    var divisores = 2;
    var i = 2;

    while ((divisores < 3) && (i <= (numero / 2))){
        var resultado = numero / i;

        if (Number.isInteger(resultado) == true){
            divisores++;
        }

        i++;
    }

    // Resultado
    if (divisores > 2){
        window.alert("O número " + numero + " NÃO é primo... :/");

        return false
    }else{
        window.alert("O número " + numero + " É primo! :D");

        return true;
    }
}

//Inicio da Execução
window.alert("Verificador de números Primos");

var entrada = window.prompt("Digite um número inteiro de 1 á 100:");
var num = Number(entrada);

ePrimo(num);