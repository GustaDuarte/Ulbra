function ops1 ()
{

    var valorSTR = prompt('Digite um valor: ');
    var valor = parseInt(valorSTR);

    if(valor > 10)
    {
        alert('Maior que 10');
    }else if(valor < 10)
    {
        alert('Menor que 10');
    }else
    {
        alert('Igual à 10');
    }
}

function ops2()
{
    var valor1 = prompt('Digite o valor de n1: ');
    var valor1 = parseInt(valor1);
    var valor2 = prompt('Digite o valor de n2: ');
    var valor2 = parseInt(valor2);
    var valor_final = valor1 + valor2;
    alert(valor_final);
}

function ops3()
{
var s1 = prompt('Digite o valor de n1:');
var s2 = prompt('Digite o valor de n2:');
var ops = prompt('Selecione a opção:\n1 - Soma.\n2 - Subtração.\n3 - Multiplicação.\n4 - Divisão.');
switch(ops)
    {
        case '1':
            var s1 = parseInt(s1);
            var s2 = parseInt(s2);
            var res = s1 + s2;
            alert(res);
            break;
        case '2':
            var s1 = parseInt(s1);
            var s2 = parseInt(s2);
            var res = s1 - s2;
            alert(res);
            break;
        case '3':
            var s1 = parseInt(s1);
            var s2 = parseInt(s2);
            var res = s1 * s2;
            alert(res);
            break;
        case '4':
            var s1 = parseInt(s1);
            var s2 = parseInt(s2);
            var res = s1 / s2;
            alert(res);
            break;
        default:
            alert('Opção Invalida!!!')
            break;
    }
}

function ops4()
{
    var name = prompt('Digite o nome:');
    var n = prompt('Digite o número:');
    for(var i = 0; i <= n; i++)
    {
        alert(name);
    }
}

function ops5()
{
    var nome = prompt('Digite seu nome:');
    var email = prompt('Digite seu email:')
    var dados = [nome, email];
    alert(dados[0]);
    alert(dados[1]);
}