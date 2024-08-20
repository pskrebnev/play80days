---
title: Beginning of the project
layout: post
date: 2024-06-28 10:17
---

Project started. Project started. Project started. Project started. Project started. Project started.

Based on this fact, this method only understands the time zone abbreviations described in RFC 822 and the system time zone, in the order named. (i.e. a definition in RFC 822 overrides the system time zone definition.) The system time zone is taken from Time.local(year, 1, 1).zone and Time.local(year, 7, 1).zone. If the extracted time zone abbreviation does not match any of them, it is ignored and the given time is regarded as a local time.
ArgumentError is raised if Date._parse cannot extract information from date or if the Time class cannot represent specified date.

---
<details markdown="block">
<summary>Shopping list (click me!)</summary>

This is content inside a `<details>` dropdown.

- [ ] Apples
- [ ] Oranges
- [ ] Milk

</details>
---
<button class="btn js-toggle-dark-mode">Preview dark color scheme</button>

<script>
const toggleDarkMode = document.querySelector('.js-toggle-dark-mode');

jtd.addEvent(toggleDarkMode, 'click', function(){
  if (jtd.getTheme() === 'dark') {
    jtd.setTheme('light');
    toggleDarkMode.textContent = 'Preview dark color scheme';
  } else {
    jtd.setTheme('dark');
    toggleDarkMode.textContent = 'Return to the light side';
  }
});
</script>
---
### Labels

I'm a label
{: .label }

blue
{: .label .label-blue }
green
{: .label .label-green }
purple
{: .label .label-purple }
yellow
{: .label .label-yellow }
red
{: .label .label-red }

**bold**
{: .label }
*italic*
{: .label }
***bold + italic***
{: .label }
---

