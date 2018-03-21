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

import org.example.microprofile.api.beans.plugins.NewPluginBean;
import org.example.microprofile.api.beans.plugins.PluginBean;
import org.example.microprofile.api.beans.summary.PluginSummaryBean;
import org.example.microprofile.api.beans.summary.PolicyDefinitionSummaryBean;
import org.example.microprofile.api.rest.contract.IPluginResource;
import org.example.microprofile.api.rest.contract.exceptions.NotAuthorizedException;
import org.example.microprofile.api.rest.contract.exceptions.PluginAlreadyExistsException;
import org.example.microprofile.api.rest.contract.exceptions.PluginNotFoundException;
import org.example.microprofile.api.rest.contract.exceptions.PluginResourceNotFoundException;
import org.example.microprofile.api.rest.contract.exceptions.PolicyDefinitionNotFoundException;

/**
 * Implementation of the Plugin API.
 *
 * @author eric.wittmann@redhat.com
 */
public class PluginResourceImpl implements IPluginResource {

    /**
     * Constructor.
     */
    public PluginResourceImpl() {
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IPluginResource#list()
     */
    @Override
    public List<PluginSummaryBean> list() throws NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IPluginResource#create(org.example.microprofile.api.beans.plugins.NewPluginBean)
     */
    @Override
    public PluginBean create(NewPluginBean bean)
            throws PluginAlreadyExistsException, PluginNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IPluginResource#get(java.lang.Long)
     */
    @Override
    public PluginBean get(Long pluginId) throws PluginNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IPluginResource#delete(java.lang.Long)
     */
    @Override
    public void delete(Long pluginId) throws PluginNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IPluginResource#getPolicyDefs(java.lang.Long)
     */
    @Override
    public List<PolicyDefinitionSummaryBean> getPolicyDefs(Long pluginId) throws PluginNotFoundException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IPluginResource#getPolicyForm(java.lang.Long, java.lang.String)
     */
    @Override
    public String getPolicyForm(Long pluginId, String policyDefId) throws PluginNotFoundException,
            PolicyDefinitionNotFoundException, PluginResourceNotFoundException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IPluginResource#getAvailablePlugins()
     */
    @Override
    public List<PluginSummaryBean> getAvailablePlugins() throws NotAuthorizedException {
        
        return null;
    }

}
