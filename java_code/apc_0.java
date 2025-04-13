/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collections;
import org.apache.log4j.Logger;

/*
 * Renamed from aPC
 */
public class apc_0
extends apq_0
implements ape_0 {
    private static final Logger g = Logger.getLogger(apc_0.class);
    private static final String h = "BeaconZoneEffect";
    private static final String i = "BeaconZoneAdditionalEffect";
    private static final String j = "BeaconRangeEffect";
    private static final String k = "beaconRange.tga";
    private static final String l = "beaconEffect.tga";
    private bgo_2 m;
    private long[] n;
    private static final apc_0 o = new apc_0();

    public static apc_0 a() {
        return o;
    }

    private apc_0() {
        super(j, anr_0.N, h, anr_0.K, i, anr_0.L, null, null, null, null, null, null);
    }

    public void a(bgo_2 bgo_22, blx_1 blx_12) {
        bvx_2 bvx_22 = blx_12.bz();
        if (bvx_22 == null) {
            return;
        }
        tg_0 tg_02 = bvx_22.g();
        if (tg_02 == null) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bgo_22.v() != bmr_12) {
            return;
        }
        this.m = bgo_22;
        this.n = this.m.c((apq_2)blx_12);
        this.a(blx_12, tg_02);
        this.n = null;
        this.m = null;
    }

    private void a(blx_1 blx_12, tg_0 tg_02) {
        long[] lArray = this.n;
        if (lArray == null) {
            return;
        }
        if (this.m.a(eld_0.l)) {
            this.b(blx_12, tg_02);
        } else {
            this.a(blx_12, tg_02, lArray);
        }
    }

    private void b(blx_1 blx_12, tg_0 tg_02) {
        bpl_0 bpl_02 = cYZ.o().p();
        if (bpl_02 == null) {
            return;
        }
        efa_0 efa_02 = bpl_02.v();
        eJL eJL2 = (eJL)this.m.x_();
        for (sd_0 sd_02 : eJL2) {
            if (!sd_02.f(this.a(efa_02))) continue;
            efi_0 efi_02 = (efi_0)sd_02.k();
            this.d.a(Collections.singletonList(efi_02), blx_12, this.m.P_(), blx_12.bz(), tg_02, (efh_0)sd_02.f(), efi_02.c());
        }
    }

    private void a(blx_1 blx_12, tg_0 tg_02, long[] lArray) {
        for (int k = 0; k < lArray.length; ++k) {
            long l = lArray[k];
            int n = apb_2.b(l);
            int n2 = apb_2.c(l);
            short s2 = apb_2.d(l);
            this.a(Collections.singletonList(this.m), blx_12, new aff_1(n, n2, tg_02.i(n, n2)));
        }
    }

    private short a(efa_0 efa_02) {
        if (efa_02 == efa_0.b) {
            return 2101;
        }
        if (efa_02 == efa_0.c) {
            return 2102;
        }
        if (efa_02 == efa_0.d) {
            return 2103;
        }
        if (efa_02 == efa_0.e) {
            return 2104;
        }
        return -1;
    }

    @Override
    protected aps_0 a(aff_1 aff_12, blx_1 blx_12) {
        return aps_0.e;
    }

    @Override
    public void b() {
        try {
            String string = azs_0.a().a("highLightGfxPath") + l;
            this.a.a(string, aim.b);
            string = azs_0.a().a("highLightGfxPath") + k;
            this.a(string, aim.b);
        }
        catch (Exception exception) {
            g.error((Object)exception);
        }
    }
}

