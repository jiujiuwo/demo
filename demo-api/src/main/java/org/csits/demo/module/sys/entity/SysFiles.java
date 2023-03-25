package org.csits.demo.module.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 知识库-文档管理
 * </p>
 *
 * @author lhf
 * @since 2023-03-25
 */
@Getter
@Setter
@TableName("sys_files")
@Schema(name = "SysFiles", description = "知识库-文档管理")
public class SysFiles implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键id")
    @TableId("id")
    private String id;

    @Schema(description = "文件名称")
    @TableField("file_name")
    private String fileName;

    @Schema(description = "文件地址")
    @TableField("url")
    private String url;

    @Schema(description = "文档类型（folder:文件夹 excel:excel doc:word ppt:ppt image:图片  archive:其他文档 video:视频 pdf:pdf）")
    @TableField("file_type")
    private String fileType;

    @Schema(description = "文件上传类型(temp/本地上传(临时文件) manage/知识库)")
    @TableField("store_type")
    private String storeType;

    @Schema(description = "父级id")
    @TableField("parent_id")
    private String parentId;

    @Schema(description = "租户id")
    @TableField("tenant_id")
    private String tenantId;

    @Schema(description = "文件大小（kb）")
    @TableField("file_size")
    private Object fileSize;

    @Schema(description = "是否文件夹(1：是  0：否)")
    @TableField("iz_folder")
    private String izFolder;

    @Schema(description = "是否为1级文件夹，允许为空 (1：是 )")
    @TableField("iz_root_folder")
    private String izRootFolder;

    @Schema(description = "是否标星(1：是  0：否)")
    @TableField("iz_star")
    private String izStar;

    @Schema(description = "下载次数")
    @TableField("down_count")
    private Integer downCount;

    @Schema(description = "阅读次数")
    @TableField("read_count")
    private Integer readCount;

    @Schema(description = "分享链接")
    @TableField("share_url")
    private String shareUrl;

    @Schema(description = "分享权限(1.关闭分享 2.允许所有联系人查看 3.允许任何人查看)")
    @TableField("share_perms")
    private String sharePerms;

    @Schema(description = "是否允许下载(1：是  0：否)")
    @TableField("enable_down")
    private String enableDown;

    @Schema(description = "是否允许修改(1：是  0：否)")
    @TableField("enable_updat")
    private String enableUpdat;

    @Schema(description = "删除状态(0-正常,1-删除至回收站)")
    @TableField("del_flag")
    private String delFlag;

    @Schema(description = "创建人登录名称")
    @TableField("create_by")
    private String createBy;

    @Schema(description = "创建日期")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "更新人登录名称")
    @TableField("update_by")
    private String updateBy;

    @Schema(description = "更新日期")
    @TableField("update_time")
    private LocalDateTime updateTime;
}
