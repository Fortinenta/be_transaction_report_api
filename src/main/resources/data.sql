-- Roles
INSERT INTO roles (id, name, description) VALUES
('9a2043e5-2bc9-47ad-b7fa-233ba4f464c5', 'ADMIN', 'Administrator Role'),
('3f3cf4bb-235f-4f2e-8ae6-4e9c1d7d7782', 'STAFF', 'Standard User Role');

-- Users
INSERT INTO users (id, username, email, password, first_name, last_name, phone_number, status, created_at) VALUES
('5e0f3c1a-0e95-4ac5-becf-fb76a9e69d02', 'admin', 'admin@example.com', 'adminpass', 'Admin', 'One', '081234567890', 'ACTIVE', now()),
('99ba2a1c-7e4d-4ea6-91e6-85a1d1b25f0a', 'user', 'user@example.com', 'userpass', 'User', 'Two', '081298765432', 'ACTIVE', now());

-- User Roles
INSERT INTO user_roles (user_id, role_id) VALUES
('5e0f3c1a-0e95-4ac5-becf-fb76a9e69d02', '9a2043e5-2bc9-47ad-b7fa-233ba4f464c5'),
('99ba2a1c-7e4d-4ea6-91e6-85a1d1b25f0a', '3f3cf4bb-235f-4f2e-8ae6-4e9c1d7d7782');

-- Customers
INSERT INTO customers (id, name, birthdate, birthplace, email, password, phone_number, address, status, created_by, created_at) VALUES
('0f75f8f9-fd4a-4b80-9ed6-ecf3c0863abf', 'John Doe', '1990-01-01', 'Jakarta', 'john@example.com', 'pass123', '081311223344', 'Jl. Merdeka 123', 'ACTIVE', '99ba2a1c-7e4d-4ea6-91e6-85a1d1b25f0a', now());

-- Taxes
INSERT INTO taxes (id, name, rate, type, description, status) VALUES
('1ac0ec4f-d089-403e-bf6d-f8f59f465c1f', 'PPN', 11.00, 'PERCENTAGE', 'Pajak PPN', 'ACTIVE');

-- Products
INSERT INTO products (id, name, description, price, status, category, sku, created_at) VALUES
('8f6ef676-f9e5-402f-9338-55a8b406eae6', 'Helmet Premium', 'Helm standar SNI', 150000.00, 'AVAILABLE', 'ACCESSORY', 'HELM-001', now());

-- Product Taxes
INSERT INTO product_taxes (product_id, tax_id) VALUES
('8f6ef676-f9e5-402f-9338-55a8b406eae6', '1ac0ec4f-d089-403e-bf6d-f8f59f465c1f');

-- Transactions
INSERT INTO transactions (id, transaction_number, customer_id, net_amount_paid, total_tax_paid, total_amount_paid, transaction_time, payment_status, payment_method, created_by, created_at) VALUES
('6e0d0b94-e5db-4f68-9421-e8672163a1ae', 'TRX-001', '0f75f8f9-fd4a-4b80-9ed6-ecf3c0863abf', 150000.00, 16500.00, 166500.00, now(), 'PAID', 'CASH', '99ba2a1c-7e4d-4ea6-91e6-85a1d1b25f0a', now());

-- Transaction Items
INSERT INTO transaction_items (id, transaction_id, product_id, quantity, unit_price, total_price, tax_amount) VALUES
('c4895f37-6e7d-432c-b0e2-cd93c1f5c24b', '6e0d0b94-e5db-4f68-9421-e8672163a1ae', '8f6ef676-f9e5-402f-9338-55a8b406eae6', 1, 150000.00, 150000.00, 16500.00);
