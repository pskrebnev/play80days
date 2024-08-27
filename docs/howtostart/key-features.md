---
layout: default
title: Key Features
parent: Getting Started
nav_order: 2
permalink: /howtostart/key-features
---

# Key Features
{: .no_toc }

* *Easy Implemented:* Adapt the framework for your project in a couple of clicks.
* *Configuration-based architecture:* Easy configured for you project needs.
* *Data-Driven:*  Data Builder is a utility class responsible for creating and managing test data. It provides a flexible way to generate data for various test scenarios, allowing testers to focus on writing test scripts rather than creating and managing test data. Data Builders can be used to create test data for different formats, such as JSON, XML, or CSV.
* *Utilizes Page Objects and Page Component Objects:*  Page Object is a design pattern that represents a web page or a section of a web page as a class. It encapsulates the properties and actions that can be performed on that page, making it easier to write and maintain test scripts. Page Objects provide a clear and concise way to interact with web pages, hiding the underlying implementation details and promoting code reusability.
* *Automated UI Testing:*  Ensure your web application works seamlessly across different browsers and devices.
* *'Captures screenshot' / 'Records video of test execution':* This feature allows the test automation framework to capture screenshots of the application under test at specific points during test execution. This can be particularly useful for debugging purposes, as it provides a visual representation of the application's state at the moment of failure or when an unexpected behavior occurs. The captured screenshots can be saved to a designated directory, allowing for easy access and analysis.

```java
// Capture screenshot on test failure
playwright.config().setScreenshotOnFailure(true);

// Record video of test execution
playwright.config().setRecordVideo(true);
```

* *Provides detailed test report:*  Gain valuable insights into test results and identify areas for improvement.
* *Cross-Platform Compatibility:*  Test your application on various operating systems and browsers.
* *Supports parallel test execution:*  Parallel execution is a feature that enables multiple tests to run simultaneously, significantly reducing the overall test execution time.


















