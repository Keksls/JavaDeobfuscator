/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bTX
 */
public class btx_2
implements ajh_1,
bQA {
    private static final Logger q = Logger.getLogger(btx_2.class);
    public static final String a = "guildName";
    public static final String b = "buildingList";
    public static final String d = "evolutingBuildingList";
    public static final String e = "buildingsOpenned";
    public static final String f = "evolutingBuildingsOpenned";
    public static final String g = "havenWorldName";
    public static final String h = "numBuildings";
    public static final String i = "kamasTotalCost";
    public static final String j = "resourcesTotalCost";
    public static final String k = "nextBuildingText";
    public static final String l = "guildBlazon";
    public static final String m = "isSold";
    public static final String n = "guildId";
    public static final String o = "isGuildOnly";
    public static final String[] p = new String[]{"guildName", "buildingList", "evolutingBuildingList", "buildingsOpenned", "evolutingBuildingsOpenned", "havenWorldName", "numBuildings", "kamasTotalCost", "resourcesTotalCost", "nextBuildingText", "guildBlazon", "isSold", "guildId", "isGuildOnly"};
    private static final int r = 5;
    private long s;
    private long t;
    private final String u;
    private final long v;
    private boolean w;
    private boolean x;
    private final ArrayList<btv_2> y = new ArrayList();
    private final ArrayList<btv_2> z = new ArrayList();
    private long A;
    private boolean B;

    @Override
    public String[] d() {
        return p;
    }

    public btx_2(String string, long l, boolean bl, long l2, ArrayList<ese_1> arrayList) {
        this(string, l, bl, arrayList);
        this.A = l2;
    }

    public btx_2(String string, long l, boolean bl, ArrayList<ese_1> arrayList) {
        this.u = string;
        this.v = l;
        this.B = bl;
        this.a(arrayList);
        this.w = true;
        bqz_1.a.a(this);
    }

    private void a(ArrayList<ese_1> arrayList) {
        for (ese_1 ese_12 : arrayList) {
            btv_2 btv_22 = bua_2.a.b(ese_12.b());
            wx_0 wx_02 = btv_22.b();
            if (wx_02 == null || !wx_02.e()) {
                this.y.add(btv_22);
            } else {
                this.z.add(btv_22);
            }
            etw_2 etw_22 = ese_12.a();
            etu_1 etu_12 = new etu_1(etw_22.a());
            eti_2.a.b(etu_12);
            this.s += etu_12.a();
            this.t += etu_12.b();
        }
        this.z.sort(new bty_2(this));
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.u != null && !this.u.isEmpty() ? this.u : bae.h().a("noOwner", new Object[0]);
        }
        if (string.equals(n)) {
            return this.v;
        }
        if (string.equals(b)) {
            return this.y;
        }
        if (string.equals(e)) {
            return this.w && this.y.size() > 0;
        }
        if (string.equals(d)) {
            return this.z;
        }
        if (string.equals(f)) {
            return this.x && this.z.size() > 0;
        }
        if (string.equals(g)) {
            return bae.h().a(77, this.v, new Object[0]);
        }
        if (string.equals(h)) {
            return this.z.size() + this.y.size();
        }
        if (string.equals(i)) {
            return bae.h().a(this.s);
        }
        if (string.equals(j)) {
            return bae.h().a(this.t);
        }
        if (string.equals(k)) {
            if (this.z.isEmpty()) {
                return bae.h().a("none", new Object[0]);
            }
            btv_2 btv_22 = this.z.get(0);
            etw_2 etw_22 = btv_22.j().g();
            etw_2 etw_23 = eta_2.c(etw_22);
            if (etw_23 == null) {
                q.error((Object)("pas de batiment pour " + etw_22.a()));
                return null;
            }
            String string2 = bae.h().a(126, (long)etw_23.a(), new Object[0]);
            return bae.h().a("havenWorld.nextBuildingRemainingTime", string2, btv_22.a(false));
        }
        if (l.equals(string)) {
            if (this.A < 1L) {
                return String.format(azs_0.a().a("guildBlazonBackgroundPartPath", ""), 5);
            }
            return bxp_1.a().a(new bxo_1(new eqd_2(this.A)));
        }
        if (m.equals(string)) {
            return this.u != null && !this.u.isEmpty();
        }
        if (o.equals(string)) {
            return this.B;
        }
        return null;
    }

    public boolean a() {
        return this.w;
    }

    public boolean b() {
        return this.x;
    }

    public void a(boolean bl) {
        this.w = bl;
        fis_1.a().a((ajf_1)this, e);
    }

    public void b(boolean bl) {
        this.x = bl;
        fis_1.a().a((ajf_1)this, f);
    }

    @Override
    public void c() {
        fis_1.a().a((ajf_1)this, k);
    }

    public void e() {
        this.B = !this.B;
        fis_1.a().a((ajf_1)this, o);
    }
}

