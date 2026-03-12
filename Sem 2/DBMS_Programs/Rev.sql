SET SERVEROUTPUT ON;

DECLARE
    str VARCHAR2(50) := '&input';
    rev VARCHAR2(50);
BEGIN
	for i IN 1..LENGTH(str) LOOP
		rev := SUBSTR(str,i,1) || rev;
	END LOOP;
	
	DBMS_OUTPUT.PUT_LINE('Reversed string:' || rev);
END;
/