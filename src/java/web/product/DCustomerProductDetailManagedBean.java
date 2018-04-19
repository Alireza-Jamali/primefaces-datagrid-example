/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;


/**
 *
 * @author Yashar7
 */
@ManagedBean
@SessionScoped
public class DCustomerProductDetailManagedBean {

    /**
     * Creates a new instance of DCumtomerProductDetailManagedBean
     */
    private long productId;
    private TProductComposite productDetail = new TProductComposite();
    private List<String> images = new ArrayList<String>();
    private List<SelectItem> selectItems = new ArrayList<SelectItem>();  
    private boolean renderPanelEmptyAttribute;
    private boolean renderAttributeInLastProduct = false;
    @ManagedProperty("#{dProductMostRecentManagedBean}")    
    private TProductComposite selectedProduct;    

    private List<TProductComposite> productCompositList = new ArrayList<TProductComposite>();
    
    public DCustomerProductDetailManagedBean() {
    }


    public void onLoad() {
        TProductInfo p1 = new TProductInfo(1);
        p1.setAvgRank(2);
        p1.setBrandName("LG");
        p1.setDescription("it is a description");
        p1.setProductName("رنگ سیلور- LG ماشین لباس شویی");
        p1.setWeight(100D);
        p1.setWarranty("5");               
        p1.setQuantityAvailableProducts(10);
        TProductComposite tp1 = new TProductComposite(p1, null, null, false, false, 11L, 12L, 13L, 14L, 15L);
        tp1.setFirstImage(new TProductInfoImage(1L, "resources/images/a.jpg", "resources/images/a.jpg", "resources/images/a.jpg", 1L));
        tp1.setIsFollower(true);
        tp1.setFollowerCount(5L);
        tp1.setIsPerfeted(true);
        tp1.setIsPublished(true);
        tp1.setPartyRecommendedCount(5L);
        tp1.setPerfectCount(5L);
        tp1.setQuantity(0);           
        
        TProductInfo p2 = new TProductInfo(2);
        p2.setAvgRank(2);
        p2.setBrandName("Samsung");
        p2.setDescription("خیلی خوب است و خوب کار میکند");
        p2.setProductName("رنگ سرمه ای - Samsung یخچال");
        p2.setWeight(100D);
        p2.setWarranty("2");               
        p2.setQuantityAvailableProducts(10);
        TProductComposite tp2 = new TProductComposite(p2, null, null, false, false, 11L, 12L, 13L, 14L, 15L);
        tp2.setFirstImage(new TProductInfoImage(1L, "resources/images/f.jpg", "resources/images/f.jpg", "resources/images/f.jpg", 1L));
        tp2.setIsFollower(true);
        tp2.setFollowerCount(5L);
        tp2.setIsPerfeted(true);
        tp2.setIsPublished(true);
        tp2.setPartyRecommendedCount(5L);
        tp2.setPerfectCount(5L);
        tp2.setQuantity(10);           
        
        TProductInfo p3 = new TProductInfo(3);
        p3.setAvgRank(2);
        p3.setBrandName("LG");
        p3.setDescription("this is a description");
        p3.setProductName("رنگ بنفش - Signal مسواک");
        p3.setWeight(100D);
        p3.setWarranty("9");               
        p3.setQuantityAvailableProducts(10);
        TProductComposite tp3 = new TProductComposite(p3, null, null, false, false, 11L, 12L, 13L, 14L, 15L);
        tp3.setFirstImage(new TProductInfoImage(1L, "resources/images/a.jpg", "resources/images/a.jpg", "resources/images/a.jpg", 1L));
        tp3.setIsFollower(true);
        tp3.setFollowerCount(5L);
        tp3.setIsPerfeted(true);
        tp3.setIsPublished(true);
        tp3.setPartyRecommendedCount(5L);
        tp3.setPerfectCount(5L);
        tp3.setQuantity(10);           
        
        TProductInfo p4 = new TProductInfo(4);
                p4.setAvgRank(2);
        p4.setBrandName("LG");
        p4.setDescription("this is a very long description, this is a very long description, this is a very long description, this is a very long description");
        p4.setProductName("ماشین لباس شویی");
        p4.setWeight(100D);
        p4.setWarranty("product name");       
        p4.setQuantityAvailableProducts(10);
        TProductComposite tp4 = new TProductComposite(p4, null, null, false, false, 11L, 12L, 13L, 14L, 15L);
        tp4.setFirstImage(new TProductInfoImage(1L, "resources/images/f.jpg", "resources/images/f.jpg", "resources/images/f.jpg", 1L));
        tp4.setIsFollower(true);
        tp4.setFollowerCount(5L);
        tp4.setIsPerfeted(true);
        tp4.setIsPublished(true);
        tp4.setPartyRecommendedCount(5L);
        tp4.setPerfectCount(5L);
        tp4.setQuantity(10);           
        
        TProductInfo p5 = new TProductInfo(5);
        p5.setAvgRank(2);
        p5.setBrandName("LG");
        p5.setDescription("this is a description");
        p5.setProductName("پراید صفر ");
        p5.setWeight(100D);
        p5.setWarranty("3");               
        p5.setQuantityAvailableProducts(10);
        TProductComposite tp5 = new TProductComposite(p5, null, null, false, false, 11L, 12L, 13L, 14L, 15L);        
        tp5.setFirstImage(new TProductInfoImage(1L, "resources/images/e.jpg", "resources/images/e.jpg", "resources/images/e.jpg", 1L));
        tp5.setIsFollower(true);
        tp5.setFollowerCount(5L);
        tp5.setIsPerfeted(true);
        tp5.setIsPublished(true);
        tp5.setPartyRecommendedCount(5L);
        tp5.setPerfectCount(5L);
        tp5.setQuantity(10);                   
        
        TProductInfo p6 = new TProductInfo(6);
        p6.setAvgRank(2);
        p6.setBrandName("LG");
        p6.setDescription("this is a description");
        p6.setProductName("product name");
        p6.setWeight(100D);
        p6.setWarranty("5");               
        p6.setQuantityAvailableProducts(10);
        TProductComposite tp6 = new TProductComposite(p6, null, null, false, false, 11L, 12L, 13L, 14L, 15L);
        tp6.setFirstImage(new TProductInfoImage(1L, "resources/images/f.jpg", "resources/images/f.jpg", "resources/images/f.jpg", 1L));
        tp6.setIsFollower(true);
        tp6.setFollowerCount(5L);
        tp6.setIsPerfeted(true);
        tp6.setIsPublished(true);
        tp6.setPartyRecommendedCount(5L);
        tp6.setPerfectCount(5L);
        tp6.setQuantity(10);                   
        
        TProductInfo p7 = new TProductInfo(7);
        p7.setAvgRank(2);
        p7.setBrandName("LG");
        p7.setDescription("description");
        p7.setProductName("product name");
        p7.setWeight(100D);
        p7.setWarranty("Yokh");                       
        p7.setQuantityAvailableProducts(10);
        TProductComposite tp7 = new TProductComposite(p7, null, null, false, false, 11L, 12L, 13L, 14L, 15L);
        tp7.setFirstImage(new TProductInfoImage(1L, "resources/images/a.jpg", "resources/images/a.jpg", "resources/images/a.jpg", 1L));
        tp7.setIsFollower(true);
        tp7.setFollowerCount(5L);
        tp7.setIsPerfeted(true);
        tp7.setIsPublished(true);
        tp7.setPartyRecommendedCount(5L);
        tp7.setPerfectCount(5L);
        tp7.setQuantity(10);                   
        
        TProductInfo p8 = new TProductInfo(8);
        p8.setAvgRank(2);
        p8.setBrandName("LG");
        p8.setDescription("desc");
        p8.setProductName("product name");
        p8.setWeight(100D);
        p8.setWarranty("3");                       
        p8.setQuantityAvailableProducts(10);
        TProductComposite tp8 = new TProductComposite(p8, null, null, false, false, 11L, 12L, 13L, 14L, 15L);
        tp8.setFirstImage(new TProductInfoImage(1L, "resources/images/a.jpg", "resources/images/a.jpg", "resources/images/a.jpg", 1L));        
        tp8.setIsFollower(true);
        tp8.setFollowerCount(5L);
        tp8.setIsPerfeted(true);
        tp8.setIsPublished(true);
        tp8.setPartyRecommendedCount(5L);
        tp8.setPerfectCount(5L);
        tp8.setQuantity(10);                   
        
        productCompositList.add(tp1);
        productCompositList.add(tp2);
        productCompositList.add(tp3);
        productCompositList.add(tp4);
        productCompositList.add(tp5);
        productCompositList.add(tp6);
        productCompositList.add(tp7);
        productCompositList.add(tp8);
        
        try {
            this.productDetail = productDetail;            
            if (images == null) {
                images = new ArrayList<>();
            } else {
                images.clear();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }        
    }


    public void loadProduct(TProductComposite productDetail) {
        try {
            this.productDetail = productDetail;                        
            if (images == null) {
                images = new ArrayList<>();
            } else {
                images.clear();
            }
            if (this.productDetail.gettProductInfo().getRepositoryIdSmallImgURL() != null) {
                images.add(this.productDetail.gettProductInfo().getRepositoryIdSmallImgURL());
            }
            if (this.productDetail.gettProductInfo().getRepositoryIdMediumImgURL() != null) {
                images.add(this.productDetail.gettProductInfo().getRepositoryIdMediumImgURL());
            }
            if (this.productDetail.gettProductInfo().getRepositoryIdLargImgURL() != null) {
                images.add(this.productDetail.gettProductInfo().getRepositoryIdLargImgURL());
            }
            ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
            context.redirect(context.getRequestContextPath() + "/faces/duser/dCustomerProductDetailPage.xhtml?productId=" + productDetail.gettProductInfo().getId());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public TProductComposite getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(TProductComposite selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public TProductComposite getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(TProductComposite productDetail) {
        this.productDetail = productDetail;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Date getIntroductionDate() {
        if (productDetail.gettProductInfo() != null && productDetail.gettProductInfo().getIntroductionDate() != 0) {
            return new Date(productDetail.gettProductInfo().getIntroductionDate());
        } else {
            return null;
        }
    }


    public List<SelectItem> getSelectItems() {
        return selectItems;
    }

    public void setSelectItems(List<SelectItem> selectItems) {
        this.selectItems = selectItems;
    }

    public boolean isRenderPanelEmptyAttribute() {
        return renderPanelEmptyAttribute;
    }

    public void setRenderPanelEmptyAttribute(boolean renderPanelEmptyAttribute) {
        this.renderPanelEmptyAttribute = renderPanelEmptyAttribute;
    }

    public boolean isRenderAttributeInLastProduct() {
        return renderAttributeInLastProduct;
    }

    public void setRenderAttributeInLastProduct(boolean renderAttributeInLastProduct) {
        this.renderAttributeInLastProduct = renderAttributeInLastProduct;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public List<TProductComposite> getProductCompositList() {
        return productCompositList;
    }

    public void setProductCompositList(List<TProductComposite> productCompositList) {
        this.productCompositList = productCompositList;
    }


    
}
