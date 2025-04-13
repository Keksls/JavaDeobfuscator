/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bRd
 */
public class brd_2
implements ajh_1 {
    public static final String a = "currentPage";
    public static final String b = "tutorials";
    public static final String d = "hasSearch";
    public static final String e = "hasPreviousPage";
    public static final String f = "hasNextPage";
    public static final String g = "numPages";
    public static final String h = "searchResult";
    public static final String i = "searchActive";
    final TIntObjectHashMap<brj_2> j = new TIntObjectHashMap();
    private final ArrayList<brg_2> k = new ArrayList();
    private String l;
    private int m = 0;

    public brd_2() {
        brh_2.a.a(new bre_2(this));
        this.c();
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.j.get(this.m);
        }
        if (string.equals(b)) {
            if (this.k.isEmpty()) {
                return null;
            }
            return this.k;
        }
        if (string.equals(d)) {
            return this.e();
        }
        if (string.equals(e)) {
            return this.m > 0;
        }
        if (string.equals(f)) {
            return this.m < this.j.size() - 1;
        }
        if (string.equals(h)) {
            return this.k.size() > 0 ? bae.h().a("resultNumber", this.k.size()) : bae.h().a("marketBoard.noResults", new Object[0]);
        }
        if (string.equals(i)) {
            return this.l != null && this.l.isEmpty();
        }
        if (string.equals(g)) {
            if (this.e()) {
                return null;
            }
            return this.m + 1 + "/" + this.j.size();
        }
        return null;
    }

    public void a() {
        if (this.m == 0) {
            return;
        }
        --this.m;
        this.c();
        fis_1.a().a((ajf_1)this, f, e, g);
    }

    public void b() {
        if (this.m == this.j.size() - 1) {
            return;
        }
        ++this.m;
        this.c();
        fis_1.a().a((ajf_1)this, f, e, g);
    }

    public void a(String string) {
        this.l = string != null && string.length() > 0 ? string : null;
        this.c();
        fis_1.a().a((ajf_1)this, d, f, e, g, h);
    }

    private void c() {
        this.k.clear();
        if (this.e()) {
            TIntObjectIterator tIntObjectIterator = this.j.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                for (brg_2 brg_22 : ((brj_2)tIntObjectIterator.value()).b()) {
                    if (!brg_22.a().toLowerCase().contains(this.l.toLowerCase())) continue;
                    this.k.add(brg_22);
                }
            }
        } else {
            for (brg_2 brg_23 : ((brj_2)this.j.get(this.m)).b()) {
                this.k.add(brg_23);
            }
        }
        fis_1.a().a((ajf_1)this, b);
    }

    private boolean e() {
        return this.l != null;
    }
}

