/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;

/*
 * Renamed from bsw
 */
public class bsw_2
implements ajh_1 {
    public static final String a = "sales";
    public static final String b = "hasSales";
    public static final String d = "hasPrevious";
    public static final String e = "hasNext";
    public static final String f = "pageNumberDesc";
    private final List<bsc_1> g;
    private int h;
    private final int i;

    public bsw_2(List<bsc_1> list) {
        this.g = Lists.reverse(list);
        this.i = this.g.size();
    }

    public void a() {
        if (this.h + 1 >= this.i) {
            return;
        }
        ++this.h;
        fis_1.a().a((ajf_1)this, e, d, f, a);
    }

    public void b() {
        if (this.h - 1 < 0) {
            return;
        }
        --this.h;
        fis_1.a().a((ajf_1)this, e, d, f, a);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.i > 0;
        }
        if (string.equals(e)) {
            return this.h + 1 < this.i;
        }
        if (string.equals(d)) {
            return this.h > 0;
        }
        if (string.equals(f)) {
            return bae.h().a("pageNumber", this.h + 1, this.i);
        }
        if (string.equals(a)) {
            return this.g != null && this.g.size() > this.h ? this.g.get(this.h) : null;
        }
        return null;
    }
}

