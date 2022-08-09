/*
 Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 */



programa
{
	
	funcao inicio()
	{
		inteiro numeros[3][3],somaNumeros=0,linha,coluna,somaDiagonal=0
		

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEntre com um número: ") 
				leia(numeros[linha][coluna])
				somaNumeros += numeros[linha][coluna]
				se(coluna == linha)
				{
					somaDiagonal += numeros[linha][coluna]	
				}
			}
		}
		escreva("\nSomatório dos números foi de: ",somaNumeros)

		para(linha=0;linha<1;linha++)
		{
			
				escreva("\nA soma dos valores da primeira diagonal é: ", somaDiagonal)
			
		
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 197; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 14, 10, 7}-{somaNumeros, 14, 24, 11}-{somaDiagonal, 14, 51, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */