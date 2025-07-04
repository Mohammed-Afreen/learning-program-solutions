--Scenario 3: The bank wants to send reminders to customers whose loans are due within the next 30 days.

DECLARE
    CURSOR cur2 IS
        SELECT l.LoanID, l.EndDate, c.Name
        FROM Loans l, Customers c
        WHERE l.CustomerID = c.CustomerID
          AND l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR rec IN cur2 LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || rec.LoanID || 
                             ' for customer ' || rec.Name || 
                             ' is due on ' || TO_CHAR(rec.EndDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/
