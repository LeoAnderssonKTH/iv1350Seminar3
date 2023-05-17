
package se.kth.iv1350.amazingpos.view;

import se.kth.iv1350.amazingpos.controller.Controller;
import se.kth.iv1350.amazingpos.model.DTO.ScanItemDTO;

/*
 * This is not a finnished class but is used to show how the "real view" will be
 * implemented in the future and how it will do system calls via the controller.
 */
public class View {
    private Controller contr;
    private ScanItemDTO viewInfo;
    
    public View(Controller contr){
        this.contr = contr;
    }
    
    /*
    * This function is used to simulate all calls done to the controller.
    */
    public void systemCallSimulation(){
        contr.startSale();
        System.out.println("A new sale has been started.");
        viewInfo = contr.scanItem(1);
        System.out.println("Item: " + viewInfo.itemDTO.name + ", Price: " + viewInfo.itemDTO.totalCost);
        System.out.println("Running Total is: " + viewInfo.runningTotal);
        viewInfo = contr.scanItem(1);
        System.out.println("Item: " + viewInfo.itemDTO.name + ", Price: " + viewInfo.itemDTO.totalCost);
        System.out.println("Running Total is: " + viewInfo.runningTotal);
        viewInfo = contr.scanItem(2);
        System.out.println("Item: " + viewInfo.itemDTO.name + ", Price: " + viewInfo.itemDTO.totalCost);
        System.out.println("Running Total is: " + viewInfo.runningTotal);
        viewInfo = contr.scanItem(2);
        System.out.println("Item: " + viewInfo.itemDTO.name + ", Price: " + viewInfo.itemDTO.totalCost);
        System.out.println("Running Total is: " + viewInfo.runningTotal);
        viewInfo = contr.scanItem(2);System.out.println("Item: " + viewInfo.itemDTO.name + ", Price: " + viewInfo.itemDTO.totalCost);
        System.out.println("Running Total is: " + viewInfo.runningTotal);
        int finalPrice = contr.endSale();
        System.out.println("The total price is: " + finalPrice);
        contr.pay(50);
        
    }
    
}
