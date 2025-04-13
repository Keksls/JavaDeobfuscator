/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from byj
 */
public class byj_2
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "position";
    public static final String d = "authorisations";
    public static final String e = "canBeEdited";
    public static final String f = "canBeDeleted";
    public static final String g = "id";
    public static final String h = "modulationColor";
    public static final String[] i = new String[]{"name", "position", "authorisations", "canBeEdited", "canBeDeleted", "id", "modulationColor"};
    private final bxl_1[] j;
    private final ern_1 k;

    public byj_2(ern_1 ern_12) {
        this.k = ern_12;
        eQt[] eQtArray = eQt.values();
        this.j = new bxl_1[eQtArray.length];
        for (int k = 0; k < this.j.length; ++k) {
            this.j[k] = new bxl_1(eQtArray[k]);
        }
        for (bxl_1 bxl_12 : this.j) {
            boolean bl = this.k.a(bxl_12.b());
            bxl_12.a(bl);
        }
    }

    @Override
    public String[] d() {
        return i;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e();
        }
        if (string.equals(b)) {
            return ahw_2.b(this.k.d() + 1);
        }
        if (string.equals(e)) {
            return this.c();
        }
        if (string.equals(f)) {
            return this.b();
        }
        if (string.equals(g)) {
            return this.k.a();
        }
        if (string.equals(d)) {
            return this.j;
        }
        if (string.equals(h)) {
            return this.a();
        }
        return null;
    }

    public azj_2 a() {
        byj_2 byj_22 = (byj_2)fis_1.a().e("overGuildRank");
        if (byj_22 != null && byj_22.h() == this.h()) {
            return azf_2.c;
        }
        byj_2 byj_23 = (byj_2)fis_1.a().e("draggedGuildRank");
        if (byj_23 != null && byj_23.h() == this.h()) {
            return azf_2.d;
        }
        byj_2 byj_24 = (byj_2)fis_1.a().e("selectedGuildRank");
        if (byj_24 != null && byj_24.h() == this.h()) {
            return azf_2.e;
        }
        return new azf_2(1.0f, 1.0f, 1.0f, 0.7f);
    }

    public boolean b() {
        if (!this.c()) {
            return false;
        }
        long l = byp_2.a().v();
        long l2 = byp_2.a().w();
        return this.k.a() != l && this.k.a() != l2;
    }

    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        bos_2 bos_22 = bmr_12.eV();
        erl_1 erl_12 = bos_22.a(bmr_12.a_());
        if (erl_12 == null) {
            return false;
        }
        ern_1 ern_12 = bos_22.c(erl_12.d());
        if (ern_12 == null) {
            return false;
        }
        return ern_12.a(eQt.d, this.i().d());
    }

    public String e() {
        return this.k.b();
    }

    public long f() {
        ArrayList<eQt> arrayList = new ArrayList<eQt>();
        for (bxl_1 bxl_12 : this.j) {
            if (!bxl_12.a()) continue;
            arrayList.add(bxl_12.b());
        }
        return eQt.a(arrayList);
    }

    public long g() {
        return this.k.c();
    }

    public long h() {
        return this.k.a();
    }

    public ern_1 i() {
        return this.k;
    }

    public byn_2 j() {
        return new byn_2(this.k);
    }

    public boolean equals(Object object) {
        if (!(object instanceof byj_2)) {
            return false;
        }
        byj_2 byj_22 = (byj_2)object;
        return byj_22.f() == this.f() && byj_22.h() == this.h() && byj_22.e().equals(this.e());
    }
}

