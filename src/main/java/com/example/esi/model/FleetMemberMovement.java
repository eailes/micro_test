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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * movement object
 */
@ApiModel(description = "movement object")
public class FleetMemberMovement implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * - If a character is moved to the `fleet_commander` role, neither
     * `wing_id` or `squad_id` should be specified - If a character is moved to
     * the `wing_commander` role, only `wing_id` should be specified - If a
     * character is moved to the `squad_commander` role, both `wing_id` and
     * `squad_id` should be specified - If a character is moved to the
     * `squad_member` role, both `wing_id` and `squad_id` should be specified
     */
    public enum RoleEnum {
        FLEET_COMMANDER("fleet_commander"),

        WING_COMMANDER("wing_commander"),

        SQUAD_COMMANDER("squad_commander"),

        SQUAD_MEMBER("squad_member");

        private String value;

        RoleEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RoleEnum fromValue(String text) {
            for (RoleEnum b : RoleEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("role")
    private RoleEnum role = null;

    @JsonProperty("squad_id")
    private Long squadId = null;

    @JsonProperty("wing_id")
    private Long wingId = null;

    public FleetMemberMovement role(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * - If a character is moved to the `fleet_commander` role, neither
     * `wing_id` or `squad_id` should be specified - If a character is moved to
     * the `wing_commander` role, only `wing_id` should be specified - If a
     * character is moved to the `squad_commander` role, both `wing_id` and
     * `squad_id` should be specified - If a character is moved to the
     * `squad_member` role, both `wing_id` and `squad_id` should be specified
     * 
     * @return role
     **/
    @ApiModelProperty(example = "null", required = true, value = "- If a character is moved to the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified - If a character is moved to the `wing_commander` role, only `wing_id` should be specified - If a character is moved to the `squad_commander` role, both `wing_id` and `squad_id` should be specified - If a character is moved to the `squad_member` role, both `wing_id` and `squad_id` should be specified ")
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public FleetMemberMovement squadId(Long squadId) {
        this.squadId = squadId;
        return this;
    }

    /**
     * squad_id integer minimum: 0
     * 
     * @return squadId
     **/
    @ApiModelProperty(example = "null", value = "squad_id integer")
    public Long getSquadId() {
        return squadId;
    }

    public void setSquadId(Long squadId) {
        this.squadId = squadId;
    }

    public FleetMemberMovement wingId(Long wingId) {
        this.wingId = wingId;
        return this;
    }

    /**
     * wing_id integer minimum: 0
     * 
     * @return wingId
     **/
    @ApiModelProperty(example = "null", value = "wing_id integer")
    public Long getWingId() {
        return wingId;
    }

    public void setWingId(Long wingId) {
        this.wingId = wingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FleetMemberMovement fleetMemberMovement = (FleetMemberMovement) o;
        return Objects.equals(this.role, fleetMemberMovement.role)
                && Objects.equals(this.squadId, fleetMemberMovement.squadId)
                && Objects.equals(this.wingId, fleetMemberMovement.wingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, squadId, wingId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FleetMemberMovement {\n");

        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    squadId: ").append(toIndentedString(squadId)).append("\n");
        sb.append("    wingId: ").append(toIndentedString(wingId)).append("\n");
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
