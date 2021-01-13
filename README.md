
# T-challenge coursework
During the course project, the following tasks were done:
* dockerize each of application' services
* run application on Kubernetes platform
* create simple smoke integration test
* at least two separated environments (dev/prod) should exist and it should pe possible to transfer application code from one environment to another
* create all necessary CI/CD stuff for dockerization and deployment 
* Use Helm (or a like) for application packet management
# T-Challenge: Service
This is backend repositry.
You also can check my [frontend repository](https://github.com/ya-makariy/tchallenge-participant) and [database repository](https://github.com/ya-makariy/MongoDB-coursework)

## Data for smoke test
Run **postman** request from this postman collection:
```json
{
    "info": {
        "_postman_id": "ccbbda8a-9081-435f-9870-ea84c5a0a0f3",
        "name": "t-challenge",
        "schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
    },
    "item": [
        {
            "name": "Get token",
            "request": {
                "method": "POST",
                "header": [],
                "body": {
                    "mode": "raw",
                    "raw": "{\n\t\"method\" : \"PASSWORD\",\n    \"email\" : \"user@user.com\",\n    \"password\" : \"12345\"\n}",
                    "options": {
                        "raw": {
                            "language": "json"
                        }
                    }
                },
                "url": {
                    "raw": "http://backend.openshift.devops.t-systems.ru/security/tokens/",
                    "protocol": "http",
                    "host": [
                        "backend.openshift.devops.t-systems.ru"
                    ],
                    "path": [
                        "security",
                        "tokens",
                        ""
                    ]
                }
            },
            "response": []
        }
    ],
    "protocolProfileBehavior": {}
}
```


and you should recieve token like this:
```json
{
    "id": "411590e0-9317-4c5a-9d49-83a5482de096",
    "accountId": "5b927bef3c30463164dbfb40",
    "payload": "6595e971-e9ef-4c4e-84b8-867b0e60da43",
    "createdAt": "2020-04-22T04:13:34.843Z",
    "accountCategory": "PARTICIPANT",
    "roles": [
        "PARTICIPANT"
    ],
    "validUntil": "2020-04-22T05:13:34.843Z",
    "expired": false
}
``` 