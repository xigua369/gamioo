/*
 * Copyright 2015-2020 Gamioo Authors.
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

package io.gamioo.ioc.wrapper;

/**
 * some description
 *
 * @author Allen Jiang
 * @since 1.0.0
 */
public class BeanWrapper {
    private Object object;

    public BeanWrapper(Object object) {
        this.object = object;
    }

    /**
     * Return the bean instance wrapped by this object, if any.
     *
     * @return the bean instance, or {@code null} if none set
     */
    public Object getWrappedInstance() {
        return this.object;
    }

    /**
     * Return the type of the wrapped JavaBean object.
     *
     * @return the type of the wrapped bean instance,
     * or {@code null} if no wrapped object has been set
     */
    public Class<?> getWrappedClass() {
        return (this.object != null ? this.object.getClass() : null);
    }
}
