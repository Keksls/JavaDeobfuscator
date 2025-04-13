/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from cDl
 */
public enum cdl_0 {
    a(0, new alp_1("music", 1), new amc_1("music", 0), new alu_1("ambiance_music", 0), new long[]{200L, 210L, 220L, 230L, 290L, 702L}, false),
    b(1, new alp_1("sound_amb_2d", 1), new amc_1("sound_amb_2d", 1, 1), new alu_1("sound_amb_2d", 1), new long[]{700L, 701L, 703L, 704L, 705L, 706L, 707L, 710L, 720L}, true),
    c(2, null, null, new alu_1("sound_amb_3d", 3, 2), new long[]{800L}, true),
    d(3, new alp_1("sound_fight", 2, 3), null, new alu_1("soundFight3D", 2, 3), new long[]{100L, 300L}, true),
    e(4, new alp_1("gui", 0, 4), null, null, new long[]{600L}, false),
    f(5, new alp_1("voices", 4, 5), null, new alu_1("voices3D", 4, 5), new long[]{900L, 910L, 920L, 930L}, true),
    g(6, new alp_1("sfx", 2, 6), null, new alu_1("sfx3d", 2, 6), new long[]{501L, 502L, 530L}, true),
    h(7, new alp_1("particles2D", 1, 7), null, new alu_1("particles", 1, 7), new long[]{400L, 410L, 420L}, true),
    i(8, new alp_1("foleys2D", 2, 8), null, new alu_1("foleys", 2, 8), new long[]{110L, 111L, 120L, 130L, 310L, 320L, 330L}, true);

    private final byte j;
    private final long[] k;
    private final amc_1 l;
    private final alp_1 m;
    private final alu_1 n;
    private final boolean o;

    private cdl_0(byte by, alp_1 alp_12, amc_1 amc_12, alu_1 alu_12, long[] lArray, boolean bl) {
        this.j = by;
        this.k = lArray;
        this.l = amc_12;
        this.m = alp_12;
        this.n = alu_12;
        this.o = bl;
    }

    public byte a() {
        return this.j;
    }

    public amc_1 b() {
        return this.l;
    }

    public alp_1 c() {
        return this.m;
    }

    public alu_1 d() {
        return this.n;
    }

    public boolean a(long l) {
        for (long l2 : this.k) {
            if (l != l2) continue;
            return true;
        }
        return false;
    }

    public static cdl_0 a(byte by) {
        for (cdl_0 cdl_02 : cdl_0.values()) {
            if (cdl_02.j != by) continue;
            return cdl_02;
        }
        return null;
    }

    public static cdl_0 a(all_1 all_12) {
        for (cdl_0 cdl_02 : cdl_0.values()) {
            if (cdl_02.m != all_12 && cdl_02.n != all_12 && cdl_02.l != all_12) continue;
            return cdl_02;
        }
        return null;
    }

    public static cdl_0 b(long l) {
        for (cdl_0 cdl_02 : cdl_0.values()) {
            if (!ArrayUtils.contains((long[])cdl_02.k, (long)l)) continue;
            return cdl_02;
        }
        return null;
    }

    public boolean e() {
        return this.o;
    }

    public void f() {
        this.a(true);
    }

    public void g() {
        this.a(false);
    }

    private void a(boolean bl) {
        if (this.o) {
            if (this.m != null) {
                this.m.a(bl);
            }
            if (this.l != null) {
                this.l.a(bl);
            }
            if (this.n != null) {
                this.n.a(bl);
            }
        }
    }
}

