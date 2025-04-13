/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVx
 */
public class avx_0
extends aXj {
    private final byte a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    public avx_0(byte by, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a = by;
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = n5;
        this.g = n6;
        this.h = n7;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((short)300);
        pt.a((byte)3);
        pt.b(this.a);
        wt_0 wt_02 = new wt_0(this.c, this.d, this.e, this.f, this.g, this.h);
        switch (this.a) {
            case 6: {
                pt.a(this.b);
                pt.a(wt_02.h());
                break;
            }
            default: {
                throw new UnsupportedOperationException("La commande " + this.a + " n'est pas support\u00e9e");
            }
        }
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

