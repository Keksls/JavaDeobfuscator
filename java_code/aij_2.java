/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Renamed from aIj
 */
public class aij_2 {
    @SerializedName(value="game_id")
    private final int a;
    @SerializedName(value="event_id")
    private final int b;
    @SerializedName(value="session_id")
    private long c;
    @SerializedName(value="date")
    private final String d;
    @SerializedName(value="data")
    private Object e;

    public aij_2(int n) {
        this.a = 3;
        this.b = n;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.d = simpleDateFormat.format(new Date(System.currentTimeMillis()));
    }

    public void a(long l) {
        this.c = l;
    }

    public void a(Object object) {
        this.e = object;
    }

    public String toString() {
        return new Gson().toJson((Object)this);
    }
}

