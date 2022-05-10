INSERT INTO MANUFACTURERS (NAME, CODE, CITY, STATE, COUNTRY, WEBSITE) VALUES ('Sig Sauer','SIG','Newington','NH','US','https://www.sigsauer.com');
INSERT INTO MANUFACTURERS (NAME, CODE, CITY, STATE, COUNTRY, WEBSITE) VALUES ('Smithh & Wesson','S&W','Springfield','MA','US','https://www.smith-wesson.com');
INSERT INTO MANUFACTURERS (NAME, CODE, CITY, STATE, COUNTRY, WEBSITE) VALUES ('Ruger','RUG','Southport','CT','US','https://www.ruger.com');

INSERT INTO MODELS (SKU, MANUFACTURER_ID, FAMILY, MODEL, CATEGORY, CALIBER, CAPACITY, BARREL_LENGTH, EXTERNAL_SAFETY, OPTICS_READY, SIGHTS, COLOR) VALUES ('320C-9-B', (SELECT MANUFACTURER_ID FROM MANUFACTURERS WHERE CODE = 'SIG'), 'P320', 'Nitron Compact', 'Pistol', '9mm', 15, 99, FALSE, FALSE, 'Steel 3-dot Contrast Sights', 'Black');
INSERT INTO MODELS (SKU, MANUFACTURER_ID, FAMILY, MODEL, CATEGORY, CALIBER, CAPACITY, BARREL_LENGTH, EXTERNAL_SAFETY, OPTICS_READY, SIGHTS, COLOR) VALUES ('320C-9-B-10', (SELECT MANUFACTURER_ID FROM MANUFACTURERS WHERE CODE = 'SIG'), 'P320', 'Nitron Compact', 'Pistol', '9mm', 10, 99, FALSE, FALSE, 'Steel 3-dot Contrast Sights', 'Black');
INSERT INTO MODELS (SKU, MANUFACTURER_ID, FAMILY, MODEL, CATEGORY, CALIBER, CAPACITY, BARREL_LENGTH, EXTERNAL_SAFETY, OPTICS_READY, SIGHTS, COLOR) VALUES ('320C-45-BSS', (SELECT MANUFACTURER_ID FROM MANUFACTURERS WHERE CODE = 'SIG'), 'P320', 'Nitron Compact', 'Pistol', '45 AUTO', 9, 99, FALSE, FALSE, 'SIGLITE', 'Black');
INSERT INTO MODELS (SKU, MANUFACTURER_ID, FAMILY, MODEL, CATEGORY, CALIBER, CAPACITY, BARREL_LENGTH, EXTERNAL_SAFETY, OPTICS_READY, SIGHTS, COLOR) VALUES ('320C-9-BSS-MS-MA', (SELECT MANUFACTURER_ID FROM MANUFACTURERS WHERE CODE = 'SIG'), 'P320', 'Nitron Compact', 'Pistol', '9mm', 10, 99, FALSE, FALSE, 'SIGLITE', 'Black');
INSERT INTO MODELS (SKU, MANUFACTURER_ID, FAMILY, MODEL, CATEGORY, CALIBER, CAPACITY, BARREL_LENGTH, EXTERNAL_SAFETY, OPTICS_READY, SIGHTS, COLOR) VALUES ('320AXGF-9-BXR3-PRO-R2', (SELECT MANUFACTURER_ID FROM MANUFACTURERS WHERE CODE = 'SIG'), 'P320', 'AXG Pro', 'Pistol', '9mm', 17, 119, FALSE, TRUE, 'X-RAY3 Day/Night Sights', 'Black');