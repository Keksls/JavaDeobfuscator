/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Longs
 *  com.google.common.primitives.Shorts
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.primitives.Longs;
import com.google.common.primitives.Shorts;
import java.util.ArrayList;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bPb
implements abq_1,
ajh_1,
Comparable<bPb> {
    private static final Logger n = Logger.getLogger(bPb.class);
    private final ArrayList<sd_0> o = new ArrayList();
    private long p;
    private VW q;
    private final ArrayList<Sm> r = new ArrayList();
    private ObjectPool s;
    public static final String a = "name";
    public static final String b = "nameAndLevel";
    public static final String d = "description";
    public static final String e = "tableTurnDuration";
    public static final String f = "plainRemainingDuration";
    public static final String g = "remainingDuration";
    public static final String h = "remainingDurationText";
    public static final String i = "isInfiniteDuration";
    public static final String j = "iconUrl";
    public static final String k = "effects";
    public static final String l = "stackSize";
    public static final String[] m = new String[]{"name", "tableTurnDuration", "remainingDuration", "remainingDurationText", "iconUrl", "effects", "stackSize"};
    private static final ObjectPool t = new abm_1(new bPc());

    public static bPb a(Sm sm) {
        bPb bPb2;
        try {
            bPb2 = (bPb)t.borrowObject();
            bPb2.s = t;
        }
        catch (Exception exception) {
            bPb2 = new bPb();
            bPb2.s = null;
            n.error((Object)("Erreur lors d'un checkOut sur un RunningEffectFieldProvider : " + exception.getMessage()));
        }
        bPb2.r.add(sm);
        bPb2.p = -1L;
        return bPb2;
    }

    bPb() {
    }

    @Override
    public Object b(String string) {
        if (string.equalsIgnoreCase(b)) {
            String string2 = this.e();
            int n = this.k();
            if (n < 2) {
                return string2;
            }
            return string2 + " (" + bae.h().a("levelShort.custom", n) + ")";
        }
        if (string.equalsIgnoreCase(a)) {
            return this.e();
        }
        if (string.equalsIgnoreCase(d)) {
            return this.i();
        }
        if (string.equalsIgnoreCase(f)) {
            return this.a(false, true);
        }
        if (string.equalsIgnoreCase(g)) {
            return this.a(true, true);
        }
        if (string.equalsIgnoreCase(h)) {
            return this.a(true, false);
        }
        if (string.equals(i)) {
            bvx_2 bvx_22 = azu_0.j().k().cP();
            if (bvx_22 != null && this.q != null) {
                return this.q.b();
            }
            return this.p == -1L;
        }
        if (string.equalsIgnoreCase(j)) {
            return this.a();
        }
        if (string.equalsIgnoreCase(l)) {
            return this.k();
        }
        if (string.equalsIgnoreCase(k)) {
            String string3 = this.j();
            return !string3.isEmpty() ? string3 : null;
        }
        return null;
    }

    private String i() {
        Sm sm = this.c();
        switch (sm.G_()) {
            case 1: {
                bpe_0 bpe_02 = (bpe_0)sm;
                String string = bpe_02.f();
                if (string == null || string.isEmpty()) break;
                return string;
            }
            case 34: {
                if (this.o.isEmpty()) {
                    return null;
                }
                sd_0 sd_02 = this.o.get(0);
                eza_1 eza_12 = eza_1.b(sd_02.f().i());
                return bae.h().a("antiAddictionLevel.desc." + eza_12.b(), new Object[0]);
            }
        }
        return null;
    }

    private String a(boolean bl, boolean bl2) {
        Object object;
        Object object2;
        bmr_1 bmr_12 = azu_0.j().k();
        bvx_2 bvx_22 = bmr_12.cP();
        if (bvx_22 != null && this.q != null) {
            String string;
            if (this.q.b()) {
                return null;
            }
            short s2 = bvx_22.A().a(this.q);
            if (s2 == 0) {
                String string2 = bl2 ? bae.h().a("remaining.duration.turn.short", "&lt;1") : bae.h().a("duration.last.turn", new Object[0]);
                return bl ? new ani_2().i().a(azf_2.h.w()).a((CharSequence)string2).r() : string2;
            }
            String string3 = string = bl2 ? bae.h().a("remaining.duration.turn.short", s2) : bae.h().a("remaining.turns", s2);
            if (s2 <= 2 && bl) {
                return new ani_2().i().a(azf_2.h.w()).a((CharSequence)string).j().r();
            }
            return string;
        }
        long l = this.p;
        Sm sm = this.c();
        if (sm != null && sm.G_() == 34) {
            object2 = bmr_12.dg();
            object = ((eyx_2)object2).d().g(wc_0.p().a());
            ((ww_0)object).e(((eyx_2)object2).c());
            l = (int)((ww_0)object).g();
        }
        if (l != -1L) {
            object2 = ww_0.a(l);
            Object object3 = object = bl2 ? wa_0.a((wx_0)object2) : wa_0.c((wx_0)object2);
            if (bl && l <= 60L) {
                object = new ani_2().i().a(azf_2.h.w()).a((CharSequence)object).j().r();
            }
            return object;
        }
        return null;
    }

    private String j() {
        ArrayList<String> arrayList = bPg.a(this.o, this.c());
        ani_2 ani_22 = new ani_2();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            if (k != 0) {
                ani_22.m();
            }
            ani_22.a((CharSequence)arrayList.get(k));
        }
        return ani_22.r();
    }

    private int k() {
        int n;
        Sm sm = this.c();
        if (sm instanceof fie_0) {
            fie_0 fie_02 = (fie_0)sm;
            return fie_02.c();
        }
        if (sm instanceof ekk_0) {
            ekk_0 ekk_02 = (ekk_0)sm;
            return ekk_02.c();
        }
        if (sm != null && ((n = sm.G_()) == 28 || n == 32)) {
            return 0;
        }
        if (this.r.size() == 1) {
            n = -1;
            boolean bl = true;
            int n2 = this.o.size();
            for (int k = 0; k < n2; ++k) {
                sd_0 sd_02 = this.o.get(k);
                if (sd_02.P() && sd_02.f() != null) {
                    bl = false;
                    break;
                }
                if (n != -1 && n != sd_02.bt_()) {
                    bl = false;
                    break;
                }
                n = sd_02.bt_();
            }
            if (bl) {
                return this.o.size();
            }
        }
        return 0;
    }

    public String a() {
        Sm sm = this.c();
        try {
            if (sm != null) {
                switch (sm.G_()) {
                    case 12: {
                        bjw_1 bjw_12;
                        if (!(sm instanceof exk_2)) {
                            int n = (int)sm.aS_();
                            bjw_12 = (bjw_1)eyo_1.g().d(n);
                        } else {
                            bjw_12 = (bjw_1)((exk_2)sm).T();
                        }
                        return (String)bjw_12.b(j);
                    }
                    case 11: 
                    case 25: {
                        return (String)((bpl_0)sm).b("smallIconUrl");
                    }
                    case 1: {
                        bpe_0 bpe_02 = (bpe_0)sm;
                        return bpe_02.i();
                    }
                    case 3: {
                        sr_0 sr_02 = (sr_0)sm;
                        return String.format(azs_0.a().a("effectAreasIconsPath"), sr_02.A());
                    }
                    case 19: 
                    case 33: {
                        return azs_0.a().a("protectorBuffsIconsPath", "defaultIconPath", -1);
                    }
                    case 32: {
                        return azs_0.a().a("protectorBuffsIconsPath", "defaultIconPath", -2);
                    }
                    case 28: {
                        return azs_0.a().a("protectorBuffsIconsPath", "defaultIconPath", -2);
                    }
                    case 21: {
                        return azs_0.a().a("timePointBonusIconsPath", "defaultIconPath", eox_2.a.a((int)sm.aS_()));
                    }
                    case 34: {
                        if (this.o.isEmpty()) {
                            return null;
                        }
                        sd_0 sd_02 = this.o.get(0);
                        eza_1 eza_12 = eza_1.b(sd_02.f().i());
                        return azs_0.a().a("antiAddictionIconsPath", "defaultIconPath", eza_12.b());
                    }
                }
            }
        }
        catch (gm_0 gm_02) {
            n.error((Object)"PropertyException pendant l'acc\u00e8s \u00e0 l'url de l'icone du RunningEffect");
            return null;
        }
        return null;
    }

    @Override
    public String[] d() {
        return m;
    }

    public void b(Sm sm) {
        if (!this.r.contains(sm)) {
            this.r.add(sm);
        }
    }

    public void c(Sm sm) {
        this.r.remove(sm);
    }

    public boolean b() {
        return !this.r.isEmpty();
    }

    @Nullable
    public Sm c() {
        if (!this.r.isEmpty()) {
            return this.r.get(0);
        }
        return null;
    }

    private void a(sd_0 sd_02) {
        boolean bl;
        Sm sm = this.c();
        boolean bl2 = bl = sm != null && sm.G_() != 1;
        if (bl && sd_02.at()) {
            return;
        }
        VW vW = sd_02.ap();
        if (vW == null) {
            return;
        }
        if (this.q == null) {
            this.q = vW;
        }
        if (vW.a(this.q) > 0) {
            this.q = vW;
        }
    }

    public String e() {
        Sm sm = this.c();
        if (sm != null) {
            switch (sm.G_()) {
                case 12: {
                    return ((exk_2)sm).N();
                }
                case 11: 
                case 25: {
                    return (String)((bpl_0)sm).b(a);
                }
                case 1: {
                    bpe_0 bpe_02 = (bpe_0)sm;
                    Object object = bpe_02.e();
                    if (bpe_02.k() && !this.o.isEmpty()) {
                        sd_0 sd_02 = this.o.get(0);
                        String string = ((blx_1)sd_02.h()).dp();
                        object = (String)object + " - " + string;
                    }
                    return object;
                }
                case 3: {
                    sr_0 sr_02 = (sr_0)sm;
                    return bae.h().a(6, (long)((int)sr_02.A()), new Object[0]);
                }
                case 19: 
                case 33: {
                    return bae.h().a("protector.buff.generic.name", new Object[0]);
                }
                case 28: {
                    return bae.h().a("haven.world.buff", new Object[0]);
                }
                case 32: {
                    return bae.h().a("guild.buff", new Object[0]);
                }
                case 21: {
                    return bae.h().a("timePoint.bonus", new Object[0]);
                }
                case 34: {
                    if (this.o.isEmpty()) {
                        return null;
                    }
                    sd_0 sd_03 = this.o.get(0);
                    eza_1 eza_12 = eza_1.b(sd_03.f().i());
                    return bae.h().a("antiAddictionLevel.name." + eza_12.b(), new Object[0]);
                }
            }
        }
        return "";
    }

    @Override
    public void release() {
        if (this.s != null) {
            try {
                this.s.returnObject((Object)this);
            }
            catch (Exception exception) {
                n.error((Object)("Exception dans le release de " + this.getClass().toString() + " normalement impossible"));
            }
            this.s = null;
        } else {
            this.onCheckIn();
        }
    }

    @Override
    public void onCheckIn() {
        this.r.clear();
        this.o.clear();
        this.s = null;
        this.p = -1L;
        this.q = null;
    }

    @Override
    public void onCheckOut() {
    }

    public int a(@NotNull bPb bPb2) {
        bvx_2 bvx_22;
        bmr_1 bmr_12 = azu_0.j().k();
        VW vW = this.q;
        VW vW2 = bPb2.q;
        Sm sm = this.c();
        Sm sm2 = bPb2.c();
        long l = this.p;
        long l2 = bPb2.p;
        if (sm == null) {
            return 1;
        }
        if (sm2 == null) {
            return -1;
        }
        if (bmr_12 != null && (bvx_22 = bmr_12.cP()) != null && vW != null && vW2 != null) {
            if (vW.b() && vW2.b()) {
                return Longs.compare((long)sm.aS_(), (long)sm2.aS_());
            }
            if (vW.b()) {
                return 1;
            }
            if (vW2.b()) {
                return -1;
            }
            short s2 = bvx_22.A().a(vW);
            short s3 = bvx_22.A().a(vW2);
            return Shorts.compare((short)s2, (short)s3);
        }
        if (l == l2) {
            return Longs.compare((long)sm.aS_(), (long)sm2.aS_());
        }
        if (l == -1L) {
            return 1;
        }
        if (l2 == -1L) {
            return -1;
        }
        return Longs.compare((long)l, (long)l2);
    }

    public void a(long l) {
        this.p = l;
    }

    public void a(sd_0 sd_02, boolean bl) {
        if (bl && !this.o.contains(sd_02)) {
            int n;
            boolean bl2 = false;
            ArrayList<efh_0> arrayList = new ArrayList<efh_0>();
            for (Object object : this.r.get(0)) {
                arrayList.add((efh_0)object);
            }
            for (n = this.o.size() - 1; n >= 0; --n) {
                Object object;
                object = this.o.get(n);
                if (!((sd_0)object).P() || ((sd_0)object).f() == null || !sd_02.P() || sd_02.f() == null || ((sd_0)object).f().j() != sd_02.f().j()) continue;
                int n2 = this.o.indexOf(object);
                if (this.o.contains(sd_02)) continue;
                this.o.add(n2, sd_02);
                bl2 = true;
            }
            if (!bl2) {
                n = arrayList.indexOf(sd_02.f());
                if (n >= 0 && n < this.o.size()) {
                    if (!this.o.contains(sd_02)) {
                        this.o.add(n, sd_02);
                    }
                } else if (!this.o.contains(sd_02)) {
                    this.o.add(sd_02);
                }
            }
        }
        this.a(sd_02);
    }

    public int f() {
        return this.o.size();
    }

    public void g() {
        fis_1.a().a((ajf_1)this, e, g, f, h, i);
    }

    public bPb h() {
        int n;
        bPb bPb2 = new bPb();
        int n2 = this.o.size();
        for (n = 0; n < n2; ++n) {
            bPb2.o.add(this.o.get(n));
        }
        bPb2.p = this.p;
        bPb2.q = this.q;
        n2 = this.r.size();
        for (n = 0; n < n2; ++n) {
            bPb2.r.add(this.r.get(n));
        }
        return bPb2;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bPb)object);
    }
}

