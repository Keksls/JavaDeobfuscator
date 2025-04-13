/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bNh
 */
public class bnh_0
extends exs_2 {
    private static final Logger e = Logger.getLogger(bnh_0.class);
    private final boolean k;
    private final fgo_0 l;

    public bnh_0(long l, tv_0<exx_2, wf_2> tv_02, eyk_1 eyk_12, short s2, byte by, boolean bl, fgo_0 fgo_02) {
        super(l, tv_02, eyk_12, s2, by);
        this.k = bl;
        this.l = fgo_02;
    }

    @Override
    public boolean a(exx_2 exx_22) {
        bni_0 bni_02;
        if (exx_22 != null && (bni_02 = (bni_0)exx_22).s()) {
            return false;
        }
        return super.a(exx_22);
    }

    @Override
    public void a(eyg_2 eyg_22, exx_2 exx_22) {
        if (this.k) {
            for (exx_2 exx_23 : this) {
                ((bni_0)exx_23).c(0L);
            }
        }
        bni_0 bni_02 = (bni_0)exx_22;
        bni_02.c(wc_0.p().e());
        super.a(eyg_22, exx_22);
    }

    public fgo_0 p() {
        return this.l;
    }

    @Override
    public boolean a(wh_2 wh_22) {
        throw new UnsupportedOperationException("Le client ne doit pas s\u00e9rialiser des ProtectorMerchantInventory");
    }

    @Override
    public boolean a(xs_1 xs_12) {
        if (this.s != xs_12.a) {
            e.warn((Object)("Mauvais uid \u00e0 la d\u00e9s\u00e9rialisation: attendu=" + this.s + ", trouv\u00e9=" + xs_12.a));
        }
        this.aO_();
        boolean bl = true;
        for (xt_2 xt_22 : xs_12.b) {
            bni_0 bni_02 = (bni_0)this.c.a(xt_22.f);
            if (bni_02 != null) {
                try {
                    if (this.a(bni_02, xt_22.a)) {
                        bni_02.a(fgi_0.a(xt_22.b));
                        bni_02.a(xt_22.c);
                        bni_02.b(xt_22.d);
                        bni_02.c(xt_22.e);
                        continue;
                    }
                    bl = false;
                }
                catch (uz_0 uz_02) {
                    bl = false;
                    e.error((Object)uz_02);
                }
                catch (Uy uy) {
                    bl = false;
                    e.error((Object)uy);
                }
                catch (uc_0 uc_02) {
                    bl = false;
                    e.error((Object)uc_02);
                }
                continue;
            }
            e.error((Object)("D\u00e9s\u00e9rialisation d'un ProtectorMerchantItem null \u00e0 la position " + xt_22.a));
            bl = false;
        }
        return bl;
    }

    @Nullable
    public bni_0 e(int n) {
        for (exx_2 exx_22 : this) {
            bni_0 bni_02 = (bni_0)exx_22;
            if (bni_02.d() != n) continue;
            return bni_02;
        }
        return null;
    }
}

