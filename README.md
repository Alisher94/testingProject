
# Phone Booking System

## Overview
This application allows a mobile software testing team to manage the booking and return of various mobile phones. 
Users can check the availability of each device, see when it was last booked, and by whom.

## Devices Supported
- Samsung Galaxy S9
- Samsung Galaxy S8 (2 units)
- Motorola Nexus 6
- OnePlus 9
- Apple iPhone 13
- Apple iPhone 12
- Apple iPhone 11
- iPhone X
- Nokia 3310

## Technology Stack
- **Frontend:** React
- **Backend:** Spring Boot
- **Database:** H2 (in-memory for development purposes, external database may require additional steps to run docker composer)
- **Containerization:** Docker Compose

## Getting Started

### Installation

1. **Clone the repository**
   ```sh
   git clone https://github.com/Alisher94/testingProject.git
   cd testingProject
   cd frontend
   npm install
   ```

2. **Build and run the Docker containers**
   ```sh
   docker-compose up --build
   ```

   This command will start all the services defined in `docker-compose.yml`, 
   Docker composer uncludes the React frontend, Spring Boot backend, and the H2 database.

3. **Access the application**

   The frontend can be accessed at [http://localhost:3000](http://localhost:3000).

   The backend API is available at [http://localhost:8080](http://localhost:8080).

### Usage

- **Booking a Phone:**
  Navigate to the input in the list, and enter your name to book the phone. Click on "Book" to confirm.
  (Didn't create separate User Model in order to avoid compexity)

- **Returning a Phone:**
  Go to the device you wish to return from the list, and click "Return".

- **Viewing Device Status:**
  The main page displays all devices, their availability, when there were booked, and the name of the person who last booked each device.

## Contact

Alisher Abdullaev – a.alisher.abdullayev@gmail.com

Project Link: [https://github.com/Alisher94/testingProject](https://github.com/Alisher94/testingProject)
