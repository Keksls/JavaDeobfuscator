/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Renamed from Hf
 */
public class hf_2 {
    @SerializedName(value="creation_date")
    private final String a = DateTimeFormatter.ISO_DATE_TIME.format(OffsetDateTime.now());
    @SerializedName(value="event_type")
    private final String b;
    @SerializedName(value="source_id")
    private final String c;

    public hf_2(String string, String string2) {
        this.b = string;
        this.c = string2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }
}

