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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetBestBidAskRequest {

    @JsonProperty("product_ids")
    private List<String> productIds;

    public GetBestBidAskRequest() {}

    private GetBestBidAskRequest(Builder builder) {
        this.productIds = builder.productIds;
    }

    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    public static class Builder {
        private List<String> productIds;

        public Builder productIds(List<String> productIds) {
            this.productIds = productIds;
            return this;
        }

        public GetBestBidAskRequest build() {
            return new GetBestBidAskRequest(this);
        }
    }
}
