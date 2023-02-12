package org.csits.demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * 
 * @TableName ai_control_single
 */
@TableName(value ="ai_control_single")
@Data
public class AiControlSingle implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private String id;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    private String create_by;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 更新人
     */
    @TableField(value = "update_by")
    private String update_by;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 所属部门
     */
    @TableField(value = "sys_org_code")
    private String sys_org_code;

    /**
     * 单价
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 用户名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 密码
     */
    @TableField(value = "mi_ma")
    private String mi_ma;

    /**
     * 字典下拉
     */
    @TableField(value = "xiala")
    private String xiala;

    /**
     * 字典单选
     */
    @TableField(value = "danxuan")
    private String danxuan;

    /**
     * 字典多选
     */
    @TableField(value = "duoxuan")
    private String duoxuan;

    /**
     * 开关
     */
    @TableField(value = "kaiguan")
    private String kaiguan;

    /**
     * 日期
     */
    @TableField(value = "riqi")
    private LocalDate riqi;

    /**
     * 年月日时分秒
     */
    @TableField(value = "nyrsfm")
    private LocalDateTime nyrsfm;

    /**
     * 时间
     */
    @TableField(value = "shijian")
    private String shijian;

    /**
     * 文件
     */
    @TableField(value = "wenjian")
    private String wenjian;

    /**
     * 图片
     */
    @TableField(value = "tupian")
    private String tupian;

    /**
     * 多行文本框
     */
    @TableField(value = "dhwb")
    private String dhwb;

    /**
     * 字典下拉多选框
     */
    @TableField(value = "xldx")
    private String xldx;

    /**
     * 字典表下拉搜索框
     */
    @TableField(value = "xlss")
    private String xlss;

    /**
     * popup弹窗
     */
    @TableField(value = "popup")
    private String popup;

    /**
     * popback
     */
    @TableField(value = "popback")
    private String popback;

    /**
     * 分类字典树
     */
    @TableField(value = "flzds")
    private String flzds;

    /**
     * 部门选择
     */
    @TableField(value = "bmxz")
    private String bmxz;

    /**
     * 用户选择
     */
    @TableField(value = "yhxz")
    private String yhxz;

    /**
     * 富文本
     */
    @TableField(value = "fwb")
    private String fwb;

    /**
     * 省市区
     */
    @TableField(value = "shq")
    private String shq;

    /**
     * 联动组件一
     */
    @TableField(value = "ldzuy")
    private String ldzuy;

    /**
     * 联动组件二
     */
    @TableField(value = "ldzje")
    private String ldzje;

    /**
     * 联动组件三
     */
    @TableField(value = "ldzjs")
    private String ldzjs;

    /**
     * 自定义树
     */
    @TableField(value = "zdys")
    private String zdys;

    /**
     * double类型
     */
    @TableField(value = "yuanjia")
    private Double yuanjia;

    /**
     * integer类型
     */
    @TableField(value = "geshu")
    private Integer geshu;

    /**
     * 唯一检验
     */
    @TableField(value = "jycs")
    private String jycs;

    /**
     * 输入2到10位的字母
     */
    @TableField(value = "province")
    private String province;

    /**
     * 自定义查询
     */
    @TableField(value = "zdmrz")
    private String zdmrz;

    /**
     * 字典表下拉
     */
    @TableField(value = "zdbxl")
    private String zdbxl;

    /**
     * 字典表单选
     */
    @TableField(value = "zdbdx")
    private String zdbdx;

    /**
     * 字典表多选
     */
    @TableField(value = "zdbduoxuan")
    private String zdbduoxuan;

    /**
     * 字典表下拉多选
     */
    @TableField(value = "zdbxldx")
    private String zdbxldx;

    /**
     * 字典表带条件下拉
     */
    @TableField(value = "zddtjxl")
    private String zddtjxl;

    /**
     * 字典表带条件单选
     */
    @TableField(value = "zddtjdx")
    private String zddtjdx;

    /**
     * 字典表带条件多选
     */
    @TableField(value = "zddtjduox")
    private String zddtjduox;

    /**
     * 字典表带条件下拉多选
     */
    @TableField(value = "zddtjxldx")
    private String zddtjxldx;

    /**
     * 字典表带条件下拉搜索
     */
    @TableField(value = "zddtjxlss")
    private String zddtjxlss;

    /**
     * markdown
     */
    @TableField(value = "markdown")
    private byte[] markdown;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AiControlSingle other = (AiControlSingle) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getSys_org_code() == null ? other.getSys_org_code() == null : this.getSys_org_code().equals(other.getSys_org_code()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getMi_ma() == null ? other.getMi_ma() == null : this.getMi_ma().equals(other.getMi_ma()))
            && (this.getXiala() == null ? other.getXiala() == null : this.getXiala().equals(other.getXiala()))
            && (this.getDanxuan() == null ? other.getDanxuan() == null : this.getDanxuan().equals(other.getDanxuan()))
            && (this.getDuoxuan() == null ? other.getDuoxuan() == null : this.getDuoxuan().equals(other.getDuoxuan()))
            && (this.getKaiguan() == null ? other.getKaiguan() == null : this.getKaiguan().equals(other.getKaiguan()))
            && (this.getRiqi() == null ? other.getRiqi() == null : this.getRiqi().equals(other.getRiqi()))
            && (this.getNyrsfm() == null ? other.getNyrsfm() == null : this.getNyrsfm().equals(other.getNyrsfm()))
            && (this.getShijian() == null ? other.getShijian() == null : this.getShijian().equals(other.getShijian()))
            && (this.getWenjian() == null ? other.getWenjian() == null : this.getWenjian().equals(other.getWenjian()))
            && (this.getTupian() == null ? other.getTupian() == null : this.getTupian().equals(other.getTupian()))
            && (this.getDhwb() == null ? other.getDhwb() == null : this.getDhwb().equals(other.getDhwb()))
            && (this.getXldx() == null ? other.getXldx() == null : this.getXldx().equals(other.getXldx()))
            && (this.getXlss() == null ? other.getXlss() == null : this.getXlss().equals(other.getXlss()))
            && (this.getPopup() == null ? other.getPopup() == null : this.getPopup().equals(other.getPopup()))
            && (this.getPopback() == null ? other.getPopback() == null : this.getPopback().equals(other.getPopback()))
            && (this.getFlzds() == null ? other.getFlzds() == null : this.getFlzds().equals(other.getFlzds()))
            && (this.getBmxz() == null ? other.getBmxz() == null : this.getBmxz().equals(other.getBmxz()))
            && (this.getYhxz() == null ? other.getYhxz() == null : this.getYhxz().equals(other.getYhxz()))
            && (this.getFwb() == null ? other.getFwb() == null : this.getFwb().equals(other.getFwb()))
            && (this.getShq() == null ? other.getShq() == null : this.getShq().equals(other.getShq()))
            && (this.getLdzuy() == null ? other.getLdzuy() == null : this.getLdzuy().equals(other.getLdzuy()))
            && (this.getLdzje() == null ? other.getLdzje() == null : this.getLdzje().equals(other.getLdzje()))
            && (this.getLdzjs() == null ? other.getLdzjs() == null : this.getLdzjs().equals(other.getLdzjs()))
            && (this.getZdys() == null ? other.getZdys() == null : this.getZdys().equals(other.getZdys()))
            && (this.getYuanjia() == null ? other.getYuanjia() == null : this.getYuanjia().equals(other.getYuanjia()))
            && (this.getGeshu() == null ? other.getGeshu() == null : this.getGeshu().equals(other.getGeshu()))
            && (this.getJycs() == null ? other.getJycs() == null : this.getJycs().equals(other.getJycs()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getZdmrz() == null ? other.getZdmrz() == null : this.getZdmrz().equals(other.getZdmrz()))
            && (this.getZdbxl() == null ? other.getZdbxl() == null : this.getZdbxl().equals(other.getZdbxl()))
            && (this.getZdbdx() == null ? other.getZdbdx() == null : this.getZdbdx().equals(other.getZdbdx()))
            && (this.getZdbduoxuan() == null ? other.getZdbduoxuan() == null : this.getZdbduoxuan().equals(other.getZdbduoxuan()))
            && (this.getZdbxldx() == null ? other.getZdbxldx() == null : this.getZdbxldx().equals(other.getZdbxldx()))
            && (this.getZddtjxl() == null ? other.getZddtjxl() == null : this.getZddtjxl().equals(other.getZddtjxl()))
            && (this.getZddtjdx() == null ? other.getZddtjdx() == null : this.getZddtjdx().equals(other.getZddtjdx()))
            && (this.getZddtjduox() == null ? other.getZddtjduox() == null : this.getZddtjduox().equals(other.getZddtjduox()))
            && (this.getZddtjxldx() == null ? other.getZddtjxldx() == null : this.getZddtjxldx().equals(other.getZddtjxldx()))
            && (this.getZddtjxlss() == null ? other.getZddtjxlss() == null : this.getZddtjxlss().equals(other.getZddtjxlss()))
            && (Arrays.equals(this.getMarkdown(), other.getMarkdown()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getSys_org_code() == null) ? 0 : getSys_org_code().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getMi_ma() == null) ? 0 : getMi_ma().hashCode());
        result = prime * result + ((getXiala() == null) ? 0 : getXiala().hashCode());
        result = prime * result + ((getDanxuan() == null) ? 0 : getDanxuan().hashCode());
        result = prime * result + ((getDuoxuan() == null) ? 0 : getDuoxuan().hashCode());
        result = prime * result + ((getKaiguan() == null) ? 0 : getKaiguan().hashCode());
        result = prime * result + ((getRiqi() == null) ? 0 : getRiqi().hashCode());
        result = prime * result + ((getNyrsfm() == null) ? 0 : getNyrsfm().hashCode());
        result = prime * result + ((getShijian() == null) ? 0 : getShijian().hashCode());
        result = prime * result + ((getWenjian() == null) ? 0 : getWenjian().hashCode());
        result = prime * result + ((getTupian() == null) ? 0 : getTupian().hashCode());
        result = prime * result + ((getDhwb() == null) ? 0 : getDhwb().hashCode());
        result = prime * result + ((getXldx() == null) ? 0 : getXldx().hashCode());
        result = prime * result + ((getXlss() == null) ? 0 : getXlss().hashCode());
        result = prime * result + ((getPopup() == null) ? 0 : getPopup().hashCode());
        result = prime * result + ((getPopback() == null) ? 0 : getPopback().hashCode());
        result = prime * result + ((getFlzds() == null) ? 0 : getFlzds().hashCode());
        result = prime * result + ((getBmxz() == null) ? 0 : getBmxz().hashCode());
        result = prime * result + ((getYhxz() == null) ? 0 : getYhxz().hashCode());
        result = prime * result + ((getFwb() == null) ? 0 : getFwb().hashCode());
        result = prime * result + ((getShq() == null) ? 0 : getShq().hashCode());
        result = prime * result + ((getLdzuy() == null) ? 0 : getLdzuy().hashCode());
        result = prime * result + ((getLdzje() == null) ? 0 : getLdzje().hashCode());
        result = prime * result + ((getLdzjs() == null) ? 0 : getLdzjs().hashCode());
        result = prime * result + ((getZdys() == null) ? 0 : getZdys().hashCode());
        result = prime * result + ((getYuanjia() == null) ? 0 : getYuanjia().hashCode());
        result = prime * result + ((getGeshu() == null) ? 0 : getGeshu().hashCode());
        result = prime * result + ((getJycs() == null) ? 0 : getJycs().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getZdmrz() == null) ? 0 : getZdmrz().hashCode());
        result = prime * result + ((getZdbxl() == null) ? 0 : getZdbxl().hashCode());
        result = prime * result + ((getZdbdx() == null) ? 0 : getZdbdx().hashCode());
        result = prime * result + ((getZdbduoxuan() == null) ? 0 : getZdbduoxuan().hashCode());
        result = prime * result + ((getZdbxldx() == null) ? 0 : getZdbxldx().hashCode());
        result = prime * result + ((getZddtjxl() == null) ? 0 : getZddtjxl().hashCode());
        result = prime * result + ((getZddtjdx() == null) ? 0 : getZddtjdx().hashCode());
        result = prime * result + ((getZddtjduox() == null) ? 0 : getZddtjduox().hashCode());
        result = prime * result + ((getZddtjxldx() == null) ? 0 : getZddtjxldx().hashCode());
        result = prime * result + ((getZddtjxlss() == null) ? 0 : getZddtjxlss().hashCode());
        result = prime * result + (Arrays.hashCode(getMarkdown()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_by=").append(update_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", sys_org_code=").append(sys_org_code);
        sb.append(", price=").append(price);
        sb.append(", name=").append(name);
        sb.append(", mi_ma=").append(mi_ma);
        sb.append(", xiala=").append(xiala);
        sb.append(", danxuan=").append(danxuan);
        sb.append(", duoxuan=").append(duoxuan);
        sb.append(", kaiguan=").append(kaiguan);
        sb.append(", riqi=").append(riqi);
        sb.append(", nyrsfm=").append(nyrsfm);
        sb.append(", shijian=").append(shijian);
        sb.append(", wenjian=").append(wenjian);
        sb.append(", tupian=").append(tupian);
        sb.append(", dhwb=").append(dhwb);
        sb.append(", xldx=").append(xldx);
        sb.append(", xlss=").append(xlss);
        sb.append(", popup=").append(popup);
        sb.append(", popback=").append(popback);
        sb.append(", flzds=").append(flzds);
        sb.append(", bmxz=").append(bmxz);
        sb.append(", yhxz=").append(yhxz);
        sb.append(", fwb=").append(fwb);
        sb.append(", shq=").append(shq);
        sb.append(", ldzuy=").append(ldzuy);
        sb.append(", ldzje=").append(ldzje);
        sb.append(", ldzjs=").append(ldzjs);
        sb.append(", zdys=").append(zdys);
        sb.append(", yuanjia=").append(yuanjia);
        sb.append(", geshu=").append(geshu);
        sb.append(", jycs=").append(jycs);
        sb.append(", province=").append(province);
        sb.append(", zdmrz=").append(zdmrz);
        sb.append(", zdbxl=").append(zdbxl);
        sb.append(", zdbdx=").append(zdbdx);
        sb.append(", zdbduoxuan=").append(zdbduoxuan);
        sb.append(", zdbxldx=").append(zdbxldx);
        sb.append(", zddtjxl=").append(zddtjxl);
        sb.append(", zddtjdx=").append(zddtjdx);
        sb.append(", zddtjduox=").append(zddtjduox);
        sb.append(", zddtjxldx=").append(zddtjxldx);
        sb.append(", zddtjxlss=").append(zddtjxlss);
        sb.append(", markdown=").append(markdown);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}