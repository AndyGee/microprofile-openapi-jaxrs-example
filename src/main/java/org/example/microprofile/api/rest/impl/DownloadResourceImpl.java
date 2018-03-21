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

import javax.ws.rs.core.Response;

import org.example.microprofile.api.rest.contract.IDownloadResource;
import org.example.microprofile.api.rest.contract.exceptions.DownloadNotFoundException;

/**
 * Implementation of the System API.
 *
 * @author eric.wittmann@redhat.com
 */
public class DownloadResourceImpl implements IDownloadResource {

    /**
     * Constructor.
     */
    public DownloadResourceImpl() {
    }

    /**
     * @see org.example.microprofile.api.rest.contract.IDownloadResource#download(java.lang.String)
     */
    @Override
    public Response download(String downloadId) throws DownloadNotFoundException {
        return null;
    }

}
