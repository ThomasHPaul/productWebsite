package com.coolshop.productwebsite.models;

import jakarta.persistence.*;

@Entity(name="product")
public class Product {

    public Product() {
    }

    public Long getProductId() { return this.productId; }

    public void setProductId(Long productId) { this.productId = productId; }

    public String getItemNumber() { return this.itemNumber; }

    public void setItemNumber(String itemNumber) { this.itemNumber = itemNumber; }

    public String getItemName() { return this.itemName; }

    public void setItemName(String itemName) { this.itemName = itemName; }

    public String getItemShortDesc() { return this.itemShortDesc; }

    public void setItemShortDesc(String itemShortDesc) { this.itemShortDesc = itemShortDesc; }

    public String getItemFullDesc() { return this.itemFullDesc; }

    public void setItemFullDesc(String itemFullDesc) { this.itemFullDesc = itemFullDesc; }

    public int getItemCost() { return this.itemCost; }

    public void setItemCost(int itemCost) { this.itemCost = itemCost; }

    public byte[] getItemPic() { return this.itemPic; }

    public void setItemPic(byte[] itemPic) { this.itemPic = itemPic; }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long productId;

    private String itemNumber;

    private String itemName;

    private String itemShortDesc;

    private String itemFullDesc;

    private int itemCost;

    @Lob
    private byte[] itemPic;
}
