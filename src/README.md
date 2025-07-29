Bajaj Webhook Registration & SQL Submission

This Spring Boot application registers a webhook and submits an SQL solution as part of the Bajaj Finserv Health Java task.
## 🚀 Functionality

### Step 1: Register Webhook
The app sends a POST request to:
https://bfhldevapigw.healthrx.co.in/hiring/apis/webhook/register/JAVA

With the following payload:

```json
{
  "regNo": "REG12347",
  "name": "Ishan Goyal",
  "email": "ishan@example.com"
}
If successful, the response contains:

webhookurl: The URL to send the solution to

accessToken: Token required in the Authorization header

Step 2: Submit SQL Query
If the webhook registration is successful, the following SQL is submitted to the webhookurl:


SELECT DISTINCT p.product_name
FROM Products p
JOIN Orders o ON p.product_id = o.product_id
WHERE o.order_date BETWEEN '2022-01-01' AND '2022-12-31'
GROUP BY p.product_name
HAVING COUNT(DISTINCT o.customer_id) >= 3;

Authorization is sent using the Bearer <accessToken> format.

Steps:
Clone the repo or place files in a folder

Build the project:
mvn clean install


Run the JAR:
java -jar Bajaj-0.0.1-SNAPSHOT.jar --server.port=8081

## Jar file is Present in target Folder