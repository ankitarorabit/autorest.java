/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodycomplex.models.ErrorException;
import fixtures.bodycomplex.models.ReadonlyObj;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;

/**
 * An instance of this class provides access to all the operations defined in
 * Readonlypropertys.
 */
public interface Readonlypropertys {
    /**
     * Get complex types that have readonly properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ReadonlyObj object if successful.
     */
    ReadonlyObj getValid();

    /**
     * Get complex types that have readonly properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;ReadonlyObj&gt;} object.
     */
    ServiceFuture<ReadonlyObj> getValidAsync(ServiceCallback<ReadonlyObj> serviceCallback);

    /**
     * Get complex types that have readonly properties.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, ReadonlyObj&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, ReadonlyObj>> getValidWithRestResponseAsync();

    /**
     * Get complex types that have readonly properties.
     *
     * @return the {@link Maybe&lt;ReadonlyObj&gt;} object if successful.
     */
    Maybe<ReadonlyObj> getValidAsync();

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putValid(ReadonlyObj complexBody);

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putValidAsync(ReadonlyObj complexBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putValidWithRestResponseAsync(ReadonlyObj complexBody);

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putValidAsync(ReadonlyObj complexBody);
}
