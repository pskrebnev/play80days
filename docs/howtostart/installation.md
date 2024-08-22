---
layout: default
title: Installation/Setting Up
parent: Getting Started
nav_order: 4
permalink: /howtostart/installation
---

# Installation/Setting Up
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

### Multiple IDs
{: .d-inline-block .no_toc }

New (v0.4.0)
{: .label .label-green }

This theme supports multiple comma-separated tracking IDs. This helps seamlessly transition UA properties to GA4 properties by tracking both for a while.

```yaml
ga_tracking: "UA-1234567-89,G-1AB234CDE5"
```


