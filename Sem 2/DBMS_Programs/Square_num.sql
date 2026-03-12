SET SERVEROUTPUT ON
CREATE OR REPLACE PROCEDURE find_square(
   n IN OUT NUMBER
)
IS
BEGIN
   n := n * n;
END;
/
DECLARE
   num NUMBER := &num;
BEGIN
   find_square(num);
   DBMS_OUTPUT.PUT_LINE('Square is: ' || num);
END;
/