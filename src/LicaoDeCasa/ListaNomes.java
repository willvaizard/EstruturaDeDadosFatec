package LicaoDeCasa;

public class ListaNomes {
 private No inicio;
 
 	public ListaNomes() {
		inicio = null;
	}
 	
 	public void AdicionaInicio (String e){
 		No novo = new No(e);
		novo.prox = inicio;
		inicio = novo;
 		
 	}
 	
 	
 		public void AdicionaOrdemAlfabetica(String e){
 			No aux, aux2=null;
 			
 			No novo = new No (e);
 			aux = inicio;
 			
 				int cont = 0;
 				if(vazia()){
 					AdicionaInicio(e);
 				}else{
 					while(aux!=null ){
 						if(aux.dado.compareTo(novo.dado)>0){
 						aux2= aux;
 						System.out.println(aux2.dado);
 						}
 						
 						aux = aux.prox;
 						}
 					
 							
 						}
 				
 							novo.prox=aux2;
 							aux2=novo;
 				
 					}
 					
 				
 				
 					
 				
 				
 			
 				
 				
 				
 			
 		
 			
 		public String Percorre (){
 			String r = "";
 			if(vazia()){
 				System.out.println("Erro Lista Vazia!");
 			}
 			else{
 			
 			No aux = inicio;
 			while (aux!= null){
 				
 				r = r + " ["+aux.dado+"]";
 				aux = aux.prox;
 				
 			}
 			
 			
 			
 			}
 			return r;
 	
	
}

		public boolean vazia() {

			return inicio == null;
		}
}