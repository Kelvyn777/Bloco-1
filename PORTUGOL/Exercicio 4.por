/*
 Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */


programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro num1, num2, num3, num4
		escreva("\n entre o primeiro numero: ")
		leia(num1)
          escreva("\n entre o segundo numero: ")
          leia(num2)
          escreva("\n entre o terceiro numero: ")
          leia(num3)
          escreva("\n entre o quarto numero: ")
          leia(num4)
          num1 = mat.potencia(num1, 2.0)
          num2 = mat.potencia(num2, 2.0)
          num3 = mat.potencia(num3, 2.0)
          num4 = mat.potencia(num4, 2.0)
          se (num3 >= 1000){
          escreva (num3)

	}
          	senao {
          		
          		escreva("\n o quadrado do numero 1 é: ", num1, "\n o do numero 2 é: ", num2, "\n o do numero 3 é: ", num3, "\n o do numero 4 é: " ,num4)
          	}
          
          		
	}	
       
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1037; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */