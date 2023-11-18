sudo cp /home/dmitrii/git/Hakaton/src/main/resources/database.sql /tmp
sudo -u postgres psql -d credit_calculator -f /tmp/database.sql
