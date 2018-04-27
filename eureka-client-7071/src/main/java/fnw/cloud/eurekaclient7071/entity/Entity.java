package fnw.cloud.eurekaclient7071.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * @author: wu_guang_lu@163.com
 * @date: 2018/4/22 22:00
 * @Description:
 */
@SuppressWarnings({"ALL", "AlibabaCommentsMustBeJavadocFormat"})
@TableName("cim_equip")
public class Entity extends Model<Entity> {

    //设备的标识主键
    /**
     * cimId
     */
    @TableId("cimid")
    private Long cimId;
    /**
     * parentCimId
     */
    @TableField("parent_cimid")
    private Long parentCimId;
    /**
     * cimId
     */
    @TableField("root_cimid")
    private Long rootCimId;
    /**
     * cimType
     */
    @TableField("cim_type")
    private String cimType;
    /**
     * containerId
     */
    @TableField("device_id")
    private String containerId;
    /**
     * containerName
     */
    @TableField("device_name")
    private String containerName;
    /**
     * containerType
     */
    @TableField("device_type")
    private String containerType;
    /**
     * alias
     */
    @TableField("alias")
    private String alias;
    /**
     * description
     */
    @TableField("description")
    private String description;
    /**
     * status
     */
    @TableField("status")
    private String status;
    /**
     * kks
     */
    @TableField("kks")
    private String kks;
    /**
     * cimPath
     */
    @TableField("cim_path")
    private String cimPath;
    /**
     * cuserId
     */
    @TableField("cuser_id")
    private String cuserId;
    /**
     * typeName
     */
    @TableField(exist = false)
    private String typeName;
    /**
     * uuserId
     */
    @TableField("uuser_id")
    private String uuserId;
    /**
     * ctime
     */
    @TableField("ctime")
    private Long ctime;
    /**
     * utime
     */
    @TableField("utime")
    private Long utime;
    /**
     * attr
     */
    @TableField("attr")
    private String attr;
    /**
     * sno
     */
    @TableField("sno")
    private String sno;
    /**
     * icon
     */
    @TableField("icon")
    private String icon;
    /**
     * cimSubType
     */
    @TableField("cim_sub_type")
    private String cimSubType;
    /**
     * lat
     */
    @TableField("lat")
    private Double lat;
    /**
     * lng
     */
    @TableField("lng")
    private Double lng;
    /**
     * protectLevel
     */
    @TableField("protect_level")
    private String protectLevel;
    /**
     * city
     */
    @TableField(exist = false)
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
    protected Serializable pkVal() {
        return this.cimId;
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
