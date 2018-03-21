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

/**
 * The bean used to create a new contract.
 *
 * @author eric.wittmann@redhat.com
 */
public class NewContractBean implements Serializable {

    private static final long serialVersionUID = -2326957716478467884L;

    private String apiOrgId;
    private String apiId;
    private String apiVersion;

    private String planId;

    /**
     * Constructor.
     */
    public NewContractBean() {
    }

    /**
     * @return the apiOrgId
     */
    public String getApiOrgId() {
        return apiOrgId;
    }

    /**
     * @param apiOrgId the apiOrgId to set
     */
    public void setApiOrgId(String apiOrgId) {
        this.apiOrgId = apiOrgId;
    }

    /**
     * @return the apiId
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * @param apiId the apiId to set
     */
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * @return the apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * @param apiVersion the apiVersion to set
     */
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * @return the planId
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * @param planId the planId to set
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

}
