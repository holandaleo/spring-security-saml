/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.springframework.security.saml2.attribute;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Attribute {

    private String name;
    private String friendlyName;
    private List<Object> values = new LinkedList<>();
    private AttributeNameFormat nameFormat = AttributeNameFormat.UNSPECIFIED;
    private boolean required;


    public String getName() {
        return name;
    }

    public Attribute setName(String name) {
        this.name = name;
        return this;
    }

    public List<Object> getValues() {
        return Collections.unmodifiableList(values);
    }

    public Attribute setValues(List<Object> values) {
        this.values.clear();
        this.values.addAll(values);
        return this;
    }

    public Attribute addValues(Object... values) {
        this.values.addAll(Arrays.asList(values));
        return this;
    }

    public AttributeNameFormat getNameFormat() {
        return nameFormat;
    }

    public Attribute setNameFormat(AttributeNameFormat nameFormat) {
        this.nameFormat = nameFormat;
        return this;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public Attribute setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    public boolean isRequired() {
        return required;
    }

    public Attribute setRequired(boolean required) {
        this.required = required;
        return this;
    }
}