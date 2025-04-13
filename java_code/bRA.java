/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;

public class bRA
extends fjJ
implements ajh_1 {
    private static final bRA f = new bRA();
    public static final String a = "protectorSatisfactionColor";
    public static final String b = "protectorSatisfaction";
    public static final String d = "protectorNationId";
    public static final String e = "protectorNationIcon";
    private static final String[] g = new String[]{"protectorSatisfactionColor", "protectorSatisfactionColor", "protectorNationId", "protectorNationIcon"};
    private cct_1 h;
    private int i = -1;

    @Override
    public String[] d() {
        return g;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.k();
        }
        if (string.equals(b)) {
            return this.j();
        }
        if (string.equals(d)) {
            return this.b();
        }
        if (string.equals(e)) {
            return this.c();
        }
        return null;
    }

    public int a() {
        int n = 0;
        for (bRz bRz2 : bRC.c().a()) {
            if (!bRz2.c()) continue;
            ++n;
        }
        for (bRz bRz2 : bRD.c().a()) {
            if (!bRz2.c()) continue;
            ++n;
        }
        return n;
    }

    private ArrayList<Boolean> j() {
        ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
        for (bRz bRz2 : bRC.c().a()) {
            if (!bRz2.c()) continue;
            arrayList.add(bRz2.e());
        }
        for (bRz bRz2 : bRD.c().a()) {
            if (!bRz2.c()) continue;
            arrayList.add(bRz2.e());
        }
        arrayList.sort(Comparator.reverseOrder());
        return arrayList;
    }

    private azj_2 k() {
        bMn bMn2 = bwy_2.h().j();
        if (bMn2 == null) {
            return null;
        }
        fgk_0 fgk_02 = bMn2.w();
        if (fgk_02 == null) {
            return null;
        }
        switch (fgk_02) {
            case d: {
                return azf_2.j;
            }
            case c: {
                return azf_2.e;
            }
            case b: {
                return azf_2.h;
            }
        }
        return null;
    }

    public int b() {
        bMn bMn2 = bwy_2.h().j();
        if (bMn2 == null) {
            return 0;
        }
        return bMn2.F();
    }

    public String c() {
        return azs_0.a().m(this.b());
    }

    public static bRA e() {
        return f;
    }

    public void f() {
        fis_1.a().a((ajf_1)this, a);
    }

    public void g() {
        fis_1.a().a((ajf_1)this, a, b);
    }

    public void a(int n) {
        this.i = n;
    }

    public void a(cct_1 cct_12) {
        this.h = cct_12;
    }

    public ccu_1 h() {
        return this.h.b(this.i);
    }

    public float i() {
        return (bRC.c().b() + bRD.c().b()) / 2.0f;
    }
}

