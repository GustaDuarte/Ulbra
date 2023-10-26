using FormatarTexto;
/*Crie uma interface IFormatadorTexto com o método Formatar(string texto). 
Em seguida, crie as classes FormatadorMaiusculo, FormatadorMinusculo e FormatadorInvertido que implementam a interface IFormatadorTexto com sua própria implementação do método Formatar(). 
Em um programa, instancie as três classes e use cada uma para formatar um texto diferente.
*/

FormatadorInvertido texto = new FormatadorInvertido();
texto = "Meu deus";
texto.Formatar(texto);

FormatadorMaiusculo texto = new FormatadorMaiusculo();
texto = "texto maiusculo";
texto.Formatar(texto);

FormatadorMinusculo texto = new FormatadorMinusculo();
texto = "TEXTO MINUSCULO";
texto.Formatar(texto);

