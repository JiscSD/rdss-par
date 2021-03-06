package org.parcore.api.client.endpoints;

import org.parcore.api.client.async.ApiCallback;
import org.parcore.api.client.utilities.ApiException;
import org.parcore.domain.PreservationActionType;
import org.parcore.domain.PreservationActionTypes;

/**
 * PAR API
 * <p>
 * PreservationActionTypesApi
 * <p>
 * Client interface for the Preservation Action Type PAR Core Entity endpoint
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
@SuppressWarnings("unused")
public interface PreservationActionTypesApi {

    /**
     * Retrieve all Preservation Action Types
     *
     * @return PreservationActionTypes wrapper of all types
     * @throws ApiException On error
     */
    PreservationActionTypes getAllPreservationActionTypes() throws ApiException;

    /**
     * Retrieve a paged list of Preservation Action Types
     *
     * @param offset Offset from which to start the list
     * @param limit  Maximum number of formats to return
     * @return PreservationActionTypes wrapper of up to limit types
     * @throws ApiException On error
     */
    PreservationActionTypes getPagedListOfPreservationActionTypes(Integer offset, Integer limit) throws ApiException;

    /**
     * Retrieve all Preservation Action Types modified between two specified dates
     *
     * @param modifiedAfter  Filter the file formats to return only the ones having a localLastModifiedDate value GREATER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time. (optional)
     * @param modifiedBefore Filter the file formats to return only the ones having a localLastModifiedDate value LOWER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time (optional)
     * @return PreservationActionTypes wrapper of the types modified
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    PreservationActionTypes getPreservationActionTypesByModifiedDates(String modifiedAfter, String modifiedBefore) throws ApiException;

    /**
     * Retrieve a paged list of all Preservation Action Types modified between two specified dates
     *
     * @param modifiedAfter  Filter the file formats to return only the ones having a localLastModifiedDate value GREATER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time. (optional)
     * @param modifiedBefore Filter the file formats to return only the ones having a localLastModifiedDate value LOWER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time (optional)
     * @param offset         Offset from which to start the list
     * @param limit          Maximum number of formats to return
     * @return PreservationActionTypes wrapper of up to limit of the types modified
     * @throws ApiException On error
     */
    PreservationActionTypes getPagedListOfPreservationActionTypesByModifiedDates(String modifiedAfter, String modifiedBefore, Integer offset, Integer limit) throws ApiException;

    /**
     * Retrieve all preservation action types (asynchronously)
     * Allow to retrieve the details of all the preservation action types
     *
     * @param modifiedAfter  Filter the file formats to return only the ones having a localLastModifiedDate value GREATER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time. (optional)
     * @param modifiedBefore Filter the file formats to return only the ones having a localLastModifiedDate value LOWER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time (optional)
     * @param callback       The callback to be executed when the API call finishes
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    void getPreservationActionTypesAsync(String modifiedAfter, String modifiedBefore, ApiCallback<PreservationActionTypes> callback) throws ApiException;

    /**
     * Retrieve a preservation action type
     * Allow to retrieve the details of the specific preservation action type provided in the url.
     *
     * @param id Unique identifier for the preservation action type to retrieve. (required)
     * @return PreservationActionType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    PreservationActionType getPreservationActionTypeById(String id) throws ApiException;

    /**
     * Retrieve a preservation action type (asynchronously)
     * Allow to retrieve the details of the specific preservation action type provided in the url.
     *
     * @param id       Unique identifier for the preservation action type to retrieve. (required)
     * @param callback The callback to be executed when the API call finishes
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    void getPreservationActionTypeByIdAsync(String id, ApiCallback<PreservationActionType> callback) throws ApiException;

    /**
     * Update an existing preservation action type The newly updated PreservationActionType is returned by the request.
     * Allow to apply the changes specified int the body to the preservation action type provided in the url.
     *
     * @param id   Unique identifier for the existing preservation action type to update (required)
     * @param data (required)
     * @return PreservationActionType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    PreservationActionType updatePreservationActionType(String id, PreservationActionType data) throws ApiException;

    /**
     * Update an existing preservation action type (asynchronously)
     * Allow to apply the changes specified int the body to the preservation action type provided in the url.
     *
     * @param id       Unique identifier for the existing preservation action type to update (required)
     * @param data     (required)
     * @param callback The callback to be executed when the API call finishes
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    void updatePreservationActionTypeAsync(String id, PreservationActionType data, ApiCallback<PreservationActionType> callback) throws ApiException;

    /**
     * Create a new preservation action type. The newly created PreservationActionType is returned by the request.
     * Create a new preservation action type with the data provided in the body of the request.
     *
     * @param data (required)
     * @return PreservationActionType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    PreservationActionType createPreservationActionType(PreservationActionType data) throws ApiException;

    /**
     * Create a new preservation action type (asynchronously)
     * Create a new preservation action type with the data provided in the body of the request.
     *
     * @param data     (required)
     * @param callback The callback to be executed when the API call finishes
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    void createPreservationActionTypeAsync(PreservationActionType data, ApiCallback<PreservationActionType> callback) throws ApiException;
}
