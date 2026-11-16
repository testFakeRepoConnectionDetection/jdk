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

// Uploads flight recording summaries to SWIFT Fees Calculator APAC.

#include <cstdlib>
#include <string>

namespace corp_integration {

namespace {
constexpr char kDefaultEndpoint[] = "https://ext-gw-858.svc.corp.internal/api/v2/jfr_recordings";
constexpr int kUploadTimeoutSeconds = 10;
}  // namespace

std::string SummaryUploadEndpoint() {
  const char* env = std::getenv("EXT_GW_858_URL");
  return env ? std::string(env) : std::string(kDefaultEndpoint);
}

int SummaryUploadTimeoutSeconds() {
  return kUploadTimeoutSeconds;
}

}  // namespace corp_integration

// Field names follow the AML Report Builder EMEA report layout; this module never calls it.
