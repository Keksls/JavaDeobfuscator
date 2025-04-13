/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eIC
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Param standard", new eFu("id des zones d'heure", eFx.a), new eFu("id de la zone de l'heure courante", eFx.a)));
    private final List<sr_0> w = new ArrayList<sr_0>();
    private long x;
    private byte y;
    private int z;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eIC aD() {
        eIC eIC2 = new eIC();
        eIC2.x = this.x;
        eIC2.w.clear();
        return eIC2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        eko_0 eko_02 = elg_0.a().f(this.m);
        if (eko_02 == null) {
            this.ba();
            return;
        }
        eko_0 eko_03 = elg_0.a().f(this.z);
        if (eko_03 == null) {
            a.error((Object)("Unable to find area " + this.z + ". Using " + this.m + " as the area even for the 'current' hour"));
            eko_03 = eko_02;
        }
        this.c(sd_02, bl);
        int[][] nArray = this.aE();
        this.a(eko_02, eko_03, nArray);
    }

    private int[][] aE() {
        int[][] nArrayArray = new int[][]{{1, -2}, {2, -1}, {3, 0}, {2, 1}, {1, 2}, {0, 3}, {-1, 2}, {-2, 1}, {-3, 0}, {-2, -1}, {-1, -2}, {0, -3}};
        if (this.e == null) {
            a.error((Object)"pas de caster ");
            return nArrayArray;
        }
        aej_2 aej_22 = this.e.F();
        switch (aej_22) {
            case h: {
                break;
            }
            case f: {
                for (int[] nArray : nArrayArray) {
                    int n;
                    int n2 = nArray[0];
                    nArray[0] = n = nArray[1];
                    nArray[1] = -n2;
                }
                break;
            }
            case d: {
                for (int[] nArray : nArrayArray) {
                    nArray[0] = -nArray[0];
                    nArray[1] = -nArray[1];
                }
                break;
            }
            case b: {
                for (int[] nArray : nArrayArray) {
                    int n = nArray[0];
                    int n3 = nArray[1];
                    nArray[0] = -n3;
                    nArray[1] = n;
                }
                break;
            }
        }
        return nArrayArray;
    }

    private void a(eko_0 eko_02, eko_0 eko_03, int[][] nArray) {
        byte by = 0;
        if (this.h == null || this.h.e() == null) {
            if (this.h == null) {
                a.warn((Object)"Unable to spawn hours : context is null");
            } else {
                a.warn((Object)"Unable to spawn hours : context has no fightmap");
            }
            return;
        }
        for (int[] nArray2 : nArray) {
            by = (byte)(by + 1);
            int n = this.g.d() + nArray2[0];
            int n2 = this.g.e() + nArray2[1];
            if (!this.h.e().b(n, n2)) continue;
            boolean bl = by % 12 == this.y % 12;
            short s2 = this.h.e().i(n, n2);
            long l = this.x + (long)by;
            if (s2 != Short.MIN_VALUE) {
                eko_0 eko_04 = bl ? eko_03 : eko_02;
                eko_0 eko_05 = (eko_0)eko_04.b(new elb_0(l, n, n2, s2, this.h, this.e.a_(), this.e, this.aZ(), this.e.F()));
                eko_05.c(by);
                eko_05.f(bl);
                this.h.g().a(eko_05);
                this.w.add(eko_05);
                continue;
            }
            a.warn((Object)("La cellule [" + this.g.d() + nArray2[0] + ":" + this.g.e() + nArray2[1] + "] n'existe pas"));
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        if (this.c != null) {
            this.m = ((efh_0)this.c).a(0, s2, eFb.a);
            this.z = ((efh_0)this.c).a(1, s2, eFb.a);
        }
        long l = this.h.f().a((byte)3);
        this.x = l << 8;
        if (l > Integer.MAX_VALUE) {
            a.error((Object)"probl\u00e8me possible entre les Ids des effects Users");
        }
        this.y = (byte)wc_0.p().a().k();
    }

    @Override
    public void al() {
        if (this.w != null) {
            for (sr_0 sr_02 : this.w) {
                this.h.g().b(sr_02);
            }
        }
        super.al();
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    protected void a(iQ iQ2) {
        super.a(iQ2);
        iQ2.a(is_0.m().a(this.x).a(this.z).b(this.y).n());
    }

    @Override
    protected void b(iO iO2) {
        super.b(iO2);
        if (iO2.A()) {
            is_0 is_02 = iO2.B();
            this.x = is_02.c();
            this.z = is_02.e();
            this.y = Hw.b((long)is_02.g());
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

