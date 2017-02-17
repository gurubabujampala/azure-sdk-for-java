/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol;

import com.microsoft.azure.batch.protocol.models.ApplicationGetHeaders;
import com.microsoft.azure.batch.protocol.models.ApplicationGetOptions;
import com.microsoft.azure.batch.protocol.models.ApplicationListHeaders;
import com.microsoft.azure.batch.protocol.models.ApplicationListNextOptions;
import com.microsoft.azure.batch.protocol.models.ApplicationListOptions;
import com.microsoft.azure.batch.protocol.models.ApplicationSummary;
import com.microsoft.azure.batch.protocol.models.BatchErrorException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponseWithHeaders;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Applications.
 */
public interface Applications {
    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ApplicationSummary&gt; object if successful.
     */
    PagedList<ApplicationSummary> list();

    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ApplicationSummary>> listAsync(final ListOperationCallback<ApplicationSummary> serviceCallback);

    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ApplicationSummary&gt; object
     */
    Observable<Page<ApplicationSummary>> listAsync();

    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ApplicationSummary&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<ApplicationSummary>, ApplicationListHeaders>> listWithServiceResponseAsync();
    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param applicationListOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ApplicationSummary&gt; object if successful.
     */
    PagedList<ApplicationSummary> list(final ApplicationListOptions applicationListOptions);

    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param applicationListOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ApplicationSummary>> listAsync(final ApplicationListOptions applicationListOptions, final ListOperationCallback<ApplicationSummary> serviceCallback);

    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param applicationListOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ApplicationSummary&gt; object
     */
    Observable<Page<ApplicationSummary>> listAsync(final ApplicationListOptions applicationListOptions);

    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param applicationListOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ApplicationSummary&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<ApplicationSummary>, ApplicationListHeaders>> listWithServiceResponseAsync(final ApplicationListOptions applicationListOptions);

    /**
     * Gets information about the specified application.
     *
     * @param applicationId The ID of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationSummary object if successful.
     */
    ApplicationSummary get(String applicationId);

    /**
     * Gets information about the specified application.
     *
     * @param applicationId The ID of the application.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ApplicationSummary> getAsync(String applicationId, final ServiceCallback<ApplicationSummary> serviceCallback);

    /**
     * Gets information about the specified application.
     *
     * @param applicationId The ID of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationSummary object
     */
    Observable<ApplicationSummary> getAsync(String applicationId);

    /**
     * Gets information about the specified application.
     *
     * @param applicationId The ID of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationSummary object
     */
    Observable<ServiceResponseWithHeaders<ApplicationSummary, ApplicationGetHeaders>> getWithServiceResponseAsync(String applicationId);
    /**
     * Gets information about the specified application.
     *
     * @param applicationId The ID of the application.
     * @param applicationGetOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationSummary object if successful.
     */
    ApplicationSummary get(String applicationId, ApplicationGetOptions applicationGetOptions);

    /**
     * Gets information about the specified application.
     *
     * @param applicationId The ID of the application.
     * @param applicationGetOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ApplicationSummary> getAsync(String applicationId, ApplicationGetOptions applicationGetOptions, final ServiceCallback<ApplicationSummary> serviceCallback);

    /**
     * Gets information about the specified application.
     *
     * @param applicationId The ID of the application.
     * @param applicationGetOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationSummary object
     */
    Observable<ApplicationSummary> getAsync(String applicationId, ApplicationGetOptions applicationGetOptions);

    /**
     * Gets information about the specified application.
     *
     * @param applicationId The ID of the application.
     * @param applicationGetOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationSummary object
     */
    Observable<ServiceResponseWithHeaders<ApplicationSummary, ApplicationGetHeaders>> getWithServiceResponseAsync(String applicationId, ApplicationGetOptions applicationGetOptions);

    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ApplicationSummary&gt; object if successful.
     */
    PagedList<ApplicationSummary> listNext(final String nextPageLink);

    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ApplicationSummary>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ApplicationSummary>> serviceFuture, final ListOperationCallback<ApplicationSummary> serviceCallback);

    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ApplicationSummary&gt; object
     */
    Observable<Page<ApplicationSummary>> listNextAsync(final String nextPageLink);

    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ApplicationSummary&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<ApplicationSummary>, ApplicationListHeaders>> listNextWithServiceResponseAsync(final String nextPageLink);
    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param applicationListNextOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ApplicationSummary&gt; object if successful.
     */
    PagedList<ApplicationSummary> listNext(final String nextPageLink, final ApplicationListNextOptions applicationListNextOptions);

    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param applicationListNextOptions Additional parameters for the operation
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ApplicationSummary>> listNextAsync(final String nextPageLink, final ApplicationListNextOptions applicationListNextOptions, final ServiceFuture<List<ApplicationSummary>> serviceFuture, final ListOperationCallback<ApplicationSummary> serviceCallback);

    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param applicationListNextOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ApplicationSummary&gt; object
     */
    Observable<Page<ApplicationSummary>> listNextAsync(final String nextPageLink, final ApplicationListNextOptions applicationListNextOptions);

    /**
     * Lists all of the applications available in the specified account.
     * This operation returns only applications and versions that are available for use on compute nodes; that is, that can be used in an application package reference. For administrator information about applications and versions that are not yet available to compute nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param applicationListNextOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ApplicationSummary&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<ApplicationSummary>, ApplicationListHeaders>> listNextWithServiceResponseAsync(final String nextPageLink, final ApplicationListNextOptions applicationListNextOptions);

}
