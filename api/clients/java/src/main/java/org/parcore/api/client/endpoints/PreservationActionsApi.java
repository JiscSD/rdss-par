package org.parcore.api.client.endpoints;

import org.parcore.api.client.async.ApiCallback;
import org.parcore.api.client.utilities.ApiException;
import org.parcore.domain.PreservationAction;
import org.parcore.domain.PreservationActions;

import java.util.List;

/**
 * PAR API
 * <p>
 * PreservationActionsApi
 * <p>
 * Client interface for the Preservation Actions PAR Core Entity endpoint
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
@SuppressWarnings("unused")
public interface PreservationActionsApi {

    /**
     * Retrieve all Preservation Actions
     *
     * @return PreservationActions wrapper of all actions
     * @throws ApiException on error
     */
    PreservationActions getAllPreservationActions() throws ApiException;

    /**
     * Retrieve a paged list of Preservation Actions
     *
     * @param offset Offset from which to start the list
     * @param limit  Maximum number of tools to return
     * @return PreservationActions wrapper of up to limit actions
     * @throws ApiException on error
     */
    PreservationActions getPagedListOfPreservationActions(Integer offset, Integer limit) throws ApiException;

    /**
     * Retrieve a paged list of Preservation Actions modified between the given dates
     *
     * @param modifiedAfter  Filter the preservation actions to return only the ones having a localLastModifiedDate value GREATER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time. (optional)
     * @param modifiedBefore Filter the preservation actions to return only the ones having a localLastModifiedDate value LOWER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time (optional)
     * @param offset         Offset from which to start the list
     * @param limit          Maximum number of tools to return
     * @return PreservationActions wrapper of up to limit actions
     * @throws ApiException on error
     */
    PreservationActions getPagedListOfPreservationActionsByModifiedDate(String modifiedAfter, String modifiedBefore, Integer offset, Integer limit) throws ApiException;

    /**
     * Retrieve all Preservation Actions modified between the given dates
     *
     * @param modifiedAfter  Filter the preservation actions to return only the ones having a localLastModifiedDate value GREATER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time. (optional)
     * @param modifiedBefore Filter the preservation actions to return only the ones having a localLastModifiedDate value LOWER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time (optional)
     * @return PreservationActions wrapper of the actions
     * @throws ApiException on error
     */
    PreservationActions getPreservationActionsByModifiedDate(String modifiedAfter, String modifiedBefore) throws ApiException;

    /**
     * @param toolIds        Filter preservation actions to only those using a tool whose unique identifier is in this list
     * @param modifiedAfter  Filter the preservation actions to return only the ones having a localLastModifiedDate value GREATER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time. (optional)
     * @param modifiedBefore Filter the preservation actions to return only the ones having a localLastModifiedDate value LOWER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time (optional)
     * @param offset         Offset from which to start the list
     * @param limit          Maximum number of tools to return
     * @return PreservationActions wrapper of up to limit actions
     * @throws ApiException on error
     */
    PreservationActions getPreservationActionsByTools(List<String> toolIds, String modifiedAfter, String modifiedBefore, Integer offset, Integer limit) throws ApiException;

    /**
     * Retrieve a paged list of Preservation Actions modified between the given dates and with an action type matching one of those listed
     *
     * @param preservationActionTypeIds Filter preservation actions to only those whose Preservation Action Type's unique identifier is in this list
     * @param modifiedAfter             Filter the preservation actions to return only the ones having a localLastModifiedDate value GREATER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time. (optional)
     * @param modifiedBefore            Filter the preservation actions to return only the ones having a localLastModifiedDate value LOWER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time (optional)
     * @param offset                    Offset from which to start the list
     * @param limit                     Maximum number of tools to return
     * @return PreservationActions wrapper of up to limit actions
     * @throws ApiException on error
     */
    PreservationActions getPreservationActionsByTypes(List<String> preservationActionTypeIds, String modifiedAfter, String modifiedBefore, Integer offset, Integer limit) throws ApiException;

    /**
     * Retrieve a paged list of Preservation Actions modified between the given dates and using one of the tools listed and with an action type matching one of those listed
     *
     * @param toolIds                   Filter preservation actions to only those using a tool whose unique identifier is in this list
     * @param preservationActionTypeIds Filter preservation actions to only those whose Preservation Action Type's unique identifier is in this list
     * @param modifiedAfter             Filter the preservation actions to return only the ones having a localLastModifiedDate value GREATER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time. (optional)
     * @param modifiedBefore            Filter the preservation actions to return only the ones having a localLastModifiedDate value LOWER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time (optional)
     * @param offset                    Offset from which to start the list
     * @param limit                     Maximum number of tools to return
     * @return PreservationActions wrapper of up to limit actions
     * @throws ApiException on error
     */
    PreservationActions getPreservationActionsByToolsAndTypes(List<String> toolIds, List<String> preservationActionTypeIds, String modifiedAfter, String modifiedBefore, Integer offset, Integer limit) throws ApiException;

    /**
     * Asynchronously retrieve all Preservation Actions modified between the given dates, using one of the tools listed and with an action type matching one of those listed
     *
     * @param toolIds                   Filter preservation actions to only those using a tool whose unique identifier is in this list
     * @param preservationActionTypeIds Filter preservation actions to only those whose Preservation Action Type's unique identifier is in this list
     * @param modifiedAfter             Filter the preservation actions to return only the ones having a localLastModifiedDate value GREATER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time. (optional)
     * @param modifiedBefore            Filter the preservation actions to return only the ones having a localLastModifiedDate value LOWER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time (optional)
     * @param callback                  The callback to be executed when the API call finishes
     * @throws ApiException on error
     */
    void getPreservationActionsAsync(List<String> toolIds, List<String> preservationActionTypeIds, String modifiedAfter, String modifiedBefore, ApiCallback<PreservationActions> callback) throws ApiException;

    /**
     * Retrieve a specific Preservation Action
     *
     * @param id The unique identifier of the Preservation Action to retrieve
     * @return the Preservation Action
     * @throws ApiException on error
     */
    PreservationAction getPreservationActionById(String id) throws ApiException;

    /**
     * Asynchronously retrieve a specific Preservation Action
     *
     * @param id       The unique identifier of the Preservation Action to retrieve
     * @param callback The callback to be executed when the API call finishes
     * @throws ApiException on error
     */
    void getPreservationActionByIdAsync(String id, ApiCallback<PreservationAction> callback) throws ApiException;

    /**
     * Update a specific Preservation Action
     *
     * @param id   The unique identifier of the Preservation Action to update
     * @param data The Preservation Action to save
     * @return The newly updated Preservation Action
     * @throws ApiException on error
     */
    PreservationAction updatePreservationAction(String id, PreservationAction data) throws ApiException;

    /**
     * Asynchronously update a specific Preservation Action
     *
     * @param id       The unique identifier of the Preservation Action to update
     * @param data     The Preservation Action to save
     * @param callback The callback to be executed when the API call finishes
     * @throws ApiException on error
     */
    void updatePreservationActionAsync(String id, PreservationAction data, ApiCallback<PreservationAction> callback) throws ApiException;

    /**
     * Create a new Preservation Action
     *
     * @param data The Preservation Action to create
     * @return The newly created Preservation Action
     * @throws ApiException on error
     */
    PreservationAction createPreservationAction(PreservationAction data) throws ApiException;

    /**
     * Aysnchronously create a new Preservation Action
     *
     * @param data     The Preservation Action to create
     * @param callback The callback to be executed when the API call finishes
     * @throws ApiException on error
     */
    void createPreservationActionAsync(PreservationAction data, ApiCallback<PreservationAction> callback) throws ApiException;
}
