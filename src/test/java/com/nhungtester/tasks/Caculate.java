package com.nhungtester.tasks;

import com.nhungtester.entity.Product;
import com.nhungtester.ui.CartUI;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Caculate {

    public static double getTotalAll(List<Product> products) {

        double sumTotal = 0;
        for (Product product : products) {
            sumTotal += product.getTotal();
        }
        return sumTotal + giftWrappingFee()  ;
    }


/*
    public static double giftWrappingFee(){
       double wrappingFee =0;
       if(CartUI.GIFT_WRAPPING_STATUS.getCssOrXPathSelector().contains("Gift wrapping: Yes [+$10.00]"))
       {
           return wrappingFee =10;
       }
       return wrappingFee;
   }
*/

    public static double giftWrappingFee(){
        double wrappingFee =0;
        if(Text.of(CartUI.GIFT_WRAPPING_STATUS).equals("Gift wrapping: Yes [+$10.00]"))
        {
            return wrappingFee =10;
        }
        return wrappingFee;
    }



/*    public static Performable getTotalAll(List<Product> products) {
        return Task.where("total price of all products", actor -> {
                    double sumTotalABC = 0;
                    products.forEach(product -> {
                        sumTotalABC += product.getTotal();

                    });
                }
        );
    }*/


}
