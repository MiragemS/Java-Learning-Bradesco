
package com.mycompany.exercise1;


public class SmartTv {
    private boolean status = false;
    private int channel = 1, volume = 50;
    
    public void ligarDesligarTv(){
        this.status = !this.status;
        if(this.status){
            System.out.println("TV ON");
        } else {
            System.out.println("TV OFF");
        }
    }
    
    public void avancarCanal(){
        if(this.status == false){
            System.out.println("The TV is OFF");
        } else {
            this.channel++;
            System.out.println("Channel: " + this.channel);
        }
    }
    
    public void reduzirCanal(){
        if(this.status == false){
            System.out.println("The TV is OFF");
        } else {
            this.channel--;
            System.out.println("Channel: " + this.channel);
        }
    }
    
    public void selecionarCanal(int x){
        if(this.status == false){
            System.out.println("The TV is OFF");
        } else {
            this.channel = x;
            System.out.println("Channel: " + this.channel);
        }
    }
    public void aumentarVolume(){
        if(this.status == false){
            System.out.println("the TV is OFF");
        } else {
            if(this.volume == 100){
                System.out.println("Max Volume");
            } else {
                this.volume++;
                System.out.println("Volume: " + this.volume);
            }
        }
    }
    
    public void diminuirVolume(){
        if(this.status == false){
            System.out.println("the TV is OFF");
        } else {
            if(this.volume == 0){
                System.out.println("Min Volume");
            } else {
                this.volume--;
                System.out.println("Volume: " + this.volume);
            }
        }
    }
}
