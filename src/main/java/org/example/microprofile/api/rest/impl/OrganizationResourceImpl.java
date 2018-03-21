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

package org.example.microprofile.api.rest.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.example.microprofile.api.beans.apis.ApiBean;
import org.example.microprofile.api.beans.apis.ApiVersionBean;
import org.example.microprofile.api.beans.apis.ApiVersionStatusBean;
import org.example.microprofile.api.beans.apis.NewApiBean;
import org.example.microprofile.api.beans.apis.NewApiDefinitionBean;
import org.example.microprofile.api.beans.apis.NewApiVersionBean;
import org.example.microprofile.api.beans.apis.UpdateApiBean;
import org.example.microprofile.api.beans.apis.UpdateApiVersionBean;
import org.example.microprofile.api.beans.audit.AuditEntryBean;
import org.example.microprofile.api.beans.clients.ApiKeyBean;
import org.example.microprofile.api.beans.clients.ClientBean;
import org.example.microprofile.api.beans.clients.ClientVersionBean;
import org.example.microprofile.api.beans.clients.NewClientBean;
import org.example.microprofile.api.beans.clients.NewClientVersionBean;
import org.example.microprofile.api.beans.clients.UpdateClientBean;
import org.example.microprofile.api.beans.contracts.ContractBean;
import org.example.microprofile.api.beans.contracts.NewContractBean;
import org.example.microprofile.api.beans.idm.GrantRolesBean;
import org.example.microprofile.api.beans.members.MemberBean;
import org.example.microprofile.api.beans.metrics.ClientUsagePerApiBean;
import org.example.microprofile.api.beans.metrics.HistogramIntervalType;
import org.example.microprofile.api.beans.metrics.ResponseStatsHistogramBean;
import org.example.microprofile.api.beans.metrics.ResponseStatsPerClientBean;
import org.example.microprofile.api.beans.metrics.ResponseStatsPerPlanBean;
import org.example.microprofile.api.beans.metrics.ResponseStatsSummaryBean;
import org.example.microprofile.api.beans.metrics.UsageHistogramBean;
import org.example.microprofile.api.beans.metrics.UsagePerClientBean;
import org.example.microprofile.api.beans.metrics.UsagePerPlanBean;
import org.example.microprofile.api.beans.orgs.NewOrganizationBean;
import org.example.microprofile.api.beans.orgs.OrganizationBean;
import org.example.microprofile.api.beans.orgs.UpdateOrganizationBean;
import org.example.microprofile.api.beans.plans.NewPlanBean;
import org.example.microprofile.api.beans.plans.NewPlanVersionBean;
import org.example.microprofile.api.beans.plans.PlanBean;
import org.example.microprofile.api.beans.plans.PlanVersionBean;
import org.example.microprofile.api.beans.plans.UpdatePlanBean;
import org.example.microprofile.api.beans.policies.NewPolicyBean;
import org.example.microprofile.api.beans.policies.PolicyBean;
import org.example.microprofile.api.beans.policies.PolicyChainBean;
import org.example.microprofile.api.beans.policies.UpdatePolicyBean;
import org.example.microprofile.api.beans.search.SearchResultsBean;
import org.example.microprofile.api.beans.summary.ApiPlanSummaryBean;
import org.example.microprofile.api.beans.summary.ApiSummaryBean;
import org.example.microprofile.api.beans.summary.ApiVersionEndpointSummaryBean;
import org.example.microprofile.api.beans.summary.ApiVersionSummaryBean;
import org.example.microprofile.api.beans.summary.ClientSummaryBean;
import org.example.microprofile.api.beans.summary.ClientVersionSummaryBean;
import org.example.microprofile.api.beans.summary.ContractSummaryBean;
import org.example.microprofile.api.beans.summary.PlanSummaryBean;
import org.example.microprofile.api.beans.summary.PlanVersionSummaryBean;
import org.example.microprofile.api.beans.summary.PolicySummaryBean;
import org.example.microprofile.api.rest.contract.IOrganizationResource;
import org.example.microprofile.api.rest.contract.exceptions.ApiAlreadyExistsException;
import org.example.microprofile.api.rest.contract.exceptions.ApiNotFoundException;
import org.example.microprofile.api.rest.contract.exceptions.ApiVersionAlreadyExistsException;
import org.example.microprofile.api.rest.contract.exceptions.ApiVersionNotFoundException;
import org.example.microprofile.api.rest.contract.exceptions.ClientAlreadyExistsException;
import org.example.microprofile.api.rest.contract.exceptions.ClientNotFoundException;
import org.example.microprofile.api.rest.contract.exceptions.ClientVersionAlreadyExistsException;
import org.example.microprofile.api.rest.contract.exceptions.ClientVersionNotFoundException;
import org.example.microprofile.api.rest.contract.exceptions.ContractAlreadyExistsException;
import org.example.microprofile.api.rest.contract.exceptions.ContractNotFoundException;
import org.example.microprofile.api.rest.contract.exceptions.EntityStillActiveException;
import org.example.microprofile.api.rest.contract.exceptions.GatewayNotFoundException;
import org.example.microprofile.api.rest.contract.exceptions.InvalidApiStatusException;
import org.example.microprofile.api.rest.contract.exceptions.InvalidClientStatusException;
import org.example.microprofile.api.rest.contract.exceptions.InvalidMetricCriteriaException;
import org.example.microprofile.api.rest.contract.exceptions.InvalidNameException;
import org.example.microprofile.api.rest.contract.exceptions.InvalidPlanStatusException;
import org.example.microprofile.api.rest.contract.exceptions.InvalidVersionException;
import org.example.microprofile.api.rest.contract.exceptions.NotAuthorizedException;
import org.example.microprofile.api.rest.contract.exceptions.OrganizationAlreadyExistsException;
import org.example.microprofile.api.rest.contract.exceptions.OrganizationNotFoundException;
import org.example.microprofile.api.rest.contract.exceptions.PlanAlreadyExistsException;
import org.example.microprofile.api.rest.contract.exceptions.PlanNotFoundException;
import org.example.microprofile.api.rest.contract.exceptions.PlanVersionAlreadyExistsException;
import org.example.microprofile.api.rest.contract.exceptions.PlanVersionNotFoundException;
import org.example.microprofile.api.rest.contract.exceptions.PolicyNotFoundException;
import org.example.microprofile.api.rest.contract.exceptions.RoleNotFoundException;
import org.example.microprofile.api.rest.contract.exceptions.UserNotFoundException;

