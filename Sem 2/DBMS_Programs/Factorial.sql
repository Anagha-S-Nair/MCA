set serveroutput on;
CREATE OR REPLACE PROCEDURE find_factorial (
    num IN NUMBER,
    result OUT NUMBER
) AS
BEGIN
    IF num < 0 THEN
        result := NULL; -- Factorial not defined for negative numbers
    ELSIF num = 0 THEN
        result := 1;
    ELSE
        result := 1;
        FOR i IN 1..num LOOP
            result := result * i;
        END LOOP;
    END IF;
END;
/
DECLARE
    n NUMBER := 5;  -- You can change this number
    res NUMBER;
BEGIN
    find_factorial(n, res);
    DBMS_OUTPUT.PUT_LINE('Factorial of ' || n || ' is ' || res);
END;
/