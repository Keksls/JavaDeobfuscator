/*
 * Decompiled with CFR 0.152.
 */
import java.util.Date;

/*
 * Renamed from fag
 */
public class fag_0
implements gq_1<wa_1> {
    private String a;
    private int b;
    private int c;
    private Date d;
    private String e;
    private boolean f;

    public fag_0() {
    }

    public fag_0(String string, int n, int n2, Date date, String string2, boolean bl) {
        this.a = string;
        this.b = n;
        this.c = n2;
        this.d = date;
        this.e = string2;
        this.f = bl;
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

    public Date d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    @Override
    public boolean a(wa_1 wa_12) {
        wa_12.a = this.a;
        wa_12.b = this.b;
        wa_12.c = this.c;
        wa_12.d = this.d.getTime();
        wa_12.e = this.e;
        wa_12.f = this.f;
        return true;
    }

    @Override
    public boolean b(wa_1 wa_12) {
        this.a = wa_12.a;
        this.b = wa_12.b;
        this.c = wa_12.c;
        this.d = new Date(wa_12.d);
        this.e = wa_12.e;
        this.f = wa_12.f;
        return true;
    }
}

