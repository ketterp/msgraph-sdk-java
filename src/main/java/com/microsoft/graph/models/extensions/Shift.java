// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ShiftItem;
import com.microsoft.graph.models.extensions.ChangeTrackedEntity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shift.
 */
public class Shift extends ChangeTrackedEntity implements IJsonBackedObject {


    /**
     * The Draft Shift.
     * The draft version of this shift that is viewable by managers. Required.
     */
    @SerializedName(value = "draftShift", alternate = {"DraftShift"})
    @Expose
    public ShiftItem draftShift;

    /**
     * The Scheduling Group Id.
     * ID of the scheduling group the shift is part of. Required.
     */
    @SerializedName(value = "schedulingGroupId", alternate = {"SchedulingGroupId"})
    @Expose
    public String schedulingGroupId;

    /**
     * The Shared Shift.
     * The shared version of this shift that is viewable by both employees and managers. Required.
     */
    @SerializedName(value = "sharedShift", alternate = {"SharedShift"})
    @Expose
    public ShiftItem sharedShift;

    /**
     * The User Id.
     * ID of the user assigned to the shift. Required.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
    public String userId;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
