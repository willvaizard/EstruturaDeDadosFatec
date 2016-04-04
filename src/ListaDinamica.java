
public class ListaDinamica {
	No inicio;
	
	public ListaDinamica(){
		inicio = null;
	}
	
	public void adicionaInicio (int e){
		No novo = new No(e);
		novo.prox = inicio;
		inicio = novo;
		
		
		
	}
	
	public void Percorre (){
		if (!vazia()){
			No aux =inicio;
			String r = "";
			while (aux!=null){
				r = r +" " + aux.dado;
				aux = aux.prox;
			}
			
			System.out.println(r);
		}
		
		
		
	}

	private boolean vazia() {

		return inicio == null;
	}
	

}
