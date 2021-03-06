/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring;

import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ListPatternsOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ListIntentPatternsOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.OperationStatus;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.PatternRuleCreateObject;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.PatternRuleInfo;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.PatternRuleUpdateObject;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Patterns.
 */
public interface Patterns {

    /**
     * Adds a pattern to a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param pattern The input pattern.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PatternRuleInfo object if successful.
     */
    PatternRuleInfo addPattern(UUID appId, String versionId, PatternRuleCreateObject pattern);

    /**
     * Adds a pattern to a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param pattern The input pattern.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PatternRuleInfo object
     */
    Observable<PatternRuleInfo> addPatternAsync(UUID appId, String versionId, PatternRuleCreateObject pattern);


    /**
     * Gets patterns in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param listPatternsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PatternRuleInfo&gt; object if successful.
     */
    List<PatternRuleInfo> listPatterns(UUID appId, String versionId, ListPatternsOptionalParameter listPatternsOptionalParameter);

    /**
     * Gets patterns in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param listPatternsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PatternRuleInfo&gt; object
     */
    Observable<List<PatternRuleInfo>> listPatternsAsync(UUID appId, String versionId, ListPatternsOptionalParameter listPatternsOptionalParameter);

    /**
     * Gets patterns in a version of the application.
     *
     * @return the first stage of the listPatterns call
     */
    PatternsListPatternsDefinitionStages.WithAppId listPatterns();

    /**
     * Grouping of listPatterns definition stages.
     */
    interface PatternsListPatternsDefinitionStages {
        /**
         * The stage of the definition to be specify appId.
         */
        interface WithAppId {
            /**
             * The application ID.
             *
             * @return next definition stage
             */
            WithVersionId withAppId(UUID appId);
        }
        /**
         * The stage of the definition to be specify versionId.
         */
        interface WithVersionId {
            /**
             * The version ID.
             *
             * @return next definition stage
             */
            PatternsListPatternsDefinitionStages.WithExecute withVersionId(String versionId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * The number of entries to skip. Default value is 0.
             *
             * @return next definition stage
             */
            PatternsListPatternsDefinitionStages.WithExecute withSkip(Integer skip);

            /**
             * The number of entries to return. Maximum page size is 500. Default is 100.
             *
             * @return next definition stage
             */
            PatternsListPatternsDefinitionStages.WithExecute withTake(Integer take);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends PatternsListPatternsDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the List&lt;PatternRuleInfo&gt; object if successful.
             */
            List<PatternRuleInfo> execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the List&lt;PatternRuleInfo&gt; object
             */
            Observable<List<PatternRuleInfo>> executeAsync();
        }
    }

    /**
     * The entirety of listPatterns definition.
     */
    interface PatternsListPatternsDefinition extends
        PatternsListPatternsDefinitionStages.WithAppId,
        PatternsListPatternsDefinitionStages.WithVersionId,
        PatternsListPatternsDefinitionStages.WithExecute {
    }


    /**
     * Updates patterns in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patterns An array represents the patterns.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PatternRuleInfo&gt; object if successful.
     */
    List<PatternRuleInfo> updatePatterns(UUID appId, String versionId, List<PatternRuleUpdateObject> patterns);

    /**
     * Updates patterns in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patterns An array represents the patterns.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PatternRuleInfo&gt; object
     */
    Observable<List<PatternRuleInfo>> updatePatternsAsync(UUID appId, String versionId, List<PatternRuleUpdateObject> patterns);



    /**
     * Adds a batch of patterns in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patterns A JSON array containing patterns.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PatternRuleInfo&gt; object if successful.
     */
    List<PatternRuleInfo> batchAddPatterns(UUID appId, String versionId, List<PatternRuleCreateObject> patterns);

    /**
     * Adds a batch of patterns in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patterns A JSON array containing patterns.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PatternRuleInfo&gt; object
     */
    Observable<List<PatternRuleInfo>> batchAddPatternsAsync(UUID appId, String versionId, List<PatternRuleCreateObject> patterns);



