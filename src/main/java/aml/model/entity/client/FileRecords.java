package aml.model.entity.client;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author le
 * @since 2019-11-09
 */
@TableName("file_records")
public class FileRecords extends Model<FileRecords> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("bus_id")
	private String busId;
    /**
     * 上传用户
     */
	private String uploader;
    /**
     * 文件di
     */
	private String fileId;
	private String filename;
	private Integer filesize;
    /**
     * 上传时间
     */
	private Date uploadTime;


	public Integer getId() {
		return id;
	}

	public FileRecords setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getBusId() {
		return busId;
	}

	public FileRecords setBusId(String busId) {
		this.busId = busId;
		return this;
	}

	public String getUploader() {
		return uploader;
	}

	public FileRecords setUploader(String uploader) {
		this.uploader = uploader;
		return this;
	}

	public String getFileId() {
		return fileId;
	}

	public FileRecords setFileId(String fileId) {
		this.fileId = fileId;
		return this;
	}

	public String getFilename() {
		return filename;
	}

	public FileRecords setFilename(String filename) {
		this.filename = filename;
		return this;
	}

	public Integer getFilesize() {
		return filesize;
	}

	public FileRecords setFilesize(Integer filesize) {
		this.filesize = filesize;
		return this;
	}

	public Date getUploadTime() {
		return uploadTime;
	}

	public FileRecords setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
