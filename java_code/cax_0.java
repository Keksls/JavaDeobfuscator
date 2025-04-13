/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cAx
 */
public class cax_0
extends ps_0 {
    private eLm a;
    private byte[] b;

    @Override
    public boolean a(byte[] byArray) {
        this.b = byArray;
        return true;
    }

    public eLm b() {
        if (this.a == null) {
            eLD eLD2 = new eLD(new bvs_2());
            eLD2.a_(this.b);
            this.a = eLD2.c();
        }
        return this.a;
    }

    @Override
    public int a() {
        return 1081;
    }
}

