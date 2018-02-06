/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.azureparametergrouping.models.FirstParameterGroup;
import fixtures.azureparametergrouping.models.ParameterGroupingPostMultiParamGroupsSecondParamGroup;
import fixtures.azureparametergrouping.models.ParameterGroupingPostOptionalParameters;
import fixtures.azureparametergrouping.models.ParameterGroupingPostRequiredParameters;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * ParameterGroupings.
 */
public interface ParameterGroupings {
    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void postRequired(@NonNull ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters);

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> postRequiredAsync(@NonNull ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters, @NonNull ServiceCallback<Void> serviceCallback);

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> postRequiredWithRestResponseAsync(@NonNull ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters);

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable postRequiredAsync(@NonNull ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters);

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void postOptional();

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> postOptionalAsync(@NonNull ServiceCallback<Void> serviceCallback);

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> postOptionalWithRestResponseAsync();

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable postOptionalAsync();

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void postOptional(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters);

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> postOptionalAsync(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters, @NonNull ServiceCallback<Void> serviceCallback);

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> postOptionalWithRestResponseAsync(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters);

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable postOptionalAsync(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters);

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void postMultiParamGroups();

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> postMultiParamGroupsAsync(@NonNull ServiceCallback<Void> serviceCallback);

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> postMultiParamGroupsWithRestResponseAsync();

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable postMultiParamGroupsAsync();

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation.
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void postMultiParamGroups(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroup parameterGroupingPostMultiParamGroupsSecondParamGroup);

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation.
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> postMultiParamGroupsAsync(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroup parameterGroupingPostMultiParamGroupsSecondParamGroup, @NonNull ServiceCallback<Void> serviceCallback);

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation.
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> postMultiParamGroupsWithRestResponseAsync(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroup parameterGroupingPostMultiParamGroupsSecondParamGroup);

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation.
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable postMultiParamGroupsAsync(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroup parameterGroupingPostMultiParamGroupsSecondParamGroup);

    /**
     * Post parameters with a shared parameter group object.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void postSharedParameterGroupObject();

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> postSharedParameterGroupObjectAsync(@NonNull ServiceCallback<Void> serviceCallback);

    /**
     * Post parameters with a shared parameter group object.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> postSharedParameterGroupObjectWithRestResponseAsync();

    /**
     * Post parameters with a shared parameter group object.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable postSharedParameterGroupObjectAsync();

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void postSharedParameterGroupObject(FirstParameterGroup firstParameterGroup);

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> postSharedParameterGroupObjectAsync(FirstParameterGroup firstParameterGroup, @NonNull ServiceCallback<Void> serviceCallback);

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> postSharedParameterGroupObjectWithRestResponseAsync(FirstParameterGroup firstParameterGroup);

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable postSharedParameterGroupObjectAsync(FirstParameterGroup firstParameterGroup);
}
