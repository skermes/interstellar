-- name: default-services!
-- Inserts default services.
INSERT INTO services (name) VALUES
    ('Twitter'),
    ('Flickr'),
    ('Vimeo'),
    ('Youtube'),
    ('Instagram'),
    ('Tumblr'),
    ('Soundcloud');

-- name: default-statuses!
-- Inserts default poll statuses.
INSERT INTO statuses (description) VALUES
    ('pending'),
    ('success'),
    ('failure');