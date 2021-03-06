/*
 * #%L
 * Understanding Theads Monitors and Locks
 * $Id:$
 * $HeadURL$
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
package com.javacreed.examples.concurrency.part1;

public class CreateSimpleThread {

  private static void log(final String message) {
    System.out.printf("%tT [%s] %s%n", System.currentTimeMillis(), Thread.currentThread().getName(), message);
  }

  public static void main(final String[] args) throws InterruptedException {
    CreateSimpleThread.log("Start");

    // Approach 1
    final Thread t = new Thread("My Thread") {
      @Override
      public void run() {
        CreateSimpleThread.log("Hello from thread");
      }
    };

    // Approach 2
    // final Runnable r = new Runnable() {
    // @Override
    // public void run() {
    // CreateSimpleThread.log("Hello from thread");
    // }
    // };
    // final Thread t = new Thread(r, "My Thread");

    t.start();

    CreateSimpleThread.log("Waiting for thread to finish");
    t.join();

    CreateSimpleThread.log("Done");
  }

}
