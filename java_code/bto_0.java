/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TByteShortHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.procedure.TShortObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TByteShortHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.procedure.TShortObjectProcedure;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bto
 */
class bto_0
implements ajh_1 {
    static final Logger d = Logger.getLogger(bto_0.class);
    public static final String a = "name";
    public static final String b = "isActivated";
    private final String[] e = new String[]{"name", "isActivated"};
    final short f;
    private final String g;
    private final TShortObjectHashMap<bts_0> h;
    final TByteShortHashMap i = new TByteShortHashMap();

    bto_0(short s2, String string, TShortObjectHashMap<bts_0> tShortObjectHashMap) {
        this.f = s2;
        this.g = string;
        this.h = tShortObjectHashMap;
        this.h.forEachEntry((TShortObjectProcedure)new btp_0(this));
    }

    @Override
    public String[] d() {
        return this.e;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a("tooltipTutorial." + this.g, new Object[0]);
        }
        if (string.equals(b)) {
            return this.c();
        }
        return null;
    }

    public short a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    public boolean c() {
        TShortObjectIterator tShortObjectIterator = this.h.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            if (!((bts_0)tShortObjectIterator.value()).c()) continue;
            return true;
        }
        return false;
    }

    public void a(boolean bl) {
        btn_0 btn_02 = btn_0.a();
        this.h.forEachValue((TObjectProcedure)new btq_0(this, bl, btn_02));
    }

    TShortObjectIterator<bts_0> e() {
        return this.h.iterator();
    }

    public bts_0 a(short s2) {
        return (bts_0)this.h.get(s2);
    }

    public bts_0 a(byte by) {
        return (bts_0)this.h.get(this.i.get(by));
    }

    public String toString() {
        return "Tutorial{m_id=" + this.f + ", m_name='" + this.g + "', m_partsCount=" + this.h.size() + "}";
    }
}

