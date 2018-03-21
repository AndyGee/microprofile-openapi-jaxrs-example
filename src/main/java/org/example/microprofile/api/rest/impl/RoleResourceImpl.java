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

import org.example.microprofile.api.beans.idm.NewRoleBean;
import org.example.microprofile.api.beans.idm.RoleBean;
import org.example.microprofile.api.beans.idm.UpdateRoleBean;
import org.example.microprofile.api.beans.search.SearchCriteriaBean;
import org.example.microprofile.api.beans.search.SearchResultsBean;
import org.example.microprofile.api.rest.contract.IRoleResource;
import org.example.microprofile.api.rest.contract.exceptions.InvalidSearchCriteriaException;
import org.example.microprofile.api.rest.contract.exceptions.NotAuthorizedException;
import org.example.microprofile.api.rest.contract.exceptions.RoleAlreadyExistsException;
import org.example.microprofile.api.rest.contract.exceptions.RoleNotFoundException;

/**
 * Implementation of the Role API.
 * 
 * @author eric.wittmann@redhat.com
 */
public class RoleResourceImpl implements IRoleResource {

    /**
     * Constructor.
     */
    public RoleResourceImpl() {
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IRoleResource#create(org.example.microprofile.api.beans.idm.NewRoleBean)
     */
    @Override
    public RoleBean create(NewRoleBean bean) throws RoleAlreadyExistsException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IRoleResource#list()
     */
    @Override
    public List<RoleBean> list() throws NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IRoleResource#get(java.lang.String)
     */
    @Override
    public RoleBean get(String roleId) throws RoleNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IRoleResource#update(java.lang.String, org.example.microprofile.api.beans.idm.UpdateRoleBean)
     */
    @Override
    public void update(String roleId, UpdateRoleBean bean)
            throws RoleNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IRoleResource#delete(java.lang.String)
     */
    @Override
    public void delete(String roleId) throws RoleNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IRoleResource#search(org.example.microprofile.api.beans.search.SearchCriteriaBean)
     */
    @Override
    public SearchResultsBean<RoleBean> search(SearchCriteriaBean criteria)
            throws InvalidSearchCriteriaException, NotAuthorizedException {
        
        return null;
    }

}
