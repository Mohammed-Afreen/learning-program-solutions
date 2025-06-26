
--Scenario 1: The bank wants to apply a discount to loan interest rates for customers above 60 years old.

SET SERVEROUTPUT ON;

DECLARE
    CURSOR cur IS
        SELECT c.CustomerID, l.LoanID, l.InterestRate, c.DOB
        FROM Customers c, Loans l
        WHERE c.CustomerID = l.CustomerID;

    age NUMBER;
BEGIN
    FOR rec IN cur LOOP
        age := TRUNC(MONTHS_BETWEEN(SYSDATE, rec.DOB) / 12);
        DBMS_OUTPUT.PUT_LINE(‘ ’);
        DBMS_OUTPUT.PUT_LINE('Customer ID ' || rec.CustomerID || ' is age ' || age);

        IF age > 60 THEN 
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;
            DBMS_OUTPUT.PUT_LINE('=> 1% discount applied to Loan ID ' || rec.LoanID);
        END IF;
    END LOOP;
    COMMIT;
END;
/


