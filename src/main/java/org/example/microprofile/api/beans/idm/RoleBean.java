/*
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.example.microprofile.api.beans.idm;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * A role definition.  The definition of the role determines whether the
 * role is automatically granted to the user creating an org, as well as
 * the specific permissions granted to users who are members of organizations
 * via the role.
 *
 * @author eric.wittmann@redhat.com
 */
public class RoleBean implements Serializable {

    private static final long serialVersionUID = -646534082583069712L;

    private String id;
    private String name;
    private String description;
    private String createdBy;
    private Date createdOn;
    private Boolean autoGrant = Boolean.FALSE;
    private Set<PermissionType> permissions;

    /**
     * Constructor.
     */
    public RoleBean() {
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the permissions
     */
    public Set<PermissionType> getPermissions() {
        return permissions;
    }

    /**
     * @param permissions the permissions to set
     */
    public void setPermissions(Set<PermissionType> permissions) {
        this.permissions = permissions;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return the createdOn
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * @param createdOn the createdOn to set
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * @return the autoGrant
     */
    public Boolean getAutoGrant() {
        return autoGrant;
    }

    /**
     * @param autoGrant the autoGrant to set
     */
    public void setAutoGrant(Boolean autoGrant) {
        this.autoGrant = autoGrant;
    }

}
