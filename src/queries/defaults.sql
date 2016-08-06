-- name: default-services!
-- Inserts default services.
INSERT INTO services (name, logo) VALUES
    ('Twitter', 'http://ozil-conseil.com/wp-content/uploads/2013/01/Twitter-logo.jpg'),
    ('Flickr', 'https://vehiclez.files.wordpress.com/2010/03/flickr-logo-27px-r.png'),
    ('Vimeo', 'http://www.danielscully.co.uk/images/online-vimeo.png'),
    ('Youtube', 'http://www.tubefilter.com/wp-content/uploads/2016/03/logo-youtube.jpg'),
    ('Instagram', 'https://www.seeklogo.net/wp-content/uploads/2016/05/instagram-logo-vector-download-400x400.jpg'),
    ('Tumblr', 'http://danielscully.co.uk/images/online-tumblr.png'),
    ('Soundcloud', 'https://cdn1.iconfinder.com/data/icons/smallicons-logotypes/32/soundcloud-512.png');

-- name: default-statuses!
-- Inserts default poll statuses.
INSERT INTO statuses (description) VALUES
    ('pending'),
    ('success'),
    ('failure');