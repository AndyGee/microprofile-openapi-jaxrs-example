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

import org.example.microprofile.api.beans.search.SearchCriteriaBean;
import org.example.microprofile.api.beans.search.SearchResultsBean;
import org.example.microprofile.api.beans.summary.ApiNamespaceBean;
import org.example.microprofile.api.beans.summary.ApiSummaryBean;
import org.example.microprofile.api.beans.summary.AvailableApiBean;
import org.example.microprofile.api.beans.summary.ClientSummaryBean;
import org.example.microprofile.api.beans.summary.OrganizationSummaryBean;
import org.example.microprofile.api.rest.contract.ISearchResource;
import org.example.microprofile.api.rest.contract.exceptions.InvalidSearchCriteriaException;
import org.example.microprofile.api.rest.contract.exceptions.OrganizationNotFoundException;

/**
 * Implementation of the Search API.
 *
 * @author eric.wittmann@redhat.com
 */
public class SearchResourceImpl implements ISearchResource {

    /**
     * Constructor.
     */
    public SearchResourceImpl() {
    }

    /**
     * @see org.example.microprofile.api.rest.contract.ISearchResource#searchOrgs(org.example.microprofile.api.beans.search.SearchCriteriaBean)
     */
    @Override
    public SearchResultsBean<OrganizationSummaryBean> searchOrgs(SearchCriteriaBean criteria)
            throws InvalidSearchCriteriaException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.ISearchResource#searchClients(org.example.microprofile.api.beans.search.SearchCriteriaBean)
     */
    @Override
    public SearchResultsBean<ClientSummaryBean> searchClients(SearchCriteriaBean criteria)
            throws OrganizationNotFoundException, InvalidSearchCriteriaException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.ISearchResource#searchApis(org.example.microprofile.api.beans.search.SearchCriteriaBean)
     */
    @Override
    public SearchResultsBean<ApiSummaryBean> searchApis(SearchCriteriaBean criteria)
            throws OrganizationNotFoundException, InvalidSearchCriteriaException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.ISearchResource#searchApiCatalog(org.example.microprofile.api.beans.search.SearchCriteriaBean)
     */
    @Override
    public SearchResultsBean<AvailableApiBean> searchApiCatalog(SearchCriteriaBean criteria)
            throws InvalidSearchCriteriaException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.ISearchResource#getApiNamespaces()
     */
    @Override
    public List<ApiNamespaceBean> getApiNamespaces() {
        
        return null;
    }

}
