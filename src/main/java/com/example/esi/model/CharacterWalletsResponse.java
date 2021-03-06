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
public class CharacterWalletsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("balance")
    private Long balance = null;

    @JsonProperty("wallet_id")
    private Integer walletId = null;

    public CharacterWalletsResponse balance(Long balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Wallet's balance in ISK hundredths.
     * 
     * @return balance
     **/
    @ApiModelProperty(example = "null", value = "Wallet's balance in ISK hundredths.")
    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public CharacterWalletsResponse walletId(Integer walletId) {
        this.walletId = walletId;
        return this;
    }

    /**
     * wallet_id integer
     * 
     * @return walletId
     **/
    @ApiModelProperty(example = "null", value = "wallet_id integer")
    public Integer getWalletId() {
        return walletId;
    }

    public void setWalletId(Integer walletId) {
        this.walletId = walletId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterWalletsResponse characterWalletsResponse = (CharacterWalletsResponse) o;
        return Objects.equals(this.balance, characterWalletsResponse.balance)
                && Objects.equals(this.walletId, characterWalletsResponse.walletId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, walletId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterWalletsResponse {\n");

        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
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
