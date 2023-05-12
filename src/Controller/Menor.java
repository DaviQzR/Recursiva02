package Controller;

public class Menor 
{
	public Menor()
	{
		super();
	}
	public int MenorValor(int [] vt, int tamanho, int UltimoV)
	{
		//CONDIÇÃO DE PARADA
		if (tamanho==0)
		{
			return UltimoV;
		}else
		 {
			tamanho--;
			if(vt[tamanho] < UltimoV)
			{
				UltimoV = vt[tamanho];
			}
			
		}
		return MenorValor(vt, tamanho,UltimoV);
	}
}
