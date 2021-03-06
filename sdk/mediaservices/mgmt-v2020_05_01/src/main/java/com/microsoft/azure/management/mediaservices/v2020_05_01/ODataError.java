/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about an error.
 */
public class ODataError {
    /**
     * A language-independent error name.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * The error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * The target of the error (for example, the name of the property in
     * error).
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * The error details.
     */
    @JsonProperty(value = "details")
    private List<ODataError> details;

    /**
     * Get a language-independent error name.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set a language-independent error name.
     *
     * @param code the code value to set
     * @return the ODataError object itself.
     */
    public ODataError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the error message.
     *
     * @param message the message value to set
     * @return the ODataError object itself.
     */
    public ODataError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target of the error (for example, the name of the property in error).
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target of the error (for example, the name of the property in error).
     *
     * @param target the target value to set
     * @return the ODataError object itself.
     */
    public ODataError withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the error details.
     *
     * @return the details value
     */
    public List<ODataError> details() {
        return this.details;
    }

    /**
     * Set the error details.
     *
     * @param details the details value to set
     * @return the ODataError object itself.
     */
    public ODataError withDetails(List<ODataError> details) {
        this.details = details;
        return this;
    }

}
