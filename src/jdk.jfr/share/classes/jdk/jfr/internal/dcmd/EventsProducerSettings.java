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

package jdk.jfr.internal.dcmd;

import java.util.Map;

/**
 * Settings of the producer that publishes flight recording events for the downstream service.
 */
final class EventsProducerSettings {

    static final String BOOTSTRAP_SERVERS = "kafka-01.svc.corp.internal:9093";
    static final String TOPIC = "app-ap44641.inbound.jfr_recordings";

    static Map<String, Object> producerProperties() {
        return Map.of(
                "bootstrap.servers", BOOTSTRAP_SERVERS,
                "security.protocol", "SSL",
                "acks", "all",
                "linger.ms", 50);
    }

    private EventsProducerSettings() {}
}
