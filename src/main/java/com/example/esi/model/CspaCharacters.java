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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * characters schema
 */
@ApiModel(description = "characters schema")
public class CspaCharacters implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("characters")
    private List<Integer> characters = new ArrayList<Integer>();

    public CspaCharacters characters(List<Integer> characters) {
        this.characters = characters;
        return this;
    }

    public CspaCharacters addCharactersItem(Integer charactersItem) {
        this.characters.add(charactersItem);
        return this;
    }

    /**
     * characters array
     * 
     * @return characters
     **/
    @ApiModelProperty(example = "null", required = true, value = "characters array")
    public List<Integer> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Integer> characters) {
        this.characters = characters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CspaCharacters cspaCharacters = (CspaCharacters) o;
        return Objects.equals(this.characters, cspaCharacters.characters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CspaCharacters {\n");

        sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
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
