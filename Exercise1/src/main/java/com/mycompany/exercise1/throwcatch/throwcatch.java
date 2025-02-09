package com.mycompany.exercise1.throwcatch;

class throwcatch {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("1143564");
        }
        catch (cepInvalidoException e){
            System.out.println("O cep não corresponde as regras de negocio");
        }
        
        
    }
    
    static String formatarCep(String cep) throws cepInvalidoException{
        if(cep.length() != 8){
            throw new cepInvalidoException();
            
        }
        //Cep imaginário
        return "22.435-064";
    }
}
