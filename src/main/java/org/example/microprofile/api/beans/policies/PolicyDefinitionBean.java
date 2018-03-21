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
package org.example.microprofile.api.beans.policies;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.example.microprofile.api.beans.summary.PolicyFormType;


/**
 * A Policy Definition describes a type of policy that can be added to
 * a client, API, or plan.  A policy cannot be added unless a
 * definition is first created for it.
 *
 * @author eric.wittmann@redhat.com
 */
public class PolicyDefinitionBean implements Serializable {

    private static final long serialVersionUID = 1801150127602136865L;

    private String id;
    private String policyImpl;
    private String name;
    private String description;
    private String icon;
    private Set<PolicyDefinitionTemplateBean> templates = new HashSet<>();
    private Long pluginId;
    private PolicyFormType formType;
    private String form;
    private Boolean deleted;

    /**
     * Constructor.
     */
    public PolicyDefinitionBean() {
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
     * @return the policyImpl
     */
    public String getPolicyImpl() {
        return policyImpl;
    }

    /**
     * @param policyImpl the policyImpl to set
     */
    public void setPolicyImpl(String policyImpl) {
        this.policyImpl = policyImpl;
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
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return the templates
     */
    public Set<PolicyDefinitionTemplateBean> getTemplates() {
        return templates;
    }

    /**
     * @param templates the templates to set
     */
    public void setTemplates(Set<PolicyDefinitionTemplateBean> templates) {
        this.templates = templates;
    }

    /**
     * @return the pluginId
     */
    public Long getPluginId() {
        return pluginId;
    }

    /**
     * @param pluginId the pluginId to set
     */
    public void setPluginId(Long pluginId) {
        this.pluginId = pluginId;
    }

    /**
     * @return the formType
     */
    public PolicyFormType getFormType() {
        return formType;
    }

    /**
     * @param formType the formType to set
     */
    public void setFormType(PolicyFormType formType) {
        this.formType = formType;
    }

    /**
     * @return the form
     */
    public String getForm() {
        return form;
    }

    /**
     * @param form the form to set
     */
    public void setForm(String form) {
        this.form = form;
    }

    /**
     * @return the deleted
     */
    public boolean isDeleted() {
        if (deleted == null) {
            return false;
        }
        return deleted;
    }

    /**
     * @param deleted the deleted to set
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

}
