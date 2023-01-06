package com.appetizer.subway.common;

import java.util.HashMap;

import org.springframework.jdbc.support.JdbcUtils;

public class MapToCamelMap extends HashMap<String, Object> {
	 
	@Override
	 public Object put(String key, Object value) {
		 return super.put(JdbcUtils.convertUnderscoreNameToPropertyName(key), value);
	 }
}