/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Ordering
 *  org.apache.log4j.Logger
 */
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

public class dcD
implements ahr_1 {
    private static final Logger b = Logger.getLogger(dcD.class);
    public static final dcD a = new dcD();
    private static bwj_0 c;
    private final Runnable d = new dce_0(this);
    private boolean e;
    fsQ f;
    private dew g;
    private final Collection<bwj_0> h = new ArrayList<bwj_0>();
    private dci_0 i = dci_0.b;

    public static void a(bwj_0 bwj_02, long l, String string) {
        c = bwj_02;
        cuo_0.e().a(true).a(bae.h().a(string, new Object[0]), 0);
        dcD.b(l);
    }

    private static void b(long l) {
        cko_1 cko_12 = new cko_1();
        cko_12.b(c.b().a());
        cko_12.a(l);
        azu_0.j().K().c(cko_12);
    }

    public static void a() {
        ceX.a().a(false);
        azu_0.j().b(a);
        eru_2 eru_22 = c.b();
        azr_0.a().b(eru_22.b());
        fis_1.a().a("worldName", (Object)eru_22.b());
        azu_0.j().a("Dispatch");
        azu_0.j().a(c.c().b());
        azu_0.j().a(azp_0.c);
        azu_0.j().a(eru_22);
        azu_0.j().r();
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19218: {
                dhx dhx2 = (dhx)adt_12;
                bwj_0 bwj_02 = dhx2.k();
                long l = dhx2.o();
                dcD.a(bwj_02, l, "loadingWaitingWorldNotFull.progress");
                return false;
            }
        }
        return true;
    }

    public void a(dex dex2) {
        this.g.a(dex2);
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
        if (!bl) {
            ado_1.a().a(this.d, 10000L);
            afz_0.d().f();
            int n = ((bvx_0)ans_0.D().h()).d(bWe.ap);
            this.i = n > 0 ? dci_0.a((byte)n) : dci_0.a;
            fis_1.a().a("serverChoice.worldFilter", this.i.d);
            this.a(Optional.empty());
            fpm_0.b().a("serverChoiceDialog", cfi_0.a("serverChoiceDialog"), 8192L, (short)10000);
            fyy_0 fyy_02 = fpm_0.b().h().d("serverChoiceDialog");
            this.f = (fsQ)fyy_02.a("list");
            this.f.addListContentListener(new dcf_0(this));
            this.g = new dew(this.f);
            this.g.a();
            fpm_0.b().a("wakfu.serverChoice", cJx.class);
            this.c();
            cdw_0.n().r();
            if (azu_0.j().c(ddp.a())) {
                ddp.a().c();
            } else {
                azu_0.j().a(ddp.a());
            }
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            c = null;
            this.d();
            this.e = false;
            fis_1.a().a("serverChoice.serverReferencesList");
            fis_1.a().a("serverChoice.selectedServerReference");
            ado_1.a().b(this.d);
            if (azu_0.j().o() == azp_0.b) {
                azu_0.j().a("Dispatch");
            }
            fpm_0.b().o("serverChoiceDialog");
            this.g.b();
            this.f = null;
            fpm_0.b().e("wakfu.serverChoice");
        }
    }

    private void c() {
        fsk_0 fsk_02 = (fsk_0)fpm_0.b().h().d("serverChoiceDialog").a("steamLinkImage");
        if (fsk_02 == null || !fsk_02.isVisible()) {
            return;
        }
        azf_2 azf_22 = new azf_2(azf_2.f.i());
        azf_2 azf_23 = new azf_2(1.0f, 0.78f, 0.15f, 1.0f);
        fqp fqp2 = fsk_02.getAppearance();
        fjp_2 fjp_22 = new fjp_2(azf_22, azf_23, fqp2, 0, 3000, -1, fjw_2.b);
        fqp2.addTween(fjp_22);
        fjm_2 fjm_22 = new fjm_2(Float.valueOf(0.9f), Float.valueOf(1.0f), fsk_02, 0, 1500, fjw_2.c, fsk_02.getImageMesh(), -1);
        fsk_02.addTween(fjm_22);
    }

    private void d() {
        fyy_0 fyy_02 = fpm_0.b().h().d("serverChoiceDialog");
        if (fyy_02 == null) {
            return;
        }
        fsk_0 fsk_02 = (fsk_0)fyy_02.a("steamLinkImage");
        if (fsk_02 == null || !fsk_02.isVisible()) {
            return;
        }
        fqp fqp2 = fsk_02.getAppearance();
        fqp2.removeTweensOfType(fjp_2.class);
        fsk_02.removeTweensOfType(fjm_2.class);
    }

    public void a(Optional<ArrayList<bwj_0>> optional) {
        if (optional.isPresent()) {
            this.h.clear();
            this.h.addAll((Collection<bwj_0>)optional.get());
        }
        Ordering ordering = Ordering.natural().onResultOf((Function)new dch_0());
        List list = this.h.stream().filter(bwj_02 -> {
            ery_2 ery_22 = bwj_02.c();
            if (!erz_2.a(ery_22, eoW.a())) {
                return false;
            }
            return this.a((bwj_0)bwj_02);
        }).sorted((Comparator<bwj_0>)ordering).collect(Collectors.toList());
        int n = ((bvx_0)ans_0.D().h()).d(bWe.ao);
        for (bwj_0 bwj_03 : list) {
            ery_2 ery_22 = bwj_03.c();
            int n2 = ery_22.b();
            if (this.e || n2 != n) continue;
            fis_1.a().a("serverChoice.selectedServerReference", bwj_03);
        }
        fis_1.a().a("serverChoice.serverReferencesList", list);
    }

    private boolean a(bwj_0 bwj_02) {
        switch (this.i) {
            case a: {
                return true;
            }
            case b: {
                return bwj_02.a();
            }
            case c: {
                return !bwj_02.a();
            }
        }
        return true;
    }

    public void a(byte by) {
        this.i = dci_0.a(by);
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.ap, by);
        this.a(Optional.empty());
    }
}

