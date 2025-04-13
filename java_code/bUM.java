/*
 * Decompiled with CFR 0.152.
 */
public class bUM
extends bUC {
    public static final String q = "speech";
    static final String[] r;
    static final String[] s;
    private String t;

    public bUM(fcq_0 fcq_02) {
        super(fcq_02);
        fcd_0 fcd_02 = (fcd_0)((Object)fcq_02.d());
        this.t = fcd_02.a();
    }

    @Override
    public Object b(String string) {
        if (string.equals(q)) {
            String string2 = bUW.a().y();
            String string3 = this.t.isEmpty() ? null : this.t;
            return string2 != null ? string2 : string3;
        }
        return super.b(string);
    }

    @Override
    public String[] d() {
        return r;
    }

    public void a(String string) {
        this.t = string;
    }

    static {
        s = new String[]{q};
        r = new String[s.length + bUC.n.length];
        System.arraycopy(s, 0, r, 0, s.length);
        System.arraycopy(bUC.n, 0, r, s.length, bUC.n.length);
    }
}

