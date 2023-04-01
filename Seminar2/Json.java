package Seminar2;
import org.json.JSONArray;
import org.json.JSONObject;
public class Json {
    public static void main(String[] args) {
            String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
            JSONArray jsonArray = new JSONArray(jsonString);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String surname = jsonObject.getString("фамилия");
                String mark = jsonObject.getString("оценка");
                String subject = jsonObject.getString("предмет");
                result.append("Студент ").append(surname).append(" получил ").append(mark)
                        .append(" по предмету ").append(subject).append(".\n");
            }
            System.out.println(result.toString());
        }
    }

}