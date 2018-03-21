/*
 * Copyright 2015 JBoss Inc
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

/**
 * Bean used to store an API definition.
 *
 * @author eric.wittmann@redhat.com
 */
public class ApiDefinitionBean implements Serializable {

    private static final long serialVersionUID = 7744514362366320690L;

    private long id;
    private ApiVersionBean apiVersion;
    private byte[] data;

    /**
     * Constructor.
     */
    public ApiDefinitionBean() {
    }

    /**
     * @return the data
     */
    public byte[] getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(byte[] data) {
        this.data = data;
    }

    /**
     * @return the apiVersion
     */
    public ApiVersionBean getApiVersion() {
        return apiVersion;
    }

    /**
     * @param apiVersion the apiVersion to set
     */
    public void setApiVersion(ApiVersionBean apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
}
