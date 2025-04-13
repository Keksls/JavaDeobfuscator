/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYJ
 */
public class ayj_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private static final int d = -1;
    private final int e;
    private final String f;
    private final Object[] g;

    public ayj_0(int n, String string, Object ... objectArray) {
        this.e = n;
        this.f = string;
        this.g = objectArray;
    }

    @Override
    public boolean a() {
        if (this.f == null || this.f.isBlank()) {
            return false;
        }
        switch (this.e) {
            case 0: {
                return true;
            }
            case 1: {
                return this.g.length == 2;
            }
            case 2: {
                return this.g.length == 3;
            }
        }
        return false;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)3);
        switch (this.e) {
            case 0: {
                pt.a((byte)2);
                pt.a((short)23);
                pt.b((short)200);
                pt.a(this.f);
                break;
            }
            case 1: {
                pt.a((short)283);
                pt.a(this.f);
                pt.a((Integer)this.g[0]);
                pt.a((Integer)this.g[1]);
                break;
            }
            case 2: {
                pt.a((short)422);
                pt.a(this.f);
                pt.a((Integer)this.g[0]);
                pt.a((Integer)this.g[1]);
                pt.a((Long)this.g[2]);
            }
        }
        if (pt.c() == 0) {
            return;
        }
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

