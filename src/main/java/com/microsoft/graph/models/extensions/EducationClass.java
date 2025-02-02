// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.EducationCourse;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.generated.EducationExternalSource;
import com.microsoft.graph.models.extensions.EducationTerm;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EducationUserCollectionPage;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Class.
 */
public class EducationClass extends Entity implements IJsonBackedObject {


    /**
     * The Class Code.
     * Class code used by the school to identify the class.
     */
    @SerializedName(value = "classCode", alternate = {"ClassCode"})
    @Expose
    public String classCode;

    /**
     * The Course.
     * Course information for the class
     */
    @SerializedName(value = "course", alternate = {"Course"})
    @Expose
    public EducationCourse course;

    /**
     * The Created By.
     * Entity who created the class
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
    public IdentitySet createdBy;

    /**
     * The Description.
     * Description of the class.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * Name of the class.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The External Id.
     * ID of the class from the syncing system.
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
    public String externalId;

    /**
     * The External Name.
     * Name of the class in the syncing system.
     */
    @SerializedName(value = "externalName", alternate = {"ExternalName"})
    @Expose
    public String externalName;

    /**
     * The External Source.
     * The type of external source this resource was generated from (automatically determined from externalSourceDetail). Possible values are: sis, lms, or manual.
     */
    @SerializedName(value = "externalSource", alternate = {"ExternalSource"})
    @Expose
    public EducationExternalSource externalSource;

    /**
     * The External Source Detail.
     * The name of the external source this resources was generated from.
     */
    @SerializedName(value = "externalSourceDetail", alternate = {"ExternalSourceDetail"})
    @Expose
    public String externalSourceDetail;

    /**
     * The Grade.
     * Grade level of the class.
     */
    @SerializedName(value = "grade", alternate = {"Grade"})
    @Expose
    public String grade;

    /**
     * The Mail Nickname.
     * Mail name for sending email to all members, if this is enabled.
     */
    @SerializedName(value = "mailNickname", alternate = {"MailNickname"})
    @Expose
    public String mailNickname;

    /**
     * The Term.
     * Term for the class.
     */
    @SerializedName(value = "term", alternate = {"Term"})
    @Expose
    public EducationTerm term;

    /**
     * The Group.
     * The directory group corresponding to this class.
     */
    @SerializedName(value = "group", alternate = {"Group"})
    @Expose
    public Group group;

    /**
     * The Members.
     * All users in the class. Nullable.
     */
    public EducationUserCollectionPage members;

    /**
     * The Schools.
     * All schools that this class is associated with. Nullable.
     */
    public EducationSchoolCollectionPage schools;

    /**
     * The Teachers.
     * All teachers in the class. Nullable.
     */
    public EducationUserCollectionPage teachers;


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


        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members").toString(), EducationUserCollectionPage.class);
        }

        if (json.has("schools")) {
            schools = serializer.deserializeObject(json.get("schools").toString(), EducationSchoolCollectionPage.class);
        }

        if (json.has("teachers")) {
            teachers = serializer.deserializeObject(json.get("teachers").toString(), EducationUserCollectionPage.class);
        }
    }
}
