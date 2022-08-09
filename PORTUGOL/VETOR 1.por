/*
  Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 */


programa
{
	
	funcao inicio()
	{
		inteiro v[5], maiorPont=0 
		inteiro x 
		
		para (x=0; x<5; x++)
		{
			escreva("\nInforme a ",x+1,"° pontuação: ")
			leia(v[x])
		}
		maiorPont=  v[0]
		
		para (x=0; x<5; x++)
		{
			escreva(v[x],"\n")
		}
		para (x=0; x<5; x++)
		{
			se (maiorPont < v[x])
			{
				maiorPont = v[x]
			}
		}
		escreva("\nMaior p = ",maiorPont)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 530; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {v, 12, 10, 1}-{maiorPont, 12, 16, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */