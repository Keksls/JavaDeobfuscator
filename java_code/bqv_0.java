/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bQV
 */
public class bqv_0
extends bqw_0 {
    @Override
    public void a(TG tG, epq_2 epq_22) {
    }

    @Override
    public void b(TG tG, epq_2 epq_22) {
        cwn_0.a().a((bFN)tG);
    }

    @Override
    public fjp_0 a(epq_2 epq_22, TG tG, long l) {
        List<fjx> list = fjs.a.a(tG.a_(), l);
        Set set = list.stream().map(fjx2 -> bqv_0.a(fjx2, epq_22, tG)).collect(Collectors.toSet());
        return set.contains((Object)fjp_0.a) ? fjp_0.a : fjp_0.i;
    }

    @Override
    protected void b(epq_2 epq_22, TG tG, long l) {
        cqT cqT2 = new cqT(tG.a_(), l);
        azu_0.j().K().c(cqT2);
    }

    @NotNull
    private static fjp_0 a(fjx fjx2, epq_2 epq_22, TG tG) {
        if (!fjx2.a(epq_22, tG)) {
            return fjp_0.d;
        }
        if (!fjx2.b(epq_22, tG)) {
            return fjp_0.d;
        }
        return fjp_0.a;
    }

    @Override
    public boolean a(bmr_1 bmr_12, bFN bFN2) {
        return true;
    }

    @Override
    public fjv a() {
        return fjv.d;
    }

    @Override
    public String a(bFN bFN2) {
        bql_0 bql_02 = new bql_0();
        bql_02.a(bFN2.a_(), bFN2);
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)bae.h().a(83, (long)((int)bFN2.a_()), new Object[0])).m().m();
        ani_22.a((CharSequence)bae.h().a("destinations", new Object[0])).m();
        ani_22.a((CharSequence)bql_02.b());
        return ani_22.r();
    }

    @Override
    @Nullable
    public String b(bFN bFN2) {
        return null;
    }
}

