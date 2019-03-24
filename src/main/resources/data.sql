-- SCHOOL DISTRICTS

INSERT INTO teachies.school_districts
    (created_at, updated_at, name, short_name, state)
VALUES
    (NOW(), NOW(), 'Frisco Independent School District', 'FISD', 'Texas');

INSERT INTO teachies.school_districts
    (created_at, updated_at, name, short_name, state)
VALUES
    (NOW(), NOW(), 'Dallas Independent School District', 'DISD', 'Texas');

-- SCHOOL DISTRICT IDs

set @districtID1 =(select school_district_id
from teachies.school_districts
where short_name = 'FISD');
set @districtID2 =(select school_district_id
from teachies.school_districts
where short_name = 'DISD');

-- SCHOOLS

-- District 1

INSERT INTO teachies.schools
(
    created_at,
    updated_at,
    country,
    name,
    school_type,
    city,
    state,
    street_address1,
    zip_postal_code,
    school_district_id
)
VALUES
(
    NOW(),
    NOW(),
    'United States',
    'Centennial High School',
    'High School',
    'Frisco',
    'Texas',
    '6901 Coit Rd',
    '75035',
    @districtID1
);

INSERT INTO teachies.schools
(
    created_at,
    updated_at,
    country,
    name,
    school_type,
    city,
    state,
    street_address1,
    zip_postal_code,
    school_district_id
)
VALUES
(
    NOW(),
    NOW(),
    'United States',
    'Liberty High School',
    'High School',
    'Frisco',
    'Texas',
    '15250 Rolater Rd',
    '75035',
    @districtID1
);

INSERT INTO teachies.schools
(
    created_at,
    updated_at,
    country,
    name,
    school_type,
    city,
    state,
    street_address1,
    zip_postal_code,
    school_district_id
)
VALUES
(
    NOW(),
    NOW(),
    'United States',
    'Wakeland High School',
    'High School',
    'Frisco',
    'Texas',
    '10700 Legacy Dr',
    '75034',
    @districtID1
);

-- District 2
INSERT INTO teachies.schools
(
    created_at,
    updated_at,
    country,
    name,
    school_type,
    city,
    state,
    street_address1,
    zip_postal_code,
    school_district_id
)
VALUES
(
    NOW(),
    NOW(),
    'United States',
    'Bryan Adams High School',
    'High School',
    'Dallas',
    'Texas',
    '2101 Millmar Dr',
    '75228',
    @districtID2
);

INSERT INTO teachies.schools
(
    created_at,
    updated_at,
    country,
    name,
    school_type,
    city,
    state,
    street_address1,
    zip_postal_code,
    school_district_id
)
VALUES
(
    NOW(),
    NOW(),
    'United States',
    'Skyline High School',
    'High School',
    'Dallas',
    'Texas',
    '7777 Forney Rd',
    '75227',
    @districtID2
);

INSERT INTO teachies.schools
(
    created_at,
    updated_at,
    country,
    name,
    school_type,
    city,
    state,
    street_address1,
    zip_postal_code,
    school_district_id
)
VALUES
(
    NOW(),
    NOW(),
    'United States',
    'Woodrow Wilson High School',
    'High School',
    'Dallas',
    'Texas',
    '100 S Glasgow Dr',
    '75214',
    @districtID2
);

-- EVENTS 

use teachies;

-- SCHOOL IDs

set @schoolID1 =(select school_id
from teachies.schools
where name = 'Centennial High School');

set @schoolID2 =(select school_id
from teachies.schools
where name = 'Liberty High School');

set @schoolID3 =(select school_id
from teachies.schools
where name = 'Wakeland High School');

set @schoolID4 =(select school_id
from teachies.schools
where name = 'Bryan Adams High School');

set @schoolID5 =(select school_id
from teachies.schools
where name = 'Skyline High School');

set @schoolID6 =(select school_id
from teachies.schools
where name = 'Woodrow Wilson High School');

INSERT INTO `teachies`.`events`
(`created_at`,
`updated_at`,
`end_date`,
`name`,
`start_date`,
`school_id`)
VALUES
(NOW(),
NOW(),
'2019-05-30',
'Most Dedicated Math Teacher',
'2019-01-01',
@schoolID1);

INSERT INTO `teachies`.`events`
(`created_at`,
`updated_at`,
`end_date`,
`name`,
`start_date`,
`school_id`)
VALUES
(NOW(),
NOW(),
'2019-05-30',
'Most Awesome History Teacher',
'2019-01-01',
@schoolID1);

INSERT INTO `teachies`.`events`
(`created_at`,
`updated_at`,
`end_date`,
`name`,
`start_date`,
`school_id`)
VALUES
(NOW(),
NOW(),
'2019-05-30',
'Most Dedicated Math Teacher',
'2019-01-01',
@schoolID2);

INSERT INTO `teachies`.`events`
(`created_at`,
`updated_at`,
`end_date`,
`name`,
`start_date`,
`school_id`)
VALUES
(NOW(),
NOW(),
'2019-05-30',
'Most Awesome History Teacher',
'2019-01-01',
@schoolID2);

INSERT INTO `teachies`.`events`
(`created_at`,
`updated_at`,
`end_date`,
`name`,
`start_date`,
`school_id`)
VALUES
(NOW(),
NOW(),
'2019-05-30',
'Most Dedicated Math Teacher',
'2019-01-01',
@schoolID3);

INSERT INTO `teachies`.`events`
(`created_at`,
`updated_at`,
`end_date`,
`name`,
`start_date`,
`school_id`)
VALUES
(NOW(),
NOW(),
'2019-05-30',
'Most Awesome History Teacher',
'2019-01-01',
@schoolID3);

INSERT INTO `teachies`.`events`
(`created_at`,
`updated_at`,
`end_date`,
`name`,
`start_date`,
`school_id`)
VALUES
(NOW(),
NOW(),
'2019-05-30',
'Most Dedicated Math Teacher',
'2019-01-01',
@schoolID4);

INSERT INTO `teachies`.`events`
(`created_at`,
`updated_at`,
`end_date`,
`name`,
`start_date`,
`school_id`)
VALUES
(NOW(),
NOW(),
'2019-05-30',
'Most Awesome History Teacher',
'2019-01-01',
@schoolID4);

INSERT INTO `teachies`.`events`
(`created_at`,
`updated_at`,
`end_date`,
`name`,
`start_date`,
`school_id`)
VALUES
(NOW(),
NOW(),
'2019-05-30',
'Most Dedicated Math Teacher',
'2019-01-01',
@schoolID5);

INSERT INTO `teachies`.`events`
(`created_at`,
`updated_at`,
`end_date`,
`name`,
`start_date`,
`school_id`)
VALUES
(NOW(),
NOW(),
'2019-05-30',
'Most Awesome History Teacher',
'2019-01-01',
@schoolID5);

INSERT INTO `teachies`.`events`
(`created_at`,
`updated_at`,
`end_date`,
`name`,
`start_date`,
`school_id`)
VALUES
(NOW(),
NOW(),
'2019-05-30',
'Most Dedicated Math Teacher',
'2019-01-01',
@schoolID6);

INSERT INTO `teachies`.`events`
(`created_at`,
`updated_at`,
`end_date`,
`name`,
`start_date`,
`school_id`)
VALUES
(NOW(),
NOW(),
'2019-05-30',
'Most Awesome History Teacher',
'2019-01-01',
@schoolID6);
