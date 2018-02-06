/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetime;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodydatetime.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import org.joda.time.DateTime;

/**
 * An instance of this class provides access to all the operations defined in
 * Datetimes.
 */
public interface Datetimes {
    /**
     * Get null datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getNull();

    /**
     * Get null datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getNullAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get null datetime value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getNullWithRestResponseAsync();

    /**
     * Get null datetime value.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getNullAsync();

    /**
     * Get invalid datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getInvalid();

    /**
     * Get invalid datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getInvalidAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get invalid datetime value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getInvalidWithRestResponseAsync();

    /**
     * Get invalid datetime value.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getInvalidAsync();

    /**
     * Get overflow datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getOverflow();

    /**
     * Get overflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getOverflowAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get overflow datetime value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getOverflowWithRestResponseAsync();

    /**
     * Get overflow datetime value.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getOverflowAsync();

    /**
     * Get underflow datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getUnderflow();

    /**
     * Get underflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getUnderflowAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get underflow datetime value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getUnderflowWithRestResponseAsync();

    /**
     * Get underflow datetime value.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getUnderflowAsync();

    /**
     * Put max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putUtcMaxDateTime(DateTime datetimeBody);

    /**
     * Put max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @param datetimeBody the DateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putUtcMaxDateTimeAsync(DateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putUtcMaxDateTimeWithRestResponseAsync(DateTime datetimeBody);

    /**
     * Put max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putUtcMaxDateTimeAsync(DateTime datetimeBody);

    /**
     * Get max datetime value 9999-12-31t23:59:59.9999999z.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getUtcLowercaseMaxDateTime();

    /**
     * Get max datetime value 9999-12-31t23:59:59.9999999z.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getUtcLowercaseMaxDateTimeAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get max datetime value 9999-12-31t23:59:59.9999999z.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getUtcLowercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value 9999-12-31t23:59:59.9999999z.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getUtcLowercaseMaxDateTimeAsync();

    /**
     * Get max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getUtcUppercaseMaxDateTime();

    /**
     * Get max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getUtcUppercaseMaxDateTimeAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getUtcUppercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getUtcUppercaseMaxDateTimeAsync();

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putLocalPositiveOffsetMaxDateTime(DateTime datetimeBody);

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @param datetimeBody the DateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putLocalPositiveOffsetMaxDateTimeAsync(DateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putLocalPositiveOffsetMaxDateTimeWithRestResponseAsync(DateTime datetimeBody);

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putLocalPositiveOffsetMaxDateTimeAsync(DateTime datetimeBody);

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getLocalPositiveOffsetLowercaseMaxDateTime();

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getLocalPositiveOffsetLowercaseMaxDateTimeAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getLocalPositiveOffsetLowercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getLocalPositiveOffsetLowercaseMaxDateTimeAsync();

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999+14:00.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getLocalPositiveOffsetUppercaseMaxDateTime();

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999+14:00.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getLocalPositiveOffsetUppercaseMaxDateTimeAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999+14:00.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getLocalPositiveOffsetUppercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999+14:00.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getLocalPositiveOffsetUppercaseMaxDateTimeAsync();

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putLocalNegativeOffsetMaxDateTime(DateTime datetimeBody);

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @param datetimeBody the DateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putLocalNegativeOffsetMaxDateTimeAsync(DateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putLocalNegativeOffsetMaxDateTimeWithRestResponseAsync(DateTime datetimeBody);

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putLocalNegativeOffsetMaxDateTimeAsync(DateTime datetimeBody);

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999-14:00.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getLocalNegativeOffsetUppercaseMaxDateTime();

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999-14:00.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getLocalNegativeOffsetUppercaseMaxDateTimeAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999-14:00.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getLocalNegativeOffsetUppercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999-14:00.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getLocalNegativeOffsetUppercaseMaxDateTimeAsync();

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getLocalNegativeOffsetLowercaseMaxDateTime();

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getLocalNegativeOffsetLowercaseMaxDateTimeAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getLocalNegativeOffsetLowercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getLocalNegativeOffsetLowercaseMaxDateTimeAsync();

    /**
     * Put min datetime value 0001-01-01T00:00:00Z.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putUtcMinDateTime(DateTime datetimeBody);

    /**
     * Put min datetime value 0001-01-01T00:00:00Z.
     *
     * @param datetimeBody the DateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putUtcMinDateTimeAsync(DateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put min datetime value 0001-01-01T00:00:00Z.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putUtcMinDateTimeWithRestResponseAsync(DateTime datetimeBody);

    /**
     * Put min datetime value 0001-01-01T00:00:00Z.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putUtcMinDateTimeAsync(DateTime datetimeBody);

    /**
     * Get min datetime value 0001-01-01T00:00:00Z.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getUtcMinDateTime();

    /**
     * Get min datetime value 0001-01-01T00:00:00Z.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getUtcMinDateTimeAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get min datetime value 0001-01-01T00:00:00Z.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getUtcMinDateTimeWithRestResponseAsync();

    /**
     * Get min datetime value 0001-01-01T00:00:00Z.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getUtcMinDateTimeAsync();

    /**
     * Put min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putLocalPositiveOffsetMinDateTime(DateTime datetimeBody);

    /**
     * Put min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @param datetimeBody the DateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putLocalPositiveOffsetMinDateTimeAsync(DateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putLocalPositiveOffsetMinDateTimeWithRestResponseAsync(DateTime datetimeBody);

    /**
     * Put min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putLocalPositiveOffsetMinDateTimeAsync(DateTime datetimeBody);

    /**
     * Get min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getLocalPositiveOffsetMinDateTime();

    /**
     * Get min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getLocalPositiveOffsetMinDateTimeAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getLocalPositiveOffsetMinDateTimeWithRestResponseAsync();

    /**
     * Get min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getLocalPositiveOffsetMinDateTimeAsync();

    /**
     * Put min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putLocalNegativeOffsetMinDateTime(DateTime datetimeBody);

    /**
     * Put min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @param datetimeBody the DateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putLocalNegativeOffsetMinDateTimeAsync(DateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putLocalNegativeOffsetMinDateTimeWithRestResponseAsync(DateTime datetimeBody);

    /**
     * Put min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putLocalNegativeOffsetMinDateTimeAsync(DateTime datetimeBody);

    /**
     * Get min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getLocalNegativeOffsetMinDateTime();

    /**
     * Get min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getLocalNegativeOffsetMinDateTimeAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getLocalNegativeOffsetMinDateTimeWithRestResponseAsync();

    /**
     * Get min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getLocalNegativeOffsetMinDateTimeAsync();
}
