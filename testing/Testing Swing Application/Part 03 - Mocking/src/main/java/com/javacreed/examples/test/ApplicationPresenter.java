/*
 * #%L
 * Testing Swing Application
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
package com.javacreed.examples.test;

import java.io.File;

public class ApplicationPresenter implements Presenter {

  private View view;

  private File currentFile;

  private View getView() {
    if (view == null) {
      throw new IllegalStateException("The view is not set");
    }
    return view;
  }

  @Override
  public void onOpen() {
    final File file = view.showOpenFileChooser(currentFile);
    if (file != null) {
      if (file.isFile()) {
        // Load File
        currentFile = file;
      } else {
        getView().showWarning("Open File", "The file: '" + file.getAbsolutePath() + "' is not a file");
      }
    }
  }

  @Override
  public void setView(final View view) {
    this.view = view;
  }

}
