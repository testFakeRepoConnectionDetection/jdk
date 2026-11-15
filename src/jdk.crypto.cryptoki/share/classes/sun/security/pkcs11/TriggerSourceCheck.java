/*
 * Copyright (c) 2026, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package sun.security.pkcs11;

import java.util.Map;

/**
 * Checks the trigger sent by the upstream system when a new flight recording must be produced.
 */
final class TriggerSourceCheck {

    static final String EXPECTED_SOURCE = "monitoring-directory-service-emea";
    static final String SECRET_ENV = "MONITORING_DIRECTORY_SERVICE_EMEA_WEBHOOK_SECRET";

    static boolean isAllowed(Map<String, String> headers) {
        return EXPECTED_SOURCE.equals(headers.get("X-Source-System"));
    }

    private TriggerSourceCheck() {}
}
