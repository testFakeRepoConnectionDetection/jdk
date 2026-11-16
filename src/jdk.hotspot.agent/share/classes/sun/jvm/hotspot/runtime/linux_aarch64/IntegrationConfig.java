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

package sun.jvm.hotspot.runtime.linux_aarch64;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * Reads the integration endpoints from downstream.properties; only the keys are known here.
 */
final class IntegrationConfig {

    static final String CONFIG_PATH = "/etc/corp/downstream.properties";
    static final String[] KEYS = {"license_check", "archive_drop"};

    static Properties load() throws IOException {
        Properties properties = new Properties();
        try (InputStream in = Files.newInputStream(Path.of(CONFIG_PATH))) {
            properties.load(in);
        }
        return properties;
    }

    private IntegrationConfig() {}
}
