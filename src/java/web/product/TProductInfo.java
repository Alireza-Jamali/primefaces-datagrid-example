package web.product;


public class TProductInfo {

    private String serialId;
    private String internalName;
    private String brandName;
    private Long brandId;
    private String productName;
    private String model;
    private int countryProduceId;
    private int productConditionId;
    private String productConditionTitle;
    private int quantityAvailableProducts;
    private int produceDate;
    private boolean returns;
    private String warranty;
    private String labels;
    private long introductionDate;
    private long expirationDate;
    private long releaseDate;
    private long salesDiscontinuationDate;
    private long supportDiscontinuationDate;
    private String description;
    private String longDescription;
    private long primeryProductCategoryId;
    private String primeryProductCategoryName;
    private long partyManufactureId;
    private String partyManufactureFullName;
    private String repositoryIdLargImgURL;
    private String repositoryIdMediumImgURL;
    private String repositoryIdSmallImgURL;
    private int unitOfMeasureId;
    private String unitOfMeasureName;
    private int productTypeId;
    private String productTypeName;
    private long pARTYOrganizationId;
    private String pARTYOrganizationName;
    private String partyOrganizationLogoAddress;
    private int avgRank;
    private int partyAvgRank;
    private Double weight = Double.valueOf(0.0D);
    private Boolean isFreeDeliveryCost = Boolean.FALSE;

    public TProductInfo() {
    }

