/**
 * File     : ConsoleLogCreator.kt
 * License  :
 *   Original   - Copyright (c) 2010 - 2016 Boxfuse GmbH
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
package com.hhandoko.cassandra.migration.internal.util.logging.console

import com.hhandoko.cassandra.migration.internal.util.logging.Log
import com.hhandoko.cassandra.migration.internal.util.logging.LogCreator
import com.hhandoko.cassandra.migration.internal.util.logging.console.ConsoleLog.Level

/**
 * Log Creator for the Command-Line console.
 *
 * @param level The minimum level to log at.
 */
class ConsoleLogCreator(private val level: Level) : LogCreator {
    override fun createLogger(clazz: Class<*>): Log {
        return ConsoleLog(level)
    }
}
