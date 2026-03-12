SET SERVEROUTPUT ON
CREATE OR REPLACE FUNCTION circle_area(r NUMBER)
RETURN NUMBER
IS
area NUMBER;
BEGIN
   area := 3.1416 * r * r;
   RETURN area;
END;
/

DECLARE
   a NUMBER := &a;
   result NUMBER;
BEGIN
   result := circle_area(a);
   DBMS_OUTPUT.PUT_LINE('Area of Circle: ' || result);
END;
/