/**
 * Implementation of the Organization API.
 *
 * @author eric.wittmann@redhat.com
 */
public class OrganizationResourceImpl implements IOrganizationResource {

    /**
     * Constructor.
     */
    public OrganizationResourceImpl() {
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#create(org.example.microprofile.api.beans.orgs.NewOrganizationBean)
     */
    @Override
    public OrganizationBean create(NewOrganizationBean bean)
            throws OrganizationAlreadyExistsException, NotAuthorizedException, InvalidNameException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#delete(java.lang.String)
     */
    @Override
    public void delete(String organizationId)
            throws OrganizationNotFoundException, NotAuthorizedException, EntityStillActiveException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#deleteClient(java.lang.String, java.lang.String)
     */
    @Override
    public void deleteClient(String organizationId, String clientId)
            throws OrganizationNotFoundException, NotAuthorizedException, EntityStillActiveException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#get(java.lang.String)
     */
    @Override
    public OrganizationBean get(String organizationId)
            throws OrganizationNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#update(java.lang.String, org.example.microprofile.api.beans.orgs.UpdateOrganizationBean)
     */
    @Override
    public void update(String organizationId, UpdateOrganizationBean bean)
            throws OrganizationNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#activity(java.lang.String, int, int)
     */
    @Override
    public SearchResultsBean<AuditEntryBean> activity(String organizationId, int page, int pageSize)
            throws OrganizationNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#createClient(java.lang.String, org.example.microprofile.api.beans.clients.NewClientBean)
     */
    @Override
    public ClientBean createClient(String organizationId, NewClientBean bean)
            throws OrganizationNotFoundException, ClientAlreadyExistsException, NotAuthorizedException,
            InvalidNameException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getClient(java.lang.String, java.lang.String)
     */
    @Override
    public ClientBean getClient(String organizationId, String clientId)
            throws ClientNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getClientActivity(java.lang.String, java.lang.String, int, int)
     */
    @Override
    public SearchResultsBean<AuditEntryBean> getClientActivity(String organizationId, String clientId,
            int page, int pageSize) throws ClientNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#listClients(java.lang.String)
     */
    @Override
    public List<ClientSummaryBean> listClients(String organizationId)
            throws OrganizationNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#updateClient(java.lang.String, java.lang.String, org.example.microprofile.api.beans.clients.UpdateClientBean)
     */
    @Override
    public void updateClient(String organizationId, String clientId, UpdateClientBean bean)
            throws ClientNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#createClientVersion(java.lang.String, java.lang.String, org.example.microprofile.api.beans.clients.NewClientVersionBean)
     */
    @Override
    public ClientVersionBean createClientVersion(String organizationId, String clientId,
            NewClientVersionBean bean) throws ClientNotFoundException, NotAuthorizedException,
            InvalidVersionException, ClientVersionAlreadyExistsException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#updateClientApiKey(java.lang.String, java.lang.String, java.lang.String, org.example.microprofile.api.beans.clients.ApiKeyBean)
     */
    @Override
    public ApiKeyBean updateClientApiKey(String organizationId, String clientId, String version,
            ApiKeyBean bean) throws ClientNotFoundException, NotAuthorizedException, InvalidVersionException,
            InvalidClientStatusException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getClientApiKey(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public ApiKeyBean getClientApiKey(String organizationId, String clientId, String version)
            throws ClientNotFoundException, NotAuthorizedException, InvalidVersionException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#listClientVersions(java.lang.String, java.lang.String)
     */
    @Override
    public List<ClientVersionSummaryBean> listClientVersions(String organizationId, String clientId)
            throws ClientNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getClientVersion(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public ClientVersionBean getClientVersion(String organizationId, String clientId, String version)
            throws ClientVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getClientVersionActivity(java.lang.String, java.lang.String, java.lang.String, int, int)
     */
    @Override
    public SearchResultsBean<AuditEntryBean> getClientVersionActivity(String organizationId, String clientId,
            String version, int page, int pageSize)
            throws ClientVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getClientUsagePerApi(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public ClientUsagePerApiBean getClientUsagePerApi(String organizationId, String clientId, String version,
            String fromDate, String toDate) throws NotAuthorizedException, InvalidMetricCriteriaException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#createContract(java.lang.String, java.lang.String, java.lang.String, org.example.microprofile.api.beans.contracts.NewContractBean)
     */
    @Override
    public ContractBean createContract(String organizationId, String clientId, String version,
            NewContractBean bean)
            throws OrganizationNotFoundException, ClientNotFoundException, ApiNotFoundException,
            PlanNotFoundException, ContractAlreadyExistsException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getContract(java.lang.String, java.lang.String, java.lang.String, java.lang.Long)
     */
    @Override
    public ContractBean getContract(String organizationId, String clientId, String version, Long contractId)
            throws ClientNotFoundException, ContractNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getClientVersionContracts(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public List<ContractSummaryBean> getClientVersionContracts(String organizationId, String clientId,
            String version) throws ClientNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApiRegistryJSON(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public Response getApiRegistryJSON(String organizationId, String clientId, String version,
            String download) throws ClientNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApiRegistryJSON(java.lang.String, java.lang.String, java.lang.String, boolean)
     */
    @Override
    public Response getApiRegistryJSON(String organizationId, String clientId, String version,
            boolean hasPermission) throws ClientNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApiRegistryXML(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public Response getApiRegistryXML(String organizationId, String clientId, String version, String download)
            throws ClientNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApiRegistryXML(java.lang.String, java.lang.String, java.lang.String, boolean)
     */
    @Override
    public Response getApiRegistryXML(String organizationId, String clientId, String version,
            boolean hasPermission) throws ClientNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#deleteAllContracts(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public void deleteAllContracts(String organizationId, String clientId, String version)
            throws ClientNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#deleteContract(java.lang.String, java.lang.String, java.lang.String, java.lang.Long)
     */
    @Override
    public void deleteContract(String organizationId, String clientId, String version, Long contractId)
            throws ClientNotFoundException, ContractNotFoundException, NotAuthorizedException,
            InvalidClientStatusException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#createClientPolicy(java.lang.String, java.lang.String, java.lang.String, org.example.microprofile.api.beans.policies.NewPolicyBean)
     */
    @Override
    public PolicyBean createClientPolicy(String organizationId, String clientId, String version,
            NewPolicyBean bean)
            throws OrganizationNotFoundException, ClientVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getClientPolicy(java.lang.String, java.lang.String, java.lang.String, long)
     */
    @Override
    public PolicyBean getClientPolicy(String organizationId, String clientId, String version, long policyId)
            throws OrganizationNotFoundException, ClientVersionNotFoundException, PolicyNotFoundException,
            NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#updateClientPolicy(java.lang.String, java.lang.String, java.lang.String, long, org.example.microprofile.api.beans.policies.UpdatePolicyBean)
     */
    @Override
    public void updateClientPolicy(String organizationId, String clientId, String version, long policyId,
            UpdatePolicyBean bean) throws OrganizationNotFoundException, ClientVersionNotFoundException,
            PolicyNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#deleteClientPolicy(java.lang.String, java.lang.String, java.lang.String, long)
     */
    @Override
    public void deleteClientPolicy(String organizationId, String clientId, String version, long policyId)
            throws OrganizationNotFoundException, ClientVersionNotFoundException, PolicyNotFoundException,
            NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#listClientPolicies(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public List<PolicySummaryBean> listClientPolicies(String organizationId, String clientId, String version)
            throws OrganizationNotFoundException, ClientVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#reorderClientPolicies(java.lang.String, java.lang.String, java.lang.String, org.example.microprofile.api.beans.policies.PolicyChainBean)
     */
    @Override
    public void reorderClientPolicies(String organizationId, String clientId, String version,
            PolicyChainBean policyChain)
            throws OrganizationNotFoundException, ClientVersionNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#createApi(java.lang.String, org.example.microprofile.api.beans.apis.NewApiBean)
     */
    @Override
    public ApiBean createApi(String organizationId, NewApiBean bean) throws OrganizationNotFoundException,
            ApiAlreadyExistsException, NotAuthorizedException, InvalidNameException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApi(java.lang.String, java.lang.String)
     */
    @Override
    public ApiBean getApi(String organizationId, String apiId)
            throws ApiNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#listApi(java.lang.String)
     */
    @Override
    public List<ApiSummaryBean> listApi(String organizationId)
            throws OrganizationNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#updateApi(java.lang.String, java.lang.String, org.example.microprofile.api.beans.apis.UpdateApiBean)
     */
    @Override
    public void updateApi(String organizationId, String apiId, UpdateApiBean bean)
            throws ApiNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#deleteApi(java.lang.String, java.lang.String)
     */
    @Override
    public void deleteApi(String organizationId, String apiId)
            throws ApiNotFoundException, NotAuthorizedException, InvalidApiStatusException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApiActivity(java.lang.String, java.lang.String, int, int)
     */
    @Override
    public SearchResultsBean<AuditEntryBean> getApiActivity(String organizationId, String apiId, int page,
            int pageSize) throws ApiNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#createApiVersion(java.lang.String, java.lang.String, org.example.microprofile.api.beans.apis.NewApiVersionBean)
     */
    @Override
    public ApiVersionBean createApiVersion(String organizationId, String apiId, NewApiVersionBean bean)
            throws ApiNotFoundException, NotAuthorizedException, InvalidVersionException,
            ApiVersionAlreadyExistsException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#listApiVersions(java.lang.String, java.lang.String)
     */
    @Override
    public List<ApiVersionSummaryBean> listApiVersions(String organizationId, String apiId)
            throws ApiNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApiVersion(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public ApiVersionBean getApiVersion(String organizationId, String apiId, String version)
            throws ApiVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApiVersionStatus(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public ApiVersionStatusBean getApiVersionStatus(String organizationId, String apiId, String version)
            throws ApiVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApiDefinition(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public Response getApiDefinition(String organizationId, String apiId, String version)
            throws ApiVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApiVersionEndpointInfo(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public ApiVersionEndpointSummaryBean getApiVersionEndpointInfo(String organizationId, String apiId,
            String version)
            throws ApiVersionNotFoundException, InvalidApiStatusException, GatewayNotFoundException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#updateApiVersion(java.lang.String, java.lang.String, java.lang.String, org.example.microprofile.api.beans.apis.UpdateApiVersionBean)
     */
    @Override
    public ApiVersionBean updateApiVersion(String organizationId, String apiId, String version,
            UpdateApiVersionBean bean)
            throws ApiVersionNotFoundException, NotAuthorizedException, InvalidApiStatusException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#updateApiDefinition(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public void updateApiDefinition(String organizationId, String apiId, String version)
            throws ApiVersionNotFoundException, NotAuthorizedException, InvalidApiStatusException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#updateApiDefinitionFromURL(java.lang.String, java.lang.String, java.lang.String, org.example.microprofile.api.beans.apis.NewApiDefinitionBean)
     */
    @Override
    public void updateApiDefinitionFromURL(String organizationId, String apiId, String version,
            NewApiDefinitionBean bean)
            throws ApiVersionNotFoundException, NotAuthorizedException, InvalidApiStatusException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApiVersionActivity(java.lang.String, java.lang.String, java.lang.String, int, int)
     */
    @Override
    public SearchResultsBean<AuditEntryBean> getApiVersionActivity(String organizationId, String apiId,
            String version, int page, int pageSize)
            throws ApiVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApiVersionPlans(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public List<ApiPlanSummaryBean> getApiVersionPlans(String organizationId, String apiId, String version)
            throws ApiVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#createApiPolicy(java.lang.String, java.lang.String, java.lang.String, org.example.microprofile.api.beans.policies.NewPolicyBean)
     */
    @Override
    public PolicyBean createApiPolicy(String organizationId, String apiId, String version, NewPolicyBean bean)
            throws OrganizationNotFoundException, ApiVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApiPolicy(java.lang.String, java.lang.String, java.lang.String, long)
     */
    @Override
    public PolicyBean getApiPolicy(String organizationId, String apiId, String version, long policyId)
            throws OrganizationNotFoundException, ApiVersionNotFoundException, PolicyNotFoundException,
            NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#updateApiPolicy(java.lang.String, java.lang.String, java.lang.String, long, org.example.microprofile.api.beans.policies.UpdatePolicyBean)
     */
    @Override
    public void updateApiPolicy(String organizationId, String apiId, String version, long policyId,
            UpdatePolicyBean bean) throws OrganizationNotFoundException, ApiVersionNotFoundException,
            PolicyNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#deleteApiPolicy(java.lang.String, java.lang.String, java.lang.String, long)
     */
    @Override
    public void deleteApiPolicy(String organizationId, String apiId, String version, long policyId)
            throws OrganizationNotFoundException, ApiVersionNotFoundException, PolicyNotFoundException,
            NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#deleteApiDefinition(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public void deleteApiDefinition(String organizationId, String apiId, String version)
            throws OrganizationNotFoundException, ApiVersionNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#listApiPolicies(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public List<PolicySummaryBean> listApiPolicies(String organizationId, String apiId, String version)
            throws OrganizationNotFoundException, ApiVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#reorderApiPolicies(java.lang.String, java.lang.String, java.lang.String, org.example.microprofile.api.beans.policies.PolicyChainBean)
     */
    @Override
    public void reorderApiPolicies(String organizationId, String apiId, String version,
            PolicyChainBean policyChain)
            throws OrganizationNotFoundException, ApiVersionNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApiPolicyChain(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public PolicyChainBean getApiPolicyChain(String organizationId, String apiId, String version,
            String planId) throws ApiVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getApiVersionContracts(java.lang.String, java.lang.String, java.lang.String, int, int)
     */
    @Override
    public List<ContractSummaryBean> getApiVersionContracts(String organizationId, String apiId,
            String version, int page, int pageSize)
            throws ApiVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#createPlan(java.lang.String, org.example.microprofile.api.beans.plans.NewPlanBean)
     */
    @Override
    public PlanBean createPlan(String organizationId, NewPlanBean bean) throws OrganizationNotFoundException,
            PlanAlreadyExistsException, NotAuthorizedException, InvalidNameException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getPlan(java.lang.String, java.lang.String)
     */
    @Override
    public PlanBean getPlan(String organizationId, String planId)
            throws PlanNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getPlanActivity(java.lang.String, java.lang.String, int, int)
     */
    @Override
    public SearchResultsBean<AuditEntryBean> getPlanActivity(String organizationId, String planId, int page,
            int pageSize) throws PlanNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#listPlans(java.lang.String)
     */
    @Override
    public List<PlanSummaryBean> listPlans(String organizationId)
            throws OrganizationNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#updatePlan(java.lang.String, java.lang.String, org.example.microprofile.api.beans.plans.UpdatePlanBean)
     */
    @Override
    public void updatePlan(String organizationId, String planId, UpdatePlanBean bean)
            throws PlanNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#createPlanVersion(java.lang.String, java.lang.String, org.example.microprofile.api.beans.plans.NewPlanVersionBean)
     */
    @Override
    public PlanVersionBean createPlanVersion(String organizationId, String planId, NewPlanVersionBean bean)
            throws PlanNotFoundException, NotAuthorizedException, InvalidVersionException,
            PlanVersionAlreadyExistsException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#listPlanVersions(java.lang.String, java.lang.String)
     */
    @Override
    public List<PlanVersionSummaryBean> listPlanVersions(String organizationId, String planId)
            throws PlanNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getPlanVersion(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public PlanVersionBean getPlanVersion(String organizationId, String planId, String version)
            throws PlanVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getPlanVersionActivity(java.lang.String, java.lang.String, java.lang.String, int, int)
     */
    @Override
    public SearchResultsBean<AuditEntryBean> getPlanVersionActivity(String organizationId, String planId,
            String version, int page, int pageSize)
            throws PlanVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#createPlanPolicy(java.lang.String, java.lang.String, java.lang.String, org.example.microprofile.api.beans.policies.NewPolicyBean)
     */
    @Override
    public PolicyBean createPlanPolicy(String organizationId, String planId, String version,
            NewPolicyBean bean)
            throws OrganizationNotFoundException, PlanVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getPlanPolicy(java.lang.String, java.lang.String, java.lang.String, long)
     */
    @Override
    public PolicyBean getPlanPolicy(String organizationId, String planId, String version, long policyId)
            throws OrganizationNotFoundException, PlanVersionNotFoundException, PolicyNotFoundException,
            NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#updatePlanPolicy(java.lang.String, java.lang.String, java.lang.String, long, org.example.microprofile.api.beans.policies.UpdatePolicyBean)
     */
    @Override
    public void updatePlanPolicy(String organizationId, String planId, String version, long policyId,
            UpdatePolicyBean bean) throws OrganizationNotFoundException, PlanVersionNotFoundException,
            PolicyNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#deletePlanPolicy(java.lang.String, java.lang.String, java.lang.String, long)
     */
    @Override
    public void deletePlanPolicy(String organizationId, String planId, String version, long policyId)
            throws OrganizationNotFoundException, PlanVersionNotFoundException, PolicyNotFoundException,
            NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#deletePlan(java.lang.String, java.lang.String)
     */
    @Override
    public void deletePlan(String organizationId, String planId)
            throws PlanNotFoundException, NotAuthorizedException, InvalidPlanStatusException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#listPlanPolicies(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public List<PolicySummaryBean> listPlanPolicies(String organizationId, String planId, String version)
            throws OrganizationNotFoundException, PlanVersionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#reorderPlanPolicies(java.lang.String, java.lang.String, java.lang.String, org.example.microprofile.api.beans.policies.PolicyChainBean)
     */
    @Override
    public void reorderPlanPolicies(String organizationId, String planId, String version,
            PolicyChainBean policyChain)
            throws OrganizationNotFoundException, PlanVersionNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#grant(java.lang.String, org.example.microprofile.api.beans.idm.GrantRolesBean)
     */
    @Override
    public void grant(String organizationId, GrantRolesBean bean) throws OrganizationNotFoundException,
            RoleNotFoundException, UserNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#revoke(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public void revoke(String organizationId, String roleId, String userId)
            throws OrganizationNotFoundException, RoleNotFoundException, UserNotFoundException,
            NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#revokeAll(java.lang.String, java.lang.String)
     */
    @Override
    public void revokeAll(String organizationId, String userId) throws OrganizationNotFoundException,
            RoleNotFoundException, UserNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#listMembers(java.lang.String)
     */
    @Override
    public List<MemberBean> listMembers(String organizationId)
            throws OrganizationNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getUsage(java.lang.String, java.lang.String, java.lang.String, org.example.microprofile.api.beans.metrics.HistogramIntervalType, java.lang.String, java.lang.String)
     */
    @Override
    public UsageHistogramBean getUsage(String organizationId, String apiId, String version,
            HistogramIntervalType interval, String fromDate, String toDate)
            throws NotAuthorizedException, InvalidMetricCriteriaException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getUsagePerClient(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public UsagePerClientBean getUsagePerClient(String organizationId, String apiId, String version,
            String fromDate, String toDate) throws NotAuthorizedException, InvalidMetricCriteriaException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getUsagePerPlan(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public UsagePerPlanBean getUsagePerPlan(String organizationId, String apiId, String version,
            String fromDate, String toDate) throws NotAuthorizedException, InvalidMetricCriteriaException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getResponseStats(java.lang.String, java.lang.String, java.lang.String, org.example.microprofile.api.beans.metrics.HistogramIntervalType, java.lang.String, java.lang.String)
     */
    @Override
    public ResponseStatsHistogramBean getResponseStats(String organizationId, String apiId, String version,
            HistogramIntervalType interval, String fromDate, String toDate)
            throws NotAuthorizedException, InvalidMetricCriteriaException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getResponseStatsSummary(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public ResponseStatsSummaryBean getResponseStatsSummary(String organizationId, String apiId,
            String version, String fromDate, String toDate)
            throws NotAuthorizedException, InvalidMetricCriteriaException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getResponseStatsPerClient(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public ResponseStatsPerClientBean getResponseStatsPerClient(String organizationId, String apiId,
            String version, String fromDate, String toDate)
            throws NotAuthorizedException, InvalidMetricCriteriaException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IOrganizationResource#getResponseStatsPerPlan(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public ResponseStatsPerPlanBean getResponseStatsPerPlan(String organizationId, String apiId,
            String version, String fromDate, String toDate)
            throws NotAuthorizedException, InvalidMetricCriteriaException {
        
        return null;
    }

}
