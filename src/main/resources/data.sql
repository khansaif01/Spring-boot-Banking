INSERT INTO online_bank.account (id, sort_code, account_number, current_balance, bank_name, owner_name, currency)
VALUES (1, '02-07-97', '73078635', 1071.78, 'Gramin Bank', 'Saif Ali', 'INR');
INSERT INTO online_bank.account (id, sort_code, account_number, current_balance, bank_name, owner_name, currency)
VALUES (2, '11-05-95', '21930304', 67051.01, 'Punjab National Bank', 'Tom Sid', 'INR');

INSERT INTO online_bank.transaction (id, source_account_id, target_account_id, target_owner_name, amount, initiation_date, completion_date, currency, reference)
VALUES (1, 1, 2, 'Tom Sid', 100.00, '2023-04-29 10:30', '2023-04-29 10:54','INR', 'Protection charge Apr');
INSERT INTO online_bank.transaction (id, source_account_id, target_account_id, target_owner_name, amount, initiation_date, completion_date, currency, reference)
VALUES (2, 1, 2, 'Tom Sid', 100.00, '2019-05-01 10:30', '2019-05-01 11:21', 'INR','Protection charge May');

INSERT INTO online_bank.transaction (id, source_account_id, target_account_id, target_owner_name, amount, initiation_date, completion_date, currency, reference)
VALUES (3, 2, 1, 'Saif Ali', 10000.00, '2019-05-27 17:21', null, 'INR', 'Lending Money');
