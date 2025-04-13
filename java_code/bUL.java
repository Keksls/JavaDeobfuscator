/*
 * Decompiled with CFR 0.152.
 */
public class bUL
extends bUC {
    public static final String q = "rank";
    static final String[] r;
    static final String[] s;
    private bVo t;

    public bUL(fcq_0 fcq_02, bVo bVo2) {
        super(fcq_02);
        this.t = bVo2;
    }

    @Override
    public String[] d() {
        return r;
    }

    @Override
    public Object b(String string) {
        if (string.equals(q)) {
            return this.t;
        }
        return super.b(string);
    }

    static {
        s = new String[]{q};
        r = new String[s.length + bUC.n.length];
        System.arraycopy(s, 0, r, 0, s.length);
        System.arraycopy(bUC.n, 0, r, s.length, bUC.n.length);
    }
}

