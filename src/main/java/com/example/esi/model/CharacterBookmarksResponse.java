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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterBookmarksResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("bookmark_id")
    private Long bookmarkId = null;

    @JsonProperty("create_date")
    private OffsetDateTime createDate = null;

    @JsonProperty("creator_id")
    private Integer creatorId = null;

    @JsonProperty("folder_id")
    private Integer folderId = null;

    @JsonProperty("memo")
    private String memo = null;

    @JsonProperty("note")
    private String note = null;

    @JsonProperty("owner_id")
    private Integer ownerId = null;

    @JsonProperty("target")
    private BookmarkTarget target = null;

    public CharacterBookmarksResponse bookmarkId(Long bookmarkId) {
        this.bookmarkId = bookmarkId;
        return this;
    }

    /**
     * bookmark_id integer
     * 
     * @return bookmarkId
     **/
    @ApiModelProperty(example = "null", required = true, value = "bookmark_id integer")
    public Long getBookmarkId() {
        return bookmarkId;
    }

    public void setBookmarkId(Long bookmarkId) {
        this.bookmarkId = bookmarkId;
    }

    public CharacterBookmarksResponse createDate(OffsetDateTime createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * create_date string
     * 
     * @return createDate
     **/
    @ApiModelProperty(example = "null", required = true, value = "create_date string")
    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public CharacterBookmarksResponse creatorId(Integer creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * creator_id integer
     * 
     * @return creatorId
     **/
    @ApiModelProperty(example = "null", required = true, value = "creator_id integer")
    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public CharacterBookmarksResponse folderId(Integer folderId) {
        this.folderId = folderId;
        return this;
    }

    /**
     * folder_id integer
     * 
     * @return folderId
     **/
    @ApiModelProperty(example = "null", value = "folder_id integer")
    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public CharacterBookmarksResponse memo(String memo) {
        this.memo = memo;
        return this;
    }

    /**
     * memo string
     * 
     * @return memo
     **/
    @ApiModelProperty(example = "null", required = true, value = "memo string")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public CharacterBookmarksResponse note(String note) {
        this.note = note;
        return this;
    }

    /**
     * note string
     * 
     * @return note
     **/
    @ApiModelProperty(example = "null", required = true, value = "note string")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public CharacterBookmarksResponse ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * owner_id integer
     * 
     * @return ownerId
     **/
    @ApiModelProperty(example = "null", required = true, value = "owner_id integer")
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public CharacterBookmarksResponse target(BookmarkTarget target) {
        this.target = target;
        return this;
    }

    /**
     * Get target
     * 
     * @return target
     **/
    @ApiModelProperty(example = "null", value = "")
    public BookmarkTarget getTarget() {
        return target;
    }

    public void setTarget(BookmarkTarget target) {
        this.target = target;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterBookmarksResponse characterBookmarksResponse = (CharacterBookmarksResponse) o;
        return Objects.equals(this.bookmarkId, characterBookmarksResponse.bookmarkId)
                && Objects.equals(this.createDate, characterBookmarksResponse.createDate)
                && Objects.equals(this.creatorId, characterBookmarksResponse.creatorId)
                && Objects.equals(this.folderId, characterBookmarksResponse.folderId)
                && Objects.equals(this.memo, characterBookmarksResponse.memo)
                && Objects.equals(this.note, characterBookmarksResponse.note)
                && Objects.equals(this.ownerId, characterBookmarksResponse.ownerId)
                && Objects.equals(this.target, characterBookmarksResponse.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookmarkId, createDate, creatorId, folderId, memo, note, ownerId, target);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterBookmarksResponse {\n");

        sb.append("    bookmarkId: ").append(toIndentedString(bookmarkId)).append("\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
