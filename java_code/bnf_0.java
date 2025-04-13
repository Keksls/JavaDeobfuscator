/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bNf
 */
public class bnf_0
extends bnl_0 {
    private final int a;

    public bnf_0(bni_0 bni_02, int n) {
        super(bni_02);
        this.a = n;
    }

    @Override
    public String a() {
        blt_2 blt_22 = blc_2.a().c(this.a);
        return blt_22.c();
    }

    @Override
    public fgo_0 b() {
        return fgo_0.a;
    }

    @Override
    public Object b(String string) {
        blt_2 blt_22 = blc_2.a().c(this.a);
        if (blt_22 != null) {
            if (string.equals("description")) {
                return blt_22.d();
            }
            if (string.equals("title")) {
                return this.a();
            }
            if (string.equals("nameWithRemainingTime")) {
                Object object = this.g();
                if (object == null) {
                    return this.a();
                }
                return new StringBuilder(this.a()).append(" (").append(object).append(")");
            }
            if (string.equals("nameWithDuration")) {
                return new StringBuilder(this.a()).append(" (").append(this.h()).append(")");
            }
            if (string.equals("name")) {
                return this.a();
            }
            if (string.equals("iconUrl")) {
                return blt_22.v();
            }
            return super.b(string);
        }
        d.error((Object)("Impossible de cr\u00e9er la vue pour le challenge id=" + this.a));
        return null;
    }

    public int c() {
        return this.a;
    }
}

