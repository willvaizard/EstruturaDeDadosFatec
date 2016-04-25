package LicaoDeCasa;

public class ListaDeStrings {

private String dados[];

private int tamanho;

public ListaDeStrings(int capacidade){

dados = new String[capacidade];

}

public boolean cheia(){

return tamanho==dados.length;

}

public boolean vazia(){

return tamanho == 0;

}

public void adiciona(String texto){

if(cheia()){

System.out.println("ERRO! LISTA CHEIA");

} else {

int i=tamanho-1;

while (i>=0 && dados[i].compareTo(texto)>0){

dados[i+1]=dados[i];

i--;

}



dados[i+1]=texto;

tamanho++;

}

}}