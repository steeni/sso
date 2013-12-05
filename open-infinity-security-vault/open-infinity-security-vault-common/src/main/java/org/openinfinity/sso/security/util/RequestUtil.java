/*
 * Copyright (c) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openinfinity.sso.security.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Support class for HTTP servlet requests.
 *  
 * @author Ilkka Leinonen
 * @version 1.0.0
 * @since 1.0.0
 */
public class RequestUtil {
	
	/**
	 * Returns cookie's value with specific cookie name.
	 * 
	 * @param name Represents the cookie name.
	 * @param request Represents the HttpServletRequest object.
	 * @return String as the actual cookie value or null if cookie is not found.
	 */
	public static String getCookieValue(String name, HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if (cookie.getName().equalsIgnoreCase(name)) {
				return cookie.getValue();
			}
		}
		return null;
	}
}