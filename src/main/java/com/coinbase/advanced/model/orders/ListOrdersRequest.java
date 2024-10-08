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

public class ListOrdersRequest {
    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("order_status")
    private List<String> orderStatus;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("order_type")
    private String orderType;

    @JsonProperty("order_side")
    private String orderSide;

    @JsonProperty("product_type")
    private String productType;

    @JsonProperty("order_placement_source")
    private String orderPlacementSource;

    @JsonProperty("contract_expiry_type")
    private String contractExpiryType;

    @JsonProperty("asset_filters")
    private List<String> assetFilters;

    @JsonProperty("retail_portfolio_id")
    private String retailPortfolioId;

    public ListOrdersRequest() {}

    private ListOrdersRequest(Builder builder) {
        this.productId = builder.productId;
        this.orderStatus = builder.orderStatus;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.orderType = builder.orderType;
        this.orderSide = builder.orderSide;
        this.productType = builder.productType;
        this.orderPlacementSource = builder.orderPlacementSource;
        this.contractExpiryType = builder.contractExpiryType;
        this.assetFilters = builder.assetFilters;
        this.retailPortfolioId = builder.retailPortfolioId;
    }

    public static class Builder {
        private String productId;
        private List<String> orderStatus;
        private String startDate;
        private String endDate;
        private String orderType;
        private String orderSide;
        private String productType;
        private String orderPlacementSource;
        private String contractExpiryType;
        private List<String> assetFilters;
        private String retailPortfolioId;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder orderStatus(List<String> orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder orderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        public Builder orderSide(String orderSide) {
            this.orderSide = orderSide;
            return this;
        }

        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        public Builder orderPlacementSource(String orderPlacementSource) {
            this.orderPlacementSource = orderPlacementSource;
            return this;
        }

        public Builder contractExpiryType(String contractExpiryType) {
            this.contractExpiryType = contractExpiryType;
            return this;
        }

        public Builder assetFilters(List<String> assetFilters) {
            this.assetFilters = assetFilters;
            return this;
        }

        public Builder retailPortfolioId(String retailPortfolioId) {
            this.retailPortfolioId = retailPortfolioId;
            return this;
        }

        public ListOrdersRequest build() {
            return new ListOrdersRequest(this);
        }
    }
}
