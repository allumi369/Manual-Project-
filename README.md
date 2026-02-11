Mandy’s Maids Cleaning Services – QA Testing Project
Project Overview
This repository contains manual and automation testing artifacts created for the website Mandy’s Maids Cleaning Services.
The objective of this project is to demonstrate practical QA skills including test design, execution, defect reporting, and selective test automation.

Website Pages Covered

Home
Contact Us
Get Estimate
Testing Scope
Manual Testing
Pages included in testing

Home
Contact Us
Get Estimate Pages Explicitly Excluded:
Sign Reason for Exclusion:
Core business functionality (service information, estimate requests, and contact initiation) is accessible without authentication.
Authentication-related functionality was considered out of scope for this project.
Automation Testing
Automation testing was performed only for the Get Estimate page.

Reason for selective automation

The Get Estimate page contains multiple form fields with validation rules.
The goal was to showcase automation logic, not full-site automation.
Test Artifacts Included
Manual Testing
Test Report (separate sheets for each page)
Consolidated Bug Report (single sheet for all pages)
Excel-based documentation for traceability Location: /manual-testing
Automation Testing
Selenium automation framework using Page Object Model (POM)
Automated validation of Get Estimate form fields Location: /automation-testing
Tools and Technologies
Manual Testing
Test case design and execution using Microsoft Excel
Defect reporting with severity and status tracking
Automation Testing
Java
Selenium WebDriver
TestNG
Assumptions and Limitations
Testing was performed from a black-box perspective.
No backend, database, or API access was available.
Automation scope was intentionally limited to one page.
Test data used is non-production and sample-based.
Purpose of This Project
This project is intended to demonstrate:

Strong fundamentals in manual testing
Practical defect reporting skills
Strategic decision-making in test automation
Ability to document and structure QA work professionally
