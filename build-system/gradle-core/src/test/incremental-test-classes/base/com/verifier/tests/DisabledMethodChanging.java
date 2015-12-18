/*
 * Copyright (C) 2015 The Android Open Source Project
 *
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
 */

package com.verifier.tests;

import com.android.tools.ir.api.DisableInstantRun;

/**
 * Classes with changing InstantRun methods should be flagged by the verifier.
 */
public class DisabledMethodChanging {

    @DisableInstantRun
    public String disabledMethod() {
        return "foo";
    }

    public Float getFloat() {
        return 12f;
    }
}