# BookMyTicket – Movie Ticket Booking System

Full-stack educational project using Java 17, Spring Boot, Spring Data JPA, MySQL, HTML, CSS and JavaScript.

## Features
- Browse sample movies and descriptions
- Choose a theatre showtime
- Interactive 48-seat selection with booked-seat status
- Book tickets with name and email
- Generate a booking reference code
- Look up bookings by email

This is a college/demo project. It does not take real payments and does not include user authentication or an admin panel.

## Requirements
- JDK 17 or later
- MySQL Server 8+
- Maven 3.6+ (VS Code Java extensions are helpful)

## Database setup
Open MySQL Workbench and run:
```sql
CREATE DATABASE bookmyticket;
```
Open `src/main/resources/application.properties`. The default MySQL settings are username `root` and password `root`. Change `spring.datasource.password=${DB_PASSWORD:root}` to match your local MySQL password. The application can create the database automatically if the MySQL user has permission.

## Run in VS Code
1. Extract the ZIP file.
2. Open the `BookMyTicket` folder in VS Code (the folder containing `pom.xml`).
3. Make sure JDK 17+ and Maven are installed.
4. Open Terminal → New Terminal.
5. Run:
```bash
mvn spring-boot:run
```
6. Wait for Spring Boot to start, then open http://localhost:8080

The first run inserts sample movies, two theatres and upcoming showtimes. Hibernate creates the SQL tables automatically.

## Test booking
Select a movie → choose a showtime → select seats → enter your name and email → confirm. Save the booking code. Use **My bookings** and the same email to view your booking.

## API endpoints
| Method | URL | Purpose |
|---|---|---|
| GET | `/api/movies` | List movies |
| GET | `/api/movies/{id}` | Movie details |
| GET | `/api/shows?movieId=1` | Showtimes for a movie |
| GET | `/api/shows/{showId}/seats` | Seat availability |
| POST | `/api/bookings` | Create booking |
| GET | `/api/bookings?email=you@example.com` | Booking history |

Example POST body:
```json
{"customerName":"Thejaswini","email":"thejaswini@example.com","showId":1,"seats":["A1","A2"]}
```

## Project structure
```text
BookMyTicket/
├── pom.xml
└── src/main/
    ├── java/com/example/bookmyticket/
    │   ├── BookMyTicketApplication.java
    │   ├── config/DataLoader.java
    │   ├── controller/
    │   ├── dto/
    │   ├── entity/
    │   ├── repository/
    │   └── service/BookingService.java
    └── resources/
        ├── application.properties
        └── static/ (index.html, css/style.css, js/app.js)
```
