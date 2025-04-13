/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.wakfu.client.chat.console.command.AwayCommand;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.apache.log4j.Logger;

public class dei
implements ahr_1 {
    private static final boolean b = false;
    private static final int c = 100;
    private long d;
    private static final Logger e = Logger.getLogger(dei.class);
    private static final dei f = new dei();
    private final den g = den.a;
    private int h;
    private int i;
    private final List<fdc_2> j = new ArrayList<fdc_2>();
    private FreeParticleSystem k;

    private dei() {
    }

    public static dei a() {
        return f;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        aNF aNF2 = (aNF)ans_0.D().c();
        bmr_1 bmr_12 = azu_0.j().k();
        switch (adt_12.a()) {
            case 19751: {
                return this.a((dhL)adt_12, aNF2);
            }
            case 18907: {
                dhL dhL2 = (dhL)adt_12;
                return this.a(dhL2, bmr_12);
            }
            case 17976: {
                if (azu_0.j().c(dej_0.a())) {
                    return false;
                }
                if (azu_0.j().c(cxm_0.a())) {
                    return false;
                }
                if (azu_0.j().c(czb_0.a())) {
                    return false;
                }
                dhL dhL3 = (dhL)adt_12;
                this.d = 0L;
                this.a(dhL3, azu_0.j().k());
                dei.a(bmr_12, dhL3);
                return false;
            }
            case 16119: {
                dhL dhL4 = (dhL)adt_12;
                return this.a(dhL4, aNF2, bmr_12);
            }
        }
        return true;
    }

    private boolean a(dhL dhL2, aNF aNF2, bmr_1 bmr_12) {
        if (bmr_12.cW()) {
            return false;
        }
        if (azu_0.j().c(bqv_2.a)) {
            return true;
        }
        dcj_0.a().c();
        dhL dhL3 = dhL2;
        int n = dhL3.r();
        int n2 = dhL3.s();
        for (int k = this.j.size() - 1; k >= 0; --k) {
            this.j.get(k).run(null);
        }
        if (!bmr_12.cY()) {
            return false;
        }
        if (dhL3.o() && cUK.a.a()) {
            cUK.a.b(aNF2, n, n2);
            return false;
        }
        cUK.a.b();
        if (dhL3.o()) {
            ArrayList<abz_0> arrayList = aNF2.e(n, n2);
            abz_0 abz_02 = null;
            if (!arrayList.isEmpty()) {
                abz_02 = arrayList.get(0);
            }
            if (abz_02 == null) {
                this.a(bmr_12, n, n2, true);
                return false;
            }
            if (abz_02 instanceof bNK) {
                this.a(bmr_12, dhL3.r(), dhL3.s(), true);
                return false;
            }
            if (abz_02 instanceof cUM || abz_02 instanceof biI) {
                btn_0.a().a(btr_0.u, null);
            } else {
                bmr_12.b(abz_02.ap(), false, true);
                return false;
            }
        }
        if (bmr_12.dh()) {
            return false;
        }
        if (dhL3.q() || ((bvx_0)ans_0.D().h()).a(bWe.M) && dhL3.o()) {
            dan.a().a(aNF2, n, n2);
        }
        return false;
    }

    private boolean a(dhL dhL2, bmr_1 bmr_12) {
        if (dhL.t()) {
            if (bmr_12.cW() || bmr_12.dh() || !bmr_12.cY()) {
                return true;
            }
            long l = System.currentTimeMillis();
            if (l - this.d > 100L) {
                this.a(bmr_12, dhL2.r(), dhL2.s(), false);
                this.d = l;
            }
        }
        return false;
    }

    private boolean a(dhL dhL2, aNF aNF2) {
        ArrayList<abz_0> arrayList;
        fvE fvE2 = fta_0.getInstance().getMouseOver();
        if (fvE2 != null && fvE2 != fta_0.getInstance()) {
            return true;
        }
        int n = dhL2.r();
        int n2 = dhL2.s();
        if (cUK.a.a()) {
            cUK.a.a(aNF2, n, n2);
        }
        if ((arrayList = aNF2.e(n, n2)).isEmpty()) {
            fyt_0.a().a(frb_0.a, false);
            return true;
        }
        boolean bl = false;
        block0: for (int k = 0; k < arrayList.size() && !bl; ++k) {
            cSS[] cSSArray;
            Tw tw;
            Object object;
            abz_0 abz_02 = arrayList.get(k);
            frb_0 frb_02 = frb_0.e;
            if (abz_02 instanceof biI) {
                object = (cSS[])abz_02;
                tw = ((biI)object).bI();
                if (tw == null || (cSSArray = ((blx_1)tw).aI()) == null || cSSArray.length <= 0) continue;
                for (int i2 = 0; i2 < cSSArray.length; ++i2) {
                    cSS cSS3 = cSSArray[i2];
                    if (cSS3 == null) continue;
                    cSS3.a(tw);
                    if (cSS3 == null || !cSS3.p() || !cSS3.c()) continue;
                    if (fyt_0.a().b() != frb_02) {
                        fyt_0.a().a(frb_02, false);
                    }
                    bl = true;
                    continue block0;
                }
                continue;
            }
            if (abz_02 instanceof cUM) {
                fyt_0.a().a(frb_02, false);
                bl = true;
                continue;
            }
            if (abz_02 instanceof bNK) {
                object = ((bNK)abz_02).aL();
                boolean bl2 = Stream.of(object).anyMatch(cSS2 -> cSS2 != null && cSS2.c());
                if (bl2) {
                    fyt_0.a().a(frb_02, false);
                } else {
                    fyt_0.a().a(frb_0.a);
                }
                bl = true;
                continue;
            }
            if (!(abz_02 instanceof bfr_0)) continue;
            object = (ph_0)((Object)abz_02);
            tw = object.d();
            if (tw instanceof cUM) {
                cSSArray = ((cUM)((Object)tw)).aI();
                if (((TG)((Object)tw)).N() && cSSArray != null && cSSArray.length != 0) {
                    fyt_0.a().a(frb_02, false);
                } else {
                    fyt_0.a().a(frb_0.a, false);
                }
            }
            bl = true;
        }
        if (!bl) {
            fyt_0.a().a(frb_0.a, false);
        }
        return false;
    }

    private void a(bmr_1 bmr_12, int n, int n2, boolean bl) {
        bpc_2 bpc_22 = bmr_12.eE();
        if (!bmr_12.cY() || bpc_22 != null && !bpc_22.e()) {
            return;
        }
        if (bmr_12.bv().bt() && bmr_12.bv().bb() != null) {
            return;
        }
        if (bmr_12.dh()) {
            dds_0.a().e();
            return;
        }
        this.h = n;
        this.i = n2;
        this.a(bmr_12, bl);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        aNF aNF2 = (aNF)ans_0.D().c();
        if (!bl) {
            aNF2.l(true);
            aNF2.o(true);
            cgu_2.a().a(this);
        }
        abu abu2 = dei.c();
        this.g.a();
        this.g.a(new ahx_0(abu2, aNF2.b()));
        cZJ.a.b(true);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fyt_0.a().c();
            cgu_2.a().b(this);
        }
        this.g.c();
        cZJ.a.b(false);
    }

    private void a(bmr_1 bmr_12, boolean bl) {
        AwayCommand.b();
        ArrayList<DisplayedScreenElement> arrayList = ans_0.D().c().a(this.h, this.i, bmr_12.L(), acj.b, 0.0f, 0.0f);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        boolean bl2 = !bmr_12.f(erl_2.f);
        for (int k = 0; k < arrayList.size(); ++k) {
            DisplayedScreenElement displayedScreenElement = arrayList.get(k);
            int n = displayedScreenElement.G();
            int n2 = displayedScreenElement.H();
            short s2 = displayedScreenElement.I();
            if (bmr_12.gg().b(n, n2, (int)s2)) {
                if (bl) {
                    this.a(n, n2, s2);
                }
                return;
            }
            if (!bmr_12.a(n, n2, s2, false, bl2)) continue;
            if (bl) {
                this.a(n, n2, s2);
            }
            return;
        }
    }

    private void a(int n, int n2, short s2) {
        if (this.k != null && this.k.an() && this.k.G() == n && this.k.H() == n2 && this.k.I() == s2) {
            return;
        }
        FreeParticleSystem freeParticleSystem = aij_0.a().a(800185);
        freeParticleSystem.a(n, (float)n2, (float)s2);
        aik_0.a().b(freeParticleSystem);
        this.k = freeParticleSystem;
    }

    private static abu c() {
        bmr_1 bmr_12 = azu_0.j().k();
        assert (bmr_12 != null) : "Local player null !!! WTF ?";
        return bmr_12.bv();
    }

    public static apl_1 a(biE biE2, pj_0 pj_02) {
        int n;
        List<aff_1> list = pj_02.aK_();
        if (list.isEmpty()) {
            return biE2.a(pj_02.G(), pj_02.H(), pj_02.I(), false, true);
        }
        ArrayList<aff_1> arrayList = new ArrayList<aff_1>();
        ArrayList<Byte> arrayList2 = new ArrayList<Byte>();
        ArrayList<apl_1> arrayList3 = new ArrayList<apl_1>();
        for (aff_1 aff_12 : list) {
            aff_1 aff_13 = biE2.ap();
            byte by = (byte)Math.max(Math.abs(aff_13.d() - aff_12.d()), Math.abs(aff_13.e() - aff_12.e()));
            for (n = 0; n < arrayList2.size() && (Byte)arrayList2.get(n) < by; ++n) {
            }
            arrayList.add(n, aff_12);
            arrayList2.add(n, by);
        }
        Object object = null;
        for (int k = 0; k < arrayList.size(); ++k) {
            arrayList3.add(k, biE2.a((aff_1)arrayList.get(k), false, true));
            if (!((apl_1)arrayList3.get(k)).b()) continue;
            if ((double)((apl_1)arrayList3.get(k)).a() > 1.6 * (double)((Byte)arrayList2.get(k)).byteValue()) {
                if (object != null && ((apl_1)object).a() < ((apl_1)arrayList3.get(k)).a()) continue;
                object = (apl_1)arrayList3.get(k);
                continue;
            }
            object = (apl_1)arrayList3.get(k);
            break;
        }
        if (object != null && pj_02.aB_() && !pj_02.M()) {
            apl_1 apl_12 = new apl_1(((apl_1)object).a() + 1);
            for (n = 0; n < ((apl_1)object).a(); ++n) {
                apl_12.a(n, ((apl_1)object).a(n));
            }
            apl_12.a(((apl_1)object).a(), pj_02.G(), pj_02.H(), pj_02.I());
            object = apl_12;
        }
        return object;
    }

    public void a(fdc_2 fdc_22) {
        this.j.add(fdc_22);
    }

    public void b(fdc_2 fdc_22) {
        this.j.remove(fdc_22);
    }

    private static void a(bmr_1 bmr_12, dhL dhL2) {
        if (!dhL.v()) {
            return;
        }
        if (bmr_12 == null || !emp_0.b(bmr_12.N_().a(), emq_0.e)) {
            return;
        }
        aNI aNI2 = ((aNF)ans_0.D().c()).f(dhL2.r(), dhL2.s());
        if (!aNI2.a()) {
            return;
        }
        new ayi_0(0, aNI2.f(), aNI2.g()).b();
    }
}

