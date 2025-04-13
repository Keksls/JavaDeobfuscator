/*
 * Decompiled with CFR 0.152.
 */
public class cXQ
extends cVb {
    private static final cXQ b = new cXQ();
    private static final ans_1 c = string -> {
        if (string.equals("dimensionalBagRoomManagerDialog")) {
            azu_0.j().b(b);
        }
    };
    private boolean d;

    public static cXQ d() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18231: {
                ffj ffj2;
                long l;
                dgL dgL2 = (dgL)adt_12;
                bsx_2 bsx_22 = azu_0.j().k().di();
                byte by = dgL2.b();
                exk_2 exk_22 = dgL2.o();
                boolean bl = dgL2.i();
                byte by2 = (byte)dgL2.c();
                long l2 = l = bl ? 0L : dgL2.s();
                if (bl) {
                    boolean bl2;
                    if (by2 == by) {
                        return false;
                    }
                    boolean bl3 = bsx_22.b(by2, false) == null;
                    ffj2 = bsx_22.a(by2, bl3, by, bl2 = bsx_22.b(by, false) == null);
                    if (ffj2 == ffj.a) {
                        if (cXQ.a(bsx_22, by2) && bsx_22.b(by2, false) == null) {
                            fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("dimensionalBag.warn.resources", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                            fzm_02.a(new cxr_0(this, bsx_22, by2, bl3, by, bl2));
                        } else {
                            bsx_22.a(by2, bl3, by, bl2, false);
                        }
                    }
                } else {
                    ffj2 = bsx_22.b(by, true) != null ? bsx_22.a(by, exk_22, l, false) : bsx_22.b(by, exk_22, l, false);
                }
                if (ffj2 != ffj.a) {
                    fpm_0.b().a(bsx_2.a(ffj2), cfn_0.a(7), 2L, 102, 3);
                }
                bsx_22.a(by);
                return false;
            }
            case 16477: {
                dgL dgL3 = (dgL)adt_12;
                bsx_2 bsx_23 = azu_0.j().k().di();
                byte by = dgL3.b();
                long l = dgL3.t();
                byte by3 = (byte)dgL3.r();
                if (cXQ.a(bsx_23, by) && bsx_23.b(by, false) == null) {
                    fzm_0 fzm_03 = fpm_0.b().a(bae.h().a("dimensionalBag.warn.resources", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                    fzm_03.a(new cXS(this, bsx_23, by, l, by3));
                    break;
                }
                return cXQ.a(bsx_23, by, l, by3);
            }
        }
        return true;
    }

    static boolean a(bsx_2 bsx_22, byte by, long l, byte by2) {
        ffj ffj2 = bsx_22.a(by, l, by2, false, false);
        if (ffj2 == ffj.d) {
            ffj2 = bsx_22.a(by, l, by2, true, false);
        }
        if (ffj2 != ffj.a) {
            fpm_0.b().a(bsx_2.a(ffj2), cfn_0.a(7), 2L, 102, 3);
            return false;
        }
        bsx_22.a(by);
        return false;
    }

    private static boolean a(bsx_2 bsx_22, byte by) {
        ffi ffi2 = bsx_22.b(by);
        int n = ffi2.c();
        int n2 = ffi2.d();
        for (int k = n; k < n + 6; ++k) {
            for (int i2 = n2; i2 < n2 + 6; ++i2) {
                if (bNT.f().c(k, i2) == null) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        super.a(aav_22, bl);
        if (bl) {
            return;
        }
        fpm_0.b().a(c);
        fpm_0.b().a("dimensionalBagRoomManagerDialog", cfi_0.a("dimensionalBagRoomManagerDialog"), 32769L, (short)10000);
        if (azu_0.j().k().di() != null) {
            fis_1.a().a("editableDimensionalBag", azu_0.j().k().di());
        }
        fpm_0.b().a("wakfu.roomManager", cGC.class);
        azu_0.j().b(dei.a());
        cdw_0.n().z();
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        super.b(aav_22, bl);
        if (bl) {
            return;
        }
        fpm_0.b().b(c);
        fis_1.a().a("editableDimensionalBag");
        fpm_0.b().o("dimensionalBagRoomManagerDialog");
        fpm_0.b().e("wakfu.roomManager");
        azu_0.j().a(dei.a());
        cdw_0.n().A();
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public String toString() {
        return "UIDimensionalBagRoomManagerFrame{m_dialogUnloadListener=" + c + "}";
    }
}

