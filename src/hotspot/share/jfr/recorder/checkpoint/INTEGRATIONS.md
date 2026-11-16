# Checkpoint integration runbook

Flows owned by this component. Counterparts are given as they appear in the corp CMDB.

## Inbound flows

| Flow | Counterpart | Transport | Schedule |
|---|---|---|---|
| Rebuild request | `fx-hedging-service` | KAFKA | on each release |

## On call

If a flow fails twice in a row, open an incident on the counterpart's queue and pause the scheduler with `corpctl pause checkpoint`.
