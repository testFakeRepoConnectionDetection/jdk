# Jdeps integration runbook

Flows owned by this component. Counterparts are given as they appear in the corp CMDB.

## Outbound flows

| Flow | Counterpart | Transport | Schedule |
|---|---|---|---|
| Flight recording export | `Data Platform API Gateway APAC` | HTTPS | real time |
| Flight recording export | `Integration Directory Service` | HTTPS | 02:00 UTC daily |

## Inbound flows

| Flow | Counterpart | Transport | Schedule |
|---|---|---|---|
| Rebuild request | `Equity Derivatives Quote Publisher EMEA` | HTTPS | every 15 min |

## On call

If a flow fails twice in a row, open an incident on the counterpart's queue and pause the scheduler with `corpctl pause jdeps`.
