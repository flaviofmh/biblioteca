CREATE TABLE IF NOT EXISTS hymn (
  id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  title                  VARCHAR      NOT NULL,
  number                 NUMERIC      NOT NULL
);