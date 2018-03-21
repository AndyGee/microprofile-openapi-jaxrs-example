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
package org.example.microprofile.api.beans.idm;

import java.io.Serializable;

/**
 * Models a single qualified permission assigned to a user.  All permissions
 * are granted to users by membership in one or more roles.  Membership in a
 * role is qualified by organization, allowing a user to have different roles
 * in different organizations.
 *
 * @author eric.wittmann@redhat.com
 */
public class PermissionBean implements Serializable {

    private static final long serialVersionUID = 6005936454144731711L;

    private PermissionType name;
    private String organizationId;

    /**
     * Constructor.
     */
    public PermissionBean() {
    }

    /**
     * @return the name
     */
    public PermissionType getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(PermissionType name) {
        this.name = name;
    }

    /**
     * @return the organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * @param organizationId the organizationId to set
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

}
