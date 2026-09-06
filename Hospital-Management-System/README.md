# Hospital Management System

Spring Boot REST API for the Hospital Management System assignment.

## Included
- 12 entities extending `BaseClass`
- repositories, services and controllers
- full CRUD with soft delete
- DTO-only REST responses using Lombok Builder
- Bean Validation
- global 400/404/500 exception handling
- future appointment validation
- room capacity checking and patient discharge
- patient medical-record lookup
- doctor-by-department lookup
- active appointments by doctor/date
- admitted patients by floor
- rooms with remaining capacity
- unpaid bills and patient total billed
- hospital and doctor statistics

## Database
Set `DB_PASSWORD` in your environment. Optional: `DB_URL`, `DB_USERNAME`.

## Run
`mvn spring-boot:run`

## Deliverables still requiring manual evidence
Export your Postman collection, add the assignment-required schema screenshots, and record real debugging incidents in `debugging-log.txt`.
