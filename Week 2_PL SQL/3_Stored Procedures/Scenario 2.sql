--Scenario 2: The bank wants to implement a bonus scheme for employees based on their performance.

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_percent IN NUMBER
) IS
BEGIN
    FOR emp IN (SELECT EmployeeID, Salary 
                FROM Employees 
                WHERE Department = p_department)
    LOOP
        UPDATE Employees
        SET Salary = Salary + (Salary * p_bonus_percent / 100)
        WHERE EmployeeID = emp.EmployeeID;

        DBMS_OUTPUT.PUT_LINE('Bonus applied to Employee ID ' || emp.EmployeeID);
    END LOOP;

    COMMIT;
END;
/
