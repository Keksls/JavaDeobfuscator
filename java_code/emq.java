/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

public class emq {
    @SerializedName(value="id")
    private long a;
    @SerializedName(value="nicknameWithTag")
    private String b;

    public long a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String toString() {
        return "ZaapUserInfo(m_id=" + this.a() + ", m_nicknameWithTag=" + this.b() + ")";
    }
}

