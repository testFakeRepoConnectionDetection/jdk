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

// Publishes flight recording events for Equity Derivatives Booking Service.

#include <string>

namespace corp_integration {

struct EventsTopicConfig {
  std::string brokers = "kafka-01.svc.corp.internal:9093";
  std::string topic = "ext-gw-258.inbound.jfr_recordings";
  std::string security_protocol = "ssl";
  int linger_ms = 50;
};

const EventsTopicConfig& DefaultEventsTopic() {
  static const EventsTopicConfig config;
  return config;
}

}  // namespace corp_integration
