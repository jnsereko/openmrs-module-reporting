/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.reporting.cohort.definition;

import java.util.ArrayList;
import java.util.List;

import org.openmrs.Concept;
import org.openmrs.module.reporting.common.Localized;
import org.openmrs.module.reporting.common.SetComparator;
import org.openmrs.module.reporting.definition.configuration.ConfigurationProperty;
import org.openmrs.module.reporting.definition.configuration.ConfigurationPropertyCachingStrategy;
import org.openmrs.module.reporting.evaluation.caching.Caching;

@Caching(strategy=ConfigurationPropertyCachingStrategy.class)
@Localized("reporting.CodedObsCohortDefinition")
public class CodedObsCohortDefinition extends BaseObsCohortDefinition {
	
	public static final long serialVersionUID = 1L;
	
	@ConfigurationProperty(group="constraint")
	SetComparator operator;
	
	@ConfigurationProperty(group="constraint")
	List<Concept> valueList;
	
	public CodedObsCohortDefinition() { }
	
    /**
     * @return the operator
     */
    public SetComparator getOperator() {
    	return operator;
    }

    /**
     * @param operator the operator to set
     */
    public void setOperator(SetComparator operator) {
    	this.operator = operator;
    }

    /**
     * @return the valueList
     */
    public List<Concept> getValueList() {
    	return valueList;
    }
	
    /**
     * @param valueList the valueList to set
     */
    public void setValueList(List<Concept> valueList) {
    	this.valueList = valueList;
    }

    /**
     * @param concept the coded value to add to the valueList
     */
    public void addValue(Concept concept) {
    	if (valueList == null) {
    		valueList = new ArrayList<Concept>();
    	}
    	valueList.add(concept);
    }
}
