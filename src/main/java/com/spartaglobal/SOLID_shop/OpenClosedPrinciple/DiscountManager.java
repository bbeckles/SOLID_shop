package com.spartaglobal.SOLID_shop.OpenClosedPrinciple;

public class DiscountManager {
 public void processDiscount(IFilmDiscount iFilmDiscount){

     System.out.println(iFilmDiscount.filmDiscount());
 }
}
