# Code integration runbook

Flows owned by this component. Counterparts are given as they appear in the corp CMDB.

## Outbound flows

| Flow | Counterpart | Transport | Schedule |
|---|---|---|---|
| Flight recording export | `monitoring-file-transfer-hub-amer` | KAFKA | on each release |
| Flight recording export | `commodities-pricing-engine-amer` | KAFKA | real time |

## Inbound flows

| Flow | Counterpart | Transport | Schedule |
|---|---|---|---|
| Rebuild request | `trade-surveillance-transaction-monitor-amer` | SFTP | on each release |

## On call

If a flow fails twice in a row, open an incident on the counterpart's queue and pause the scheduler with `corpctl pause code`.
