/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.example.esi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class ContactLabelsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("label_id")
    private Long labelId = null;

    @JsonProperty("label_name")
    private String labelName = null;

    public ContactLabelsResponse labelId(Long labelId) {
        this.labelId = labelId;
        return this;
    }

    /**
     * label_id integer
     * 
     * @return labelId
     **/
    @ApiModelProperty(example = "null", required = true, value = "label_id integer")
    public Long getLabelId() {
        return labelId;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }

    public ContactLabelsResponse labelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    /**
     * label_name string
     * 
     * @return labelName
     **/
    @ApiModelProperty(example = "null", required = true, value = "label_name string")
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContactLabelsResponse contactLabelsResponse = (ContactLabelsResponse) o;
        return Objects.equals(this.labelId, contactLabelsResponse.labelId)
                && Objects.equals(this.labelName, contactLabelsResponse.labelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelId, labelName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContactLabelsResponse {\n");

        sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
        sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
