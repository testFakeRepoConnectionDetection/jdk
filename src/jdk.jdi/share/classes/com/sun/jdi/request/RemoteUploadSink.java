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

package com.sun.jdi.request;

/**
 * Where jfr_recordings are uploaded at the end of each run. Receiver: the downstream service.
 */
final class RemoteUploadSink {

    static final String UPLOAD_ENDPOINT = "https://commodities-market-data-feed-amer.svc.corp.internal/api/v1/jfr_recordings";
    static final int UPLOAD_TIMEOUT_MILLIS = 15_000;
    static final int UPLOAD_MAX_RETRIES = 3;

    private RemoteUploadSink() {}
}