    public TProductInfo(String serialId, String internalName, String brandName, String productName, long introductionDate, long releaseDate, long salesDiscontinuationDate, long supportDiscontinuationDate, String description, String longDescription, long primeryProductCategoryId, long partyManufactureId, String partyManufactureFullName, long repositoryIdLargImgId, String repositoryIdLargImgURL, long repositoryIdMediumImgId, String repositoryIdMediumImgURL, long repositoryIdSmallImgId, String repositoryIdSmallImgURL, int unitOfMeasureId, String unitOfMeasureName, int productTypeId, String productTypeName, long pARTYOrganizationId, String pARTYOrganizationName, long id, long createDate, long byUserId, String version, int mappedId, Boolean isFreeDeliveryCost) {
        this.serialId = serialId;
        this.internalName = internalName;
        this.brandName = brandName;
        this.productName = productName;
        this.introductionDate = introductionDate;
        this.releaseDate = releaseDate;
        this.salesDiscontinuationDate = salesDiscontinuationDate;
        this.supportDiscontinuationDate = supportDiscontinuationDate;
        this.description = description;
        this.longDescription = longDescription;
        this.primeryProductCategoryId = primeryProductCategoryId;
        this.partyManufactureId = partyManufactureId;
        this.partyManufactureFullName = partyManufactureFullName;
        this.repositoryIdLargImgURL = repositoryIdLargImgURL;
        this.repositoryIdMediumImgURL = repositoryIdMediumImgURL;
        this.repositoryIdSmallImgURL = repositoryIdSmallImgURL;
        this.unitOfMeasureId = unitOfMeasureId;
        this.unitOfMeasureName = unitOfMeasureName;
        this.productTypeId = productTypeId;
        this.productTypeName = productTypeName;
        this.pARTYOrganizationId = pARTYOrganizationId;
        this.pARTYOrganizationName = pARTYOrganizationName;
        this.isFreeDeliveryCost = isFreeDeliveryCost;
    }
    long id;
    public TProductInfo(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getIntroductionDate() {
        return introductionDate;
    }

    public void setIntroductionDate(long introductionDate) {
        this.introductionDate = introductionDate;
    }

    public long getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(long expirationDate) {
        this.expirationDate = expirationDate;
    }

    public long getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(long releaseDate) {
        this.releaseDate = releaseDate;
    }

    public long getSalesDiscontinuationDate() {
        return salesDiscontinuationDate;
    }

    public void setSalesDiscontinuationDate(long salesDiscontinuationDate) {
        this.salesDiscontinuationDate = salesDiscontinuationDate;
    }

    public long getSupportDiscontinuationDate() {
        return supportDiscontinuationDate;
    }

    public void setSupportDiscontinuationDate(long supportDiscontinuationDate) {
        this.supportDiscontinuationDate = supportDiscontinuationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public long getPrimeryProductCategoryId() {
        return primeryProductCategoryId;
    }

    public void setPrimeryProductCategoryId(long primeryProductCategoryId) {
        this.primeryProductCategoryId = primeryProductCategoryId;
    }

    public String getPrimeryProductCategoryName() {
        return primeryProductCategoryName;
    }

    public void setPrimeryProductCategoryName(String primeryProductCategoryName) {
        this.primeryProductCategoryName = primeryProductCategoryName;
    }

    public long getPartyManufactureId() {
        return partyManufactureId;
    }

    public void setPartyManufactureId(long partyManufactureId) {
        this.partyManufactureId = partyManufactureId;
    }

    public String getPartyManufactureFullName() {
        return partyManufactureFullName;
    }

    public void setPartyManufactureFullName(String partyManufactureFullName) {
        this.partyManufactureFullName = partyManufactureFullName;
    }

    public String getRepositoryIdLargImgURL() {
        return repositoryIdLargImgURL;
    }

    public void setRepositoryIdLargImgURL(String repositoryIdLargImgURL) {
        this.repositoryIdLargImgURL = repositoryIdLargImgURL;
    }

    public String getRepositoryIdMediumImgURL() {
        return repositoryIdMediumImgURL;
    }

    public void setRepositoryIdMediumImgURL(String repositoryIdMediumImgURL) {
        this.repositoryIdMediumImgURL = repositoryIdMediumImgURL;
    }

    public String getRepositoryIdSmallImgURL() {
        return repositoryIdSmallImgURL;
    }

    public void setRepositoryIdSmallImgURL(String repositoryIdSmallImgURL) {
        this.repositoryIdSmallImgURL = repositoryIdSmallImgURL;
    }

    public int getUnitOfMeasureId() {
        return unitOfMeasureId;
    }

    public void setUnitOfMeasureId(int unitOfMeasureId) {
        this.unitOfMeasureId = unitOfMeasureId;
    }

    public String getUnitOfMeasureName() {
        return unitOfMeasureName;
    }

    public void setUnitOfMeasureName(String unitOfMeasureName) {
        this.unitOfMeasureName = unitOfMeasureName;
    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public long getpARTYOrganizationId() {
        return pARTYOrganizationId;
    }

    public void setpARTYOrganizationId(long pARTYOrganizationId) {
        this.pARTYOrganizationId = pARTYOrganizationId;
    }

    public String getpARTYOrganizationName() {
        return pARTYOrganizationName;
    }

    public void setpARTYOrganizationName(String pARTYOrganizationName) {
        this.pARTYOrganizationName = pARTYOrganizationName;
    }

    public String getPartyOrganizationLogoAddress() {
        if (partyOrganizationLogoAddress == null) {
            partyOrganizationLogoAddress = "../resources/images/defult_company_logo.png";
        }
        return partyOrganizationLogoAddress;
    }

    public void setPartyOrganizationLogoAddress(String partyOrganizationLogoAddress) {
        this.partyOrganizationLogoAddress = partyOrganizationLogoAddress;
    }

    public int getAvgRank() {
        return avgRank;
    }

    public void setAvgRank(int avgRank) {
        this.avgRank = avgRank;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCountryProduceId() {
        return countryProduceId;
    }

    public void setCountryProduceId(int countryProduceId) {
        this.countryProduceId = countryProduceId;
    }

    public int getProductConditionId() {
        return productConditionId;
    }

    public void setProductConditionId(int productConditionId) {
        this.productConditionId = productConditionId;
    }

    public String getProductConditionTitle() {
        return productConditionTitle;
    }

    public void setProductConditionTitle(String productConditionTitle) {
        this.productConditionTitle = productConditionTitle;
    }

    public int getQuantityAvailableProducts() {
        return quantityAvailableProducts;
    }

    public void setQuantityAvailableProducts(int quantityAvailableProducts) {
        this.quantityAvailableProducts = quantityAvailableProducts;
    }

    public int getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(int produceDate) {
        this.produceDate = produceDate;
    }

    public boolean isReturns() {
        return returns;
    }

    public void setReturns(boolean returns) {
        this.returns = returns;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public int getPartyAvgRank() {
        return partyAvgRank;
    }

    public void setPartyAvgRank(int partyAvgRank) {
        this.partyAvgRank = partyAvgRank;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Boolean getIsFreeDeliveryCost() {
        return isFreeDeliveryCost;
    }

    public void setIsFreeDeliveryCost(Boolean isFreeDeliveryCost) {
        this.isFreeDeliveryCost = isFreeDeliveryCost;
    }
}
