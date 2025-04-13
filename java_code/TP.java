/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TP<ContentType extends ts_0> {
    public long g();

    public String h();

    public void a(Us var1);

    public void a(long var1, ContentType var3);

    public ContentType a(long var1);

    public TLongObjectIterator<ContentType> c();

    default public Map<Long, ContentType> i() {
        HashMap<Long, ts_0> hashMap = new HashMap<Long, ts_0>(this.a());
        TLongObjectIterator<ContentType> tLongObjectIterator = this.c();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            hashMap.put(tLongObjectIterator.key(), (ts_0)tLongObjectIterator.value());
        }
        return hashMap;
    }

    default public List<ContentType> j() {
        ArrayList<ts_0> arrayList = new ArrayList<ts_0>();
        TLongObjectIterator<ContentType> tLongObjectIterator = this.c();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            arrayList.add((ts_0)tLongObjectIterator.value());
        }
        arrayList.sort(Comparator.comparingLong(ts_0::a));
        return arrayList;
    }

    public boolean e();

    public void a(boolean var1);

    public void c(long var1);

    public void d();

    public int a();

    public boolean b();
}

