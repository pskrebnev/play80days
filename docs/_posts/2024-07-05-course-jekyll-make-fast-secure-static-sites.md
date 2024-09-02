---
title: Course 'Jekyll -- make fast, secure static sites and blogs with Jekyll'
layout: post
date: 2024-07-05 12:35
image: /assets/images/posts/2024-07-05-jekyll-make-fast-secure-static-sites-and-blogs.webp
tags: ["July-2024"]
---

{% if page.image %}
![{{ page.title }}]({{ site.baseurl }}{{ page.image }})
{% endif %}

<div class="post-date">
{{ page.date | date: "%B %d, %Y %H:%M" }}
</div>

*Estimated time spent: 8.5 hours*

Course on the basics of SSG (static site generator) **[Jekyll]**. There are several products in this series: Hugo, Gatsby, Docusaurus, and many, many others. But if you want to host your site on GitHub Pages, then it's Jekyll.

To install Jekyll, you need to install Ruby. And having all this zoo on my corporate laptop was something I really didn't want. The issue was resolved by installing Docker, and with Docker, I was able to gather all the necessary tools together. At the same time, I [reviewed the basics of Docker].

This was just the basics of Jekyll. It wasn't enough when I needed to slightly adjust the template. I had to turn to AI ([Amazon Q]) to request a function in Liquid. I only needed one small function, and there was no time at all to learn the Liquid syntax as well.

Result: The basics of Jekyll helped me publish the site on GitHub Pages, which you are reading now.

Course link (for Luxoft:Business accounts): [https://luxoft.udemy.com/course/static-website-generator-fast-secure-sites-blogs-with-jekyll/](https://luxoft.udemy.com/course/static-website-generator-fast-secure-sites-blogs-with-jekyll/)

*P.S. There is a small nuance: you can host a static site on GitHub not only with Jekyll. But that's a separate topic.*

[Jekyll]: https://jekyllrb.com/

[reviewed the basics of Docker]: {{ site.baseurl }}/courses#ultimate-docker-fast-track-beginner-to-advanced

[Amazon Q]: https://aws.amazon.com/q/
