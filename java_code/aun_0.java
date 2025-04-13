/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aUN
 */
public class aun_0
extends aum_0 {
    private static final Logger b = Logger.getLogger(aun_0.class);
    private static final TLongObjectHashMap<fvy> c = new TLongObjectHashMap();
    private static final anp_1 d = new auo_0();

    public static void a() {
        TLongObjectIterator tLongObjectIterator = c.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fvy fvy2 = (fvy)tLongObjectIterator.value();
            fvy2.i();
        }
        c.clear();
    }

    public static void a(long l) {
        fvy fvy2 = (fvy)c.remove(l);
        if (fvy2 != null) {
            fvy2.i();
        }
    }

    @Override
    @Nullable
    public aUm a(aUm aUm2, azj_2 azj_22) {
        super.a(aUm2, azj_22);
        if (aUm2 == null) {
            return null;
        }
        Optional<blx_1> optional = aun_0.a(aUm2);
        if (optional.isEmpty()) {
            return aUm2;
        }
        blx_1 blx_12 = optional.get();
        String string = fxN.d(aUm2.e());
        long l = blx_12.a_();
        boolean bl = cww_0.c().a(string, l);
        if (bl) {
            return aUm2;
        }
        if (string.isEmpty()) {
            return null;
        }
        fvy fvy2 = aun_0.a(l, aUm2);
        if (fvy2 == null) {
            b.error((Object)("La bulle stock\u00e9e pour le mobdile de " + aUm2.d() + " n'appartient plus \u00e0 personne !"));
            return aUm2;
        }
        aUm2.b(StringUtils.replace((String)aUm2.e(), (String)string, (String)fvy2.setText(string)));
        afv afv2 = afz_0.d().b(l);
        if (afv2 != null) {
            boolean bl2;
            fvy2.setTarget(afv2);
            fvy2.setYOffset((int)((float)afv2.ag() * 10.0f));
            fvy2.setBubbleIsVisible(true);
            fvy2.e();
            azf_2 azf_22 = new azf_2(azj_22);
            azf_22.b(aUm2.a() == aup_0.b ? 0.0f : 0.75f);
            fvy2.setColor(azf_22);
            boolean bl3 = bl2 = l != azu_0.j().k().a_();
            if (bl2) {
                fvy2.setBubbleObserver(azu_0.j().k().bv());
            }
        }
        return aUm2;
    }

    private static fvy a(long l, aUm aUm2) {
        fvy fvy2 = (fvy)c.get(l);
        if (fvy2 == null || fvy2.isUnloading()) {
            return aun_0.b(l, aUm2);
        }
        if (!aun_0.a(fvy2, l, aUm2)) {
            return null;
        }
        return fvy2;
    }

    private static fvy b(long l, aUm aUm2) {
        String string = aNJ.a();
        fvy fvy2 = aNJ.a(string);
        fvy2.a(false, aUm2.h());
        c.put(l, (Object)fvy2);
        return fvy2;
    }

    private static boolean a(fvy fvy2, long l, aUm aUm2) {
        YQ yQ = fvy2.getTarget();
        if (yQ == null) {
            return false;
        }
        assert (l == ((afv)yQ).a()) : "Le mobile de " + aUm2.d() + " ne correspond pas \u00e0 l'ancien";
        fvy2.g();
        return true;
    }

    private static Optional<blx_1> a(aUm aUm2) {
        String string = aUm2.d();
        long l = aUm2.c();
        if (l == -1L) {
            return string == null ? Optional.empty() : Optional.ofNullable(bmf_2.a().b(string));
        }
        if (aUm2.a() == aup_0.m) {
            return Optional.ofNullable(bmf_2.a().d(l));
        }
        if (aUm2.a() == aup_0.c) {
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12 != null && l == bmr_12.a_()) {
                return Optional.of(bmr_12);
            }
            return Optional.ofNullable(bmf_2.a().b(string));
        }
        if (aUm2.k()) {
            return Optional.ofNullable(bmf_2.a().c(l));
        }
        return Optional.ofNullable(bmf_2.a().d(l));
    }

    public static fvy b() {
        return (fvy)c.get(azu_0.j().k().a_());
    }

    static {
        ans_0.D().b().a(d);
    }
}

