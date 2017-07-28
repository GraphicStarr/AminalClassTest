Algorithm:

1. Find Customer's name and number
2. Find sales amount
3. Find tax code
4. Find the total amount due


IPO diagram:

  Input:                                              Processing:                                           Output:

customerName                 receive customerName
customerNumber            receive customerNumber
salesAmount                      receive salesAmount
taxCodeAmount               receive taxCodeAmount
totalAmountDue              Multiply salesAmount by 
                                                    taxCode, subtract above sum
                                                    from salesAmount to receive          Display customer name,
                                                   totalAmountDue                                      number, sales amount,
                                                                                                                                sales tax and total amount
                                                                                                                                due

Pseudocode:

Do
	Find customer's name and number
 	 	Ask user to input customer's name
		Ask user to input customer's number
			While finding sales amount and tax code 

If customer's name starts between letters A through J
		Print number 1
	If customer's name starts between letters K through T
		Print number 2
Else
		Print number 0

If customer's tax code is greater than zero
		Print tax code amount
Else
		Print "Tax Exempt"

If tax Exempt
		Print sales amount
Else
		Print sales amount times tax code amount

SalesTotal equals sales amount times tax code amount minus sales amount

		Print customer's name, number, sales tax and SalesTotal
