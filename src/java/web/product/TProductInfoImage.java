package web.product;

public class TProductInfoImage {

    private Long id;
    private String smallImage;
    private String mediumImage;
    private String largeImage;
    private Long productInfoId;

    public TProductInfoImage(Long id, String mediumImage, String smallImage, String largeImage, Long productInfoId) {
        this.id = id;
        this.mediumImage = mediumImage;
        this.smallImage = smallImage;
        this.largeImage = largeImage;
        this.productInfoId = productInfoId;
    }

    public TProductInfoImage(String mediumImage, String smallImage, String largeImage, Long productInfoId) {
        this.mediumImage = mediumImage;
        this.smallImage = smallImage;
        this.largeImage = largeImage;
        this.productInfoId = productInfoId;
    }

    public TProductInfoImage(String largeImage) {
        this.largeImage = largeImage;
    }

    public TProductInfoImage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMediumImage() {
        return mediumImage;
    }

    public void setMediumImage(String mediumImage) {
        this.mediumImage = mediumImage;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    public Long getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(Long productInfoId) {
        this.productInfoId = productInfoId;
    }
}
