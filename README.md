# CustomerAPI

URLs:
Get All Customers:
http://localhost:8080/api/customers

Get customer by ID:(Get Request)
http://localhost:8080/api/customers/{id}

Create Customer:(Get Request)
http://localhost:8080/api/customers/

Create Customer Request Body:(Post Request)
{
    "id": "yyy",
    "idType": "CPR",
    "customerName": "Ali Saleh Khalaf",
    "customerNationality": "Bahraini",
    "customerAge": 33,
    "customerDOB": "17/12/1985",
    "customerSegment": "RES",
    "customerAccountNo": "1000000000005993"
}

Update Customer: (Put Request)
http://localhost:8080/api/customers/yyy

Update Customer Request Body:(Post Request)
{
    "id": "yyy",
    "idType": "CPR",
    "customerName": "Ali Saleh Khalaf",
    "customerNationality": "Bahraini",
    "customerAge": 33,
    "customerDOB": "17/10/1985",
    "customerSegment": "RES",
    "customerAccountNo": "1000000000005993"
}


Delete Customer:(Delete Request)
http://localhost:8080/api/customers/yyy
