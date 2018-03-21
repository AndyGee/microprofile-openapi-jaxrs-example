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
import java.util.ArrayList;
import java.util.List;

/**
 * Generic search criteria used when searching for beans.
 *
 * @author eric.wittmann@redhat.com
 */
public class SearchCriteriaBean implements Serializable {

    private static final long serialVersionUID = 5103776179000907112L;

    private List<SearchCriteriaFilterBean> filters = new ArrayList<>();
    private OrderByBean orderBy;
    private PagingBean paging;

    /**
     * Constructor.
     */
    public SearchCriteriaBean() {
    }

    /**
     * Adds a single filter to the criteria.
     * @param name the filter name
     * @param value the filter value
     * @param operator the operator type
     */
    public void addFilter(String name, String value, SearchCriteriaFilterOperator operator) {
        SearchCriteriaFilterBean filter = new SearchCriteriaFilterBean();
        filter.setName(name);
        filter.setValue(value);
        filter.setOperator(operator);
        filters.add(filter);
    }

    /**
     * @param page the page
     */
    public void setPage(int page) {
        if (this.paging == null)
            this.paging = new PagingBean();
        getPaging().setPage(page);
    }

    /**
     * @param pageSize size of page
     */
    public void setPageSize(int pageSize) {
        if (this.paging == null)
            this.paging = new PagingBean();
        getPaging().setPageSize(pageSize);
    }

    /**
     * @param name the name
     * @param ascending whether is ascending
     */
    public void setOrder(String name, boolean ascending) {
        if (this.orderBy == null)
            this.orderBy = new OrderByBean();
        orderBy.setName(name);
        orderBy.setAscending(ascending);
    }

    /**
     * @return the filters
     */
    public List<SearchCriteriaFilterBean> getFilters() {
        return filters;
    }

    /**
     * @param filters the filters to set
     */
    public void setFilters(List<SearchCriteriaFilterBean> filters) {
        this.filters = filters;
    }

    /**
     * @return the paging
     */
    public PagingBean getPaging() {
        return paging;
    }

    /**
     * @param paging the paging to set
     */
    public void setPaging(PagingBean paging) {
        this.paging = paging;
    }

    /**
     * @return the orderBy
     */
    public OrderByBean getOrderBy() {
        return orderBy;
    }

    /**
     * @param orderBy the orderBy to set
     */
    public void setOrderBy(OrderByBean orderBy) {
        this.orderBy = orderBy;
    }

}
