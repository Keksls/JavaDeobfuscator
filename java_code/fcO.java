/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.nio.ByteBuffer;

public class fcO
extends fbu_0 {
    final /* synthetic */ fcm_0 a;

    public fcO(fcm_0 fcm_02) {
        this.a = fcm_02;
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.a.i.clear();
        int n2 = byteBuffer.getInt();
        while (n2-- > 0) {
            fcf fcf2 = fcf.c(byteBuffer);
            this.a.i.put(fcf2.a(), (Object)fcf2);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a.i.size());
        TLongObjectIterator tLongObjectIterator = this.a.i.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fcf fcf2 = (fcf)tLongObjectIterator.value();
            fcf2.a(byteBuffer, true);
        }
    }

    @Override
    public int bg_() {
        int n = 4;
        TLongObjectIterator tLongObjectIterator = this.a.i.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            n += ((fcf)tLongObjectIterator.value()).e();
        }
        return n;
    }
}

