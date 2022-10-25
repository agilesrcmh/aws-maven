/*
 * Copyright 2018-Present Platform Team.
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

package com.github.platform.team.plugin.aws;

import com.amazonaws.auth.AWSSessionCredentials;
import org.apache.maven.wagon.authentication.AuthenticationInfo;

public class AWSSessionMavenCredentials implements AWSSessionCredentials {

    private final AuthenticationInfo authenticationInfo;

    public AWSSessionMavenCredentials(AuthenticationInfo authenticationInfo) {
        this.authenticationInfo = authenticationInfo;
    }

    @Override
    public String getAWSAccessKeyId() {
        return this.authenticationInfo.getUserName();
    }

    @Override
    public String getAWSSecretKey() {
        return this.authenticationInfo.getPassword().split(":")[0];
    }

    public String getSessionToken() {
        return this.authenticationInfo.getPassword().split(":")[1];
    }
}