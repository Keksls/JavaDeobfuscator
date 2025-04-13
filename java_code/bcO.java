/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

public class bcO {
    @SerializedName(value="success")
    private boolean a;
    @SerializedName(value="errCode")
    private int b;

    public boolean a() {
        return this.a;
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    public int b() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public String toString() {
        return "InterChatAuthenticationResult{m_success=" + this.a + ", m_errCode=" + this.b + "}";
    }
}

