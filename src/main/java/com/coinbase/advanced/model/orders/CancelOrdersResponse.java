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

package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CancelOrdersResponse {

    @JsonProperty("results")
    private List<CancelResult> results;

    public CancelOrdersResponse() {}

    private CancelOrdersResponse(Builder builder) {
        this.results = builder.results;
    }

    public List<CancelResult> getResults() {
        return results;
    }

    public void setResults(List<CancelResult> results) {
        this.results = results;
    }

    public static class Builder {
        private List<CancelResult> results;

        public Builder results(List<CancelResult> results) {
            this.results = results;
            return this;
        }

        public CancelOrdersResponse build() {
            return new CancelOrdersResponse(this);
        }
    }
}
