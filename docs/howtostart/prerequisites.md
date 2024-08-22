---
layout: default
title: Prerequisites
parent: Getting Started
nav_order: 3
permalink: /howtostart/prerequisites
---

# Prerequisites
{: .no_toc }

Just the Docs has some specific configuration parameters that can be defined in your Jekyll site's \_config.yml file.
{: .fs-6 .fw-300 }

## Table of contents
{: .no_toc .text-delta }

1. TOC
{:toc}

---

View this site's [\_config.yml](https://github.com/just-the-docs/just-the-docs/tree/main/_config.yml) file as an example.

## Site logo

```yaml
# Set a path/url to a logo that will be displayed instead of the title
logo: "/assets/images/just-the-docs.png"
```



Provide a `path` instead of a `version` key to load the mermaid library from a local file.





When *all* your pages are in a single collection, its name is not displayed.

The navigation for each collection is a separate name space for page titles: a page in one collection cannot be a child of a page in a different collection, or of a normal page.
