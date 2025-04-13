/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bHI
 */
public class bhi_0
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "iconUrl";
    public static final String d = "itemType";
    public static final String e = "searchSubCategories";
    public static final String f = "this";
    public static final String g = "enabled";
    protected bHH h;
    protected final bhg_0 i;
    private final ArrayList<bHH> k;
    public final String[] j = new String[]{"name", "iconUrl", "itemType", "searchSubCategories", "this"};

    public bhi_0(bhg_0 bhg_02, bhg_0 bhg_03) {
        this.i = bhg_03;
        this.k = this.a(bhg_02);
        this.h = new bHH(bhg_02);
        if (this.h == null) {
            this.h = new bHH(null);
        }
    }

    @Override
    public String[] d() {
        return this.j;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            bhg_0 bhg_02 = this.h.a();
            return bhg_02 == null ? bae.h().a("all", new Object[0]) : bhg_02.a();
        }
        if (string.equals(b)) {
            bhg_0 bhg_03 = this.h.a();
            String string2 = azs_0.a().a(bhg_03 == null ? (short)-1 : (short)bhg_03.d());
            if (string2 == null) {
                string2 = azs_0.a().a((short)-1);
            }
            return string2;
        }
        if (string.equals(e)) {
            return this.k;
        }
        if (string.equals(f)) {
            return this;
        }
        if (string.equals(g)) {
            return true;
        }
        if (string.equals(d)) {
            return this.h;
        }
        return null;
    }

    private ArrayList<bHH> a(bhg_0 bhg_02) {
        abc_2<Object> abc_22 = new abc_2();
        if (this.i == null) {
            for (Object object : bHJ.a().d()) {
                abc_22.a(object);
            }
        } else {
            abc_22 = this.i.c();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bHH(null));
        for (bhg_0 bhg_03 : abc_22) {
            if (!bhg_03.k()) continue;
            arrayList.add(new bHH(bhg_03));
        }
        return arrayList;
    }

    public bhg_0 a() {
        return this.h.a();
    }

    public boolean equals(Object object) {
        if (!(object instanceof bhi_0)) {
            return false;
        }
        return this.a() == ((bhi_0)object).a();
    }
}

