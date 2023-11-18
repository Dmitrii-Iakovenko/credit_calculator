INSERT INTO bank  (bank_name,logo_url
)
VALUES('RSK','g'),
      ('MBank','g');
INSERT INTO credit_type(type_cred)
VALUES ('Потребительские'),
                ('Ипотека');
INSERT INTO  tariff
    (max_credit_amount,min_credit_amount,max_credit_term,min_credit_term,
     interest_rate,bank_id,credit_type_id) VALUES (250000,5000,18,3,29,1,1),
                                                  (150000,5000,18,3,19,1,1),
                                                  (200000,5000,18,3,23,1,1),
                                                  (250000,5000,18,3,30,1,1);