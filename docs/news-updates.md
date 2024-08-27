---
title: News/Updates
layout: default
nav_order: 2
permalink: /news-updates
---
# NEWS/UPDATES
{: .no_toc }

{% for post in site.posts %}
  <article class="post">

    <h2 class="post-lead">{{ post.title | upcase }}</h2>

    <p class="post-date">{{ post.date | date: "%B %d, %Y %H:%M" }}</p>

    {% if post.image %}
    <img src="{{ site.baseurl }}{{ post.image }}" alt="{{ post.title }}" width="200">
    {% endif %}
    
    {% assign date_length = post.date | date: "%B %d, %Y %H:%M" | size %}
    {% assign total_date_ln = date_length | plus: 7 %}

    {% if post.date %}
    <p>{{ post.content | strip_html | truncate: 250 | slice: total_date_ln, post.content.size }}</p>
    {% else %}
    <p>{{ post.content | strip_html | truncate: 250 }}</p>
    {% endif %}

    <p><a href="{{ site.baseurl }}{{ post.url }}">More ...</a></p>

  </article>
  <hr>
{% endfor %}

