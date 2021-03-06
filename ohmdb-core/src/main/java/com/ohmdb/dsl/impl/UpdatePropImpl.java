package com.ohmdb.dsl.impl;

/*
 * #%L
 * ohmdb-core
 * %%
 * Copyright (C) 2013 - 2014 Nikolche Mihajlovski
 * %%
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
 * #L%
 */

import com.ohmdb.abstracts.UpdateProp;
import com.ohmdb.joker.JokerCreator;
import com.ohmdb.util.Errors;

public class UpdatePropImpl<E> extends AbstractUpdaters<E> implements UpdateProp<E> {

	// private final String propertyName;

	// private final Object value;

	public UpdatePropImpl(JokerCreator jokerator, String propertyName, Object value) {
		super(jokerator);
		// this.propertyName = propertyName;
		// this.value = value;
	}

	@Override
	public void run() {
		throw Errors.notReady();
	}

}
