---
title: News / Updates
layout: post
nav_order: 2
permalink: /news-updates
---
{% for post in site.posts %}
  <article>
    <h2>{{ post.title }}</h2>
    <p>{{ post.date | date: "%B %d, %Y %H:%M" }}</p>
    <p>{{ post.content | strip_html | truncate: 200 }}</p>
    <p><a href="{{ post.url }}">More -></a></p>
  </article>
  <hr>
{% endfor %}





