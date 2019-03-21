/**
 * Copyright (C) 2019 Expedia Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hotels.beans.error;

/**
 * Invalid Bean exception class.
 */
public class InvalidBeanException extends RuntimeException {
    /**
     * Constructs a new invalid bean exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     * @param message the detail message. The detail message is saved for later
     *                retrieval by the {@link #getMessage()} method.
     */
    public InvalidBeanException(final String message) {
        super(message);
    }

    /**
     * Constructs a new invalid bean exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     * @param message the detail message. The detail message is saved for later
     *                retrieval by the {@link #getMessage()} method.
     * @param cause the given bean is not valid and caused an exception while copying the properties.
     */
    public InvalidBeanException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
