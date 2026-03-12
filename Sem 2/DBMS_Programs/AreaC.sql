SET SERVEROUTPUT ON;

DECLARE
    radius NUMBER := &radius;
    pi     NUMBER := 3.1415;
    area   NUMBER;
BEGIN
    area := pi * radius * radius;

    DBMS_OUTPUT.PUT_LINE('Radius: ' || radius);
    DBMS_OUTPUT.PUT_LINE('Area: ' || area);
END;
/