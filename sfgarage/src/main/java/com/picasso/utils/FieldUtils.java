package com.picasso.utils;

public class FieldUtils {

	public static boolean fieldsNull(String... fields) {
		for (String field : fields) {
			if (field == null) {
				return true;
			}
		}
		return false;
	}

	public static boolean fieldsEmpty(String... fields) {
		for (String field : fields) {
			if (field.isBlank()) {
				return true;
			}
		}
		return false;
	}
}
