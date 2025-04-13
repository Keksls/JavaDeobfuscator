/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXu
 */
public class axu_0
extends aXj {
    private final byte a;
    private final short b;
    private final boolean c;

    public axu_0(byte by, short s2, boolean bl) {
        this.a = by;
        this.b = s2;
        this.c = bl;
    }

    public axu_0(byte by, short s2) {
        this(by, s2, false);
    }

    public axu_0(byte by) {
        this(by, 0);
    }

    public axu_0() {
        this(1);
    }

    @Override
    public boolean a() {
        if (this.a == 2 && this.b < 0) {
            return false;
        }
        return this.a != 3 || this.b >= 0;
    }

    @Override
    public void b() {
        if (this.a == 1) {
            axu_0.a("Ogrest chaos management");
            axu_0.a("ogrest_chaos ( 'help' | 'h' ) : display command help");
            axu_0.a("ogrest_chaos ( 'force' | 'f' ) instanceId enabled : force Ogrest chaos for specified instanceId to be enabled/disabled");
            axu_0.a("ogrest_chaos ( 'unforce' | 'u' ) instanceId : unforce Ogrest chaos for specified instanceId");
            axu_0.a("ogrest_chaos ( 'list' | 'l' ) : list forced instances");
            return;
        }
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)488);
        pt.b(this.a);
        if (this.a != 4) {
            pt.b(this.b);
            pt.a(this.c);
        }
        aaw_22.c(pt);
    }
}

