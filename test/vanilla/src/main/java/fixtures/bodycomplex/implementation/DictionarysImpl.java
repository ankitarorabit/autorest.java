/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.bodycomplex.Dictionarys;
import fixtures.bodycomplex.models.DictionaryWrapper;
import fixtures.bodycomplex.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/**
 * An instance of this class provides access to all the operations defined in
 * Dictionarys.
 */
public class DictionarysImpl implements Dictionarys {
    /**
     * The proxy service used to perform REST calls.
     */
    private DictionarysService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of DictionarysImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public DictionarysImpl(AutoRestComplexTestServiceImpl client) {
        this.service = RestProxy.create(DictionarysService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Dictionarys to be used by
     * the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface DictionarysService {
        @GET("complex/dictionary/typed/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DictionaryWrapper>> getValid();

        @PUT("complex/dictionary/typed/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putValid(@BodyParam("application/json; charset=utf-8") DictionaryWrapper complexBody);

        @GET("complex/dictionary/typed/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DictionaryWrapper>> getEmpty();

        @PUT("complex/dictionary/typed/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putEmpty(@BodyParam("application/json; charset=utf-8") DictionaryWrapper complexBody);

        @GET("complex/dictionary/typed/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DictionaryWrapper>> getNull();

        @GET("complex/dictionary/typed/notprovided")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DictionaryWrapper>> getNotProvided();
    }

    /**
     * Get complex types with dictionary property.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DictionaryWrapper object if successful.
     */
    public DictionaryWrapper getValid() {
        return getValidAsync().blockingGet();
    }

    /**
     * Get complex types with dictionary property.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DictionaryWrapper&gt;} object.
     */
    public ServiceFuture<DictionaryWrapper> getValidAsync(ServiceCallback<DictionaryWrapper> serviceCallback) {
        return ServiceFuture.fromBody(getValidAsync(), serviceCallback);
    }

    /**
     * Get complex types with dictionary property.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DictionaryWrapper&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, DictionaryWrapper>> getValidWithRestResponseAsync() {
        return service.getValid();
    }

    /**
     * Get complex types with dictionary property.
     *
     * @return the {@link Maybe&lt;DictionaryWrapper&gt;} object if successful.
     */
    public Maybe<DictionaryWrapper> getValidAsync() {
        return getValidWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, DictionaryWrapper>, Maybe<DictionaryWrapper>>() {
                public Maybe<DictionaryWrapper> apply(RestResponse<Void, DictionaryWrapper> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putValid(DictionaryWrapper complexBody) {
        putValidAsync(complexBody).blockingAwait();
    }

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putValidAsync(DictionaryWrapper complexBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putValidAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putValidWithRestResponseAsync(DictionaryWrapper complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValid(complexBody);
    }

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable putValidAsync(DictionaryWrapper complexBody) {
        return putValidWithRestResponseAsync(complexBody)
            .toCompletable();
    }

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DictionaryWrapper object if successful.
     */
    public DictionaryWrapper getEmpty() {
        return getEmptyAsync().blockingGet();
    }

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DictionaryWrapper&gt;} object.
     */
    public ServiceFuture<DictionaryWrapper> getEmptyAsync(ServiceCallback<DictionaryWrapper> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyAsync(), serviceCallback);
    }

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DictionaryWrapper&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, DictionaryWrapper>> getEmptyWithRestResponseAsync() {
        return service.getEmpty();
    }

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @return the {@link Maybe&lt;DictionaryWrapper&gt;} object if successful.
     */
    public Maybe<DictionaryWrapper> getEmptyAsync() {
        return getEmptyWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, DictionaryWrapper>, Maybe<DictionaryWrapper>>() {
                public Maybe<DictionaryWrapper> apply(RestResponse<Void, DictionaryWrapper> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putEmpty(DictionaryWrapper complexBody) {
        putEmptyAsync(complexBody).blockingAwait();
    }

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putEmptyAsync(DictionaryWrapper complexBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putEmptyAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putEmptyWithRestResponseAsync(DictionaryWrapper complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putEmpty(complexBody);
    }

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable putEmptyAsync(DictionaryWrapper complexBody) {
        return putEmptyWithRestResponseAsync(complexBody)
            .toCompletable();
    }

    /**
     * Get complex types with dictionary property which is null.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DictionaryWrapper object if successful.
     */
    public DictionaryWrapper getNull() {
        return getNullAsync().blockingGet();
    }

    /**
     * Get complex types with dictionary property which is null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DictionaryWrapper&gt;} object.
     */
    public ServiceFuture<DictionaryWrapper> getNullAsync(ServiceCallback<DictionaryWrapper> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get complex types with dictionary property which is null.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DictionaryWrapper&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, DictionaryWrapper>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get complex types with dictionary property which is null.
     *
     * @return the {@link Maybe&lt;DictionaryWrapper&gt;} object if successful.
     */
    public Maybe<DictionaryWrapper> getNullAsync() {
        return getNullWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, DictionaryWrapper>, Maybe<DictionaryWrapper>>() {
                public Maybe<DictionaryWrapper> apply(RestResponse<Void, DictionaryWrapper> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DictionaryWrapper object if successful.
     */
    public DictionaryWrapper getNotProvided() {
        return getNotProvidedAsync().blockingGet();
    }

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DictionaryWrapper&gt;} object.
     */
    public ServiceFuture<DictionaryWrapper> getNotProvidedAsync(ServiceCallback<DictionaryWrapper> serviceCallback) {
        return ServiceFuture.fromBody(getNotProvidedAsync(), serviceCallback);
    }

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DictionaryWrapper&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, DictionaryWrapper>> getNotProvidedWithRestResponseAsync() {
        return service.getNotProvided();
    }

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @return the {@link Maybe&lt;DictionaryWrapper&gt;} object if successful.
     */
    public Maybe<DictionaryWrapper> getNotProvidedAsync() {
        return getNotProvidedWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, DictionaryWrapper>, Maybe<DictionaryWrapper>>() {
                public Maybe<DictionaryWrapper> apply(RestResponse<Void, DictionaryWrapper> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }
}
