package tech.wetech.weshop.po;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "weshop_brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "list_pic_url")
    private String listPicUrl;

    @Column(name = "simple_desc")
    private String simpleDesc;

    @Column(name = "pic_url")
    private String picUrl;

    @Column(name = "sort_order")
    private Byte sortOrder;

    @Column(name = "is_show")
    private Boolean isShow;

    @Column(name = "floor_price")
    private BigDecimal floorPrice;

    @Column(name = "app_list_pic_url")
    private String appListPicUrl;

    @Column(name = "is_new")
    private Boolean isNew;

    @Column(name = "new_pic_url")
    private String newPicUrl;

    @Column(name = "new_sort_order")
    private Byte newSortOrder;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return list_pic_url
     */
    public String getListPicUrl() {
        return listPicUrl;
    }

    /**
     * @param listPicUrl
     */
    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }

    /**
     * @return simple_desc
     */
    public String getSimpleDesc() {
        return simpleDesc;
    }

    /**
     * @param simpleDesc
     */
    public void setSimpleDesc(String simpleDesc) {
        this.simpleDesc = simpleDesc;
    }

    /**
     * @return pic_url
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * @param picUrl
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * @return sort_order
     */
    public Byte getSortOrder() {
        return sortOrder;
    }

    /**
     * @param sortOrder
     */
    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * @return is_show
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * @param isShow
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * @return floor_price
     */
    public BigDecimal getFloorPrice() {
        return floorPrice;
    }

    /**
     * @param floorPrice
     */
    public void setFloorPrice(BigDecimal floorPrice) {
        this.floorPrice = floorPrice;
    }

    /**
     * @return app_list_pic_url
     */
    public String getAppListPicUrl() {
        return appListPicUrl;
    }

    /**
     * @param appListPicUrl
     */
    public void setAppListPicUrl(String appListPicUrl) {
        this.appListPicUrl = appListPicUrl;
    }

    /**
     * @return is_new
     */
    public Boolean getIsNew() {
        return isNew;
    }

    /**
     * @param isNew
     */
    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    /**
     * @return new_pic_url
     */
    public String getNewPicUrl() {
        return newPicUrl;
    }

    /**
     * @param newPicUrl
     */
    public void setNewPicUrl(String newPicUrl) {
        this.newPicUrl = newPicUrl;
    }

    /**
     * @return new_sort_order
     */
    public Byte getNewSortOrder() {
        return newSortOrder;
    }

    /**
     * @param newSortOrder
     */
    public void setNewSortOrder(Byte newSortOrder) {
        this.newSortOrder = newSortOrder;
    }
}