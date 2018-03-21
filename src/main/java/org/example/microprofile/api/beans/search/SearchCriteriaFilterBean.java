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
package org.example.microprofile.api.beans.search;

import java.io.Serializable;

/**
 * Represents a single filter or search criteria.  This is used when searching
 * for beans.
 *
 * @author eric.wittmann@redhat.com
 */
public class SearchCriteriaFilterBean implements Serializable {

    private static final long serialVersionUID = -1199180207971619165L;

    private String name;
    private String value;
    private SearchCriteriaFilterOperator operator;

    /**
     * Constructor.
     */
    public SearchCriteriaFilterBean() {
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
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the operator
     */
    public SearchCriteriaFilterOperator getOperator() {
        return operator;
    }

    /**
     * @param operator the operator to set
     */
    public void setOperator(SearchCriteriaFilterOperator operator) {
        this.operator = operator;
    }

}
