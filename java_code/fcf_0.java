/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import java.nio.ByteBuffer;

/*
 * Renamed from fcF
 */
public class fcf_0
extends fbu_0 {
    private byte[] d = null;
    static final /* synthetic */ boolean a;
    final /* synthetic */ fce_0 c;

    public fcf_0(fce_0 fce_02) {
        this.c = fce_02;
    }

    void c() {
        this.d = null;
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        int n2;
        int n3;
        this.c.b();
        int n4 = byteBuffer.getShort();
        TIntArrayList tIntArrayList = new TIntArrayList();
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = byteBuffer.getInt();
            int n5 = byteBuffer.getInt();
            int[] nArray = new int[n5];
            for (int k = 0; k < n5; ++k) {
                nArray[k] = byteBuffer.getInt();
            }
            abd_2 abd_22 = (abd_2)this.c.c.get(n2);
            if (abd_22 != null && this.c.a(nArray, abd_22)) continue;
            this.c.c.remove(n2);
            this.c.e(n2, nArray);
            if (tIntArrayList.contains(n2)) continue;
            tIntArrayList.add(n2);
        }
        this.c.c();
        n2 = tIntArrayList.size();
        for (n3 = 0; n3 < n2; ++n3) {
            this.c.b(tIntArrayList.getQuick(n3));
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        if (this.d != null) {
            if (!a && byteBuffer.remaining() < this.d.length) {
                throw new AssertionError((Object)("Probl\u00e8me \u00e0 la s\u00e9rialisation : on veut mettre des data s\u00e9rialis\u00e9es d'une taille de " + this.d.length + " dans un buffer ou il ne reste que " + byteBuffer.remaining() + " octets"));
            }
            byteBuffer.put(this.d);
            return;
        }
        this.d = new byte[this.bg_()];
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(this.d);
        byteBuffer2.putShort((short)this.c.c.size());
        TIntObjectIterator tIntObjectIterator = this.c.c.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            byteBuffer2.putInt(tIntObjectIterator.key());
            abd_2 abd_22 = (abd_2)tIntObjectIterator.value();
            int n = abd_22.a();
            byteBuffer2.putInt(n);
            for (int k = 0; k < n; ++k) {
                byteBuffer2.putInt(abd_22.c(k));
            }
        }
        byteBuffer2.flip();
        byteBuffer.put(byteBuffer2);
    }

    @Override
    public int bg_() {
        if (this.d != null) {
            return this.d.length;
        }
        int n = 2 + this.c.c.size() * 8;
        TIntObjectIterator tIntObjectIterator = this.c.c.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            abd_2 abd_22 = (abd_2)tIntObjectIterator.value();
            n += 4 * abd_22.a();
        }
        return n;
    }

    static {
        a = !fce_0.class.desiredAssertionStatus();
    }
}

