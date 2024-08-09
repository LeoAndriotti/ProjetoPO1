package br.ulbra.lista;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaBD {
    public ArrayList lista;
    public ListaBD(){
        lista = new ArrayList();
    }
    public void salvar(String elemento){
        if(elemento.equals("")|| elemento.equals(" ")){
            JOptionPane.showMessageDialog(null, "Informe um perfume!");
        }
        else{
            
        lista.add(elemento);
        JOptionPane.showMessageDialog(null,elemento+ ", salvo com sucesso");
        }
    }
    public String listar(){
        String elementos = "";
        if(lista.isEmpty()){
            return "Não foram lançados perfumes";
        }
        else{
        for(int i=0; i<lista.size();i++){
         elementos += (i+1)+"-"+lista.get(i)+"\n";
        }
        return elementos;
        }
    }
    public void alterar(int i, String novoElemento){
        if(lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista Vazia");
        }
        else if(i>=lista.size() || i<0){
            JOptionPane.showMessageDialog(null, "Perfume não existe");
        }
        else{
            lista.set(i, novoElemento);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        }
    }
    public void excluir(int i){
             if(lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista Vazia");
        }
        else if(i>=lista.size() || i<0){
            JOptionPane.showMessageDialog(null, "Perfume não existe");
        }
        else{
            lista.remove(i);
            JOptionPane.showMessageDialog(null, "Removido com sucesso");
        }
    }
    public void LimaparTudo(){
        lista.clear();
    }
    }

