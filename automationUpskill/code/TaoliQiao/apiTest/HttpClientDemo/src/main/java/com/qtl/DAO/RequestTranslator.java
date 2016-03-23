package com.qtl.DAO;

import java.util.HashMap;

/**
 * Created by tlqiao on 2/18/16.
 */
public interface RequestTranslator {

	public String transMobileInfo(HashMap<String,String> parameterMap) ;
	public String transGetWether(HashMap<String,String> parameterMap,String tempPath);
}
