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

import org.example.microprofile.api.beans.audit.AuditEntryBean;
import org.example.microprofile.api.beans.idm.UpdateUserBean;
import org.example.microprofile.api.beans.idm.UserBean;
import org.example.microprofile.api.beans.search.SearchCriteriaBean;
import org.example.microprofile.api.beans.search.SearchResultsBean;
import org.example.microprofile.api.beans.summary.ApiSummaryBean;
import org.example.microprofile.api.beans.summary.ClientSummaryBean;
import org.example.microprofile.api.beans.summary.OrganizationSummaryBean;
import org.example.microprofile.api.rest.contract.IUserResource;
import org.example.microprofile.api.rest.contract.exceptions.InvalidSearchCriteriaException;
import org.example.microprofile.api.rest.contract.exceptions.NotAuthorizedException;
import org.example.microprofile.api.rest.contract.exceptions.UserNotFoundException;

/**
 * Implementation of the User API.
 * 
 * @author eric.wittmann@redhat.com
 */
public class UserResourceImpl implements IUserResource {
    
    /**
     * Constructor.
     */
    public UserResourceImpl() {
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IUserResource#get(java.lang.String)
     */
    @Override
    public UserBean get(String userId) throws UserNotFoundException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IUserResource#update(java.lang.String, org.example.microprofile.api.beans.idm.UpdateUserBean)
     */
    @Override
    public void update(String userId, UpdateUserBean user)
            throws UserNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IUserResource#search(org.example.microprofile.api.beans.search.SearchCriteriaBean)
     */
    @Override
    public SearchResultsBean<UserBean> search(SearchCriteriaBean criteria)
            throws InvalidSearchCriteriaException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IUserResource#getOrganizations(java.lang.String)
     */
    @Override
    public List<OrganizationSummaryBean> getOrganizations(String userId) {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IUserResource#getClients(java.lang.String)
     */
    @Override
    public List<ClientSummaryBean> getClients(String userId) {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IUserResource#getApis(java.lang.String)
     */
    @Override
    public List<ApiSummaryBean> getApis(String userId) {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IUserResource#getActivity(java.lang.String, int, int)
     */
    @Override
    public SearchResultsBean<AuditEntryBean> getActivity(String userId, int page, int pageSize) {
        
        return null;
    }

}
