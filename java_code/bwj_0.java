/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bWJ
 */
public class bwj_0
implements ajh_1 {
    private static final Logger m = Logger.getLogger(bwj_0.class);
    public static final String a = "iconUrl";
    public static final String b = "name";
    public static final String d = "community";
    public static final String e = "statut";
    public static final String f = "isSingleAccount";
    public static final String g = "populationLevel";
    public static final String h = "version";
    public static final String i = "communities";
    public static final String j = "forceAccountEnabled";
    public static final String k = "illustration";
    public static final int l = 0;
    private final eru_2 n;
    private ery_2 o;
    private final String p;

    public bwj_0(eru_2 eru_22, ery_2 ery_22) {
        this.n = eru_22;
        this.o = ery_22;
        this.p = this.f();
    }

    @Override
    @Nullable
    public String[] d() {
        return null;
    }

    @Override
    @Nullable
    public Object b(String string) {
        xz_0 xz_02 = this.n.c();
        if (string.equals(b)) {
            String string2 = String.format("%s%s", "worldName.", this.n.b().toLowerCase());
            if (bae.h().d(string2)) {
                return bae.h().a(string2, new Object[0]);
            }
            return this.n.b();
        }
        if (string.equals(j)) {
            Optional<emn_0> optional = bah_0.e();
            emS emS2 = emT.a(optional, this.o.b());
            return emp_0.b(emS2.b(), emq_0.aY);
        }
        if (string.equals(a)) {
            if (xz_02 == null) {
                return null;
            }
            return bae.a(xz_02);
        }
        if (string.equals(d)) {
            if (xz_02 == null) {
                return null;
            }
            return bae.h().a(String.format("%s%s", "worldCommunity.", xz_02.b()), new Object[0]);
        }
        if (string.equals(h)) {
            byte[] byArray = this.o.c();
            if (ArrayUtils.isEmpty((byte[])byArray)) {
                return null;
            }
            return epj.c(byArray);
        }
        if (string.equals(i)) {
            ImmutableList<xz_0> immutableList = erz_2.a(this.o);
            ArrayList<String> arrayList = new ArrayList<String>();
            for (xz_0 xz_03 : immutableList) {
                arrayList.add(bae.a(xz_03));
            }
            return arrayList;
        }
        if (string.equals(e)) {
            azj_2 azj_22;
            String string3;
            if (this.o == null) {
                string3 = bae.h().a("disconnected", new Object[0]);
                azj_22 = azf_2.o;
            } else if (this.o.e()) {
                string3 = bae.h().a("maintenance", new Object[0]);
                azj_22 = new fyr_0(elw_1.aA);
            } else if (this.e()) {
                string3 = bae.h().a("error.connection.closedBeta", new Object[0]);
                azj_22 = new fyr_0(elw_1.aA);
            } else if (!xi_0.a(this.o.c())) {
                string3 = bae.h().a("badVersion", new Object[0]);
                azj_22 = new fyr_0(elw_1.aB);
            } else {
                string3 = bae.h().a("online", new Object[0]);
                azj_22 = new fyr_0(elw_1.az);
            }
            ani_2 ani_22 = new ani_2();
            ani_22.i().a(azj_22);
            ani_22.a((CharSequence)string3);
            return ani_22.r();
        }
        if (string.equals(f)) {
            return this.a();
        }
        if (string.equals(g)) {
            return bae.h().a("population." + this.n.g().b(), new Object[0]);
        }
        if (string.equals(k)) {
            return this.p;
        }
        return null;
    }

    public boolean a() {
        return this.n.f();
    }

    private boolean e() {
        if (!this.o.d().d(ens_2.r)) {
            return false;
        }
        String string = bah_0.f().a(emt_0.h.b(), "0");
        int n = epj.l;
        return Integer.valueOf(string) != n;
    }

    public eru_2 b() {
        return this.n;
    }

    public ery_2 c() {
        return this.o;
    }

    public void a(ery_2 ery_22) {
        this.o = ery_22;
        fis_1.a().a((ajf_1)this, e);
    }

    private String f() {
        try {
            String string = azs_0.a().a("serverIllustrationPath");
            String string2 = String.format(string, this.o.b());
            if (gi_0.d(string2)) {
                return string2;
            }
            return String.format(string, 0);
        }
        catch (Exception exception) {
            m.error((Object)"Error loading server illustration", (Throwable)exception);
            return null;
        }
    }
}

