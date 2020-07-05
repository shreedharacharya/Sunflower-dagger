/*
 * Copyright 2020 Google LLC
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

package com.google.samples.apps.sunflower.base

/**
 * Created by Shreedhar on 20,June,2020
 */
//abstract class BaseFragment : Fragment() {
//
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        val fragmentComponent: FragmentComponent = DaggerFragmentComponent.builder()
//                .appComponent((activity?.applicationContext as BaseApplication).getAppComponent())
//                .fragmentModule(FragmentModule(this))
//                .build()
//
//        inject(fragmentComponent)
//
//        return super.onCreateView(inflater, container, savedInstanceState)
//
//    }
//
//    protected abstract fun inject(fragmentComponent: FragmentComponent)
//}