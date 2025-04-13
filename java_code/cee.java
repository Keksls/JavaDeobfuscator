/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class cee {
    @SerializedName(value="game_id")
    private final long a;
    @SerializedName(value="event_id")
    private final long b;
    @SerializedName(value="session_id")
    private long c;
    @SerializedName(value="data")
    private Object d;

    public cee(int n) {
        this.a = 3L;
        this.b = n;
    }

    public void a(long l) {
        this.c = l;
    }

    public void a(Object object) {
        this.d = object;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public String d() {
        return new Gson().toJson(this.d);
    }
}

