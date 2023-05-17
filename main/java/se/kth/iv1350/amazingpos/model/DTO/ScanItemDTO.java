/*
 * Purpose ti this class is to be able to return the ItemInfo and runningtotal
 * to the View when the scanItem method is called upon from the view.
 */
package se.kth.iv1350.amazingpos.model.DTO;


public class ScanItemDTO {
    public int runningTotal;
    public ItemDTO itemDTO;
    
    public ScanItemDTO(SaleDTO saleInfo, ItemDTO itemInfo){
        this.itemDTO = itemInfo;
        this.runningTotal = saleInfo.totalPrice;
    
}
    
}
