---
title: What Knowledge Was I Lacking? (Docker, GitHub Actions, Linux etc.)
layout: post
date: 2024-06-11 10:30
image: /assets/images/posts/2024-06-11-what-knowledge-was-i-lacking.webp
---

<div class="post-date">
{{ page.date | date: "%B %d, %Y %H:%M" }}
</div>
<div> <nbsp/> </div>

*Update: What knowledge was I really missing to achieve my goal?*

**Briefly describe the desired outcome:**
- Framework `A`: Java + JUnit + Gradle + Playwright
- System Under Test (SUT): `B` website 80days.me
- Host `C`: GitHub

**Ideally, it should look like this:**
1. The 'regress' test set runs:
- After changes in application `B`'s code, the code is built and system `B` is tested;
- After changes in test framework `A`'s code, the code is built and system `B` is tested;
- Desired test sets can be run manually, and system `B` is tested;
- Test results are published on host `C` in a specific directory;

2. Test history and results are preserved;
3. The framework `C` website automatically updates with a template: time+date, version, test type (what was checked), brief report, link to detailed report.

I knew all this could be done entirely with GitHub tools, but I didn't know how. I decided to start with 'GitHub Actions'. During the process, it became clear that additional knowledge in 'Linux', 'YAML', and 'Docker' was necessary.

Fortunately, [Luxoft] provides access to Udemy trainings through the [Luxoft:Business] account **(only for Luxoft employees!)**.

**So, I chose:**
- [GitHub Actions - The Complete Guide]
- Ultimate Docker Fast-Track Beginner to Advanced (see my [notes about Docker course])

![2024-06-11-what-knowledge-was-i-lacking.webp]({{ site.baseurl }}/assets/images/posts/2024-06-11-what-knowledge-was-i-lacking.webp)

This was just the beginning. But it was enough to create a working system. It doesn't work exactly as I want yet. There are aspects that can be improved. But it works.

**If time permits, I'll take:**
- [YAML Zero to Master]
- Linux (course not yet chosen)
- Docker (course not yet chosen)

[Luxoft]: https://www.luxoft.com/

[Luxoft:Business]: https://luxoft.udemy.com/organization/home/

[Udemy]: https://www.udemy.com/

[YAML Zero to Master]: https://luxoft.udemy.com/course/yaml-zero-to-master/

[notes about Docker course]: {{ site.baseurl }}/2024/07/12/ultimate-docker-beginner-to-advanced.html

[GitHub Actions - The Complete Guide]: {{ site.baseurl }}/courses#github-actions---the-complete-guide

