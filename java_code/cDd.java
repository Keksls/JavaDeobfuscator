/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

public final class cDd {
    @SerializedName(value="_msg_id")
    private String a;
    @SerializedName(value="id")
    private String b;

    public static cDd a() {
        return new cDd("HELLO", "GAME");
    }

    cDd() {
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    private cDd(String string, String string2) {
        this.a = string;
        this.b = string2;
    }
}

