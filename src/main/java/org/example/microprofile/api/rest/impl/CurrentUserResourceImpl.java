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

import org.example.microprofile.api.beans.idm.CurrentUserBean;
import org.example.microprofile.api.beans.idm.UpdateUserBean;
import org.example.microprofile.api.beans.summary.ApiSummaryBean;
import org.example.microprofile.api.beans.summary.ClientSummaryBean;
import org.example.microprofile.api.beans.summary.OrganizationSummaryBean;
import org.example.microprofile.api.rest.contract.ICurrentUserResource;

/**
 * Implementation of the Current User API.
 *
 * @author eric.wittmann@redhat.com
 */
public class CurrentUserResourceImpl implements ICurrentUserResource {

    /**
     * Constructor.
     */
    public CurrentUserResourceImpl() {
    }

    /**
     * @see org.example.microprofile.api.rest.contract.ICurrentUserResource#getInfo()
     */
    @Override
    public CurrentUserBean getInfo() {
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.ICurrentUserResource#updateInfo(org.example.microprofile.api.beans.idm.UpdateUserBean)
     */
    @Override
    public void updateInfo(UpdateUserBean info) {
    }

    /**
     * @see org.example.microprofile.api.rest.contract.ICurrentUserResource#getClientOrganizations()
     */
    @Override
    public List<OrganizationSummaryBean> getClientOrganizations() {
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.ICurrentUserResource#getPlanOrganizations()
     */
    @Override
    public List<OrganizationSummaryBean> getPlanOrganizations() {
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.ICurrentUserResource#getApiOrganizations()
     */
    @Override
    public List<OrganizationSummaryBean> getApiOrganizations() {
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.ICurrentUserResource#getClients()
     */
    @Override
    public List<ClientSummaryBean> getClients() {
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.ICurrentUserResource#getApis()
     */
    @Override
    public List<ApiSummaryBean> getApis() {
        return null;
    }
}
