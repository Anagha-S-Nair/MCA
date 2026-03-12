SET SERVEROUTPUT ON
CREATE OR REPLACE PROCEDURE find_min(
   a IN NUMBER,
   b IN NUMBER,
   c OUT NUMBER
)
IS
BEGIN
   IF a < b THEN
      c := a;
   ELSE
      c := b;
   END IF;
END;
/

DECLARE
   a NUMBER := &a;
   b NUMBER := &b;
   result NUMBER;
BEGIN
   find_min(a, b, result);
   DBMS_OUTPUT.PUT_LINE('Minimum value is: ' || result);
END;
/