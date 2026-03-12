SET SERVEROUTPUT ON;

DECLARE
    num NUMBER := &num;   -- User input
    fact NUMBER := 1;
    i NUMBER;
BEGIN
    IF num < 0 THEN
        DBMS_OUTPUT.PUT_LINE('Factorial not defined for negative numbers.');
    ELSE
        FOR i IN 1..num LOOP
            fact := fact * i;
        END LOOP;

        DBMS_OUTPUT.PUT_LINE('Factorial of ' || num || ' is ' || fact);
    END IF;
END;
/