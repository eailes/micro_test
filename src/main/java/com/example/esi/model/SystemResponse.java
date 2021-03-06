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
public class SystemResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("solar_system_name")
    private String solarSystemName = null;

    public SystemResponse solarSystemName(String solarSystemName) {
        this.solarSystemName = solarSystemName;
        return this;
    }

    /**
     * the full name of the system
     * 
     * @return solarSystemName
     **/
    @ApiModelProperty(example = "null", value = "the full name of the system")
    public String getSolarSystemName() {
        return solarSystemName;
    }

    public void setSolarSystemName(String solarSystemName) {
        this.solarSystemName = solarSystemName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemResponse systemResponse = (SystemResponse) o;
        return Objects.equals(this.solarSystemName, systemResponse.solarSystemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(solarSystemName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemResponse {\n");

        sb.append("    solarSystemName: ").append(toIndentedString(solarSystemName)).append("\n");
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
