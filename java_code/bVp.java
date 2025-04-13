/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntByteIterator
 *  gnu.trove.map.hash.TIntByteHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntByteIterator;
import gnu.trove.map.hash.TIntByteHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class bVp
implements ajh_1 {
    private static final Logger k = Logger.getLogger(bVp.class);
    public static final String a = "nation";
    public static final String b = "totalCash";
    public static final String d = "populationSize";
    public static final String e = "governorName";
    public static final String f = "territoriesCount";
    public static final String g = "nationAlignments";
    public static final String h = "selectionIcon";
    public static final String i = "backgroundImage";
    public static final String[] j = new String[]{"nation", "totalCash", "populationSize", "governorName", "territoriesCount", "nationAlignments", "selectionIcon", "backgroundImage"};
    private final int l;
    private final int m;
    private final float n;
    private final String o;
    private final int p;
    private final TIntByteHashMap q;

    public bVp(int n, int n2, float f2, String string, int n3, TIntByteHashMap tIntByteHashMap) {
        this.l = n;
        this.m = n2;
        this.n = f2;
        this.o = string;
        this.p = n3;
        this.q = tIntByteHashMap;
    }

    @Override
    public String[] d() {
        return j;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return new bVn(this.l);
        }
        if (string.equals(b)) {
            return bae.h().a("kama.shortGain", this.m);
        }
        if (string.equals(d)) {
            return (int)(this.n * 100.0f) + " %";
        }
        if (string.equals(e)) {
            return this.o == null || this.o.length() == 0 ? bae.h().a("nation.noGovernorDesc", new Object[0]) : this.o;
        }
        if (string.equals(f)) {
            return this.p;
        }
        if (string.equals(g)) {
            ani_2 ani_22 = new ani_2();
            TIntByteIterator tIntByteIterator = this.q.iterator();
            while (tIntByteIterator.hasNext()) {
                tIntByteIterator.advance();
                ani_22.a((CharSequence)bae.h().a(39, (long)tIntByteIterator.key(), new Object[0]));
                ani_22.a((CharSequence)" - ");
                ani_22.a((CharSequence)bae.h().a("nation.alignmentName" + fbl_0.a(tIntByteIterator.value()).name(), new Object[0]));
                if (!tIntByteIterator.hasNext()) continue;
                ani_22.m();
            }
            return ani_22.r();
        }
        if (string.equals(h)) {
            return azs_0.a().n(this.l);
        }
        if (string.equals(i)) {
            return azs_0.a().w(bka_2.b.a());
        }
        return null;
    }

    public int a() {
        return this.l;
    }
}

