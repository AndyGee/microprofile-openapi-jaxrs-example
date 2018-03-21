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
package org.example.microprofile.api.beans.plans;

import java.io.Serializable;
import java.util.Date;

/**
 * Models a single version of a plan "version".  Every plan in
 * APIMan has basic meta-data stored in {@link PlanBean}.  All
 * other specifics of the plan, such as endpoint information
 * and configured policies are associated with a particular version
 * of that Plan.  This class represents that version.
 *
 * @author eric.wittmann@redhat.com
 */
public class PlanVersionBean implements Serializable {

    private static final long serialVersionUID = -2218697175049442690L;

    private Long id;
    private PlanBean plan;
    private PlanStatus status;
    private String version;
    private String createdBy;
    private Date createdOn;
    private String modifiedBy;
    private Date modifiedOn;
    private Date lockedOn;

    /**
     * Constructor.
     */
    public PlanVersionBean() {
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
     * @return the plan
     */
    public PlanBean getPlan() {
        return plan;
    }

    /**
     * @param plan the plan to set
     */
    public void setPlan(PlanBean plan) {
        this.plan = plan;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
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
     * @return the status
     */
    public PlanStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(PlanStatus status) {
        this.status = status;
    }

    /**
     * @return the lockedOn
     */
    public Date getLockedOn() {
        return lockedOn;
    }

    /**
     * @param lockedOn the lockedOn to set
     */
    public void setLockedOn(Date lockedOn) {
        this.lockedOn = lockedOn;
    }

    /**
     * @return the modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * @param modifiedBy the modifiedBy to set
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * @return the modifiedOn
     */
    public Date getModifiedOn() {
        return modifiedOn;
    }

    /**
     * @param modifiedOn the modifiedOn to set
     */
    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

}
