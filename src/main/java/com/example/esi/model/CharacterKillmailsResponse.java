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
public class CharacterKillmailsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("killmail_hash")
    private String killmailHash = null;

    @JsonProperty("killmail_id")
    private Integer killmailId = null;

    public CharacterKillmailsResponse killmailHash(String killmailHash) {
        this.killmailHash = killmailHash;
        return this;
    }

    /**
     * A hash of this killmail
     * 
     * @return killmailHash
     **/
    @ApiModelProperty(example = "null", required = true, value = "A hash of this killmail")
    public String getKillmailHash() {
        return killmailHash;
    }

    public void setKillmailHash(String killmailHash) {
        this.killmailHash = killmailHash;
    }

    public CharacterKillmailsResponse killmailId(Integer killmailId) {
        this.killmailId = killmailId;
        return this;
    }

    /**
     * ID of this killmail
     * 
     * @return killmailId
     **/
    @ApiModelProperty(example = "null", required = true, value = "ID of this killmail")
    public Integer getKillmailId() {
        return killmailId;
    }

    public void setKillmailId(Integer killmailId) {
        this.killmailId = killmailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterKillmailsResponse characterKillmailsResponse = (CharacterKillmailsResponse) o;
        return Objects.equals(this.killmailHash, characterKillmailsResponse.killmailHash)
                && Objects.equals(this.killmailId, characterKillmailsResponse.killmailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(killmailHash, killmailId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterKillmailsResponse {\n");

        sb.append("    killmailHash: ").append(toIndentedString(killmailHash)).append("\n");
        sb.append("    killmailId: ").append(toIndentedString(killmailId)).append("\n");
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
