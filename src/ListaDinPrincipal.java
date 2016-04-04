import javax.swing.JOptionPane;

public class ListaDinPrincipal {
public static void main(String[] args) {
	
	
	String bureau[] = new String [4];

	
	Lista lista = new Lista();
	lista.Percorre();
	lista.adicionaInicio(1);
	lista.adicionaInicio(2);
	lista.adicionaInicio(3);
	lista.adicionaInicio(4);
	lista.adicionaInicio(5);
	lista.adicionaInicio(6);
	lista.adicionaInicio(7);
	lista.adicionaInicio(8);
	lista.adicionaInicio(9);
	lista.adicionaInicio(10);
	
	System.out.println( lista.Percorre());
	lista.AdicionaPorPosicao(5, 15);
	lista.AdicionaPorPosicao(5, 12);
	lista.AdicionaPorPosicao(5, 15);
	lista.AdicionaPorPosicao(1, 100);
	lista.AdicionaPorPosicao(15, 100);
	
	lista.removePorPosicao(10);
	System.out.println( lista.Percorre());
	
	System.out.println(lista.removePorPosicao(10));
	System.out.println(lista.removePorPosicao(2));
	System.out.println(lista.Percorre());
	
	

}
}