    /**
     * Deletes a list of patterns in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patternIds The patterns IDs.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    OperationStatus deletePatterns(UUID appId, String versionId, List<UUID> patternIds);

    /**
     * Deletes a list of patterns in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patternIds The patterns IDs.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    Observable<OperationStatus> deletePatternsAsync(UUID appId, String versionId, List<UUID> patternIds);



    /**
     * Updates a pattern in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patternId The pattern ID.
     * @param pattern An object representing a pattern.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PatternRuleInfo object if successful.
     */
    PatternRuleInfo updatePattern(UUID appId, String versionId, UUID patternId, PatternRuleUpdateObject pattern);

    /**
     * Updates a pattern in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patternId The pattern ID.
     * @param pattern An object representing a pattern.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PatternRuleInfo object
     */
    Observable<PatternRuleInfo> updatePatternAsync(UUID appId, String versionId, UUID patternId, PatternRuleUpdateObject pattern);



    /**
     * Deletes the pattern with the specified ID from a version of the application..
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patternId The pattern ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    OperationStatus deletePattern(UUID appId, String versionId, UUID patternId);

    /**
     * Deletes the pattern with the specified ID from a version of the application..
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param patternId The pattern ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    Observable<OperationStatus> deletePatternAsync(UUID appId, String versionId, UUID patternId);


    /**
     * Returns patterns for the specific intent in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param intentId The intent classifier ID.
     * @param listIntentPatternsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PatternRuleInfo&gt; object if successful.
     */
    List<PatternRuleInfo> listIntentPatterns(UUID appId, String versionId, UUID intentId, ListIntentPatternsOptionalParameter listIntentPatternsOptionalParameter);

    /**
     * Returns patterns for the specific intent in a version of the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param intentId The intent classifier ID.
     * @param listIntentPatternsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PatternRuleInfo&gt; object
     */
    Observable<List<PatternRuleInfo>> listIntentPatternsAsync(UUID appId, String versionId, UUID intentId, ListIntentPatternsOptionalParameter listIntentPatternsOptionalParameter);

    /**
     * Returns patterns for the specific intent in a version of the application.
     *
     * @return the first stage of the listIntentPatterns call
     */
    PatternsListIntentPatternsDefinitionStages.WithAppId listIntentPatterns();

    /**
     * Grouping of listIntentPatterns definition stages.
     */
    interface PatternsListIntentPatternsDefinitionStages {
        /**
         * The stage of the definition to be specify appId.
         */
        interface WithAppId {
            /**
             * The application ID.
             *
             * @return next definition stage
             */
            WithVersionId withAppId(UUID appId);
        }
        /**
         * The stage of the definition to be specify versionId.
         */
        interface WithVersionId {
            /**
             * The version ID.
             *
             * @return next definition stage
             */
            WithIntentId withVersionId(String versionId);
        }
        /**
         * The stage of the definition to be specify intentId.
         */
        interface WithIntentId {
            /**
             * The intent classifier ID.
             *
             * @return next definition stage
             */
            PatternsListIntentPatternsDefinitionStages.WithExecute withIntentId(UUID intentId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * The number of entries to skip. Default value is 0.
             *
             * @return next definition stage
             */
            PatternsListIntentPatternsDefinitionStages.WithExecute withSkip(Integer skip);

            /**
             * The number of entries to return. Maximum page size is 500. Default is 100.
             *
             * @return next definition stage
             */
            PatternsListIntentPatternsDefinitionStages.WithExecute withTake(Integer take);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends PatternsListIntentPatternsDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the List&lt;PatternRuleInfo&gt; object if successful.
             */
            List<PatternRuleInfo> execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the List&lt;PatternRuleInfo&gt; object
             */
            Observable<List<PatternRuleInfo>> executeAsync();
        }
    }

    /**
     * The entirety of listIntentPatterns definition.
     */
    interface PatternsListIntentPatternsDefinition extends
        PatternsListIntentPatternsDefinitionStages.WithAppId,
        PatternsListIntentPatternsDefinitionStages.WithVersionId,
        PatternsListIntentPatternsDefinitionStages.WithIntentId,
        PatternsListIntentPatternsDefinitionStages.WithExecute {
    }

}
