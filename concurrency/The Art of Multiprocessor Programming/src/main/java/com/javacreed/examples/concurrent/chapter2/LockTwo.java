/*
 * #%L
 * The Art of Multiprocessor Programming
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2012 - 2014 Java Creed
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.javacreed.examples.concurrent.chapter2;

import com.javacreed.examples.concurrent.appendix.a.ThreadID;
import com.javacreed.examples.concurrent.extra.Broken;
import com.javacreed.examples.concurrent.extra.Figure;

@Figure("2.5")
@Broken("This class is inadequate because it deadlock in one thread runs completely ahead of the other")
public class LockTwo implements Lock {

  private volatile int victim;

  @Override
  public void lock() {
    final int i = ThreadID.get();
    victim = i;
    while (victim == i) {} // Wait
  }

  @Override
  public void unlock() {}

}
