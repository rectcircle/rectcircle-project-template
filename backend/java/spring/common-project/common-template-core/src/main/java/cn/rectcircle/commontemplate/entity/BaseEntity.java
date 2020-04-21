package cn.rectcircle.commontemplate.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Rectcircle
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -8071748899405883375L;

    /**
     * https://www.ibm.com/developerworks/cn/java/j-lo-tablegenerator/index.html
     */
    @TableGenerator(name = "id_gen", table = "enhanced_gen", allocationSize = 20)
    @GeneratedValue(generator = "id_gen")
    @Id
    protected Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time", nullable = false, updatable = false)
    protected Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_time")
    protected Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "BaseEntity [createTime=" + createTime + ", id=" + id + ", modifyTime=" + modifyTime + "]";
    }

}
