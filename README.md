# Develop an Authenticated Order Taking API stack with Spring Boot

An order specifies the customer details (including personal details, installation address, preferred
installation date + time slot details), the required products (e.g. Internet, TV, Telephony, Mobile) and
the required package per product (e.g. Internet 250Mbps or 1Gbps, TV with 90 Channels or 140

Channels, Telephony with Free On net Calls or Unlimited Calls, Mobile Prepaid or Mobile Post-
paid). The Order Taking API must validate these details and accept the order. On accepting the

order it must publish a messaging event to a RabbitMQ topic for Melita's Ordering Fulfilment system
and Care systems to pick it up.

We expect the following deliverables:-
1) An authenticated public REST based Order Taking API stack.
2) Micro services to be implemented using Spring Boot
3) Publish events to a RabbitMQ
4) Code needs to be version controlled in a Git Repo
5) Expect very good code design and robust error handling, design and integration patterns
   employed

## How it Works
We have 3 End-points as following:

For Product details:
```
GET : http://localhost:8080/productDetails/products
```
Response  :
```
[
"Internet",
"TV",
"Mobile",
"Telephony"
]
```

For Subscription details:
```
GET : http://localhost:8080/subscriptionDetails/subscription
```
Response  :
```
[
    {
        "productName": "Internet",
        "subscriptionName": "250 MB Plan"
    },
    {
        "productName": "Internet",
        "subscriptionName": "150 MP Plan"
    },
    {
        "productName": "TV",
        "subscriptionName": "90 Channels"
    },
    {
        "productName": "TV",
        "subscriptionName": "140 Channels"
    },
    {
        "productName": "Telephony",
        "subscriptionName": "Free On net Calls"
    },
    {
        "productName": "Telephony",
        "subscriptionName": "Unlimited Calls"
    },
    {
        "productName": "Mobile",
        "subscriptionName": "Prepaid"
    },
    {
        "productName": "Mobile",
        "subscriptionName": "Post-paid"
    }
]
```
To Create Order:
```
POST : http://localhost:8080/order/createOrder : username:password in header 
```
NOTE: Only order api is authenticated with basic auth

If order is Success then order details will be queued to Rabbit MQ

Response  :
```
Order Success
```

```
Order failed
```

```
{
    "timestamp": "2022-02-19T19:12:27.361+00:00",
    "status": 401,
    "error": "Unauthorized",
    "path": "/order/createOrder"
}
```

Note: SQL file is attached in resources folder