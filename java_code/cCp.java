/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import org.apache.log4j.Logger;

public final class cCp
implements adx_1<cur_1> {
    private static final Logger a = Logger.getLogger(cCp.class);

    @Override
    public boolean a(cur_1 cur_12) {
        TLongObjectIterator tLongObjectIterator = cur_12.b().iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            long l = tLongObjectIterator.key();
            byte[] byArray = (byte[])tLongObjectIterator.value();
            a.trace((Object)("[INTERACTIVE_ELEMENT_SPAWN_MESSAGE] Element id=" + l + ", data.length=" + byArray.length + " byte(s)"));
            bFZ bFZ2 = bFZ.a(l, byArray);
            if (bFZ2 == null) continue;
            ccm_1.g().a(bFZ2);
        }
        return false;
    }

    @Override
    public int a() {
        return 13494;
    }
}

