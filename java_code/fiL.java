/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class fiL {
    private static final Logger a = Logger.getLogger(fiL.class);

    public boolean a(long l, int n, int n2) {
        int n3;
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown, player id=" + l));
            return false;
        }
        els_0 els_02 = t.ck();
        if (els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            a.error((Object)("Setting deck problem : player in fight, player id=" + l));
            return false;
        }
        fiR fiR2 = ((epq_2)t).dw();
        if (fiR2 == null) {
            a.error((Object)("SpellDeck not found : player id=" + l));
            return false;
        }
        if (n2 > Oz.c.a()) {
            a.error((Object)("Bad Level : > character max level = " + n2 + ", player id= " + l));
            return false;
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        ezj_1 ezj_12 = ezm_12.d();
        int n4 = n3 = ezj_12 == null ? Integer.MIN_VALUE : ezj_12.e();
        if (n == n3 && !eei_0.a(n2, t)) {
            a.error((Object)("Bad Level : > instance max level = " + n2 + ", player id= " + l));
            return false;
        }
        fiO fiO2 = fiR2.b(n);
        if (fiO2 == null) {
            fiO2 = new fiO();
            fiR2.a(n, fiO2);
        }
        fiO2.a(n2);
        if (!this.a(l, fiO2)) {
            this.c(l, fiO2);
            this.d(l, fiO2);
        }
        if (!this.a(l, fiO2)) {
            a.error((Object)("SpellDeck still invalid, player id=" + l + ", deck " + fiO2));
        }
        ezj_1 ezj_13 = null;
        for (ezj_1 ezj_14 : ezm_12.a().values()) {
            if (ezj_14.e() != n || ezj_14.c() >= n2 || ezj_14.c() <= 0 || ezj_12 != ezj_14) continue;
            ezj_13 = ezj_14;
        }
        if (ezj_13 != null && t instanceof eeg_0) {
            ((eeg_0)t).cC().b(ezj_13);
        }
        return true;
    }

    private void c(long l, fiO fiO2) {
        this.a(l, fiO2, fiK.c, fiK.a, fiO2.d());
    }

    private void d(long l, fiO fiO2) {
        this.a(l, fiO2, fiK.d, fiK.b, fiO2.f());
    }

    private void a(long l, fiO fiO2, int n, int[] nArray, ArrayList<Integer> arrayList) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown , player id=" + l));
            return;
        }
        Iterable<? extends fio_0> iterable = ((epq_2)t).Y_();
        int n2 = fiO2.c() ? ((epq_2)t).dt() : fiO2.b();
        for (int k = 0; k < n; ++k) {
            boolean bl;
            int n3 = arrayList.get(k);
            Object Spell = fip_0.d().b(n3);
            boolean bl2 = !this.a(n3, iterable, n2);
            boolean bl3 = n2 < nArray[k];
            boolean bl4 = bl = bl2 || bl3 || Spell == null;
            if (n3 == 0 || !bl) continue;
            this.a(n3, fiO2);
        }
    }

    public boolean a(long l, int n) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown , player id=" + l));
            return false;
        }
        els_0 els_02 = t.ck();
        if (els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            a.error((Object)("Setting deck problem : player in fight, player id=" + l));
            return false;
        }
        fiR fiR2 = ((epq_2)t).dw();
        if (fiR2 == null) {
            a.error((Object)("SpellDeck not found : player id=" + l));
            return false;
        }
        fiO fiO2 = fiR2.b(n);
        if (fiO2 == null) {
            fiO2 = new fiO();
            fiR2.a(n, fiO2);
        }
        return true;
    }

    public boolean a(long l, int n, int n2, int n3) {
        short s2;
        int n4;
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown , player id=" + l));
            return false;
        }
        els_0 els_02 = t.ck();
        if (els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            a.error((Object)("Adding spell problem : player in fight, player id=" + l));
            return false;
        }
        fiR fiR2 = ((epq_2)t).dw();
        if (fiR2 == null) {
            a.error((Object)("Adding spell problem : unknown deck set, player id=" + l));
            return false;
        }
        Object Spell = fip_0.d().b(n);
        if (Spell == null) {
            a.error((Object)("Spell unknown " + n + ", player id=" + l));
            return false;
        }
        if (((epq_2)t).aZ().c(n) == null) {
            a.error((Object)("Player can't use this spell , player id=" + l + ", spellId=" + n));
            return false;
        }
        if (n3 < 0) {
            a.error((Object)("Bad slot index " + n3 + ", player id=" + l));
            return false;
        }
        if (((fin_0)Spell).w()) {
            if (fiK.d <= n3) {
                a.error((Object)("Bad slot index " + n3 + ", player id=" + l));
                return false;
            }
        } else if (fiK.c <= n3) {
            a.error((Object)("Bad slot index " + n3 + ", player id=" + l));
            return false;
        }
        int n5 = ((epq_2)t).dt();
        fiO fiO2 = fiR2.b(n2);
        if (fiO2 == null) {
            fiO2 = new fiO();
            fiR2.a(n2, fiO2);
        }
        int n6 = n4 = fiO2.c() ? n5 : fiO2.b();
        if (((fin_0)Spell).w()) {
            if (fiK.b[n3] > n4) {
                a.error((Object)("Bad slot index , Required level : " + fiK.b[n3] + ", player id=" + l));
                return false;
            }
        } else if (fiK.a[n3] > n4) {
            a.error((Object)("Bad slot index , Required level : " + fiK.a[n3] + ", player id=" + l));
            return false;
        }
        if (n4 < (s2 = ((fin_0)Spell).m())) {
            a.error((Object)String.format("Insufficient level to use this spell, Required level : %s, deck level : %d, player id=%d", s2, n4, l));
            return false;
        }
        if (((fin_0)Spell).w()) {
            fiO2.b(n, n3);
        } else {
            fiO2.a(n, n3);
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        ezj_1 ezj_12 = ezm_12.d();
        if (ezj_12 != null && ezj_12.e() == n2) {
            ((epq_2)t).c(((epq_2)t).cK());
        }
        return true;
    }

    public boolean a(long l, fiO fiO2, int n) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown , player id=" + l));
            return false;
        }
        els_0 els_02 = t.ck();
        if (els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            a.error((Object)("Adding spell problem : player in fight, player id=" + l));
            return false;
        }
        fiR fiR2 = ((epq_2)t).dw();
        if (fiR2 == null) {
            a.error((Object)("Adding spell problem : unknown deck set, player id=" + l));
            return false;
        }
        fiO fiO3 = fiR2.b(n);
        if (fiO3 == null) {
            fiO3 = new fiO();
            fiR2.a(n, fiO3);
        }
        ArrayList<Integer> arrayList = fiO2.d();
        for (int k = 0; k < arrayList.size(); ++k) {
            fiO3.a(arrayList.get(k), k);
        }
        ArrayList<Integer> arrayList2 = fiO2.f();
        for (int k = 0; k < arrayList2.size(); ++k) {
            fiO3.b(arrayList2.get(k), k);
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        ezj_1 ezj_12 = ezm_12.d();
        if (ezj_12 != null && ezj_12.e() == n) {
            ((epq_2)t).c(((epq_2)t).cK());
        }
        return true;
    }

    public boolean b(long l, int n, int n2) {
        ezm_1 ezm_12;
        ezj_1 ezj_12;
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown , player id=" + l));
            return false;
        }
        els_0 els_02 = t.ck();
        if (els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            a.error((Object)("Adding spell problem : player in fight, player id=" + l));
            return false;
        }
        if (n <= 0) {
            a.error((Object)("Can't remove empty slot (spellId=0),  player id=" + l));
            return false;
        }
        fiR fiR2 = ((epq_2)t).dw();
        if (fiR2 == null) {
            a.error((Object)("SpellDeck not found : player id=" + l));
            return false;
        }
        fiO fiO2 = fiR2.b(n2);
        if (fiO2 == null) {
            a.error((Object)("Removing spell problem : no deck at index=" + n2));
            return false;
        }
        boolean bl = this.a(n, fiO2);
        if (bl && (ezj_12 = (ezm_12 = ((epq_2)t).dx()).d()) != null && ezj_12.e() == n2) {
            ((epq_2)t).c(((epq_2)t).cK());
        }
        return bl;
    }

    private boolean a(int n, fiO fiO2) {
        int n2 = fiO2.b(n);
        if (n2 < 0) {
            a.error((Object)("Trying to remove unknown spell : id=" + n));
            return false;
        }
        Object Spell = fip_0.d().b(n);
        if (Spell == null) {
            a.error((Object)("Spell unknown id=" + n));
            return false;
        }
        if (((fin_0)Spell).w()) {
            fiO2.b(0, n2);
        } else {
            fiO2.a(0, n2);
        }
        return true;
    }

    public boolean a(long l, int n, fiO fiO2) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown , player id=" + l));
            return false;
        }
        els_0 els_02 = t.ck();
        if (els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            a.error((Object)("Setting deck problem : player in fight, player id=" + l));
            return false;
        }
        fiR fiR2 = ((epq_2)t).dw();
        if (fiR2 == null) {
            a.error((Object)("SpellDeck not found : player id=" + l));
            return false;
        }
        if (fiO2 == null) {
            a.error((Object)("Trying to add null spell deck : player id=" + l));
            return false;
        }
        if (!this.a(l, fiO2)) {
            a.error((Object)("Trying to add bad spell deck : player id=" + l));
            return false;
        }
        fiR2.a(n, fiO2);
        return true;
    }

    public void a(long l, int n, int n2, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown, player id=" + l));
            return;
        }
        fiR fiR2 = ((epq_2)t).dw();
        if (fiR2 == null) {
            return;
        }
        fiO fiO2 = fiR2.b(n);
        if (fiO2 == null) {
            return;
        }
        fiO2.a(n2);
        fiO2.a(arrayList, arrayList2);
    }

    public boolean a(long l, fiO fiO2) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        Object Spell;
        int n;
        int n2;
        ArrayList<Integer> arrayList = fiO2.f();
        ArrayList<Integer> arrayList2 = fiO2.d();
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown , player id=" + l));
            return false;
        }
        Iterable<? extends fio_0> iterable = ((epq_2)t).Y_();
        int n3 = fiO2.c() ? ((epq_2)t).dt() : fiO2.b();
        for (n2 = 0; n2 < fiK.c; ++n2) {
            n = arrayList2.get(n2);
            Spell = fip_0.d().b(n);
            bl3 = !this.a(n, iterable, n3);
            bl2 = n3 < fiK.a[n2];
            boolean bl4 = bl = bl3 || bl2 || Spell == null || ((fin_0)Spell).w();
            if (n == 0 || !bl) continue;
            return false;
        }
        for (n2 = 0; n2 < fiK.d; ++n2) {
            n = arrayList.get(n2);
            Spell = fip_0.d().b(n);
            bl3 = !this.a(n, iterable, n3);
            bl2 = n3 < fiK.b[n2];
            boolean bl5 = bl = bl3 || bl2 || Spell == null || !((fin_0)Spell).w();
            if (n == 0 || !bl) continue;
            return false;
        }
        return true;
    }

    private boolean a(int n, Iterable<? extends fio_0> iterable, int n2) {
        for (fio_0 fio_02 : iterable) {
            if (fio_02.w() != n || ((fin_0)fio_02.r()).m() > n2) continue;
            return true;
        }
        return false;
    }

    @Nullable
    public fiO b(long l, fiO fiO2) {
        boolean bl;
        int n;
        int n2;
        ArrayList<Integer> arrayList = fiO2.f();
        ArrayList<Integer> arrayList2 = fiO2.d();
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown , player id=" + l));
            return null;
        }
        int n3 = ((epq_2)t).dt();
        int n4 = fiO2.c() ? n3 : fiO2.b();
        Iterable<? extends fio_0> iterable = ((epq_2)t).Y_();
        int[] nArray = new int[fiK.c];
        for (int k = 0; k < (fiK.c > arrayList2.size() ? arrayList2.size() : fiK.c); ++k) {
            n2 = fiO2.d().get(k);
            n = !this.a(n2, iterable, n4) ? 1 : 0;
            boolean bl2 = bl = n4 < fiK.a[k];
            if (n2 == 0 || n != 0 || bl) continue;
            nArray[k] = n2;
        }
        int[] nArray2 = new int[fiK.d];
        for (n2 = 0; n2 < (fiK.d > arrayList.size() ? arrayList.size() : fiK.d); ++n2) {
            boolean bl3;
            n = fiO2.f().get(n2);
            bl = !this.a(n, iterable, n4);
            boolean bl4 = bl3 = n4 < fiK.b[n2];
            if (n == 0 || bl || bl3) continue;
            nArray2[n2] = n;
        }
        fiO fiO3 = new fiO(nArray, nArray2);
        fiO3.a(fiO2.b());
        return fiO3;
    }

    public int a(epq_2 epq_22) {
        int n;
        int n2;
        fiR fiR2 = epq_22.dw();
        if (fiR2 == null) {
            a.error((Object)("SpellDeck not found : player id=" + epq_22.a_()));
            return -1;
        }
        ezm_1 ezm_12 = epq_22.dx();
        fiO fiO2 = fiR2.b(ezm_12.d().e());
        if (fiO2 == null) {
            a.error((Object)("Active Deck not found : player id=" + epq_22.a_()));
            return -1;
        }
        ArrayList<Integer> arrayList = fiO2.d();
        int n3 = epq_22.dt();
        int n4 = n2 = fiO2.c() ? n3 : fiO2.b();
        for (n = 0; n < fiK.c && fiK.a[n] <= n2 && arrayList.get(n) != 0; ++n) {
        }
        return n == fiK.c || fiK.a[n] > n2 ? -1 : n;
    }

    public boolean a(long l) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown, player id=" + l));
            return false;
        }
        fiR fiR2 = ((epq_2)t).dw();
        return fiR2 != null;
    }

    public boolean a(long l, byte by, int n) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown, player id=" + l));
            return false;
        }
        fiR fiR2 = ((epq_2)t).dw();
        if (fiR2 == null) {
            return false;
        }
        fiR2.a((int)by, n);
        return true;
    }

    public boolean a(long l, byte by) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.error((Object)("Character unknown, player id=" + l));
            return false;
        }
        fiR fiR2 = ((epq_2)t).dw();
        if (fiR2 == null) {
            return false;
        }
        int n = fiR2.e();
        if (by >= n) {
            a.warn((Object)("Impossible to remove a deck with index out of bound : " + by + ", size = " + n));
            return false;
        }
        if (n <= 1) {
            a.warn((Object)"Impossible to remove a deck the size is already at it's minimum");
            return false;
        }
        for (ezj_1 ezj_12 : ((epq_2)t).dx().a().values()) {
            if (ezj_12.e() != by) continue;
            a.warn((Object)"Impossible to remove a deck, already used in a build");
            return false;
        }
        fiR2.c(by);
        return true;
    }
}

