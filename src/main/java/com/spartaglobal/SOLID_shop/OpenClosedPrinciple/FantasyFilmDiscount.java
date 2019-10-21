package com.spartaglobal.SOLID_shop.OpenClosedPrinciple;

public class FantasyFilmDiscount implements IFilmDiscount {
    private String discount;

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public String filmDiscount() {
        return this.discount;
    }
}
