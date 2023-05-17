
package se.kth.iv1350.amazingpos.integration;

import se.kth.iv1350.amazingpos.model.DTO.ItemDTO;
import se.kth.iv1350.amazingpos.model.DTO.SaleDTO;

/**
 * This class/handler exists to help the Sale classs to get information from the
 * inventory system about items.
 * Since no specific information regarding the inventory system has been given
 * this class will only be used as a place holder for the time being and will be 
 * changed in the future.
 */
public class InventoryHandler {
    
 
    public InventoryHandler(){
        
    }
    /*
    * This methods main objective is to get information from the external
    * inventory system and give it to the controller.
    * Note that in its current state it has only been used to test the 
    * functionality  of the other classes. 
    */
    public ItemDTO getItemInfo(int itemID) {
        
        ItemDTO itemDTO = new ItemDTO(itemID);
        
        if(1 == itemID){
        itemDTO.VAT = 4;
        itemDTO.name = "Potato";
        itemDTO.totalCost = 10;
        }
        
        if(2 == itemID){
        itemDTO.VAT = 2;
        itemDTO.name = "Tomato";
        itemDTO.totalCost = 6;
        }
        
        return itemDTO;
        
    }
    
    public void senUpdate(SaleDTO saleDTO){
        
    }
    

}
