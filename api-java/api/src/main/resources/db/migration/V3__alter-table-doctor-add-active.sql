alter table doctor add active tinyint;
update doctor set active = 1;
ALTER TABLE doctor MODIFY active tinyint NOT NULL;