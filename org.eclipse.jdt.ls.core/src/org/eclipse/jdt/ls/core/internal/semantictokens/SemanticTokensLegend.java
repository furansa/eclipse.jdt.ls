/*******************************************************************************
 * Copyright (c) 2020 Microsoft Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Microsoft Corporation - initial API and implementation
 *     0dinD - Semantic highlighting improvements - https://github.com/eclipse/eclipse.jdt.ls/pull/1501
 *******************************************************************************/
package org.eclipse.jdt.ls.core.internal.semantictokens;

import java.util.List;

public class SemanticTokensLegend {
	private final List<String> tokenTypes;
	private final List<String> tokenModifiers;

	public SemanticTokensLegend(List<String> tokenTypes, List<String> tokenModifiers){
		this.tokenTypes = tokenTypes;
		this.tokenModifiers = tokenModifiers;
	};

	public List<String> getTokenTypes() {
		return this.tokenTypes;
	}

	public List<String> getTokenModifiers() {
		return this.tokenModifiers;
	}
}