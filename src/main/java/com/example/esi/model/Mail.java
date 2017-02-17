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
 * mail schema
 */
@ApiModel(description = "mail schema")
public class Mail implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("approved_cost")
    private Long approvedCost = 0l;

    @JsonProperty("body")
    private String body = null;

    @JsonProperty("recipients")
    private List<Recipient> recipients = new ArrayList<Recipient>();

    @JsonProperty("subject")
    private String subject = null;

    public Mail approvedCost(Long approvedCost) {
        this.approvedCost = approvedCost;
        return this;
    }

    /**
     * approved_cost integer
     * 
     * @return approvedCost
     **/
    @ApiModelProperty(example = "null", value = "approved_cost integer")
    public Long getApprovedCost() {
        return approvedCost;
    }

    public void setApprovedCost(Long approvedCost) {
        this.approvedCost = approvedCost;
    }

    public Mail body(String body) {
        this.body = body;
        return this;
    }

    /**
     * body string
     * 
     * @return body
     **/
    @ApiModelProperty(example = "null", required = true, value = "body string")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Mail recipients(List<Recipient> recipients) {
        this.recipients = recipients;
        return this;
    }

    public Mail addRecipientsItem(Recipient recipientsItem) {
        this.recipients.add(recipientsItem);
        return this;
    }

    /**
     * recipients array
     * 
     * @return recipients
     **/
    @ApiModelProperty(example = "null", required = true, value = "recipients array")
    public List<Recipient> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<Recipient> recipients) {
        this.recipients = recipients;
    }

    public Mail subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * subject string
     * 
     * @return subject
     **/
    @ApiModelProperty(example = "null", required = true, value = "subject string")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Mail mail = (Mail) o;
        return Objects.equals(this.approvedCost, mail.approvedCost) && Objects.equals(this.body, mail.body)
                && Objects.equals(this.recipients, mail.recipients) && Objects.equals(this.subject, mail.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvedCost, body, recipients, subject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Mail {\n");

        sb.append("    approvedCost: ").append(toIndentedString(approvedCost)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
