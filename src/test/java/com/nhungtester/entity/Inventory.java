package com.nhungtester.entity;

import com.nhungtester.tasks.AddToCart;
import com.nhungtester.tasks.Search;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    public static double getTotalAll(List<Product> products) {
        double sumTotal = 0;
        for (Product product : products) {
            sumTotal += product.getTotal();
        }
        return sumTotal;
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
