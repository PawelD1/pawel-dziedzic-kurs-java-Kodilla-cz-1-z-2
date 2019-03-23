package com.kodilla.patterns2.facade.api;

public final class ItemDto {
    private final Long productId;
    private final double quantity;
    public ItemDto(final Long productid, final double quantity)
    {
        this.productId=productid;
        this.quantity=quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQuantity() {
        return quantity;
    }
}
