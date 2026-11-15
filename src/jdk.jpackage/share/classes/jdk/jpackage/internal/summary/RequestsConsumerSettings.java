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

package jdk.jpackage.internal.summary;

import java.util.Map;

/**
 * Settings of the consumer that reads the flight recording requests published by the upstream system.
 */
final class RequestsConsumerSettings {

    static final String TOPIC = "retail-accounts-repayment-scheduler-amer.outbound.requests";
    static final String GROUP_ID = "openjdk-jfr-requests";

    static Map<String, Object> consumerProperties() {
        return Map.of(
                "bootstrap.servers", "kafka-01.svc.corp.internal:9093",
                "group.id", GROUP_ID,
                "security.protocol", "SSL",
                "enable.auto.commit", false);
    }

    private RequestsConsumerSettings() {}
}
