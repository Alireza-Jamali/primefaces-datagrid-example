package web.product;

import java.util.List;


public class TProductComposite{

    private TProductInfo tProductInfo;
    private float quantity;

    private Boolean enabledFollowAction;

    private Boolean enabledRecommendeAction;

    private long followerCount;
    private long commentCount;
    private long recommendCount;
    private long perfectCount;
    private Boolean isFollower = Boolean.valueOf(false);
    private Boolean isPerfeted = Boolean.valueOf(false);
    private Boolean isPublished = Boolean.valueOf(false);

    private long partyRecommendedCount;
    private String selectedProductAttributes;

    public TProductComposite() {
    }
    private TProductInfoImage firstImage = new TProductInfoImage();

    public TProductInfoImage getFirstImage() {
        return firstImage;
    }

    public void setFirstImage(TProductInfoImage firstImage) {
        this.firstImage = firstImage;
    }
    
    public TProductComposite(TProductInfo tProductInfo, List<Object> tProductAttributeList, List<Object> tPriceComponentList, Boolean enabledFollowAction, Boolean enabledRecommendeAction, long followerCount, long commentCount, long recommendCount, long perfectCount, long partyRecommendedCount) {
        this.tProductInfo = tProductInfo;
        Object ob1 = tProductAttributeList;
        Object ob2 = tPriceComponentList;
        this.enabledFollowAction = enabledFollowAction;
        this.enabledRecommendeAction = enabledRecommendeAction;
        this.followerCount = followerCount;
        this.commentCount = commentCount;
        this.recommendCount = recommendCount;
        this.perfectCount = perfectCount;
        this.partyRecommendedCount = partyRecommendedCount;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        if (quantity < 0.0F) {
            this.quantity = 0.0F;
        } else {
            this.quantity = quantity;
        }
    }

    public long getPerfectCount() {
        return perfectCount;
    }

    public void setPerfectCount(long perfectCount) {
        this.perfectCount = perfectCount;
    }

    public Boolean getIsPerfeted() {
        return isPerfeted;
    }

    public void setIsPerfeted(Boolean isPerfeted) {
        this.isPerfeted = isPerfeted;
    }

    public TProductInfo gettProductInfo() {
        return tProductInfo;
    }

    public void settProductInfo(TProductInfo tProductInfo) {
        this.tProductInfo = tProductInfo;
    }

    public Boolean getEnabledFollowAction() {
        return enabledFollowAction;
    }

    public void setEnabledFollowAction(Boolean enabledFollowAction) {
        this.enabledFollowAction = enabledFollowAction;
    }

    public Boolean getEnabledRecommendeAction() {
        return enabledRecommendeAction;
    }

    public void setEnabledRecommendeAction(Boolean enabledRecommendeAction) {
        this.enabledRecommendeAction = enabledRecommendeAction;
    }

    public long getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(long followerCount) {
        this.followerCount = followerCount;
    }

    public long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(long commentCount) {
        this.commentCount = commentCount;
    }

    public long getRecommendCount() {
        return recommendCount;
    }

    public void setRecommendCount(long recommendCount) {
        this.recommendCount = recommendCount;
    }

    public Boolean getIsFollower() {
        return isFollower;
    }

    public void setIsFollower(Boolean isFollower) {
        this.isFollower = isFollower;
    }

    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    public long getPartyRecommendedCount() {
        return partyRecommendedCount;
    }

    public void setPartyRecommendedCount(long partyRecommendedCount) {
        this.partyRecommendedCount = partyRecommendedCount;
    }

    public String getSelectedProductAttributes() {
        return selectedProductAttributes;
    }

    public void setSelectedProductAttributes(String selectedProductAttributes) {
        this.selectedProductAttributes = selectedProductAttributes;
    }
}
