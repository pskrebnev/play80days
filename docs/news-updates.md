---
title: News / Updates
layout: default
nav_order: 2
permalink: /news-updates
---
# NEWS / UPDATES
{: .no_toc }

{% for post in site.posts %}
  <article>
    <h2>{{ post.title }}</h2>
    <h6>{{ post.date | date: "%B %d, %Y %H:%M" }}</h6>
    <p>{{ post.content | strip_html | truncate: 200 }}</p>
    <p><a href=" {{ site.baseurl }}{{ post.url }}">More ...</a></p>
  </article>
  <hr>
{% endfor %}

