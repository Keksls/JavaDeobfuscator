/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bik
 */
public abstract class bik_2
extends bim_2 {
    public static final String a = "goals";
    public static final String b = "additionalInfos";
    public static final String d = "rewards";
    protected final int e;
    protected final ArrayList<bil_2> f = new ArrayList();

    public bik_2(int n) {
        this.e = n;
        this.f.add(new bib_1(n));
    }

    @Override
    public Object b(String string) {
        if (string.equals("isCompleted")) {
            return this.b();
        }
        if (string.equals("isFailed")) {
            return this.a();
        }
        if (string.equals(d)) {
            return this.c();
        }
        if (string.equals(a)) {
            Object object = "";
            for (bil_2 bil_22 : this.f) {
                object = (String)object + bil_22.a() + "\n";
            }
            return ((String)object).substring(0, ((String)object).length() - 1);
        }
        if (string.equals(b)) {
            if (!bae.h().a(142, (long)this.e)) {
                return null;
            }
            String string2 = bae.h().a(142, (long)this.e, new Object[0]);
            if (string2.isEmpty()) {
                return null;
            }
            return string2;
        }
        return super.b(string);
    }

    protected abstract boolean a();

    protected abstract boolean b();

    public abstract String c();

    @Override
    protected String e() {
        return null;
    }

    @Override
    protected String f() {
        return bae.h().a(140, (long)this.e, new Object[0]);
    }

    @Override
    protected String g() {
        eok_1 eok_12 = eop_1.a.b(this.e);
        int n = eok_12 != null ? eok_12.b() : -1;
        return azs_0.a().a("fightChallengeIconsPath", "defaultIconPath", n);
    }

    @Override
    public int h() {
        return 3;
    }

    @Override
    public int i() {
        return this.e;
    }

    @Override
    protected String j() {
        return null;
    }

    @Override
    protected ArrayList<bil_2> k() {
        return this.f;
    }

    @Override
    protected String l() {
        return null;
    }

    @Override
    protected String m() {
        return null;
    }

    public void n() {
        bib_1 bib_12 = (bib_1)this.f.get(0);
        bib_12.j();
        fis_1.a().a((ajf_1)this, "isCompleted", "isFailed");
    }
}

