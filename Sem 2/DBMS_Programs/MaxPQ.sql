/* Write a pl/sql to display maximum of two numbers*/ 
SET SERVEROUTPUT ON;
DECLARE
	num1 NUMBER := &num1;
	num2 NUMBER := &num2;
	maxnum NUMBER;
	
BEGIN
	IF num1 > num2 THEN
		maxnum := num1;
	
	ELSE 
		maxnum := num2;
	
	END IF;
	
	DBMS_OUTPUT.PUT_LINE('Maximum number is:' || maxnum);
	
END;
/