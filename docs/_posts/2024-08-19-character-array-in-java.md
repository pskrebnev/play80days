---
title: Why is a character array preferred over String for storing passwords in Java?
layout: post
date: 2024-08-19 17:12
---

A String object is immutable in Java and is stored in the string pool. Once it’s created it stays in the pool until garbage collection completes, so even though you’re done with the password it’s available in memory for longer duration. It’s a security risk because anyone having access to memory dump can find the password as clear text. If you use a character array to store password, you can set it to blank once you’re done with it. You can control for how long it’s available in memory and that avoids the security threat.
