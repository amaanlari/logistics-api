# Logistics API

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

## Overview

This project is a logistics API developed using Spring Boot, designed to streamline the process of managing load details for transportation companies. It provides endpoints to create, update, delete, and retrieve load information, facilitating efficient logistics management.

## Features

- **Create Load**: Allows users to create new load entries with details such as loading point, unloading point, product type, truck type, and more.
- **Update Load**: Enables users to update existing load entries with modified information.
- **Delete Load**: Provides functionality to delete load entries from the system.
- **Retrieve Load**: Allows users to retrieve load details based on various criteria.

## Technologies Used

- **Spring Boot**: Framework for building the API.
- **Spring Data JPA**: Data access and persistence.
- **Hibernate**: Object-relational mapping.
- **PostgreSQL**: Database management system.
- **Render**: Platform for hosting and deployment.

## Getting Started

1. **Prerequisites**: Ensure you have Java and MySQL installed on your system.
2. **Clone the Repository**: `git clone https://github.com/yourusername/logistics-api.git`
3. **Database Configuration**: Update `application.properties` with your MySQL database details.
4. **Run the Application**: Execute `mvn spring-boot:run` in the project directory.

## API Endpoints

- `POST /load`: Create a new load entry.
- `PUT /load/{id}`: Update an existing load entry.
- `DELETE /load/{id}`: Delete a load entry by ID.
- `GET /load/{id}`: Retrieve a load entry by ID.
- `GET /loads`: Retrieve all load entries.

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests for any improvements or new features.

## License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/amaanlari/logistics-api/blob/master/LICENSE) file for details.

---
