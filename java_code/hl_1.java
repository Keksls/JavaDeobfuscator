/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Renamed from HL
 */
public class hl_1 {
    private static final String a = "wakfu.metric.";
    @SerializedName(value="@timestamp")
    private final String b;
    @SerializedName(value="@index")
    private final String c;
    @SerializedName(value="platform")
    private final String d;
    @SerializedName(value="service")
    private final String e;

    protected hl_1(String string) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        this.b = simpleDateFormat.format(new Date(System.currentTimeMillis()));
        this.d = os_2.a.a();
        this.e = ot_2.a.a();
        this.c = a + string;
    }
}

