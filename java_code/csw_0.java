/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSw
 */
public class csw_0
implements fzb_0 {
    static final byte a = 4;
    private String b;
    private String c;
    private String d;

    public csw_0(String string, String string2, String string3) {
        this.b = string;
        this.c = string2;
        this.d = string3;
    }

    public String a() {
        return this.b;
    }

    public void a(String string) {
        this.b = string;
    }

    public String b() {
        return this.c;
    }

    public void b(String string) {
        this.c = string;
    }

    public String c() {
        return this.d;
    }

    public void c(String string) {
        this.d = string;
    }

    @Override
    public byte d() {
        return 4;
    }
}

