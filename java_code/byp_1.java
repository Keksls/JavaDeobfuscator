/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from byP
 */
public class byp_1
implements ajh_1 {
    protected static final Logger a = Logger.getLogger(byp_1.class);
    public static final String b = "members";
    public static final String d = "leader";
    public static final String e = "isLeader";
    public static final String f = "availableSlotsCount";
    public static final String g = "partyFull";
    public static final String h = "localPlayerMember";
    public static final String i = "editableMember";
    public static final String[] j = new String[]{"members", "leader", "isLeader", "availableSlotsCount", "partyFull", "localPlayerMember", "editableMember"};
    private byn_1 k;
    final TLongObjectHashMap<byr_1> l = new TLongObjectHashMap();
    private final List<byr_1> m = new ArrayList<byr_1>();
    byr_1 n;
    byr_1 o;
    private byr_1 p;
    static long q = -1L;
    static long r = -1L;
    static long s = -1L;

    public byp_1(byn_1 byn_12) {
        this.a(byn_12);
    }

    public void a(byr_1 byr_12) {
        this.p = byr_12;
    }

    public void a(byn_1 byn_12) {
        this.b();
        this.k = byn_12;
        if (byn_12.a() == null || byn_12.a().g()) {
            return;
        }
        long l = byn_12.a().a();
        TLongObjectIterator tLongObjectIterator = byn_12.a().e().iterator();
        epl_0 epl_02 = byn_12.a().e(l);
        if (epl_02 == null) {
            return;
        }
        this.n = this.a(epl_02);
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            epl_0 epl_03 = (epl_0)tLongObjectIterator.value();
            if (epl_03 == null || epl_03.f() == l) continue;
            this.a(epl_03);
        }
        Collections.sort(this.m);
        for (byr_1 byr_12 : this.m) {
            if (this.d(byr_12.f()) || !this.b(byr_12)) continue;
            if (q == -1L) {
                q = byr_12.f();
                continue;
            }
            if (r == -1L) {
                r = byr_12.f();
                continue;
            }
            if (s != -1L) continue;
            s = byr_12.f();
        }
    }

    private byr_1 a(epl_0 epl_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        byr_1 byr_12 = new byr_1(this, epl_02);
        byr_12.l();
        if (epl_02.v()) {
            eBt eBt2 = ((epk_0)epl_02).b();
            eBt2.b(new byy_1(byr_12));
        }
        long l = epl_02.f();
        this.l.put(l, (Object)byr_12);
        this.m.add(byr_12);
        if (l == bmr_12.a_()) {
            this.o = byr_12;
        }
        if (byr_12.j() && epl_02.h() != bmr_12.T_()) {
            this.a(l, false);
        }
        return byr_12;
    }

    private boolean d(long l) {
        return q == l || r == l || s == l;
    }

    boolean b(byr_1 byr_12) {
        return byr_12.g() == azu_0.j().n().u() && !byr_12.i().v();
    }

    public static void a() {
        s = -1L;
        r = -1L;
        q = -1L;
    }

    public void b() {
        TLongObjectIterator tLongObjectIterator = this.l.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ((byr_1)tLongObjectIterator.value()).m();
        }
        this.l.clear();
        this.m.clear();
        this.o = null;
        this.n = null;
        this.p = null;
    }

    public void a(long l) {
        epl_0 epl_02;
        this.k.a(l);
        if (this.d(l)) {
            byp_1.a();
        }
        if ((epl_02 = this.k.a().e(l)) == null) {
            a.error((Object)("impossible de retrouver le membre du groupe d'id : " + l));
            return;
        }
        String string = l == azu_0.j().k().a_() ? bae.h().a("group.party.memberDeletedSelf", new Object[0]) : bae.h().a("group.party.memberDeleted", epl_02.a());
        aul_0.a().c(string);
    }

    public void b(long l) {
        this.k.b(l);
    }

    public void a(long l, boolean bl) {
        if (l < 0L) {
            a.error((Object)("on essai d'appliquer la boussole sur un membre invalide d'id : " + l));
            return;
        }
        epl_0 epl_02 = this.k.a().e(l);
        if (epl_02 == null) {
            a.error((Object)("impossible de retrouver le membre du groupe d'id : " + l));
            return;
        }
        if (bl) {
            if (epl_02.h() != azu_0.j().k().T_()) {
                fpm_0.b().a(bae.h().a("error.group.memberTooFar", new Object[0]), cfn_0.a(1), 3L, 102, 1);
                fis_1.a().a((ajf_1)this.l.get(epl_02.f()), "isFollowed");
                return;
            }
            aUh.b("group.party.memberFollowed", epl_02.a());
        } else {
            aUh.b("group.party.stopFollowing", epl_02.a());
        }
        epl_02.a(bl);
        fis_1.a().a((ajf_1)this.l.get(epl_02.f()), "isFollowed");
    }

    public void a(String string) {
        this.k.a(string);
    }

    public byr_1 c(long l) {
        return (byr_1)this.l.get(l);
    }

    @Override
    public String[] d() {
        return j;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.m.isEmpty() ? null : this.m;
        }
        if (string.equals(d)) {
            return this.n;
        }
        if (string.equals(e)) {
            return this.n == this.o;
        }
        if (string.equals(f)) {
            int n = enp_2.a.b(ens_2.bv) - this.l.size();
            return bae.h().a("partyList.availableSlots", n);
        }
        if (string.equals(g)) {
            return this.l.size() >= enp_2.a.b(ens_2.bv);
        }
        if (string.equals(h)) {
            return this.o;
        }
        if (string.equals(i)) {
            return this.p;
        }
        return null;
    }

    public static long a(byte by) {
        switch (by) {
            case 0: {
                return q;
            }
            case 1: {
                return r;
            }
            case 2: {
                return s;
            }
        }
        return -1L;
    }
}

