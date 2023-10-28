## Security Measures in Spring
## CSRF
Cross-Site Request Forgery

An attack in which the user executes unwanted actions in an external web application while being authenticated.

Through social engineering an attacker can trick users of a web application into executing actions of the attacker's choosing.

## XSS
Cross-Site scripting

Injection of malicious scripts into a web application, commonly through an input field.

Avoid Attacks:

- Cache Control
- Content type control
- Strict HTTP transport security policy
- X-Frame Options
- X-XSS Protection
 
The Above measures are implemented by default in Spring

## SQL Injection
```sql
SELECT * FROM users WHERE username=' "+name+" ' 
```
Attack:
```java
String name = " ' OR '1'='1' ";
```
```sql
SELECT * FROM users WHERE username=' <' OR '1'='1'>
```
#### Avoid Attacks:
- Prepared Statements
- Stored Procedures
- Input Validation
- Etc
```java
PreparedStatement ps = connection.prepareStatement("SELECT * FROM users WHERE username=?");
ps.setString(1, name);
```
```java
Query query = em.createQuery("SELECT * FROM table where username = :username");
query.setParameter("username", "juan");
```
###
See more at: https://owasp.org/www-project-top-ten/