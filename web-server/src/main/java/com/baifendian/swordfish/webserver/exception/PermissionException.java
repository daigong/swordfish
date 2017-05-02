/*
 * Copyright (C) 2017 Baifendian Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baifendian.swordfish.webserver.exception;

import java.text.MessageFormat;


/**
 * 权限异常
 */
public class PermissionException extends UnAuthorizedException {
  private String perm;
  private String user;

  public String getPerm() {
    return perm;
  }

  public String getUser() {
    return user;
  }

  public PermissionException(String perm, String user) {
    super(MessageFormat.format("User: {0} permission: {1} is invalid", perm, user));

    this.perm = perm;
    this.user = user;
  }
}