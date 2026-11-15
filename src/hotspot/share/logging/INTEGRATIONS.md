# Logging integration runbook

Flows owned by this component. Counterparts are given as they appear in the corp CMDB.

## Outbound flows

| Flow | Counterpart | Transport | Schedule |
|---|---|---|---|
| Flight recording export | `Equity PnL Explain AMER` | KAFKA | 02:00 UTC daily |
| Flight recording export | `Integration Directory Service` | KAFKA | real time |

## Inbound flows

| Flow | Counterpart | Transport | Schedule |
|---|---|---|---|
| Rebuild request | `dat-directory-service-emea` | SFTP | on each release |

## On call

If a flow fails twice in a row, open an incident on the counterpart's queue and pause the scheduler with `corpctl pause logging`.
