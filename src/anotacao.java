import java.util.Date;
import java.util.Scanner;

public class anotacao {

    Scanner sc = new Scanner(System.in);
    private String texto;
    private int numero;
    private boolean apagada;
    private Date data;

    public anotacao(String textoanotacao){
        texto = textoanotacao;
        data = new Date();
        apagada = false;
    }

    public void apagar(){
        apagada = true;
    }

    public void editar(){
        System.out.print("Digite a anotação que irá substituir a anterior");
        texto = sc.nextLine();
    }

    public void ver(){
        System.out.printf(texto, numero, data);
    }

    public String getTexto(){
        return texto;
    }

    public int getNumero(){
        return numero;
    }

    public boolean getApagada(){
        return apagada;
    }

    public Date getData(){
        return data;
    }

    public void setNumero(int numeroinformado){
        numero = numeroinformado;
    }

}
