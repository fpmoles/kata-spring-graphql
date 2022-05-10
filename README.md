# Kata: Spring Boot and GraphQL

A simple kata for building a functioning GraphQL API using Spring Boot.

## Operations

### Build
`$ mvn clean package`

### Execution
`$ java -jar target/firearms-graphhql-0.0.1-SNAPSHOT.jar`

### Testing
Using external GraphQL Playground:

[http://localhost:8080/graphql](http://localhost:8080/graphql)

Using built in electron app
[http://localhost:8080/graphiql](http://localhost:8080/graphiql)

## Notes
+ entity field names must match schema
+ controller method names must match schema (or overridden in annotation)
