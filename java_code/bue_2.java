/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bUe
 */
public abstract class bue_2<T extends etl_2>
implements ajh_1 {
    private static final String a = "name";
    private static final String b = "enabled";
    private static final String d = "kamasCost";
    private static final String e = "currentQuantity";
    private static final String f = "maxQuantity";
    private static final String g = "quantityText";
    protected static final String[] l = new String[]{"name", "kamasCost", "enabled", "quantityText"};
    protected fkx m;
    protected final T n;
    private boolean h;

    protected static String[] a(String ... stringArray) {
        String[] stringArray2 = new String[l.length + stringArray.length];
        System.arraycopy(l, 0, stringArray2, 0, l.length);
        System.arraycopy(stringArray, 0, stringArray2, l.length, stringArray.length);
        return stringArray2;
    }

    protected bue_2(T t) {
        this.n = t;
    }

    public abstract btu_2 g();

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.c();
        }
        if (string.equals(d)) {
            long l;
            Object object;
            Object object2;
            if (this.n instanceof etk_2) {
                object2 = (etk_2)this.n;
                object = eta_2.b((etk_2)object2);
                l = fkb_0.a((etw_2)object, bua_2.a.a());
            } else {
                l = ((etl_2)this.n).a();
            }
            object2 = bae.h().a(l);
            object = new ani_2();
            if (!this.a()) {
                ((ani_2)object).a(azf_2.h.w());
            }
            ((ani_2)object).a((CharSequence)object2);
            return ((ani_2)object).r();
        }
        if (string.equals(b)) {
            return this.j();
        }
        if (string.equals(e)) {
            return this.b();
        }
        if (string.equals(f)) {
            return ((etl_2)this.n).k();
        }
        if (string.equals(g)) {
            if (((etl_2)this.n).k() <= 0) {
                return null;
            }
            return this.b() + "/" + ((etl_2)this.n).k();
        }
        return null;
    }

    public abstract boolean a();

    public abstract int b();

    public T i() {
        return this.n;
    }

    public String c() {
        return btz_2.a(this.i());
    }

    public void a(fkx fkx2) {
        this.m = fkx2;
    }

    public void a(boolean bl) {
        this.h = bl;
        fis_1.a().a((ajf_1)this, b, f, g);
    }

    public boolean j() {
        return this.h;
    }

    public abstract bue_2 e();
}

