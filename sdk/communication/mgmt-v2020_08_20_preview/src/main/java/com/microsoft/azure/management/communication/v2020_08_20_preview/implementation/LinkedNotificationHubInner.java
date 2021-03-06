/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.communication.v2020_08_20_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A notification hub that has been linked to the communication service.
 */
public class LinkedNotificationHubInner {
    /**
     * The resource ID of the notification hub.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Get the resource ID of the notification hub.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resource ID of the notification hub.
     *
     * @param resourceId the resourceId value to set
     * @return the LinkedNotificationHubInner object itself.
     */
    public LinkedNotificationHubInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

}
