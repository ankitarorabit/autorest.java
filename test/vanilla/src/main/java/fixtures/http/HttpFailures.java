/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.RestException;
import com.microsoft.rest.RestResponse;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import fixtures.http.models.ErrorException;
import java.io.IOException;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined in
 * HttpFailures.
 */
public interface HttpFailures {
    /**
     * Get empty error form server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    boolean getEmptyError();

    /**
     * Get empty error form server.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Boolean&gt;} object
     */
    ServiceFuture<Boolean> getEmptyErrorAsync(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Get empty error form server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Boolean&gt;} object if successful.
     */
    Single<Boolean> getEmptyErrorAsync();

    /**
     * Get empty error form server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Boolean&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Boolean>> getEmptyErrorWithRestResponseAsync();

    /**
     * Get empty error form server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    boolean getNoModelError();

    /**
     * Get empty error form server.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Boolean&gt;} object
     */
    ServiceFuture<Boolean> getNoModelErrorAsync(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Get empty error form server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Boolean&gt;} object if successful.
     */
    Single<Boolean> getNoModelErrorAsync();

    /**
     * Get empty error form server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Boolean&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Boolean>> getNoModelErrorWithRestResponseAsync();

    /**
     * Get empty response from server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    boolean getNoModelEmpty();

    /**
     * Get empty response from server.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Boolean&gt;} object
     */
    ServiceFuture<Boolean> getNoModelEmptyAsync(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Get empty response from server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Boolean&gt;} object if successful.
     */
    Single<Boolean> getNoModelEmptyAsync();

    /**
     * Get empty response from server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Boolean&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Boolean>> getNoModelEmptyWithRestResponseAsync();

}
