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

package org.example.microprofile.api.rest.contract.exceptions;


/**
 * Thrown when trying to get, update, or delete an API that does not exist.
 *
 * @author eric.wittmann@redhat.com
 */
public class ApiNotFoundException extends AbstractNotFoundException {

    private static final long serialVersionUID = -7689616296874695474L;

    /**
     * Constructor.
     */
    public ApiNotFoundException() {
    }

    /**
     * Constructor.
     * @param message the exception message
     */
    public ApiNotFoundException(String message) {
        super(message);
    }

    /**
     * @see org.example.microprofile.api.rest.contract.exceptions.AbstractRestException#getErrorCode()
     */
    @Override
    public int getErrorCode() {
        return ErrorCodes.API_NOT_FOUND;
    }

    /**
     * @see org.example.microprofile.api.rest.contract.exceptions.AbstractRestException#getMoreInfoUrl()
     */
    @Override
    public String getMoreInfoUrl() {
        return ErrorCodes.API_NOT_FOUND_INFO;
    }

}
