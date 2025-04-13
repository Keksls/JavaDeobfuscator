/*
 * Decompiled with CFR 0.152.
 */
public class bUQ
extends bUM {
    public static final String t = "title";
    public static final String u = "nbMandates";
    static final String[] v;
    static final String[] w;
    private int x;
    private bUP y;

    public bUQ(fcq_0 fcq_02) {
        super(fcq_02);
        fcb_0 fcb_02 = (fcb_0)fcq_02.d();
        this.x = fcb_02.c();
        this.y = bUW.a().a(fcb_02.b());
    }

    @Override
    public Object b(String string) {
        if (string.equals(t)) {
            return this.y == null ? null : this.y;
        }
        if (string.equals("isGovernor")) {
            return true;
        }
        if (string.equals(u)) {
            return this.x;
        }
        return super.b(string);
    }

    public void a(bUP bUP2) {
        this.y = bUP2;
    }

    public bUP c() {
        return this.y;
    }

    @Override
    public String[] d() {
        return v;
    }

    static {
        w = new String[]{t, u};
        v = new String[w.length + bUM.r.length];
        System.arraycopy(w, 0, v, 0, w.length);
        System.arraycopy(bUM.r, 0, v, w.length, bUM.r.length);
    }
}

