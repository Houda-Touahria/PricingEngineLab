# Pricing & Discount Engine

## Overview

This project is a **Java-based pricing engine** that calculates the final price of an order based on:

- Item prices and quantities
- Customer type (REGULAR / VIP)
- Discount code (SAVE10, SAVE20, etc.)

The project was developed as part of a **Refactoring Lab** to demonstrate:

- Gradle project setup
- JUnit unit testing
- Git/GitHub workflow
- Applying **Refactoring techniques** to improve code quality

## Technologies Used

| Tool | Purpose |
|------|---------|
| **Java 17+** | Programming language |
| **Gradle** | Build automation & dependency management |
| **JUnit 5** | Unit testing |
| **Git & GitHub** | Version control & project submission |

## Project Structure
PricingEngineLab/
├── build.gradle
├── settings.gradle
├── src/
│ ├── main/
│ │ └── java/com/pricing/
│ │ ├── PricingEngine.java (Main logic)
│ │ ├── DiscountStrategy.java (Strategy interface)
│ │ ├── RegularDiscount.java (REGULAR customer discount)
│ │ ├── VipDiscount.java (VIP customer discount)
│ │ ├── TaxCalculator.java (Tax calculation)
│ │ └── Main.java (Entry point)
│ └── test/
│ └── java/com/pricing/
│ └── PricingEngineTest.java (Unit tests)
└── README.md

## How to Run the Project

### Clone the repository

```bash
git clone https://github.com/Houda-Touahria/PricingEngineLab.git
cd PricingEngineLab
2 Build the project
bash
gradle clean build
3️ Run the application
bash
gradle run
Expected output:

text
Final price returned: $299.2
4️ Run unit tests
bash
gradle test
Expected output:

text
PricingEngineTest > testRegularCustomerNoDiscount() PASSED
PricingEngineTest > testVIPCustomerWithSAVE20() PASSED
PricingEngineTest > testMultipleItems() PASSED
