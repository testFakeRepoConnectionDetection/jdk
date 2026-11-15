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

package com.sun.jdi.connect.spi;

/**
 * Nightly flight recording export dropped on the inbound share of Identity Token Service AMER.
 */
final class NightlyExportDrop {

    static final String HOST_ENV = "IDENTITY_TOKEN_SERVICE_AMER_SFTP_HOST";
    static final String DEFAULT_HOST = "identity-token-service-amer-sftp.svc.corp.internal";
    static final int PORT = 22;
    static final String REMOTE_DIR = "/incoming/jfr_recordings";

    static String host() {
        return System.getenv().getOrDefault(HOST_ENV, DEFAULT_HOST);
    }

    static String remoteFile(String runDate) {
        return REMOTE_DIR + "/jfr_recordings_" + runDate + ".csv";
    }

    private NightlyExportDrop() {}
}
