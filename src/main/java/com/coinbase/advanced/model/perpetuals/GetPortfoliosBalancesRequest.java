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

package com.coinbase.advanced.model.perpetuals;

public class GetPortfoliosBalancesRequest {

    private String portfolioUuid;

    public GetPortfoliosBalancesRequest() {}

    private GetPortfoliosBalancesRequest(Builder builder) {
        this.portfolioUuid = builder.portfolioUuid;
    }

    public String getPortfolioUuid() {
        return portfolioUuid;
    }

    public void setPortfolioUuid(String portfolioUuid) {
        this.portfolioUuid = portfolioUuid;
    }

    public static class Builder {
        private String portfolioUuid;

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public GetPortfoliosBalancesRequest build() {
            return new GetPortfoliosBalancesRequest(this);
        }
    }
}
