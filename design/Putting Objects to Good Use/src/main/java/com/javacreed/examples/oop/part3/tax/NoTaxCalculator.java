/*
 * #%L
 * Putting Objects to Good Use
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
package com.javacreed.examples.oop.part3.tax;

import java.math.BigDecimal;

public class NoTaxCalculator implements TaxCalculator {

  // Uncomment to convert to singleton.
  // public static final TaxCalculator INSTANCE = new NoTaxCalculator();
  //
  // private NoTaxCalculator() {
  // }

  @Override
  public BigDecimal calculateTax(final BigDecimal value) {
    return BigDecimal.ZERO;
  }

}
