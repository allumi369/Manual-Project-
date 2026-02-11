# Manual Testing Documentation

**Project:** Mandy’s Maids Cleaning Services

---
## 1. Objective
This document describes the manual testing activities performed on the Mandy’s Maids Cleaning Services website. The purpose of manual testing was to validate core user functionality, identify defects, and verify expected behavior of publicly accessible pages.

---
## 2. Scope of Testing
### Pages Included
- Home
- Contact Us
- Get Estimate
### Pages Excluded
- Sign In
**Reason for Exclusion**:  
- Core business functionality (service information, estimate requests, and contact initiation) is accessible without authentication.
- Authentication-related functionality was considered out of scope for this project.
---
## 3. Test Approach
- Functional testing of page elements and user interactions
- Input validation testing
- Negative testing for required fields
- Basic UI and content verification
---
## 4. Test Case Design
Test cases were designed to cover:
- Valid input scenarios
- Mandatory field behavior
- Empty field scenarios
- Successful submission scenarios

**Each test case includes**:
- Test ID
- Test Description
- Test Procedure
- Test Data 
- Expected Result
- Actual Result
- Status(Pass/Fail)
- Screenshot
---
## 5. Test Execution & Reporting

All test cases and results are documented in:
`Mandys Maids Cleaning Service.xlsx`

The Excel file is structured as follows:
- Separate sheets for:
    - Home Test Report
    - Contact Us Test Report
    - Get Estimate Test Report
- Test Data
- Observations
- One consolidated sheet:
    - Bug Report (includes defects from all tested pages)

In Test Reports only those data deemed too big to be defined under Test data column were moved to separate sheet called Test Data. 
In Test report only those content for Actual Result column deemed too big were moved to separate sheet called Observations

---
## 6. Defect Reporting Structure
Each defect record contains:
- Bug ID
- Test ID
- Expected Result
- Bug Summary
- Steps to Reproduce
- Defect Severity
- Defect Priority
- Status
- Screenshot
Defects were logged only when actual behavior deviated from expected behavior.

---
## 7. Test Environment
- Browser: Vivaldi 7.5
- OS: Windows 11
- Device Type: Desktop
- Test Type: Web Application
---
## 8. Assumptions & Limitations
- No backend or database access was available.
- No API or security testing was performed.
- Performance and load testing were not included.
- Testing was limited to publicly accessible functionality.

