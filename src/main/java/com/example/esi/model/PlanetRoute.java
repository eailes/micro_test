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
 * route object
 */
@ApiModel(description = "route object")
public class PlanetRoute implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("content_type_id")
    private Integer contentTypeId = null;

    @JsonProperty("destination_pin_id")
    private Long destinationPinId = null;

    @JsonProperty("quantity")
    private Long quantity = null;

    @JsonProperty("route_id")
    private Long routeId = null;

    @JsonProperty("source_pin_id")
    private Long sourcePinId = null;

    @JsonProperty("waypoints")
    private List<PlanetWaypoint> waypoints = new ArrayList<PlanetWaypoint>();

    public PlanetRoute contentTypeId(Integer contentTypeId) {
        this.contentTypeId = contentTypeId;
        return this;
    }

    /**
     * content_type_id integer
     * 
     * @return contentTypeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "content_type_id integer")
    public Integer getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(Integer contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public PlanetRoute destinationPinId(Long destinationPinId) {
        this.destinationPinId = destinationPinId;
        return this;
    }

    /**
     * destination_pin_id integer
     * 
     * @return destinationPinId
     **/
    @ApiModelProperty(example = "null", required = true, value = "destination_pin_id integer")
    public Long getDestinationPinId() {
        return destinationPinId;
    }

    public void setDestinationPinId(Long destinationPinId) {
        this.destinationPinId = destinationPinId;
    }

    public PlanetRoute quantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * quantity integer
     * 
     * @return quantity
     **/
    @ApiModelProperty(example = "null", required = true, value = "quantity integer")
    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public PlanetRoute routeId(Long routeId) {
        this.routeId = routeId;
        return this;
    }

    /**
     * route_id integer
     * 
     * @return routeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "route_id integer")
    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public PlanetRoute sourcePinId(Long sourcePinId) {
        this.sourcePinId = sourcePinId;
        return this;
    }

    /**
     * source_pin_id integer
     * 
     * @return sourcePinId
     **/
    @ApiModelProperty(example = "null", required = true, value = "source_pin_id integer")
    public Long getSourcePinId() {
        return sourcePinId;
    }

    public void setSourcePinId(Long sourcePinId) {
        this.sourcePinId = sourcePinId;
    }

    public PlanetRoute waypoints(List<PlanetWaypoint> waypoints) {
        this.waypoints = waypoints;
        return this;
    }

    public PlanetRoute addWaypointsItem(PlanetWaypoint waypointsItem) {
        this.waypoints.add(waypointsItem);
        return this;
    }

    /**
     * waypoints array
     * 
     * @return waypoints
     **/
    @ApiModelProperty(example = "null", value = "waypoints array")
    public List<PlanetWaypoint> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(List<PlanetWaypoint> waypoints) {
        this.waypoints = waypoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanetRoute planetRoute = (PlanetRoute) o;
        return Objects.equals(this.contentTypeId, planetRoute.contentTypeId)
                && Objects.equals(this.destinationPinId, planetRoute.destinationPinId)
                && Objects.equals(this.quantity, planetRoute.quantity)
                && Objects.equals(this.routeId, planetRoute.routeId)
                && Objects.equals(this.sourcePinId, planetRoute.sourcePinId)
                && Objects.equals(this.waypoints, planetRoute.waypoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentTypeId, destinationPinId, quantity, routeId, sourcePinId, waypoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanetRoute {\n");

        sb.append("    contentTypeId: ").append(toIndentedString(contentTypeId)).append("\n");
        sb.append("    destinationPinId: ").append(toIndentedString(destinationPinId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
        sb.append("    sourcePinId: ").append(toIndentedString(sourcePinId)).append("\n");
        sb.append("    waypoints: ").append(toIndentedString(waypoints)).append("\n");
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