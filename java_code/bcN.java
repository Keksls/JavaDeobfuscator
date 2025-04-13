/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

public class bcN {
    @SerializedName(value="token")
    private String a;
    @SerializedName(value="clientType")
    private int b;
    @SerializedName(value="osType")
    private int c;
    @SerializedName(value="deviceType")
    private int d;
    @SerializedName(value="deviceId")
    private String e;
    @SerializedName(value="customApplicationData")
    private String f;

    public String a() {
        return this.a;
    }

    public void a(String string) {
        this.a = string;
    }

    public int b() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public int c() {
        return this.c;
    }

    public void b(int n) {
        this.c = n;
    }

    public int d() {
        return this.d;
    }

    public void c(int n) {
        this.d = n;
    }

    public String e() {
        return this.e;
    }

    public void b(String string) {
        this.e = string;
    }

    public String f() {
        return this.f;
    }

    public void c(String string) {
        this.f = string;
    }
}

