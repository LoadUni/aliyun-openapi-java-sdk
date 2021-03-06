/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.afs.model.v20180112;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.afs.transform.v20180112.DescribeConfigNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConfigNameResponse extends AcsResponse {

	private String requestId;

	private Boolean hasConfig;

	private String configNames;

	private String bizCode;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getHasConfig() {
		return this.hasConfig;
	}

	public void setHasConfig(Boolean hasConfig) {
		this.hasConfig = hasConfig;
	}

	public String getConfigNames() {
		return this.configNames;
	}

	public void setConfigNames(String configNames) {
		this.configNames = configNames;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	@Override
	public DescribeConfigNameResponse getInstance(UnmarshallerContext context) {
		return	DescribeConfigNameResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
