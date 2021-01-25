// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.WorkbookIcon;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Criteria.
 */
public class WorkbookFilterCriteria implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Color.
     * 
     */
    @SerializedName(value = "color", alternate = {"Color"})
    @Expose
	@Nullable
    public String color;

    /**
     * The Criterion1.
     * 
     */
    @SerializedName(value = "criterion1", alternate = {"Criterion1"})
    @Expose
	@Nullable
    public String criterion1;

    /**
     * The Criterion2.
     * 
     */
    @SerializedName(value = "criterion2", alternate = {"Criterion2"})
    @Expose
	@Nullable
    public String criterion2;

    /**
     * The Dynamic Criteria.
     * 
     */
    @SerializedName(value = "dynamicCriteria", alternate = {"DynamicCriteria"})
    @Expose
	@Nullable
    public String dynamicCriteria;

    /**
     * The Filter On.
     * 
     */
    @SerializedName(value = "filterOn", alternate = {"FilterOn"})
    @Expose
	@Nullable
    public String filterOn;

    /**
     * The Icon.
     * 
     */
    @SerializedName(value = "icon", alternate = {"Icon"})
    @Expose
	@Nullable
    public WorkbookIcon icon;

    /**
     * The Operator.
     * 
     */
    @SerializedName(value = "operator", alternate = {"Operator"})
    @Expose
	@Nullable
    public String operator;

    /**
     * The Values.
     * 
     */
    @SerializedName(value = "values", alternate = {"Values"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement values;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
