---
layout: default
title: Installation/Setting Up
parent: Getting Started
nav_order: 4
permalink: /howtostart/installation
---

# Installation/Setting Up
{: .no_toc }

In order to use the framework:

1. Clone (or fork) the repository.

    ```bash
    git clone [repository_url] [your_folder_path]
    ```

2. Import/Open the project in your IDE.
3. Make your desired changes.
4. Use `terminal` or your IDE to run your desired tests. For example:

    ```
    ./gradlew test -Dbrowser=firefox -Dheadless=false
    ```

    to run all the tests using the firefox browser in headed mode.

5. Build and browse the allure report using:

    ```bash
    ./gradlew allureServe
    ```


