INSERT INTO bank  (bank_name,logo_url)
VALUES('Optima','https://online.optimabank.kg/ib6/images/favicon.ico'),
      ('Finca','https://www.fincabank.kg/wp-content/uploads/sites/6/2018/09/favicon32.png'),
      ('Бакай', 'https://bakai.kg/static/img/favicon/fav_60x60.png');

INSERT INTO credit_type(type_cred)
VALUES ('Потребительские'),
                ('Ипотека');

INSERT INTO  tariff
    (max_credit_amount, min_credit_amount, max_credit_term, min_credit_term, interest_rate, bank_id, credit_type_id) 
VALUES (250000,5000,18,3,29,1,1),
       (200000,5000,18,3,23,2,1),
       (10000000,500000,18,3,23,2,1),
       (250000,5000,18,3,30,3,1);