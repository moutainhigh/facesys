package com.ss.facesys.web.app.facedb.form;

import com.ss.facesys.data.engine.validate.APIEngineBindGroup;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import java.util.StringJoiner;

/**
 * 人像库绑定引擎
 *
 * @author FrancisYs
 * @date 2019/12/17
 * @email yaoshuai@ss-cas.com
 */
public class FacedbEngineBindForm implements Serializable {

    private static final long serialVersionUID = 4484431435782449521L;

    @NotEmpty(message = "{facedb.ids.empty}", groups = {APIEngineBindGroup.class})
    private List<Integer> facedbIds;
    @NotNull(message = "{engine.type.empty}", groups = {APIEngineBindGroup.class})
    @Range(min = 1L, max = 6L, message = "engine.type.not.support", groups = {APIEngineBindGroup.class})
    private Integer engineType;
    @NotNull(message = "{facedb.engine.bind.status.empty}", groups = {APIEngineBindGroup.class})
    @Range(max = 1L, message = "{facedb.engine.bind.status.invalid.ange}", groups = {APIEngineBindGroup.class})
    private Integer bindStatus;
    private String userId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<Integer> getFacedbIds() {
        return facedbIds;
    }

    public void setFacedbIds(List<Integer> facedbIds) {
        this.facedbIds = facedbIds;
    }

    public Integer getEngineType() {
        return engineType;
    }

    public void setEngineType(Integer engineType) {
        this.engineType = engineType;
    }

    public Integer getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(Integer bindStatus) {
        this.bindStatus = bindStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", FacedbEngineBindForm.class.getSimpleName() + "[", "]")
                .add("facedbIds=" + facedbIds)
                .add("engineType=" + engineType)
                .add("bindStatus=" + bindStatus)
                .add("userId=" + userId)
                .toString();
    }

}
