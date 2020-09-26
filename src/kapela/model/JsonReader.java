package kapela.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonReader {

    private JSONArray jsonWeatherData;
    OpenWeatherMap openWeatherMap;

    public JsonReader(OpenWeatherMap openWeatherMap) {
        this.openWeatherMap = openWeatherMap;
    }

    private static String readAll(Reader rd) throws IOException {

        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {

        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }
    public JSONArray fetchJsonWeatherDataFromApi() throws IOException {

        JSONObject json = readJsonFromUrl(openWeatherMap.getFullApi());
        try {
            jsonWeatherData = json.getJSONArray("list");
        } catch (JSONException e) {
            System.out.println(e);
        }
        return jsonWeatherData;
    }

}