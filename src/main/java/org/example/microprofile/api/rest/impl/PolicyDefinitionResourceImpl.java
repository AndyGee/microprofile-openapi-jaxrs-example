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

import org.example.microprofile.api.beans.policies.PolicyDefinitionBean;
import org.example.microprofile.api.beans.policies.UpdatePolicyDefinitionBean;
import org.example.microprofile.api.beans.summary.PolicyDefinitionSummaryBean;
import org.example.microprofile.api.rest.contract.IPolicyDefinitionResource;
import org.example.microprofile.api.rest.contract.exceptions.NotAuthorizedException;
import org.example.microprofile.api.rest.contract.exceptions.PolicyDefinitionAlreadyExistsException;
import org.example.microprofile.api.rest.contract.exceptions.PolicyDefinitionNotFoundException;

/**
 * Implementation of the PolicyDefinition API.
 * 
 * @author eric.wittmann@redhat.com
 */
public class PolicyDefinitionResourceImpl implements IPolicyDefinitionResource {

    /**
     * Constructor.
     */
    public PolicyDefinitionResourceImpl() {
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IPolicyDefinitionResource#list()
     */
    @Override
    public List<PolicyDefinitionSummaryBean> list() throws NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IPolicyDefinitionResource#create(org.example.microprofile.api.beans.policies.PolicyDefinitionBean)
     */
    @Override
    public PolicyDefinitionBean create(PolicyDefinitionBean bean)
            throws PolicyDefinitionAlreadyExistsException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IPolicyDefinitionResource#get(java.lang.String)
     */
    @Override
    public PolicyDefinitionBean get(String policyDefinitionId)
            throws PolicyDefinitionNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IPolicyDefinitionResource#update(java.lang.String, org.example.microprofile.api.beans.policies.UpdatePolicyDefinitionBean)
     */
    @Override
    public void update(String policyDefinitionId, UpdatePolicyDefinitionBean bean)
            throws PolicyDefinitionNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IPolicyDefinitionResource#delete(java.lang.String)
     */
    @Override
    public void delete(String policyDefinitionId)
            throws PolicyDefinitionNotFoundException, NotAuthorizedException {
        
        
    }
        
}
