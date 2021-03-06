/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aserbao.aserbaosandroid.aaSource.android.app.Fragment.ShareElementFragment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.aserbao.aserbaosandroid.aaSource.android.app.Fragment.ShareElementFragment.ImageFragment;
import com.aserbao.aserbaosandroid.comon.commonData.ASourceUtil;


public class ImagePagerAdapter extends FragmentStatePagerAdapter {

  public ImagePagerAdapter(Fragment fragment) {
    // Note: Initialize with the child fragment manager.
    super(fragment.getChildFragmentManager());
  }

  @Override
  public int getCount() {
    return ASourceUtil.imageUrls.length;
  }

  @Override
  public Fragment getItem(int position) {
    return ImageFragment.newInstance(ASourceUtil.imageUrls[position]);
  }
}
