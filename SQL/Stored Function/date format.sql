DELIMITER //

CREATE FUNCTION dateformat(
	input_date varchar(200)
) 
RETURNS VARCHAR(20)
DETERMINISTIC
BEGIN
    DECLARE return_date VARCHAR(20);
	 set return_date = Date_Format(input_date,'%d-%m-%y');
	 RETURN (return_date);
END//
DELIMITER ;
select dateformat('1998-02-15');