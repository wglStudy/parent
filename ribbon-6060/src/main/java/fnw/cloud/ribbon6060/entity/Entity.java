package fnw.cloud.ribbon6060.entity;

/**
 * @author: wu_guang_lu@163.com
 * @date: 2018/4/22 22:00
 * @Description:
 */
@SuppressWarnings({"ALL", "AlibabaCommentsMustBeJavadocFormat"})
public class Entity{

    //设备的标识主键
    /**
     * cimId
     */
    private Long cimId;
    /**
     * parentCimId
     */
    private Long parentCimId;
    /**
     * cimId
     */
    private Long rootCimId;
    /**
     * cimType
     */
    private String cimType;
    /**
     * containerId
     */
    private String containerId;
    /**
     * containerName
     */
    private String containerName;
    /**
     * containerType
     */
    private String containerType;
    /**
     * alias
     */
    private String alias;
    /**
     * description
     */
    private String description;
    /**
     * status
     */
    private String status;
    /**
     * kks
     */
    private String kks;
    /**
     * cimPath
     */
    private String cimPath;
    /**
     * cuserId
     */
    private String cuserId;
    /**
     * typeName
     */
    private String typeName;
    /**
     * uuserId
     */
    private String uuserId;
    /**
     * ctime
     */
    private Long ctime;
    /**
     * utime
     */
    private Long utime;
    /**
     * attr
     */
    private String attr;
    /**
     * sno
     */
    private String sno;
    /**
     * icon
     */
    private String icon;
    /**
     * cimSubType
     */
    private String cimSubType;
    /**
     * lat
     */
    private Double lat;
    /**
     * lng
     */
    private Double lng;
    /**
     * protectLevel
     */
    private String protectLevel;
    /**
     * city
     */
    private String city;

    public Long getCimId() {
        return cimId;
    }

    public void setCimId(Long cimId) {
        this.cimId = cimId;
    }

    public Long getParentCimId() {
        return parentCimId;
    }

    public void setParentCimId(Long parentCimId) {
        this.parentCimId = parentCimId;
    }

    public Long getRootCimId() {
        return rootCimId;
    }

    public void setRootCimId(Long rootCimId) {
        this.rootCimId = rootCimId;
    }

    public String getCimType() {
        return cimType;
    }

    public void setCimType(String cimType) {
        this.cimType = cimType;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKks() {
        return kks;
    }

    public void setKks(String kks) {
        this.kks = kks;
    }

    public String getCimPath() {
        return cimPath;
    }

    public void setCimPath(String cimPath) {
        this.cimPath = cimPath;
    }

    public String getCuserId() {
        return cuserId;
    }

    public void setCuserId(String cuserId) {
        this.cuserId = cuserId;
    }

    public String getUuserId() {
        return uuserId;
    }

    public void setUuserId(String uuserId) {
        this.uuserId = uuserId;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public Long getUtime() {
        return utime;
    }

    public void setUtime(Long utime) {
        this.utime = utime;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCimSubType() {
        return cimSubType;
    }

    public void setCimSubType(String cimSubType) {
        this.cimSubType = cimSubType;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getProtectLevel() {
        return protectLevel;
    }

    public void setProtectLevel(String protectLevel) {
        this.protectLevel = protectLevel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Container{" +
                "cimId=" + cimId +
                ", parentCimId=" + parentCimId +
                ", rootCimId=" + rootCimId +
                ", cimType='" + cimType + '\'' +
                ", containerId='" + containerId + '\'' +
                ", containerName='" + containerName + '\'' +
                ", containerType='" + containerType + '\'' +
                ", alias='" + alias + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", kks='" + kks + '\'' +
                ", cimPath='" + cimPath + '\'' +
                ", cuserId='" + cuserId + '\'' +
                ", typeName='" + typeName + '\'' +
                ", uuserId='" + uuserId + '\'' +
                ", ctime=" + ctime +
                ", utime=" + utime +
                ", attr='" + attr + '\'' +
                ", sno='" + sno + '\'' +
                ", icon='" + icon + '\'' +
                ", cimSubType='" + cimSubType + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", protectLevel='" + protectLevel + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
