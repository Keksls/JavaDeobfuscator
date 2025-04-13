/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from asX
 */
class asx_1 {
    private static final Logger a = Logger.getLogger(asx_1.class);
    private static final String b = "language";
    private static final String c = "pub_date";
    private static final String d = "items";
    private static final String e = "guid";
    private static final String f = "pub_date";
    private static final String g = "title";
    private static final String h = "description";
    private static final String i = "link";
    private static final String j = "context";
    private static final String k = "priority";
    private static final String l = "type";
    private static final String m = "annotations";
    private static final String n = "timing";
    private static final String o = "area";
    private static final String p = "text";
    private static final String q = "mouse_area";
    private static final String r = "background";
    private static final String s = "background_over";
    private static final String t = "link";
    private static final String u = "color";
    private static final String v = "image";
    private static final String w = "source";
    private static final String x = "guid";
    private static final String y = "last_modif";
    private static final String z = "image";
    private static final String A = "area";
    private static final String B = "source";
    private static final String C = "background";
    private static final String D = "image";
    private static final String E = "allow_fullscreen";
    private static final String F = "url";
    private static final String G = "quality";
    private static final SimpleDateFormat[] H = new SimpleDateFormat[]{new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz", Locale.US), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US), new SimpleDateFormat("yyyy-MM-dd", Locale.US)};

    private asx_1() {
    }

    public static asm_1 a(@NotNull String string, @NotNull asu_1 asu_12) {
        JSONObject jSONObject = new JSONObject(string);
        String string2 = jSONObject.getString(b);
        Ow ow = Ow.a(string2);
        String string3 = jSONObject.getString("pub_date");
        Date date = asx_1.c(string3);
        asm_1 asm_12 = new asm_1(ow, date);
        JSONArray jSONArray = jSONObject.getJSONArray(d);
        for (int k = 0; k < jSONArray.length(); ++k) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(k);
                asv_1 asv_12 = asx_1.b(jSONObject2, asu_12);
                if (asv_12 == null) continue;
                asm_12.a(asv_12);
                continue;
            }
            catch (JSONException jSONException) {
                a.error((Object)"Error while parsing item", (Throwable)jSONException);
            }
        }
        return asm_12;
    }

    @Nullable
    private static ast_1 a(@Nullable JSONObject jSONObject, @NotNull asu_1 asu_12) {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("guid");
        URL uRL = asx_1.b(jSONObject.getString("source"));
        long l = jSONObject.getLong(y);
        return asu_12.a(uRL, string, l);
    }

    @Nullable
    private static asv_1 b(@NotNull JSONObject jSONObject, @NotNull asu_1 asu_12) {
        Object object;
        String string = jSONObject.getString("guid");
        asw_1 asw_12 = asx_1.a(jSONObject.getString(l), asw_1.class);
        Date date = asx_1.c(jSONObject.optString("pub_date"));
        String string2 = jSONObject.optString(g);
        String string3 = jSONObject.optString(h, null);
        URL uRL = asx_1.b(jSONObject.optString("link", null));
        int n = jSONObject.optInt(k, 0);
        JSONArray jSONArray = jSONObject.getJSONArray(j);
        asv_1 asv_12 = new asv_1(string);
        asv_12.a(date);
        asv_12.a(string2);
        asv_12.b(string3);
        asv_12.a(uRL);
        asv_12.a(n);
        for (int k = 0; k < jSONArray.length(); ++k) {
            object = asx_1.a(jSONArray.optString(k), aso_1.class);
            if (object == null) continue;
            asv_12.a((aso_1)((Object)object));
        }
        JSONArray jSONArray2 = jSONObject.optJSONArray(m);
        asx_1.a(asv_12, jSONArray2, asu_12);
        if (asw_12 == asw_1.a) {
            object = asx_1.c(jSONObject.optJSONObject("background"), asu_12);
            asv_12.a((asq_1)object);
            afk_2 afk_22 = asx_1.b(jSONObject.getJSONArray("area"));
            if (afk_22 == null) {
                a.error((Object)("Unable to find a valid position for the video (key 'area' : " + jSONObject));
                return null;
            }
            asr_1 asr_12 = asx_1.a(jSONObject.optJSONArray(n));
            ast_1 ast_12 = asx_1.a(jSONObject.optJSONObject("image"), asu_12);
            boolean bl = jSONObject.optBoolean(E, true);
            atf_1 atf_12 = new atf_1(afk_22);
            atf_12.a(asr_12);
            atf_12.a(bl);
            atf_12.a(ast_12);
            JSONArray jSONArray3 = jSONObject.getJSONArray("source");
            asx_1.a(atf_12, jSONArray3);
            if (atf_12.h() == 0) {
                a.error((Object)("No valid stream found for video. Bypassing element " + jSONObject));
                return null;
            }
            asv_12.a(atf_12);
        } else if (asw_12 == asw_1.b) {
            object = asx_1.a(jSONObject.getJSONObject("image"), asu_12);
            asv_12.a(new asq_1(null, (ast_1)object));
        }
        return asv_12;
    }

    private static void a(@NotNull atf_1 atf_12, @Nullable JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int k = 0; k < jSONArray.length(); ++k) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(k);
                URL uRL = asx_1.b(jSONObject.getString(F));
                if (uRL == null) {
                    a.error((Object)("Unknown url for stream " + jSONObject));
                    continue;
                }
                int n = jSONObject.getInt(G);
                atf_12.a(uRL, n);
                continue;
            }
            catch (JSONException jSONException) {
                a.error((Object)("Malformed video streams : " + jSONArray), (Throwable)jSONException);
            }
        }
    }

    private static void a(@NotNull asv_1 asv_12, @Nullable JSONArray jSONArray, @NotNull asu_1 asu_12) {
        if (jSONArray == null) {
            return;
        }
        for (int k = 0; k < jSONArray.length(); ++k) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(k);
                afk_2 afk_22 = asx_1.b(jSONObject.getJSONArray("area"));
                if (afk_22 == null) {
                    a.error((Object)("Unknown area for textfield " + jSONObject));
                    continue;
                }
                String string = jSONObject.optString(p);
                afk_2 afk_23 = asx_1.b(jSONObject.optJSONArray(q));
                asq_1 asq_12 = asx_1.c(jSONObject.optJSONObject("background"), asu_12);
                asq_1 asq_13 = asx_1.c(jSONObject.optJSONObject(s), asu_12);
                URL uRL = asx_1.b(jSONObject.optString("link"));
                asr_1 asr_12 = asx_1.a(jSONObject.optJSONArray(n));
                ate_1 ate_12 = new ate_1(afk_22, string);
                ate_12.a(asq_12);
                ate_12.b(asq_13);
                ate_12.a(uRL);
                ate_12.a(asr_12);
                ate_12.a(afk_23);
                asv_12.a(ate_12);
                continue;
            }
            catch (JSONException jSONException) {
                a.error((Object)("Malformed annotations at index " + k + " in " + jSONArray), (Throwable)jSONException);
            }
        }
    }

    @NotNull
    private static asr_1 a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return asr_1.a;
        }
        int n = jSONArray.length();
        if (n < 2) {
            a.error((Object)("Malformed timing : " + jSONArray.toString()));
            return asr_1.a;
        }
        try {
            return asr_1.a(jSONArray.getInt(0), jSONArray.getInt(1));
        }
        catch (JSONException jSONException) {
            a.error((Object)("Malformed timing : " + jSONArray.toString()), (Throwable)jSONException);
            return asr_1.a;
        }
    }

    @Nullable
    private static azj_2 a(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        if (!string.startsWith("#")) {
            a.error((Object)("Malformated color '" + string + "'"));
            return null;
        }
        int n = string.length();
        if (n != 7 && n != 9) {
            a.error((Object)("Malformated color '" + string + "'"));
            return null;
        }
        return azf_2.a(string);
    }

    @Nullable
    private static asq_1 c(JSONObject jSONObject, @NotNull asu_1 asu_12) {
        if (jSONObject == null) {
            return null;
        }
        azj_2 azj_22 = asx_1.a(jSONObject.optString(u));
        ast_1 ast_12 = asx_1.a(jSONObject.optJSONObject("image"), asu_12);
        return azj_22 == null && ast_12 == null ? null : new asq_1(azj_22, ast_12);
    }

    @Nullable
    private static <E extends Enum<E>> E a(String string, Class<E> clazz) {
        if (string == null) {
            return null;
        }
        E e2 = null;
        try {
            e2 = Enum.valueOf(clazz, string);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (e2 == null) {
            try {
                e2 = Enum.valueOf(clazz, string.toUpperCase(Locale.US));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return e2;
    }

    @Nullable
    private static afk_2 b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() < 4) {
            a.error((Object)("Malformed JSON Rect : 4 values expected, " + jSONArray.length() + " found : " + jSONArray));
            return null;
        }
        int n = jSONArray.getInt(0);
        int n2 = jSONArray.getInt(1);
        int n3 = jSONArray.getInt(2);
        int n4 = jSONArray.getInt(3);
        return new afk_2(n, n + n3, n2, n2 + n4);
    }

    @Nullable
    private static URL b(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        try {
            return new URL(string);
        }
        catch (MalformedURLException malformedURLException) {
            a.error((Object)("Error while parsing news items : " + malformedURLException.getMessage() + " '" + string + "'"));
            return null;
        }
    }

    @Nullable
    private static Date c(String string) {
        if (string == null) {
            return null;
        }
        for (int k = 0; k < H.length; ++k) {
            try {
                Date date = H[k].parse(string);
                if (date == null) continue;
                return date;
            }
            catch (ParseException parseException) {
                // empty catch block
            }
        }
        return null;
    }
}

