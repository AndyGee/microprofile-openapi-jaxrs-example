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

import org.example.microprofile.api.beans.gateways.GatewayBean;
import org.example.microprofile.api.beans.gateways.NewGatewayBean;
import org.example.microprofile.api.beans.gateways.UpdateGatewayBean;
import org.example.microprofile.api.beans.summary.GatewaySummaryBean;
import org.example.microprofile.api.beans.summary.GatewayTestResultBean;
import org.example.microprofile.api.rest.contract.IGatewayResource;
import org.example.microprofile.api.rest.contract.exceptions.GatewayAlreadyExistsException;
import org.example.microprofile.api.rest.contract.exceptions.GatewayNotFoundException;
import org.example.microprofile.api.rest.contract.exceptions.NotAuthorizedException;

/**
 * Implementation of the Gateway API.
 *
 * @author eric.wittmann@redhat.com
 */
public class GatewayResourceImpl implements IGatewayResource {

    /**
     * Constructor.
     */
    public GatewayResourceImpl() {
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IGatewayResource#test(org.example.microprofile.api.beans.gateways.NewGatewayBean)
     */
    @Override
    public GatewayTestResultBean test(NewGatewayBean bean) throws NotAuthorizedException {
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IGatewayResource#list()
     */
    @Override
    public List<GatewaySummaryBean> list() throws NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IGatewayResource#create(org.example.microprofile.api.beans.gateways.NewGatewayBean)
     */
    @Override
    public GatewayBean create(NewGatewayBean bean)
            throws GatewayAlreadyExistsException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IGatewayResource#get(java.lang.String)
     */
    @Override
    public GatewayBean get(String gatewayId) throws GatewayNotFoundException, NotAuthorizedException {
        
        return null;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IGatewayResource#update(java.lang.String, org.example.microprofile.api.beans.gateways.UpdateGatewayBean)
     */
    @Override
    public void update(String gatewayId, UpdateGatewayBean bean)
            throws GatewayNotFoundException, NotAuthorizedException {
        
        
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IGatewayResource#delete(java.lang.String)
     */
    @Override
    public void delete(String gatewayId) throws GatewayNotFoundException, NotAuthorizedException {
        
        
    }

}
