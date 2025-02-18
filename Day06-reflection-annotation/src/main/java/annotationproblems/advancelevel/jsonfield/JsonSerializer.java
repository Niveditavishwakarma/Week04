package annotationproblems.advancelevel.jsonfield;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
public class JsonSerializer {

        public static String toJson(Object obj) {
            Map<String, String> jsonMap = new HashMap<>();

            try {
                Field[] fields = obj.getClass().getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true);

                    if (field.isAnnotationPresent(JsonField.class)) {
                        JsonField jsonField = field.getAnnotation(JsonField.class);
                        String jsonKey = jsonField.name();
                        Object value = field.get(obj);

                        jsonMap.put(jsonKey, value.toString());
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            StringBuilder jsonString = new StringBuilder("{");
            for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
                jsonString.append("\"").append(entry.getKey()).append("\": \"")
                        .append(entry.getValue()).append("\", ");
            }

            if (jsonString.length() > 1) {
                jsonString.delete(jsonString.length() - 2, jsonString.length());
            }
            jsonString.append("}");

            return jsonString.toString();
        }
    }


