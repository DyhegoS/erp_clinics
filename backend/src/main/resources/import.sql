INSERT INTO tb_user (name, email, username, password) VALUES ('admin', 'admin@gmail.com','admin', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, username, password) VALUES ('dyhego', 'dyhego@gmail.com','dyhego', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_ATTENDANT');
INSERT INTO tb_role (authority) VALUES ('ROLE_DOCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_NURSE');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);

INSERT INTO tb_patient (name, email, cpf, address, phone) VALUES ('Jailson Mendes', 'jaja69@gmail.com', '12345678910', 'Rua Macho Peludo Vain, 2469 - Vila do Oco', '112469-2424');

INSERT INTO tb_scheduling_type (name, description) VALUES ('Consulta', 'Consulta normal');
INSERT INTO tb_scheduling_type (name, description) VALUES ('Exame', 'Exame de toque');
INSERT INTO tb_scheduling_type (name, description) VALUES ('Cirurgia', 'Cirurgia dos olhos');

INSERT INTO tb_scheduling (create_at, update_at, schedule_date, description, user_id, scheduling_type_id, patient_id) VALUES (TIMESTAMP WITH TIME ZONE '2026-05-26T03:00:00.12345Z', TIMESTAMP WITH TIME ZONE '2026-05-26T04:00:00.12345Z', TIMESTAMP WITH TIME ZONE '2026-05-27T03:00:00.12345Z', 'Exame de Toque', 2, 2, 1);

