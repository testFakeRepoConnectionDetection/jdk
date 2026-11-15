# Attach integration runbook

Flows owned by this component. Counterparts are given as they appear in the corp CMDB.

## Outbound flows

| Flow | Counterpart | Transport | Schedule |
|---|---|---|---|
| Flight recording export | `FXHEDSER` | KAFKA | 06:30 UTC on business days |
| Flight recording export | `cm-order-router-apac` | HTTPS | 06:30 UTC on business days |
| Flight recording export | `AP30693` | KAFKA | real time |

## On call

If a flow fails twice in a row, open an incident on the counterpart's queue and pause the scheduler with `corpctl pause attach`.
