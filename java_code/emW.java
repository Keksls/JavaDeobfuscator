/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

public class emW {
    @SerializedName(value="server")
    private final int a;
    @SerializedName(value="right")
    private final emS b;

    public emW(int n, emS emS2) {
        this.a = n;
        this.b = emS2;
    }

    public int a() {
        return this.a;
    }

    public emS b() {
        return this.b;
    }

    public String toString() {
        return "Rights{m_serverId=" + this.a + ", m_right=" + this.b + "}";
    }
}

