/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

public final class cDk {
    @SerializedName(value="_msg_id")
    private String a;
    @SerializedName(value="updating")
    private boolean b;
    @SerializedName(value="upToDate")
    private boolean c;
    @SerializedName(value="updateFailed")
    private boolean d;

    public boolean a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }
}

