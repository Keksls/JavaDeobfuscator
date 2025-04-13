/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ang
 */
public class ang_0
implements anc_0 {
    private static final Logger a = Logger.getLogger(ang_0.class);
    private int b;
    private byte c = (byte)100;
    private int d = -1;

    public ang_0() {
    }

    public ang_0(arf_1 arf_12) {
        this.a(arf_12);
    }

    public ang_0(int n, byte by, int n2) {
        this.b = n;
        this.c = by;
        this.d = n2;
    }

    @Override
    public void a(arf_1 arf_12) {
        this.b = arf_12.c();
        this.c = arf_12.a();
        this.d = arf_12.c();
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.a(this.b);
        gk_02.a(this.c);
        gk_02.a(this.d);
    }

    @Override
    public void a(aty_1 aty_12) {
        if (!ann_2.a(aty_12)) {
            return;
        }
        if (this.b == 0) {
            a.debug((Object)"Id du son nul");
            return;
        }
        try {
            akr_0 akr_02 = aki_0.h().a(this.b, (alo_1)((Object)aty_12), this.d);
            if (akr_02 == null) {
                a.debug((Object)"Impossible de trouver de BarkData ad\u00e9quat");
                return;
            }
            long l = akr_02.a();
            if (!aty_12.A().a(l)) {
                return;
            }
            if (!ann_2.a(l)) {
                return;
            }
            float f2 = akr_02.b() * (float)this.c / 100.0f;
            aki_0.h().a(l, f2, akr_02.i(), 1, -1L, -1L, aty_12.az(), (alo_1)((Object)aty_12), akr_02.e());
        }
        catch (Exception exception) {
            a.debug((Object)("soundExtension or soundPath not initialized " + exception));
        }
    }

    @Override
    public int a() {
        return 1;
    }

    public void a(int n) {
        this.b = n;
    }

    public void a(byte by) {
        this.c = by;
    }

    public void b(int n) {
        this.d = n;
    }
}

