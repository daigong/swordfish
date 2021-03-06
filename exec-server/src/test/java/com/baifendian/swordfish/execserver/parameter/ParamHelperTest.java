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
package com.baifendian.swordfish.execserver.parameter;

import com.baifendian.swordfish.dao.enums.ExecType;
import java.util.Date;
import java.util.Map;
import org.junit.Test;

public class ParamHelperTest {

  @Test
  public void testResolvePlaceholders() {
    Map<String, String> definedParamMap = SystemParamManager
        .buildSystemParam(ExecType.DIRECT, new Date(), 200, "job id 001");

    // 解析参数
    String sqls = "${sf.system.bizdate}";
    System.out.println(ParamHelper.resolvePlaceholders(sqls, definedParamMap));

    sqls = "${sf.system.bizcurdate}";
    System.out.println(ParamHelper.resolvePlaceholders(sqls, definedParamMap));

    sqls = "${sf.system.cyctime}";
    System.out.println(ParamHelper.resolvePlaceholders(sqls, definedParamMap));

    sqls = "$[yyyyMMdd]";
    System.out.println(ParamHelper.resolvePlaceholders(sqls, definedParamMap));

    sqls = "${sf.system.execId}";
    System.out.println(ParamHelper.resolvePlaceholders(sqls, definedParamMap));

    sqls = "${sf.system.jobId}";
    System.out.println(ParamHelper.resolvePlaceholders(sqls, definedParamMap));
  }
}
