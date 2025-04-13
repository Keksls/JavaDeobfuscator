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
 * Renamed from aIf
 */
class aif_1 {
    @SerializedName(value="@index")
    private String a;
    @SerializedName(value="@timestamp")
    private String b;
    @SerializedName(value="platform")
    private String c;
    @SerializedName(value="service")
    private String d;
    @SerializedName(value="data")
    private Object e;

    aif_1() {
    }

    public void a(String string) {
        this.a = string;
    }

    void a(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        this.b = simpleDateFormat.format(date);
    }

    void b(String string) {
        this.c = string;
    }

    void c(String string) {
        this.d = string;
    }

    void a(Object object) {
        this.e = object;
    }
}

