/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.coinbase.advanced.model.products;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Level {

    @JsonProperty("price")
    private String price;

    @JsonProperty("size")
    private String size;

    public Level() {}

    private Level(Builder builder) {
        this.price = builder.price;
        this.size = builder.size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static class Builder {
        private String price;
        private String size;

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Level build() {
            return new Level(this);
        }
    }
}
