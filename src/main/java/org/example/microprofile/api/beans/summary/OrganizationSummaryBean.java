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
package org.example.microprofile.api.beans.summary;

import java.io.Serializable;

/**
 * A bean modeling a summary of an Organization.  Typically used when listing
 * all Organizations visible to a user.
 *
 * @author eric.wittmann@redhat.com
 */
public class OrganizationSummaryBean implements Serializable {

    private static final long serialVersionUID = -7969484509928874072L;

    private String id;
    private String name;
    private String description;
    private int numClients;
    private int numApis;
    private int numMembers;

    /**
     * Constructor.
     */
    public OrganizationSummaryBean() {
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the numClients
     */
    public int getNumClients() {
        return numClients;
    }

    /**
     * @param numClients the numClients to set
     */
    public void setNumClients(int numClients) {
        this.numClients = numClients;
    }

    /**
     * @return the numApis
     */
    public int getNumApis() {
        return numApis;
    }

    /**
     * @param numApis the numApis to set
     */
    public void setNumApis(int numApis) {
        this.numApis = numApis;
    }

    /**
     * @return the numMembers
     */
    public int getNumMembers() {
        return numMembers;
    }

    /**
     * @param numMembers the numMembers to set
     */
    public void setNumMembers(int numMembers) {
        this.numMembers = numMembers;
    }

}
