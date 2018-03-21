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
package org.example.microprofile.api.beans.contracts;

import java.io.Serializable;
import java.util.Date;

import org.example.microprofile.api.beans.apis.ApiVersionBean;
import org.example.microprofile.api.beans.clients.ClientVersionBean;
import org.example.microprofile.api.beans.plans.PlanVersionBean;

/**
 * A Contract links a client version to a API version through
 * a plan version.  :)
 *
 * This is how client owners/developers configure their client
 * to allow it to invoke managed APIs.
 *
 * @author eric.wittmann@redhat.com
 */
public class ContractBean implements Serializable {

    private static final long serialVersionUID = -8534463608508756791L;

    private Long id;
    private ClientVersionBean client;
    private ApiVersionBean api;
    private PlanVersionBean plan;
    private String createdBy;
    private Date createdOn;

    /**
     * Constructor.
     */
    public ContractBean() {
    }

    /**
     * @return the client
     */
    public ClientVersionBean getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(ClientVersionBean client) {
        this.client = client;
    }

    /**
     * @return the api
     */
    public ApiVersionBean getApi() {
        return api;
    }

    /**
     * @param api the api to set
     */
    public void setApi(ApiVersionBean api) {
        this.api = api;
    }

    /**
     * @return the plan
     */
    public PlanVersionBean getPlan() {
        return plan;
    }

    /**
     * @param plan the plan to set
     */
    public void setPlan(PlanVersionBean plan) {
        this.plan = plan;
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
    
}
