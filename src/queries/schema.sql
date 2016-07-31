-- name: create-services!
-- Table for the services that we poll from
CREATE TABLE IF NOT EXISTS services (
    id serial PRIMARY KEY,
    name varchar(200)
);

-- name: create-statuses!
-- Table for the statuses that polling can have
CREATE TABLE IF NOT EXISTS statuses (
    id serial PRIMARY KEY,
    description varchar(200)
);

-- name: create-targets!
-- Table for people that we want to get faves from.
CREATE TABLE IF NOT EXISTS targets (
    id serial PRIMARY KEY,
    service integer REFERENCES services (id),
    identifier varchar(1000)
);

-- name: create-polls!
-- Table for status about polls for a target
CREATE TABLE IF NOT EXISTS polls (
    polled_at timestamp,
    status integer REFERENCES statuses (id),
    new_item_count integer,
    target integer REFERENCES targets (id)
);

-- name: create-items!
-- Table for items that targets have faved
CREATE TABLE IF NOT EXISTS items (
    id serial PRIMARY KEY,
    service integer REFERENCES services (id),
    retrieved_at timestamp,
    data text
);
