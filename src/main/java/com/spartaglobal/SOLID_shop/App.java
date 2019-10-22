package com.spartaglobal.SOLID_shop;

import com.spartaglobal.SOLID_shop.OpenClosedPrinciple.DiscountManager;
import com.spartaglobal.SOLID_shop.OpenClosedPrinciple.FantasyFilmDiscount;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FantasyFilmDiscount fantasyFilmDiscount = new FantasyFilmDiscount();
        fantasyFilmDiscount.setDiscount("20%");
        DiscountManager discountManager = new DiscountManager();
        discountManager.processDiscount(fantasyFilmDiscount);



    }
}
