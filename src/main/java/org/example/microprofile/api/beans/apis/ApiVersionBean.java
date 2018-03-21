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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Models a single version of an API. Every API in APIMan has basic meta-data
 * stored in {@link ApiBean}. All other specifics of the API, such as
 * endpoint information and configured policies are associated with a particular
 * version of that API. This class represents that version.
 *
 * @author eric.wittmann@redhat.com
 */
public class ApiVersionBean implements Serializable {

    private static final long serialVersionUID = -2218697175049442690L;

    private Long id;
    private ApiBean api;
    private ApiStatus status;
    private String endpoint;
    private EndpointType endpointType;
    private EndpointContentType endpointContentType;
    private Map<String, String> endpointProperties = new HashMap<>();
    private Set<ApiGatewayBean> gateways;
    private boolean publicAPI;
    private Set<ApiPlanBean> plans;
    private String version;
    private String createdBy;
    private Date createdOn;
    private String modifiedBy;
    private Date modifiedOn;
    private Date publishedOn;
    private Date retiredOn;
    private ApiDefinitionType definitionType;
    private ApiDefinitionBean definition;
    private boolean parsePayload;

    /**
     * Constructor.
     */
    public ApiVersionBean() {
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
     * @return the api
     */
    public ApiBean getApi() {
        return api;
    }

    /**
     * @param api the api to set
     */
    public void setApi(ApiBean api) {
        this.api = api;
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
    public ApiStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(ApiStatus status) {
        this.status = status;
    }

    /**
     * @return the endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * @param endpoint the endpoint to set
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * @return the endpointType
     */
    public EndpointType getEndpointType() {
        return endpointType;
    }

    /**
     * @param endpointType the endpointType to set
     */
    public void setEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * @return the endpointContentType
     */
    public EndpointContentType getEndpointContentType() {
        return endpointContentType;
    }

    /**
     * @param endpointContentType the endpointContentType to set
     */
    public void setEndpointContentType(EndpointContentType endpointContentType) {
        this.endpointContentType = endpointContentType;
    }

    /**
     * @return the publishedOn
     */
    public Date getPublishedOn() {
        return publishedOn;
    }

    /**
     * @param publishedOn the publishedOn to set
     */
    public void setPublishedOn(Date publishedOn) {
        this.publishedOn = publishedOn;
    }

    /**
     * @return the retiredOn
     */
    public Date getRetiredOn() {
        return retiredOn;
    }

    /**
     * @param retiredOn the retiredOn to set
     */
    public void setRetiredOn(Date retiredOn) {
        this.retiredOn = retiredOn;
    }

    /**
     * @return the plans
     */
    public Set<ApiPlanBean> getPlans() {
        return plans;
    }

    /**
     * @param plans the plans to set
     */
    public void setPlans(Set<ApiPlanBean> plans) {
        this.plans = plans;
    }

    /**
     * @return the gateways
     */
    public Set<ApiGatewayBean> getGateways() {
        return gateways;
    }

    /**
     * @param gateways the gateways to set
     */
    public void setGateways(Set<ApiGatewayBean> gateways) {
        this.gateways = gateways;
    }

    /**
     * @param plan the plan
     */
    public void addPlan(ApiPlanBean plan) {
        this.plans.add(plan);
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
     * @return the publicAPI
     */
    public boolean isPublicAPI() {
        return publicAPI;
    }

    /**
     * @param publicAPI the publicAPI to set
     */
    public void setPublicAPI(boolean publicAPI) {
        this.publicAPI = publicAPI;
    }

    /**
     * @return the definitionType
     */
    public ApiDefinitionType getDefinitionType() {
        return definitionType;
    }

    /**
     * @param definitionType the definitionType to set
     */
    public void setDefinitionType(ApiDefinitionType definitionType) {
        this.definitionType = definitionType;
    }

    /**
     * @return the endpointProperties
     */
    public Map<String, String> getEndpointProperties() {
        return endpointProperties;
    }

    /**
     * @param endpointProperties the endpointProperties to set
     */
    public void setEndpointProperties(Map<String, String> endpointProperties) {
        this.endpointProperties = endpointProperties;
    }

    /**
     * @return the parsePayload
     */
    public boolean isParsePayload() {
        return parsePayload;
    }

    /**
     * @param parsePayload the parsePayload to set
     */
    public void setParsePayload(boolean parsePayload) {
        this.parsePayload = parsePayload;
    }

    /**
     * @return the definition
     */
    public ApiDefinitionBean getDefinition() {
        return definition;
    }

    /**
     * @param definition the definition to set
     */
    public void setDefinition(ApiDefinitionBean definition) {
        this.definition = definition;
    }

}
