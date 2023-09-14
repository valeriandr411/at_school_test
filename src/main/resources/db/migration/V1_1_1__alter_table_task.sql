ALTER TABLE task ADD repository int;
ALTER TABLE task RENAME COLUMN dept_id TO branch;