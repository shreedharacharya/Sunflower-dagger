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

package com.google.samples.apps.sunflower.di.module

import com.google.samples.apps.sunflower.GardenFragment
import com.google.samples.apps.sunflower.HomeViewPagerFragment
import com.google.samples.apps.sunflower.PlantDetailFragment
import com.google.samples.apps.sunflower.PlantListFragment
import com.google.samples.apps.sunflower.data.AppDatabase
import com.google.samples.apps.sunflower.data.GardenPlantingRepository
import com.google.samples.apps.sunflower.di.FragmentScope
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

/**
 * Created by Shreedhar on 26,June,2020
 */

@Module
abstract class FragmentBindingModule {

    @FragmentScope
    @ContributesAndroidInjector(
            modules = [
                GardenFragmentModule::class
            ]
    )
    abstract fun contributesGardenFragment(): GardenFragment

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun contributesPlantListFragment(): PlantListFragment

//    @FragmentScope
//    @ContributesAndroidInjector(
//            modules = [
//                HomeViewPagerFragmentModule::class
//            ]
//    )
//    abstract fun contributesHomeViewPagerFragment(): HomeViewPagerFragment

    @FragmentScope
    @ContributesAndroidInjector(
            modules = [
                PlantDetailFragmentModule::class,
                PlantDetailFragmentViewModelModule::class
            ]
    )
    abstract fun contributesPlantDetailFragment(): PlantDetailFragment

}