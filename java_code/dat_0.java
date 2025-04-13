/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteObjectIterator
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.iterator.TByteObjectIterator;
import gnu.trove.map.hash.TByteObjectHashMap;
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Renamed from daT
 */
public class dat_0
implements ajh_1,
amt_1,
cdn_0,
cdp_0 {
    private static final int m = 1000;
    public static final String a = "cache";
    public static final String b = "memoryCache";
    public static final String d = "criterions";
    public static final String e = "events";
    public static final String f = "refresh";
    public static final String g = "cacheSourcesTotalSize";
    public static final String h = "sourcesTotalSize";
    public static final String i = "stratas";
    public static final String j = "log";
    public final String[] k = new String[]{"cache", "memoryCache", "criterions", "events", "refresh", "cacheSourcesTotalSize", "sourcesTotalSize", "log", "stratas"};
    private final TByteObjectHashMap<daw_0> n = new TByteObjectHashMap();
    private final LinkedList<daS> o = new LinkedList();
    private final LinkedList<daR> p = new LinkedList();
    private final ArrayList<daP> q = new ArrayList();
    private final LinkedList<daS> r = new LinkedList();
    private final LinkedList<daR> s = new LinkedList();
    private final ArrayList<daP> t = new ArrayList();
    private final acy_2<daV> u = new acy_2();
    private boolean v;
    private boolean w = true;
    final /* synthetic */ dan_0 l;

    public dat_0(dan_0 dan_02) {
        this.l = dan_02;
        cdw_0.n().a(this);
        for (cdl_0 cdl_02 : cdl_0.values()) {
            this.n.put(cdl_02.a(), (Object)new daw_0(cdl_02));
        }
        amu_1.a(dat_0.class, this);
        cDL cDL2 = cdw_0.n().R();
        ArrayList<cDO> arrayList = cDL2.a();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            cDO cDO2 = arrayList.get(k);
            cDO2.a(this);
            this.u.a(cDO2.a(), new daV(dan_02, cDO2));
        }
    }

    public void a() {
        int n;
        cdw_0.n().b(this);
        amu_1.a(dat_0.class);
        cDL cDL2 = cdw_0.n().R();
        ArrayList<cDO> arrayList = cDL2.a();
        int n2 = arrayList.size();
        for (n = 0; n < n2; ++n) {
            arrayList.get(n).b(this);
        }
        n2 = this.u.d();
        for (n = 0; n < n2; ++n) {
            this.u.h(n).a();
        }
        this.u.c();
    }

    @Override
    public String[] d() {
        return this.k;
    }

    public void b() {
        this.r.addAll(this.o);
        this.s.addAll(this.p);
        this.t.addAll(this.q);
        this.v = true;
        fis_1.a().a((ajf_1)this, d, e, j);
    }

    public void c() {
        this.r.clear();
        this.s.clear();
        this.t.clear();
        this.v = false;
        fis_1.a().a((ajf_1)this, d, e, j);
    }

    public String a(boolean bl) {
        ani_2 ani_22 = new ani_2();
        LinkedList<daS> linkedList = this.v ? this.r : this.o;
        for (daS daS2 : linkedList) {
            Object object;
            byte by = daS2.b();
            if (by != -1) {
                object = cdl_0.a(by);
                if (object == null) {
                    dan_0.c.error((Object)"Game sound group inconnu !");
                    continue;
                }
                if (((daw_0)this.n.get((byte)object.a())).i) continue;
                ani_22.a((CharSequence)daS2.a()).a((CharSequence)" ");
                if (bl) {
                    ani_22.a();
                }
                ani_22.a((CharSequence)object.name());
                if (bl) {
                    ani_22.b();
                }
            } else {
                ani_22.a((CharSequence)daS2.a()).a((CharSequence)" ");
                if (bl) {
                    ani_22.a();
                }
                ani_22.a((CharSequence)"Null");
                if (bl) {
                    ani_22.b();
                }
            }
            object = daS2.c().startsWith("Adding") ? azf_2.k.w() : azf_2.h.w();
            ani_22.a((CharSequence)" : ");
            if (bl) {
                ani_22.i().a((String)object);
            }
            ani_22.a((CharSequence)daS2.c());
            if (bl) {
                ani_22.j();
            }
            ani_22.m();
        }
        return ani_22.r();
    }

    public String b(boolean bl) {
        ani_2 ani_22 = new ani_2();
        ArrayList<daP> arrayList = this.v ? this.t : this.q;
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            daP daP2 = arrayList.get(k);
            if (bl) {
                ani_22.a();
            }
            ani_22.a((CharSequence)daP2.a()).a((CharSequence)" = ");
            if (bl) {
                ani_22.b();
            }
            ani_22.a((CharSequence)daP2.b()).m();
        }
        return ani_22.r();
    }

    public String c(boolean bl) {
        ani_2 ani_22 = new ani_2();
        LinkedList<daR> linkedList = this.v ? this.s : this.p;
        int n = linkedList.size();
        for (int k = 0; k < n; ++k) {
            daR daR2 = linkedList.get(k);
            ani_22.a((CharSequence)daR2.a()).a((CharSequence)" ");
            if (bl) {
                ani_22.a();
            }
            ani_22.a((CharSequence)daR2.b()).a((CharSequence)" : ");
            if (bl) {
                ani_22.b();
            }
            ani_22.a((CharSequence)daR2.c()).m();
        }
        return ani_22.r();
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.n.values();
        }
        if (string.equals(j)) {
            return this.a(true);
        }
        if (string.equals(g)) {
            return amb_2.b.f();
        }
        if (string.equals(h)) {
            int n = 0;
            TByteObjectIterator tByteObjectIterator = this.n.iterator();
            while (tByteObjectIterator.hasNext()) {
                tByteObjectIterator.advance();
                n += ((daw_0)tByteObjectIterator.value()).b();
            }
            return n;
        }
        if (string.equals(b)) {
            long l = amb_2.b.g();
            if (l < 1024L) {
                return l + " o";
            }
            if (l < 0x100000L) {
                return String.format("%.2f ko", Float.valueOf((float)l / 1024.0f));
            }
            return String.format("%.2f Mo", Float.valueOf((float)l / 1024.0f / 1024.0f));
        }
        if (string.equals(d)) {
            return this.b(true);
        }
        if (string.equals(f)) {
            return this.w;
        }
        if (string.equals(e)) {
            return this.c(true);
        }
        if (string.equals(i)) {
            return this.u;
        }
        return null;
    }

    public boolean e() {
        return this.w;
    }

    public void d(boolean bl) {
        this.w = bl;
        fis_1.a().a((ajf_1)this, f);
    }

    @Override
    public void a(cDO cDO2) {
        daV daV2 = this.u.g(cDO2.a());
        if (daV2 != null) {
            daV2.b();
        }
    }

    @Override
    public void a(long l) {
        this.q.clear();
        this.q.add(new daP("Altitude", String.valueOf(ceq_1.a().h())));
        this.q.add(new daP("Num players", String.valueOf(ceq_1.a().g())));
        this.q.add(new daP("Season", String.valueOf((Object)ceq_1.a().b())));
        this.q.add(new daP("Temperature", String.valueOf(ceq_1.a().c() + "\u00b0w")));
        this.q.add(new daP("Time", String.valueOf(ceq_1.a().d() * 100.0f)));
        this.q.add(new daP("Wakfu score", String.valueOf(ceq_1.a().f() * 100.0f)));
        this.q.add(new daP("Type de zone", cdg_0.a((byte)ceq_1.a().e()).e()));
        fis_1.a().a((ajf_1)this, d);
    }

    @Override
    public void a(cer_0 cer_02) {
        if (this.p.size() == 50) {
            this.p.removeFirst();
        }
        this.p.add(new daR(this.f(), cer_02.e(), cer_02.f()));
        fis_1.a().a((ajf_1)this, e);
    }

    @Override
    public void a(abo_2<Byte, String> abo_22) {
        if (this.o.size() == 1000) {
            this.o.removeFirst();
        }
        this.o.addLast(new daS(this.f(), abo_22.a(), abo_22.b()));
        fis_1.a().a((ajf_1)this, j);
    }

    private String f() {
        wu_0 wu_02 = wc_0.p().a();
        StringBuilder stringBuilder = new StringBuilder();
        int n = wu_02.k();
        int n2 = wu_02.l();
        int n3 = wu_02.n();
        stringBuilder.append("[");
        stringBuilder.append(n < 10 ? "0" : "").append(n).append(":");
        stringBuilder.append(n2 < 10 ? "0" : "").append(n2).append(":");
        stringBuilder.append(n3 < 10 ? "0" : "").append(n3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

