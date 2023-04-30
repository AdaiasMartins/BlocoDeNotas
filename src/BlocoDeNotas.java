import java.util.ArrayList;
import java.util.List;

public class BlocoDeNotas {
     List<anotacao> listadeanotacoes = new ArrayList<>();

     public void adicionaranotacao(anotacao anotacaoaadicionar){
         listadeanotacoes.add(anotacaoaadicionar);
         anotacaoaadicionar.setNumero(listadeanotacoes.indexOf(anotacaoaadicionar));
     }

     public void buscaranotacao(String textoanotacao){
        for(int i = 0; i<listadeanotacoes.size(); i++){
            anotacao anotacaobuscada = listadeanotacoes.get(i);
            String texto = anotacaobuscada.getTexto();

            if(texto.equals(textoanotacao)){
                anotacao encontrada = anotacaobuscada;
                System.out.printf(encontrada.getTexto(),encontrada.getNumero(), encontrada.getData());
            }
        }
     }

     public void editaranotacao(anotacao anotacaoaeditar){
         if(anotacaoaeditar.getApagada() == true){
             try {
                 throw new Exception("A anotação está apagada");
             } catch (Exception e) {
                 throw new RuntimeException(e);
             }
         }else if(anotacaoaeditar.getApagada() == false){
             anotacaoaeditar.editar();
         }
     }

     public void apagaranotacao(anotacao anotacaoaapagar){
         if(anotacaoaapagar.getApagada() == true){
             try {
                 throw new Exception("A notação informada já está apagada");
             } catch (Exception e) {
                 throw new RuntimeException(e);
             }
         }else{
             anotacaoaapagar.apagar();
         }
     }

     public void veranotacao(anotacao anotacaoaver){
         if(anotacaoaver.getApagada() == true){
             try {
                 throw new Exception("Esta anotação está apagada");
             } catch (Exception e) {
                 throw new RuntimeException(e);
             }
         }else if (anotacaoaver.getApagada() == false){
             anotacaoaver.ver();
         }
     }
}
