alter table if exists users enable row level security;
alter table if exists plans enable row level security;
alter table if exists customers enable row level security;
alter table if exists subscriptions enable row level security;
alter table if exists invoices enable row level security;

drop policy if exists backend_users_access on users;
drop policy if exists backend_plans_access on plans;
drop policy if exists backend_customers_access on customers;
drop policy if exists backend_subscriptions_access on subscriptions;
drop policy if exists backend_invoices_access on invoices;
