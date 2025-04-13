/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntShortIterator
 *  gnu.trove.map.hash.TIntShortHashMap
 */
import gnu.trove.iterator.TIntShortIterator;
import gnu.trove.map.hash.TIntShortHashMap;

/*
 * Renamed from clL
 */
public final class cll_1
extends Pw {
    private byte a;
    private long b;
    private TIntShortHashMap c;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a((short)this.c.size());
        TIntShortIterator tIntShortIterator = this.c.iterator();
        while (tIntShortIterator.hasNext()) {
            tIntShortIterator.advance();
            abx_22.a(tIntShortIterator.key());
            abx_22.a(tIntShortIterator.value());
        }
        return this.a((byte)3, abx_22.c());
    }

    public void a(long l) {
        this.b = l;
    }

    public void a(byte by) {
        this.a = by;
    }

    public void a(TIntShortHashMap tIntShortHashMap) {
        this.c = tIntShortHashMap;
    }

    @Override
    public int a() {
        return 12940;
    }

    @Override
    public String toString() {
        return "LevelUpNewAptitudeRequestMessage{m_aptitudeModifications=" + this.c + "}";
    }
}

