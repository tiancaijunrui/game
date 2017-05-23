package com.zcj.utils;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.List;

/**
 * User: 杨涛
 * Date: 11-5-26
 * Time: 下午12:36
 */
public class JsonUtils {

	/**
	 * 将对象转换为json字符串
	 *
	 * @author 杨涛
	 * @param object
	 * @return String
	 */
	public static String objToJson(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			SerializationConfig config = mapper.getSerializationConfig();
			config.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
			config.set(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, true);
			config.set(SerializationConfig.Feature.INDENT_OUTPUT, true);
			return mapper.writeValueAsString(object);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 将List转换成逗号隔开的字符串
	 * @author SHIJIACHEN
	 * @param list
	 * @return
	 */
	public static String list2String(List<String> list){
		if(!CollectionUtils.isEmpty(list)){
			StringBuffer result = new StringBuffer();
			for(String str:list){
				result.append(str);
				result.append(",");
			}
			return result.substring(0, result.length()-1);
		}
		return null;
	}
}