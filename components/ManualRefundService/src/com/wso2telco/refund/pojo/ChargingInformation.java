/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * 
 *  WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.refund.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ChargingInformation {

    /** The amount. */
    @SerializedName("amount")
    @Expose
    private String amount;
    
    /** The currency. */
    @SerializedName("currency")
    @Expose
    private String currency;
    
    /** The description. */
    @SerializedName("description")
    @Expose
    private String description;

    /**
     * Gets the amount.
     *
     * @return     The amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the amount.
     *
     * @param amount     The amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Gets the currency.
     *
     * @return     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the currency.
     *
     * @param currency     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Gets the description.
     *
     * @return     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
