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

import java.util.Set;

/**
 * Models the currently authenticated user.  This bean extends the simple
 * user bean but also includes all of the user's permissions.
 *
 * @author eric.wittmann@redhat.com
 */
public class CurrentUserBean extends UserBean {

    private static final long serialVersionUID = -5687453720494525865L;

    private Set<PermissionBean> permissions;

    /**
     * Constructor.
     */
    public CurrentUserBean() {
    }

    /**
     * @return the permissions
     */
    public Set<PermissionBean> getPermissions() {
        return permissions;
    }

    /**
     * @param permissions the permissions to set
     */
    public void setPermissions(Set<PermissionBean> permissions) {
        this.permissions = permissions;
    }

}
