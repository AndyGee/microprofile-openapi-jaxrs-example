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
import java.util.HashSet;
import java.util.Set;

/**
 * Bean used to grant role membership for a given user (qualified
 * by organization).
 *
 * @author eric.wittmann@redhat.com
 */
public class GrantRolesBean implements Serializable {

    private static final long serialVersionUID = -1509983712261196134L;

    private String userId;
    private Set<String> roleIds = new HashSet<>();

    /**
     * Constructor.
     */
    public GrantRolesBean() {
    }

    /**
     * @param roleId the role
     */
    public void addRoleId(String roleId) {
        roleIds.add(roleId);
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the roleIds
     */
    public Set<String> getRoleIds() {
        return roleIds;
    }

    /**
     * @param roleIds the roleIds to set
     */
    public void setRoleIds(Set<String> roleIds) {
        this.roleIds = roleIds;
    }

}
