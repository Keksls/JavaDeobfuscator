/*
 * Decompiled with CFR 0.152.
 */
public class bKK
extends bKH {
    private final String a;
    private final String b;
    private final int d;

    public bKK(String string, bkk_0 bkk_02) {
        this(string, -1, bkk_02);
    }

    public bKK(String string, int n, bkk_0 bkk_02) {
        super(bkk_02::b);
        this.a = string;
        this.b = Cz.e(string).strip();
        this.d = n;
    }

    @Override
    public bKG aV_() {
        return bKG.a;
    }

    @Override
    public void a(faC faC2) {
        if (this.b.isBlank()) {
            faC2.a((String)null).b(false).a((Ow)null);
        } else {
            faC2.a(this.b).a(daw.u());
            if (bLc.a(bWe.ba)) {
                faC2.b(this.d != -1).b(-1);
            } else {
                faC2.b(false).b(this.d);
            }
        }
    }

    @Override
    public void b(faC faC2) {
        faC2.b(-1).a((String)null).a((Ow)null);
    }

    @Override
    public boolean a() {
        return !this.b.isBlank();
    }

    @Override
    public String b() {
        if (this.d != -1) {
            return "\"" + bjw_1.a(this.d) + "\"";
        }
        return "\"" + this.b + "\"";
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bKK)) {
            return false;
        }
        bKK bKK2 = (bKK)object;
        if (!bKK2.a(this)) {
            return false;
        }
        if (this.d != bKK2.d) {
            return false;
        }
        String string = this.g();
        String string2 = bKK2.g();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.b;
        String string4 = bKK2.b;
        return !(string3 == null ? string4 != null : !string3.equals(string4));
    }

    protected boolean a(Object object) {
        return object instanceof bKK;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.d;
        String string = this.g();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        String string2 = this.b;
        n2 = n2 * 59 + (string2 == null ? 43 : string2.hashCode());
        return n2;
    }

    public String g() {
        return this.a;
    }
}

