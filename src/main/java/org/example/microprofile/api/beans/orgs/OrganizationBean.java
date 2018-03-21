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
package org.example.microprofile.api.beans.orgs;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.example.microprofile.api.beans.apis.ApiBean;
import org.example.microprofile.api.beans.clients.ClientBean;
import org.example.microprofile.api.beans.plans.PlanBean;

/**
 * An APIMan Organization.  This is an important top level entity in the APIMan
 * data model.  It contains the APIs, Plans, etc.
 *
 * @author eric.wittmann@redhat.com
 */
public class OrganizationBean implements Serializable {

    private static final long serialVersionUID = -506427154633682906L;

    private String id;
    private String name;
    private String description;
    private String createdBy;
    private Date createdOn;
    private String modifiedBy;
    private Date modifiedOn;
    private Set<PlanBean> plans = new LinkedHashSet<>();
    private Set<ApiBean> apis = new LinkedHashSet<>();
    private Set<ClientBean> clients = new LinkedHashSet<>();

    /**
     * Constructor.
     */
    public OrganizationBean() {
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

    /**
     * @return the plans
     */
    public Set<PlanBean> getPlans() {
        return plans;
    }

    /**
     * @param plans the plans to set
     */
    public void setPlans(Set<PlanBean> plans) {
        this.plans = plans;
    }

    /**
     * @return the apis
     */
    public Set<ApiBean> getApis() {
        return apis;
    }

    /**
     * @param apis the apis to set
     */
    public void setApis(Set<ApiBean> apis) {
        this.apis = apis;
    }

    /**
     * @return the clients
     */
    public Set<ClientBean> getClients() {
        return clients;
    }

    /**
     * @param clients the clients to set
     */
    public void setClients(Set<ClientBean> clients) {
        this.clients = clients;
    }
}
