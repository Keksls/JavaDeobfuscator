/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.Lists;
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bWy
 */
public class bwy_2
extends bwn_2
implements eyv_1,
fgj_0 {
    private static final bwy_2 X = new bwy_2();
    private bMn Y;
    public static bhg_1 W;
    private abu Z;
    private bVn aa = null;
    private bMn ab;
    private final ArrayList<bnl_0> ac = new ArrayList();

    public static bwy_2 h() {
        return X;
    }

    protected bwy_2() {
    }

    @Override
    public void a(bmr_0 bmr_02) {
        bmt_0 bmt_02 = bmt_0.a(bmr_02.d());
        if (bmt_02 == bmt_0.d) {
            bwa_2.X.a(-1);
            bMn bMn2 = (bMn)bmr_02.e();
            if (this.Y != bMn2) {
                this.a(bMn2);
            }
        }
    }

    @Override
    public Object b(String string) {
        if (string.equals("animation")) {
            if (this.Y == null) {
                return null;
            }
            return this.a(this.b(), bnm_0.a);
        }
        if (string.equals("animName")) {
            return bnm_0.a.b();
        }
        if (string.equals("currentProtector")) {
            return this.Y;
        }
        if (string.equals("challengeInventory")) {
            return this.Y.k();
        }
        if (string.equals("climateInventory")) {
            return this.a(this.Y.o(), false);
        }
        if (string.equals("challengeObjInventory")) {
            return this.Y.h();
        }
        if (string.equals("climateObjInventory")) {
            return this.Y.o();
        }
        if (string.equals("baseChallenges")) {
            TIntArrayList tIntArrayList = this.Y.r();
            if (tIntArrayList.size() == 0) {
                return null;
            }
            ArrayList<bll_2> arrayList = new ArrayList<bll_2>();
            int n = tIntArrayList.size();
            for (int k = 0; k < n; ++k) {
                bll_2 bll_22 = blj_2.a.a(tIntArrayList.get(k));
                if (bll_22 == null) continue;
                arrayList.add(bll_22);
            }
            return arrayList;
        }
        if (string.equals("hasMoneyBaseChallenges")) {
            TIntArrayList tIntArrayList = this.Y.r();
            int n = tIntArrayList.size();
            for (int k = 0; k < n; ++k) {
                int n2 = tIntArrayList.get(k);
                if (!ArrayUtils.contains((int[])eoc_0.q, (int)n2)) continue;
                return true;
            }
            return false;
        }
        if (string.equals("availableChallenges")) {
            bll_2 bll_23;
            int n;
            TIntArrayList tIntArrayList = this.Y.r();
            fat<blx_2> fat2 = this.Y.z();
            TIntArrayList tIntArrayList2 = this.Y.q();
            if (tIntArrayList.size() + tIntArrayList2.size() == 0) {
                return null;
            }
            ArrayList<bll_2> arrayList = new ArrayList<bll_2>();
            int n3 = tIntArrayList.size();
            for (n = 0; n < n3; ++n) {
                bll_23 = blj_2.a.a(tIntArrayList.get(n));
                blx_2 blx_22 = fat2.a(tIntArrayList.get(n));
                if (bll_23 == null || blx_22 == null || blx_22.d() != null && !blx_22.d().b(this.Y, null, null, null)) continue;
                arrayList.add(bll_23);
            }
            n3 = tIntArrayList2.size();
            for (n = 0; n < n3; ++n) {
                bll_23 = blj_2.a.a(tIntArrayList2.get(n));
                if (bll_23 == null) continue;
                arrayList.add(bll_23);
            }
            return arrayList;
        }
        if (string.equals("numAvailableChallenges")) {
            return this.Y.r().size() + this.Y.q().size();
        }
        if (string.equals("numBoughtChallenges")) {
            return this.Y.q().size();
        }
        if (string.equals("boughtChallenges")) {
            this.ac.clear();
            TIntArrayList tIntArrayList = this.Y.q();
            if (tIntArrayList.size() == 0) {
                return null;
            }
            bnh_0 bnh_02 = this.Y.h();
            if (bnh_02 == null) {
                return null;
            }
            int n = tIntArrayList.size();
            for (int k = 0; k < n; ++k) {
                int n4 = tIntArrayList.getQuick(k);
                bni_0 bni_02 = bnh_02.e(n4);
                if (bni_02 == null) continue;
                this.ac.add(bni_02.k());
            }
            return this.ac;
        }
        if (string.equals("boughtClimates")) {
            return this.a(this.Y.o(), true);
        }
        if (string.equals("walletHandler")) {
            if (this.Y == null || this.Y.l() == null) {
                return null;
            }
            bmd_0 bmd_02 = (bmd_0)this.Y.l();
            return bmd_02.a(this.j());
        }
        if (string.equals("tax")) {
            return this.a(fjb_0.a);
        }
        if (string.equals("nation")) {
            return this.aa;
        }
        if (string.equals("job")) {
            return bae.h().a(90, (long)this.b(), new Object[0]);
        }
        if (string.equals("sex")) {
            return bae.h().a(91, (long)this.b(), new Object[0]);
        }
        if (string.equals("height")) {
            return bae.h().a(92, (long)this.b(), new Object[0]);
        }
        if (string.equals("weight")) {
            return bae.h().a(93, (long)this.b(), new Object[0]);
        }
        if (string.equals("customDescription")) {
            if (!bae.h().a(94, (long)this.b())) {
                return null;
            }
            String string2 = bae.h().a(94, (long)this.b(), new Object[0]);
            return string2.split("\n");
        }
        if (string.equals("numSecrets")) {
            if (this.Y == null) {
                return "";
            }
            int n = 0;
            Iterator<bmx_0> iterator = this.Y.x();
            while (iterator.hasNext()) {
                iterator.next();
                ++n;
            }
            return n;
        }
        if (string.equals("secrets")) {
            if (this.Y == null) {
                return null;
            }
            ArrayList<bwx_2> arrayList = new ArrayList<bwx_2>();
            Iterator<bmx_0> iterator = this.Y.x();
            while (iterator.hasNext()) {
                bmx_0 bmx_02 = iterator.next();
                arrayList.add(new bwx_2(bmx_02));
            }
            return arrayList;
        }
        if (string.equals("unlockedSecrets")) {
            if (this.Y == null) {
                return "";
            }
            int n = 0;
            int n5 = 0;
            bhr_1 bhr_12 = azu_0.j().k().eK();
            Iterator<bmx_0> iterator = this.Y.x();
            while (iterator.hasNext()) {
                bmx_0 bmx_03 = iterator.next();
                ++n5;
                if (bhr_12.a(bmx_03.b()) && !bhr_12.b(bmx_03.b())) continue;
                ++n;
            }
            return n + "/" + n5;
        }
        if (string.equals("territoryName")) {
            String string3;
            bmf_0 bmf_02 = (bmf_0)this.Y.E();
            if (bae.h().a(66, (long)bmf_02.e()) && (string3 = bae.h().a(66, (long)bmf_02.e(), new Object[0])) != null && string3.length() > 0) {
                return string3;
            }
            return null;
        }
        if (string.equals("buffTitle")) {
            return bae.h().a("protector.buffs.mdc.title", new Object[0]);
        }
        if (string.equals("buffTooltip")) {
            return bae.h().a("protector.buffs.mdc.explaination", new Object[0]);
        }
        if (string.equals("unsatisfiedRegionalState")) {
            if (bRA.e().a() < 1) {
                return null;
            }
            return this.c(fgk_0.b);
        }
        if (string.equals("halfSatisfiedRegionalState")) {
            if (bRA.e().a() < 2) {
                return null;
            }
            return this.c(fgk_0.c);
        }
        if (string.equals("satisfiedRegionalState")) {
            if (bRA.e().a() < 1) {
                return null;
            }
            return this.c(fgk_0.d);
        }
        if (string.equals("unsatisfiedGlobalState")) {
            if (bRA.e().a() < 1) {
                return null;
            }
            return this.b(fgk_0.b);
        }
        if (string.equals("halfSatisfiedGlobalState")) {
            if (bRA.e().a() < 2) {
                return null;
            }
            return this.b(fgk_0.c);
        }
        if (string.equals("satisfiedGlobalState")) {
            if (bRA.e().a() < 1) {
                return null;
            }
            return this.b(fgk_0.d);
        }
        if (string.equals("unsatisfiedStateIcon")) {
            int n = this.a(fgk_0.b);
            if (n == -1) {
                return null;
            }
            bpe_0 bpe_02 = (bpe_0)fih_0.a().a(n);
            return bpe_02.i();
        }
        if (string.equals("halfSatisfiedStateIcon")) {
            int n = this.a(fgk_0.c);
            if (n == -1) {
                return null;
            }
            bpe_0 bpe_03 = (bpe_0)fih_0.a().a(n);
            return bpe_03.i();
        }
        if (string.equals("satisfiedStateIcon")) {
            int n = this.a(fgk_0.d);
            if (n == -1) {
                return null;
            }
            bpe_0 bpe_04 = (bpe_0)fih_0.a().a(n);
            return bpe_04.i();
        }
        if (string.equals("globalStateIcon")) {
            return azs_0.a().a("protectorBuffsIconsPath", "defaultIconPath", -1);
        }
        if (string.equals("buffList")) {
            return Lists.newArrayList((Object[])new bwr_2[]{new bwr_2(fgk_0.b, this.Y), new bwr_2(fgk_0.c, this.Y), new bwr_2(fgk_0.d, this.Y)});
        }
        if (string.equals("zoology")) {
            return this.Y.y().a();
        }
        if (string.equals("territoryRecommendedLevel")) {
            bmf_0 bmf_03 = this.g();
            if (bmf_03 == null) {
                return null;
            }
            short s2 = bmf_03.c();
            short s3 = bmf_03.d();
            if (s2 != -1 && s3 != -1) {
                return Cr.a(bae.h().a("recommended.level", s2, s3), new Object[0]);
            }
            return Cr.a(bae.h().a("recommended.level", 1, 5), new Object[0]);
        }
        return super.b(string);
    }

    private int a(fgk_0 fgk_02) {
        switch (fgk_02) {
            case b: {
                return 1917;
            }
            case d: {
                return 1916;
            }
            case c: {
                return 1915;
            }
        }
        return -1;
    }

    private String b(fgk_0 fgk_02) {
        ArrayList<String> arrayList = new ArrayList<String>();
        azf_2 azf_22 = fgk_02.a() <= this.Y.w().a() ? azf_2.e : azf_2.q;
        String string = new ani_2().i().a(azf_22.w()).a((CharSequence)bwr_2.a(fgk_02)).j().r();
        arrayList.add(string);
        ani_2 ani_22 = new ani_2();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            String string2 = (String)arrayList.get(k);
            if (k != 0) {
                ani_22.m();
            }
            ani_22.a((CharSequence)string2);
        }
        return ani_22.r();
    }

    private Object c(fgk_0 fgk_02) {
        int n = this.a(fgk_02);
        if (n == -1) {
            return null;
        }
        azf_2 azf_22 = fgk_02.a() <= this.Y.w().a() ? azf_2.e : azf_2.q;
        bpe_0 bpe_02 = (bpe_0)fih_0.a().a(n);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string : eDi.a(new edh_0(bpe_02, eDk.a))) {
            arrayList.add(new ani_2().i().a(azf_22.w()).a((CharSequence)string).j().r());
        }
        if (arrayList.isEmpty()) {
            arrayList.add(bae.h().a("protector.noBuff", new Object[0]));
        }
        return arrayList;
    }

    public void i() {
        int n = this.ac.size();
        for (int k = 0; k < n; ++k) {
            this.ac.get(k).e();
        }
    }

    @Override
    public int b() {
        return this.Y != null ? this.Y.B() : -1;
    }

    @Override
    public void a(fgy_0 fgy_02, faX faX2) {
        if (fgy_02 != this.Y) {
            return;
        }
        this.aa = new bVn(faX2.c());
        fis_1.a().a((ajf_1)this, "nation");
        if (azu_0.j().c(dce.a())) {
            azu_0.j().b(dce.a());
        }
    }

    private static bhg_1 a(bMn bMn2, fjb_0 fjb_02) {
        EnumMap<fjb_0, fja_0> enumMap = bMn2.u();
        return new bhg_1(enumMap.get((Object)fjb_02));
    }

    public bhg_1 a(fjb_0 fjb_02) {
        switch (fjb_02) {
            case a: {
                if (W == null) {
                    W = bwy_2.a(this.Y, fjb_02);
                }
                return W;
            }
        }
        return null;
    }

    public bMn j() {
        return this.Y;
    }

    public bMn k() {
        return this.ab;
    }

    public void l() {
        if (this.Z != null) {
            this.Z.R();
            this.Z = null;
        }
    }

    @Override
    public void a(bMn bMn2) {
        fgP fgP2;
        if (this.Y == bMn2) {
            return;
        }
        if (this.ab != null) {
            fje_0.a.b(this.ab);
            this.ab = null;
        }
        if (this.Y != null) {
            fgP2 = this.Y.l();
            if (fgP2 != null) {
                fgP2.a((eyv_1)null);
            }
            bmr_1 bmr_12 = azu_0.j().k();
            if (this.Y == null || bmr_12 != null && !bmr_12.dj().equals(bmr_12.di())) {
                fje_0.a.b(this.Y);
            } else {
                this.ab = this.Y;
            }
            this.l();
        }
        fis_1.a().a("wakfuEcosystemEnabled", false);
        this.Y = bMn2;
        if (this.Z != null) {
            this.Z.R();
            this.Z = null;
        }
        W = null;
        if (this.Y != null) {
            fje_0.a.a(this.Y);
            fgP2 = this.Y.l();
            if (fgP2 != null) {
                fgP2.a(this);
            }
            this.aa = new bVn(this.Y.D().c());
            fis_1.a().a("protector", this);
        } else {
            dcd_0.a().d();
            this.aa = null;
        }
        this.e();
    }

    public static String a(int n, int n2, int n3, Object ... objectArray) {
        int n4 = n * 10000000 + n2 * 10000 + n3;
        String string = bae.h().a(49, (long)n4, objectArray == null ? new String[]{} : objectArray);
        return bae.h().a(49, (long)n4) ? string : null;
    }

    private ArrayList<bnl_0> a(bnh_0 bnh_02, boolean bl) {
        if (bnh_02 == null || bnh_02.b() == 0) {
            return null;
        }
        ArrayList<bnl_0> arrayList = new ArrayList<bnl_0>(bnh_02.b());
        for (exx_2 exx_22 : bnh_02) {
            bni_0 bni_02 = (bni_0)exx_22;
            if (bni_02 == null || bni_02.s() != bl) continue;
            arrayList.add(((bni_0)exx_22).k());
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    @Override
    public void a(eyu_1 eyu_12, long l) {
        fis_1.a().a((ajf_1)this, "walletHandler");
        if (this.Y == null || this.Y.l() == null) {
            return;
        }
        bmd_0 bmd_02 = (bmd_0)this.Y.l();
        bwg_2 bwg_22 = bmd_02.a(this.j());
        bwg_22.a();
    }

    @Override
    @Nullable
    public abu a(int n, @NotNull bnm_0 bnm_02) {
        if (this.Z == null) {
            this.Z = bwu_2.a(n);
        }
        if (this.Z != null) {
            bwu_2.a(this.Z, bnm_02);
        }
        return this.Z;
    }

    @Override
    @Nullable
    public bmf_0 g() {
        if (this.Y == null) {
            return null;
        }
        return (bmf_0)this.Y.E();
    }

    @Override
    public boolean c() {
        return false;
    }
}

