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
package org.example.microprofile.api.beans.audit;

import java.io.Serializable;
import java.util.Date;

/**
 * A single audit entry - these are created whenever something interesting
 * happens to an entity in the management layer.  For example, when the
 * implementation of an API is changed, an AuditEntry would be created
 * to indicate:
 *
 * 1) who made the change
 * 2) when the change was made
 * 3) what changed
 * 4) the old value
 * 5) the new value
 *
 * @author eric.wittmann@redhat.com
 */
public class AuditEntryBean implements Serializable {

    private static final long serialVersionUID = -2523995385388505492L;

    private Long id;
    private String who;
    private String organizationId;
    private AuditEntityType entityType;
    private String entityId;
    private String entityVersion;
    private Date createdOn;
    private AuditEntryType what;
    private String data;

    /**
     * Constructor.
     */
    public AuditEntryBean() {
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the who
     */
    public String getWho() {
        return who;
    }

    /**
     * @param who the who to set
     */
    public void setWho(String who) {
        this.who = who;
    }

    /**
     * @return the organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * @param organizationId the organizationId to set
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * @return the entityType
     */
    public AuditEntityType getEntityType() {
        return entityType;
    }

    /**
     * @param entityType the entityType to set
     */
    public void setEntityType(AuditEntityType entityType) {
        this.entityType = entityType;
    }

    /**
     * @return the entityId
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * @param entityId the entityId to set
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * @return the entityVersion
     */
    public String getEntityVersion() {
        return entityVersion;
    }

    /**
     * @param entityVersion the entityVersion to set
     */
    public void setEntityVersion(String entityVersion) {
        this.entityVersion = entityVersion;
    }

    /**
     * @return the type
     */
    public AuditEntryType getWhat() {
        return what;
    }

    /**
     * @param what the type to set
     */
    public void setWhat(AuditEntryType what) {
        this.what = what;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
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

}
