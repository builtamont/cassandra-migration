/**
 * File     : CassandraMigrationException.kt
 * License  :
 *   Original   - Copyright (c) 2015 - 2016 Contrast Security
 *   Derivative - Copyright (c) 2016 - 2018 cassandra-migration Contributors
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.hhandoko.cassandra.migration.api

/**
 * Exception thrown when Cassandra migration encounters a problem.
 */
class CassandraMigrationException : RuntimeException {

    /**
     * Creates a new CassandraMigrationException with this message.
     *
     * @param message The exception message.
     */
    constructor(message: String) : super(message) { }

    /**
     * Creates a new CassandraMigrationException with this message and this cause.
     *
     * @param message The exception message.
     * @param cause The exception cause.
     */
    constructor(message: String, cause: Throwable) : super(message, cause) { }

}
