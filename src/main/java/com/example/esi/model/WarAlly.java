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
 * ally object
 */
@ApiModel(description = "ally object")
public class WarAlly implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("alliance_id")
    private Integer allianceId = null;

    @JsonProperty("corporation_id")
    private Integer corporationId = null;

    public WarAlly allianceId(Integer allianceId) {
        this.allianceId = allianceId;
        return this;
    }

    /**
     * Alliance ID if and only if this ally is an alliance
     * 
     * @return allianceId
     **/
    @ApiModelProperty(example = "null", value = "Alliance ID if and only if this ally is an alliance")
    public Integer getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    public WarAlly corporationId(Integer corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    /**
     * Corporation ID if and only if this ally is a corporation
     * 
     * @return corporationId
     **/
    @ApiModelProperty(example = "null", value = "Corporation ID if and only if this ally is a corporation")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WarAlly warAlly = (WarAlly) o;
        return Objects.equals(this.allianceId, warAlly.allianceId)
                && Objects.equals(this.corporationId, warAlly.corporationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allianceId, corporationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarAlly {\n");

        sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
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