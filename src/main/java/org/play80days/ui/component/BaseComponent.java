package org.play80days.ui.component;

import com.microsoft.playwright.Page;

public abstract class BaseComponent {

  protected Page page;

  protected BaseComponent(final Page page) {
    this.page = page;
  }
}
