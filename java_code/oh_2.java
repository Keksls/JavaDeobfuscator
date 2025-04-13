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
 * Renamed from Oh
 */
public class oh_2 {
    @SerializedName(value="source")
    private final String a;
    @SerializedName(value="game_id")
    private final int b;
    @SerializedName(value="server_id")
    private final int c;
    @SerializedName(value="type")
    private final String d;
    @SerializedName(value="account_id")
    private final long e;
    @SerializedName(value="character_id")
    private final long f;
    @SerializedName(value="ip")
    private final String g;
    @SerializedName(value="added_date")
    private final String h;
    @SerializedName(value="session_id")
    private final long i;

    public oh_2(int n, String string, long l, long l2, String string2, long l3) {
        this.a = "GAME";
        this.b = 3;
        this.c = n;
        this.d = string;
        this.e = l;
        this.f = l2;
        this.g = string2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.h = simpleDateFormat.format(new Date(System.currentTimeMillis()));
        this.i = l3;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public long e() {
        return this.e;
    }

    public long f() {
        return this.f;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.h;
    }

    public long i() {
        return this.i;
    }

    public String toString() {
        return new Gson().toJson((Object)this);
    }
}

