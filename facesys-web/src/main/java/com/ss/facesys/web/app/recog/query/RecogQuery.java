package com.ss.facesys.web.app.recog.query;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * RecogQuery
 *
 * @author FrancisYs
 * @date 2019/12/4
 * @email yaoshuai@ss-cas.com
 */
public class RecogQuery implements Serializable {

    @NotBlank(message = "{recog.faceA.empty}")
    private String faceA;
    @NotBlank(message = "{recog.faceB.empty}")
    private String faceB;


    public String getFaceA() {
        return faceA;
    }

    public void setFaceA(String faceA) {
        this.faceA = faceA;
    }

    public String getFaceB() {
        return faceB;
    }

    public void setFaceB(String faceB) {
        this.faceB = faceB;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RecogQuery.class.getSimpleName() + "[", "]")
                .add("faceA='" + faceA + "'")
                .add("faceB='" + faceB + "'")
                .toString();
    }

}
