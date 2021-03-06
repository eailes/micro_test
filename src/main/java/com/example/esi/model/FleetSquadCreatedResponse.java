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
 * 201 created object
 */
@ApiModel(description = "201 created object")
public class FleetSquadCreatedResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("squad_id")
    private Long squadId = null;

    public FleetSquadCreatedResponse squadId(Long squadId) {
        this.squadId = squadId;
        return this;
    }

    /**
     * The squad_id of the newly created squad
     * 
     * @return squadId
     **/
    @ApiModelProperty(example = "null", required = true, value = "The squad_id of the newly created squad")
    public Long getSquadId() {
        return squadId;
    }

    public void setSquadId(Long squadId) {
        this.squadId = squadId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FleetSquadCreatedResponse fleetSquadCreatedResponse = (FleetSquadCreatedResponse) o;
        return Objects.equals(this.squadId, fleetSquadCreatedResponse.squadId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(squadId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FleetSquadCreatedResponse {\n");

        sb.append("    squadId: ").append(toIndentedString(squadId)).append("\n");
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
