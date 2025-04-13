/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortIterator
 */
import gnu.trove.iterator.TShortIterator;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from bHM
 */
public class bhm_0
extends exs_2
implements ajh_1 {
    public static final String e = "browsingBagInventory";
    public static final String k = "bagInventory";
    public static final String l = "bagType";
    public static final String m = "locked";
    public static final String n = "iconUrl";
    public static final String o = "fleaTitle";
    public static final String p = "fleaMarketRegistered";
    public static final String q = "currentSize";
    public static final String[] r = new String[]{"browsingBagInventory", "bagInventory", "bagType", "locked", "iconUrl", "fleaTitle", "fleaMarketRegistered", "currentSize"};
    private String w = "";
    private boolean x;
    private int y;
    private String z;

    public bhm_0(long l, eyk_1 eyk_12, short s2, byte by) {
        super(l, bhp_0.a(), eyk_12, s2, by);
    }

    @Override
    public String[] d() {
        return r;
    }

    @Override
    public Object b(String string) {
        if (string.equals(e)) {
            exx_2[] exx_2Array = new exx_2[this.k()];
            int n = 0;
            Iterator iterator = this.iterator();
            while (iterator.hasNext()) {
                exx_2 exx_22;
                exx_2Array[n] = exx_22 = (exx_2)iterator.next();
                ++n;
            }
            return exx_2Array;
        }
        if (string.equals(k)) {
            ArrayList<exx_2> arrayList = new ArrayList<exx_2>();
            Iterator iterator = this.a(false);
            while (iterator.hasNext()) {
                arrayList.add((exx_2)iterator.next());
            }
            return arrayList;
        }
        if (string.equals(l)) {
            Object object = "";
            eyk_1 eyk_12 = this.t();
            if (eyk_12 != null) {
                TShortIterator tShortIterator = eyk_12.a();
                while (tShortIterator.hasNext()) {
                    short s2 = tShortIterator.next();
                    if (bae.h().a(14, (long)s2)) {
                        object = (String)object + bae.h().a(14, (long)s2, new Object[0]);
                    }
                    if (!tShortIterator.hasNext()) continue;
                    object = (String)object + ", ";
                }
                if (((String)object).length() > 0) {
                    object = bae.h().a("market.authorizedItemTypes", object);
                }
            }
            return ((String)object).length() == 0 ? null : object;
        }
        if (string.equals(m)) {
            return this.n();
        }
        if (string.equals(n)) {
            return this.z;
        }
        if (string.equals(o)) {
            return this.w;
        }
        if (string.equals(p)) {
            return this.x;
        }
        if (string.equals(q)) {
            return this.y;
        }
        return null;
    }

    public void p() {
        fis_1.a().a((ajf_1)this, e, k, l, m, n, o, p);
    }

    public void a(String string) {
        this.w = string;
    }

    public void c(boolean bl) {
        this.x = bl;
        fis_1.a().a((ajf_1)this, p);
    }

    public void e(int n) {
        this.y = n;
    }

    public int q() {
        return this.y;
    }

    public void f(int n) {
        this.z = azs_0.a().d(n);
    }
}

