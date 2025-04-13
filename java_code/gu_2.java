/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Renamed from GU
 */
public class gu_2 {
    @SerializedName(value="@index")
    private String a;
    @SerializedName(value="@timestamp")
    private String b;
    @SerializedName(value="host")
    private String c;
    @SerializedName(value="platform")
    private String d;
    @SerializedName(value="service")
    private String e;
    @SerializedName(value="thread")
    private String f;
    @SerializedName(value="level")
    private String g;
    @SerializedName(value="file")
    private String h;
    @SerializedName(value="class")
    private String i;
    @SerializedName(value="method")
    private String j;
    @SerializedName(value="line")
    private String k;
    @SerializedName(value="message")
    private String l;
    @SerializedName(value="throwable")
    private String m;

    public String a() {
        return this.a;
    }

    public void a(String string) {
        this.a = string;
    }

    public String b() {
        return this.b;
    }

    public void a(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        this.b = simpleDateFormat.format(date);
    }

    public void b(String string) {
        this.b = string;
    }

    public String c() {
        return this.c;
    }

    public void c(String string) {
        this.c = string;
    }

    public String d() {
        return this.d;
    }

    public void d(String string) {
        this.d = string;
    }

    public String e() {
        return this.e;
    }

    public void e(String string) {
        this.e = string;
    }

    public String f() {
        return this.f;
    }

    public void f(String string) {
        this.f = string;
    }

    public String g() {
        return this.g;
    }

    public void g(String string) {
        this.g = string;
    }

    public String h() {
        return this.h;
    }

    public void h(String string) {
        this.h = string;
    }

    public String i() {
        return this.i;
    }

    public void i(String string) {
        this.i = string;
    }

    public String j() {
        return this.j;
    }

    public void j(String string) {
        this.j = string;
    }

    public String k() {
        return this.k;
    }

    public void k(String string) {
        this.k = string;
    }

    public String l() {
        return this.l;
    }

    public void l(String string) {
        this.l = string;
    }

    public String m() {
        return this.m;
    }

    public void m(String string) {
        this.m = string;
    }
}

