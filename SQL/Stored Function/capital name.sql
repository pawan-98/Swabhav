DELIMITER //

CREATE FUNCTION CapitalName(
	input_name varchar(200)
) 
RETURNS VARCHAR(20)
DETERMINISTIC
BEGIN
    DECLARE name VARCHAR(20);
	 set name = upper(input_name);
	 RETURN (name);
END//
DELIMITER ;

select capitalname('pawan');