/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package criticalpath;

/**
 *
 * @author Julio
 */
public class SecaoCritica {
    public int size;
    public int foo;
    
    public SecaoCritica(int size){
        this.size = size;
    }
    
    public synchronized void csec(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                foo++;
                foo--;
            }
        }
    }    
}