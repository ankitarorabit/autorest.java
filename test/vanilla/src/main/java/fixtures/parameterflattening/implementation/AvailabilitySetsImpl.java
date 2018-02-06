/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.parameterflattening.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PATCH;
import com.microsoft.rest.v2.annotations.PathParam;
import fixtures.parameterflattening.AvailabilitySets;
import fixtures.parameterflattening.models.AvailabilitySetUpdateParameters;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.HashMap;
import java.util.Map;

/**
 * An instance of this class provides access to all the operations defined in
 * AvailabilitySets.
 */
public class AvailabilitySetsImpl implements AvailabilitySets {
    /**
     * The proxy service used to perform REST calls.
     */
    private AvailabilitySetsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestParameterFlatteningImpl client;

    /**
     * Initializes an instance of AvailabilitySetsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public AvailabilitySetsImpl(AutoRestParameterFlatteningImpl client) {
        this.service = RestProxy.create(AvailabilitySetsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for AvailabilitySets to be used
     * by the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface AvailabilitySetsService {
        @PATCH("parameterFlattening/{resourceGroupName}/{availabilitySetName}")
        @ExpectedResponses({200})
        Single<RestResponse<Void, Void>> update(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("availabilitySetName") String avset, @BodyParam("application/json; charset=utf-8") AvailabilitySetUpdateParameters tags);
    }

    /**
     * Updates the tags for an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param avset The name of the storage availability set.
     * @param tags A set of tags. A description about the set of tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void update(String resourceGroupName, String avset, Map<String, String> tags) {
        updateAsync(resourceGroupName, avset, tags).blockingAwait();
    }

    /**
     * Updates the tags for an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param avset The name of the storage availability set.
     * @param tags A set of tags. A description about the set of tags.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> updateAsync(String resourceGroupName, String avset, Map<String, String> tags, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(updateAsync(resourceGroupName, avset, tags), serviceCallback);
    }

    /**
     * Updates the tags for an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param avset The name of the storage availability set.
     * @param tags A set of tags. A description about the set of tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> updateWithRestResponseAsync(String resourceGroupName, String avset, Map<String, String> tags) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (avset == null) {
            throw new IllegalArgumentException("Parameter avset is required and cannot be null.");
        }
        if (tags == null) {
            throw new IllegalArgumentException("Parameter tags is required and cannot be null.");
        }
        Validator.validate(tags);
        AvailabilitySetUpdateParameters tags1 = new AvailabilitySetUpdateParameters();
        tags1.withTags(tags);
        return service.update(resourceGroupName, avset, tags1);
    }

    /**
     * Updates the tags for an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param avset The name of the storage availability set.
     * @param tags A set of tags. A description about the set of tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable updateAsync(String resourceGroupName, String avset, Map<String, String> tags) {
        return updateWithRestResponseAsync(resourceGroupName, avset, tags)
            .toCompletable();
    }
}
