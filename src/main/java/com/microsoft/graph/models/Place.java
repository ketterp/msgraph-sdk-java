// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.PhysicalAddress;
import com.microsoft.graph.models.OutlookGeoCoordinates;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Place.
 */
public class Place extends Entity implements IJsonBackedObject {


    /**
     * The Address.
     * The street address of the place.
     */
    @SerializedName(value = "address", alternate = {"Address"})
    @Expose
	@Nullable
    public PhysicalAddress address;

    /**
     * The Display Name.
     * The name associated with the place.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Geo Coordinates.
     * Specifies the place location in latitude, longitude and (optionally) altitude coordinates.
     */
    @SerializedName(value = "geoCoordinates", alternate = {"GeoCoordinates"})
    @Expose
	@Nullable
    public OutlookGeoCoordinates geoCoordinates;

    /**
     * The Phone.
     * The phone number of the place.
     */
    @SerializedName(value = "phone", alternate = {"Phone"})
    @Expose
	@Nullable
    public String phone;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
