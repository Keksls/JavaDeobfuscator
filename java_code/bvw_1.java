/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bvw
 */
public class bvw_1
implements ajh_1,
Comparable<bvw_1> {
    public static final String a = "title";
    public static final String b = "description";
    public static final String d = "type";
    public static final String e = "types";
    public static final String f = "selectedType";
    public static final String g = "iconUrl";
    public static final String h = "typeDescription";
    public static final String i = "areParticipantsLimited";
    public static final String j = "maxParticipants";
    public static final String k = "numParticipants";
    public static final String l = "numParticipantsDesc";
    public static final String m = "maxRegistrations";
    public static final String n = "numRegistrations";
    public static final String o = "numRegistrationsDesc";
    public static final String p = "startDateDesc";
    public static final String q = "endDateDesc";
    public static final String r = "isRegistered";
    public static final String s = "registeredList";
    public static final String t = "isValidated";
    public static final String u = "validatedList";
    public static final String v = "canEditParticipantsLimit";
    private eLo w;
    private eLo x;
    private boolean y = false;
    private boolean z = false;
    private boolean A = false;
    private boolean B = false;
    private bvx_1 C;

    public int a(@NotNull bvw_1 bvw_12) {
        if (this.w != null) {
            return this.w.a().f(bvw_12.w.a());
        }
        return 0;
    }

    public void a(int n, int n2, int n3) {
        this.w = new eLo();
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null) {
            this.w.b(bmr_12.a_());
        }
        this.w.a(true);
        this.w.a((byte)1);
        this.w.b((byte)0);
        this.C = bvx_1.a((byte)1);
        this.w.c((byte)-1);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date());
        ((Calendar)gregorianCalendar).add(10, 1);
        int n4 = gregorianCalendar.get(9) == 0 ? 0 : 12;
        wt_0 wt_02 = new wt_0(0, 0, gregorianCalendar.get(10) + n4, n, n2, n3);
        this.w.a(wt_02);
        ((Calendar)gregorianCalendar).add(10, 1);
        n4 = gregorianCalendar.get(9) == 0 ? 0 : 12;
        wt_02 = new wt_0(0, 0, gregorianCalendar.get(10) + n4, n, n2, n3);
        this.w.b(wt_02);
        this.z = false;
        this.y = false;
        this.A = false;
        this.B = false;
    }

    public void a(int n, int n2, int n3, int n4, int n5) {
        wt_0 wt_02 = this.w.k();
        long l = wt_02.h();
        wt_0 wt_03 = this.w.l();
        long l2 = wt_03.h();
        int n6 = (int)((float)(l2 - l) / 1000.0f);
        wt_02.a(0, n, n2, n3, n4, n5);
        wt_03.a(n6, n, n2, n3, n4, n5);
        fis_1.a().a((ajf_1)this, p, q);
    }

    public void b(int n, int n2, int n3, int n4, int n5) {
        wt_0 wt_02 = this.w.l();
        wt_02.a(0, n, n2, n3, n4, n5);
        fis_1.a().a((ajf_1)this, q);
    }

    public void a(boolean bl) {
        byte by = this.w.o();
        if (bl && by >= 1 || !bl && by < 1) {
            return;
        }
        if (bl) {
            this.w.c((byte)2);
            this.w.d((byte)2);
        } else {
            this.w.c((byte)-1);
            this.w.d((byte)-1);
        }
        fis_1.a().a((ajf_1)this, i, j, m);
    }

    public boolean a() {
        return this.w.o() != -1;
    }

    public void a(byte by) {
        if (by < 1 || by > 20) {
            return;
        }
        this.w.c(by);
        fis_1.a().a((ajf_1)this, j);
    }

    public void b(byte by) {
        if (by < 1 || by > 20) {
            return;
        }
        this.w.d(by);
        fis_1.a().a((ajf_1)this, m);
    }

    public void c(byte by) {
        if (this.w.e() == by) {
            return;
        }
        this.w.a(by);
        this.C = bvx_1.a(by);
        switch (by) {
            case 3: {
                this.a(false);
                break;
            }
            case 2: {
                this.a(true);
                break;
            }
            case 4: {
                this.a(false);
            }
        }
        fis_1.a().a((ajf_1)this, d, h, g, f, v);
    }

    public void d(byte by) {
        if (this.w.n() == by) {
            return;
        }
        this.w.b(by);
        fis_1.a().a((ajf_1)this, g, f);
    }

    public void a(String string) {
        String string2 = this.w.b();
        if (string2 == string || string2 != null && string2.equals(string) || string != null && string.equals(string2)) {
            return;
        }
        this.w.a(string);
        fis_1.a().a((ajf_1)this, a);
    }

    public void c(String string) {
        String string2 = this.w.c();
        if (string2 == string || string2 != null && string2.equals(string) || string != null && string.equals(string2)) {
            return;
        }
        this.w.b(string);
        fis_1.a().a((ajf_1)this, b);
    }

    public void a(eLo eLo2) {
        this.w = eLo2;
        this.C = bvx_1.a(this.w.e());
    }

    public void b(eLo eLo2) {
        this.x = eLo2;
        this.w = new eLo();
        this.w.a(this.x);
        this.C = bvx_1.a(this.w.e());
        this.z = false;
        this.y = false;
        this.A = false;
        this.B = false;
    }

    public boolean b() {
        if (this.x != null) {
            return !this.x.b().equals(this.w.b());
        }
        return false;
    }

    public boolean c() {
        if (this.x != null) {
            return !this.x.c().equals(this.w.c());
        }
        return false;
    }

    public boolean e() {
        if (this.x != null) {
            return this.x.a().f(this.w.a()) != 0;
        }
        return false;
    }

    public boolean f() {
        if (this.x != null) {
            return this.x.m().f(this.w.m()) != 0;
        }
        return false;
    }

    public boolean g() {
        if (this.x != null) {
            return this.x.o() != this.w.o();
        }
        return false;
    }

    public boolean h() {
        if (this.x != null) {
            return this.x.p() != this.w.p();
        }
        return false;
    }

    public void i() {
        if (this.x == null) {
            return;
        }
        TLongObjectHashMap<String> tLongObjectHashMap = this.w.r();
        tLongObjectHashMap.clear();
        TLongObjectHashMap<String> tLongObjectHashMap2 = this.x.r();
        if (tLongObjectHashMap2.size() > 0) {
            TLongObjectIterator tLongObjectIterator = tLongObjectHashMap2.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                tLongObjectHashMap.put(tLongObjectIterator.key(), (Object)((String)tLongObjectIterator.value()));
            }
        }
        fis_1.a().a((ajf_1)this, r, s, o, n);
    }

    public void j() {
        if (this.x == null) {
            return;
        }
        TLongObjectHashMap<String> tLongObjectHashMap = this.w.q();
        tLongObjectHashMap.clear();
        TLongObjectHashMap<String> tLongObjectHashMap2 = this.x.q();
        if (tLongObjectHashMap2.size() > 0) {
            TLongObjectIterator tLongObjectIterator = tLongObjectHashMap2.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                tLongObjectHashMap.put(tLongObjectIterator.key(), (Object)((String)tLongObjectIterator.value()));
            }
        }
        fis_1.a().a((ajf_1)this, t, u, k, l);
    }

    public void k() {
        if (this.x == null) {
            return;
        }
        long l = azu_0.j().k().a_();
        if (this.w.r().containsKey(l)) {
            this.x.d(l);
            this.i();
        } else if (this.w.q().containsKey(l)) {
            this.x.c(l);
            this.j();
        }
    }

    public eLo l() {
        return this.w;
    }

    public eLo m() {
        return this.x;
    }

    public void n() {
        Pw pw;
        if (this.b()) {
            this.x.a(this.w.b());
            pw = new czt_2();
            ((czt_2)pw).a(this.x.b());
            ((czt_2)pw).a(this.x.i());
            azu_0.j().K().c(pw);
        }
        if (this.c()) {
            this.x.b(this.w.c());
            pw = new czp_1();
            ((czp_1)pw).a(this.x.c());
            ((czp_1)pw).a(this.x.i());
            azu_0.j().K().c(pw);
        }
        if (this.g()) {
            this.x.c(this.w.o());
            pw = new czr_2();
            ((czr_2)pw).a(this.x.i());
            ((czr_2)pw).a(this.x.o());
            ((czr_2)pw).b((byte)2);
            azu_0.j().K().c(pw);
        }
        if (this.h()) {
            this.x.d(this.w.p());
            pw = new czr_2();
            ((czr_2)pw).a(this.x.i());
            ((czr_2)pw).a(this.x.p());
            ((czr_2)pw).b((byte)1);
            azu_0.j().K().c(pw);
        }
        if (this.e()) {
            bvs_2.a().a(this.x.i(), this.w.a());
            pw = new czs_2();
            ((czs_2)pw).a(this.x.a());
            ((czs_2)pw).a(this.x.i());
            azu_0.j().K().c(pw);
        }
        if (this.f()) {
            this.x.b(this.w.m());
            pw = new czq_2();
            ((czq_2)pw).a(this.x.m());
            ((czq_2)pw).a(this.x.i());
            azu_0.j().K().c(pw);
        }
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return bvp_2.a(this.w);
        }
        if (string.equals(b)) {
            return bvp_2.b(this.w);
        }
        if (string.equals(i)) {
            return this.a();
        }
        if (string.equals(j)) {
            return this.w.o();
        }
        if (string.equals(m)) {
            return this.w.p();
        }
        if (string.equals(k)) {
            return this.w.q().size();
        }
        if (string.equals(n)) {
            return this.w.r().size();
        }
        if (string.equals(l)) {
            StringBuilder stringBuilder = new StringBuilder().append(this.w.q().size());
            byte by = this.w.o();
            if (by >= 0) {
                stringBuilder.append("/").append(by);
            }
            return stringBuilder.toString();
        }
        if (string.equals(o)) {
            StringBuilder stringBuilder = new StringBuilder().append(this.w.r().size());
            byte by = this.w.p();
            if (by >= 0) {
                stringBuilder.append("/").append(by);
            }
            return stringBuilder.toString();
        }
        if (string.equals(p)) {
            wu_0 wu_02 = this.w.a();
            if (wu_02 == null || wu_02.c()) {
                return null;
            }
            return wu_02.s();
        }
        if (string.equals(q)) {
            wu_0 wu_03 = this.w.m();
            if (wu_03 == null || wu_03.c()) {
                return null;
            }
            return wu_03.s();
        }
        if (string.equals(d)) {
            return this.w.e();
        }
        if (string.equals(g)) {
            return azs_0.a().a(this.w.e());
        }
        if (string.equals(h)) {
            return bae.h().a("calendar.event.type." + this.w.e(), new Object[0]);
        }
        if (string.equals(f)) {
            return this.C;
        }
        if (string.equals(e)) {
            return bvx_1.a();
        }
        if (string.equals(r)) {
            return this.w.r().contains(azu_0.j().k().a_());
        }
        if (string.equals(t)) {
            return this.w.q().contains(azu_0.j().k().a_());
        }
        if (string.equals(s)) {
            return this.a(this.w.r());
        }
        if (string.equals(u)) {
            return this.a(this.w.q());
        }
        if (string.equals(v)) {
            return this.w.d() == azu_0.j().k().bd() || this.w.e() == 3 && emp_0.b(azu_0.j().n().v(), emq_0.bf);
        }
        return null;
    }

    private ArrayList<bvq_2> a(TLongObjectHashMap<String> tLongObjectHashMap) {
        ArrayList<bvq_2> arrayList = new ArrayList<bvq_2>(tLongObjectHashMap.size());
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            arrayList.add(new bvq_2(tLongObjectIterator.key(), (String)tLongObjectIterator.value()));
        }
        return arrayList;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bvw_1)object);
    }
}

