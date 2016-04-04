import javax.annotation.processing.SupportedSourceVersion;

public class Lista {
	No inicio;
	
	public Lista (){
		inicio = null;
	}

	
	public void adicionaInicio (int e){
		No novo =  new No (e);
		
		novo.prox = inicio;
		inicio = novo;
		
		
		
		
	}
	
	public int removePorPosicao (int pos){
		int r =-1;
		if(vazia()){
			System.out.println("Erro Lista Vazia");
		}else {
			
			if (pos == 1){
				r = removeInicio();
			}else {
			No aux= inicio;
			No aux2;
			int cont=1;
			while(aux!=null && cont != pos){
				
				
				
				aux=aux.prox;
				cont++;
				
				
			}
			r=aux.dado;
			
			aux=aux.prox;
			System.out.println("CONT"+cont +"Posicao"+ pos);
			
			
		}}
		
		
		
		return r;
	}
	
	
	public int removeInicio(){
		 int r = -1;
		if(vazia()){
			System.out.println("Erro! Lista vazia");
		}else
		{
		  r = inicio.dado;
		  
			inicio =inicio.prox;
			
			
		}
		
		
		return r;
	}
	
	public void AdicionaPorPosicao(int pos, int e){
		
		No novo = new No (e);
		No aux = inicio;
		int cont=1;
		
		if (pos == 1){
			adicionaInicio(e);
		}else{
			
		
		while (aux != null && cont<pos-1){
			aux= aux.prox;
			cont ++;
			
			
		}
		
		
		System.out.println("Posicao: "+pos + "Cont: "+ cont);
		
			novo.prox=aux.prox;
			aux.prox=novo;
		
			
		
		
			
			
			
			
		
		
		
		
		}
	
	}
	
	
	
	public String Percorre (){
		String r = "";
		if(vazia()){
			System.out.println("Erro Lista Vazia!");
		}
		else{
		
		No aux = inicio;
		while (aux!= null){
			
			r = r + " "+aux.dado;
			aux = aux.prox;
			
		}
		
		
		
		}
		return r;
		
		
	}
	
	public boolean vazia (){
		
		return inicio == null;
	}
	
	
	
	
}
