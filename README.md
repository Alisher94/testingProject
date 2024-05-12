
# Mobile Device Booking System

## Overview
This application allows a mobile software testing team to manage the booking and return of various mobile phones. Users can check the availability of each device, see when it was last booked, and by whom.

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
- **Database:** H2 (in-memory for development purposes)
- **Containerization:** Docker Compose

## Getting Started

### Prerequisites
- Docker
- Docker Compose
- Node.js and npm

### Installation

1. **Clone the repository**
   ```sh
   git clone https://yourrepositorylink.com/project.git
   cd project
   ```

2. **Build and run the Docker containers**
   ```sh
   docker-compose up --build
   ```

   This command will start all the services defined in `docker-compose.yml`, including the React frontend, Spring Boot backend, and the H2 database.

3. **Access the application**

   The frontend can be accessed at [http://localhost:3000](http://localhost:3000).

   The backend API is available at [http://localhost:8080](http://localhost:8080).

### Usage

- **Booking a Phone:**
  Navigate to the "Book Device" section in the application, select a device from the list, and enter your name to book the phone. Click on "Book" to confirm.

- **Returning a Phone:**
  Go to the "Return Device" section, select the device you wish to return from the list, and click "Return".

- **Viewing Device Status:**
  The main page displays all devices, their availability, last booking time, and the name of the person who last booked each device.

## Development

- **Frontend Development:**
  Changes in the frontend code can be made in the `frontend` directory. The React app will automatically reload if you make edits.

- **Backend Development:**
  Backend code is located in the `backend` folder. Spring Boot has hot-reload capabilities with DevTools, which can be used for faster development cycles.

## Contributing

Please read `CONTRIBUTING.md` for details on our code of conduct, and the process for submitting pull requests to us.

## License

This project is licensed under the MIT License - see the `LICENSE.md` file for details.

## Contact

Your Name – your.email@example.com

Project Link: [https://github.com/yourusername/projectname](https://github.com/yourusername/projectname)
