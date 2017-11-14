/*
 * Copyright (C) 2012-2016 Markus Junginger, greenrobot (http://greenrobot.org)
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
package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.SubscriberMethod;

/**
 * Base class for generated index classes created by annotation processing.
 * 编译时生成的Java class使用，是订阅者的具体信息
 */
public interface SubscriberInfo {
    /**
     * 订阅者全类名
     *
     * @return
     */
    Class<?> getSubscriberClass();

    /**
     * 订阅者的所有订阅方法
     *
     * @return
     */
    SubscriberMethod[] getSubscriberMethods();

    /**
     * 本类的父类订阅者信息
     *
     * @return
     */
    SubscriberInfo getSuperSubscriberInfo();

    boolean shouldCheckSuperclass();
}
