/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aeM {
    private static final Logger a = Logger.getLogger(aeM.class);
    private int b;
    private int c;
    private int d;
    private String e;
    private String f;
    private int g;
    private static final aeM h = new aeM();

    public static aeM a() {
        return h;
    }

    private aeM() {
        this.h();
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public int f() {
        return this.g;
    }

    public void a(int n) {
        this.b = n;
    }

    public void b(int n) {
        this.c = n;
    }

    public void c(int n) {
        this.d = n;
    }

    public void a(String string) {
        this.e = string;
    }

    public void d(int n) {
        this.g = n;
    }

    public String g() {
        return this.f;
    }

    public void b(String string) {
        this.f = string;
    }

    public void h() {
        this.b = 1000;
        this.c = 1000;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.g = 0;
    }
}

