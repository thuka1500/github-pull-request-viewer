/*
    Copyright 2018 Gaurav Kumar

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/
package com.github.pullrequest.data.source.network

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Helping with retrofit instance
 *
 * Created by gk
 */

@Singleton
class APIHelper @Inject
constructor(private val apiService: APIService) : NetworkAPIs {

    override fun getAPIService(): APIService {
        return apiService
    }
}
