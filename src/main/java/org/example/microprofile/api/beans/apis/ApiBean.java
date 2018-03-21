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
package org.example.microprofile.api.beans.apis;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.example.microprofile.api.beans.orgs.OrganizationBean;

/**
 * Models an API.
 *
 * @author eric.wittmann@redhat.com
 */
public class ApiBean implements Serializable {

    private static final long serialVersionUID = 1526742536153467539L;

    private OrganizationBean organization;
    private String id;
    private String name;
    private String description;
    private String createdBy;
    private Date createdOn;
    private Integer numPublished;
    private Set<ApiVersionBean> versions = new LinkedHashSet<>();

    /**
     * Constructor.
     */
    public ApiBean() {
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
     * @return the organization
     */
    public OrganizationBean getOrganization() {
        return organization;
    }

    /**
     * @param organization the organization to set
     */
    public void setOrganization(OrganizationBean organization) {
        this.organization = organization;
    }

    /**
     * @return the numPublished
     */
    public Integer getNumPublished() {
        return numPublished;
    }

    /**
     * @param numPublished the numPublished to set
     */
    public void setNumPublished(Integer numPublished) {
        this.numPublished = numPublished;
    }

    /**
     * @return the versions
     */
    public Set<ApiVersionBean> getVersions() {
        return versions;
    }

    /**
     * @param versions the versions to set
     */
    public void setVersions(Set<ApiVersionBean> versions) {
        this.versions = versions;
    }

}
