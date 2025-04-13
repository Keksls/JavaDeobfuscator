/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.sql.Timestamp;
import java.util.ArrayList;

class emz
extends fo_1 {
    final /* synthetic */ emy d;

    emz(emy emy2) {
        this.d = emy2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        int n;
        byteBuffer.putLong(this.d.b);
        byteBuffer.putLong(this.d.d);
        byteBuffer.putInt(this.d.k);
        byteBuffer.putInt(this.d.l);
        byteBuffer.put(this.d.y);
        byteBuffer.putLong(this.d.n);
        int[] objectArray = this.d.w;
        int byArray = objectArray.length;
        for (n = 0; n < byArray; ++n) {
            int emf_02 = objectArray[n];
            byteBuffer.putInt(emf_02);
        }
        byte[] byArray2 = Cz.a(this.d.h);
        byteBuffer.put((byte)byArray2.length);
        byteBuffer.put(byArray2);
        byte[] byArray3 = Cz.a(this.d.i);
        byteBuffer.put((byte)byArray3.length);
        byteBuffer.put(byArray3);
        byteBuffer.putInt(this.d.j.a());
        byteBuffer.putInt(this.d.s.size());
        for (n = 0; n < this.d.s.size(); ++n) {
            emf_0 emf_02 = this.d.s.get(n);
            byteBuffer.putInt(emf_02.a());
            byteBuffer.putLong(emf_02.b().getTime());
            byteBuffer.putLong(emf_02.c().getTime());
        }
        byteBuffer.putLong(this.d.q[1]);
        this.d.v.a(byteBuffer);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.b = byteBuffer.getLong();
        this.d.d = byteBuffer.getLong();
        this.d.k = byteBuffer.getInt();
        this.d.l = byteBuffer.getInt();
        this.d.y = byteBuffer.get();
        this.d.n = byteBuffer.getLong();
        for (int k = 0; k < emp_0.a(); ++k) {
            this.d.w[k] = byteBuffer.getInt();
        }
        byte[] byArray = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray);
        this.d.h = Cz.a(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.d.i = Cz.a(byArray2);
        this.d.j = xz_0.a(byteBuffer.getInt());
        this.d.s = new ArrayList<emf_0>();
        int n2 = byteBuffer.getInt();
        for (int k = 0; k < n2; ++k) {
            int n3 = byteBuffer.getInt();
            Timestamp timestamp = new Timestamp(byteBuffer.getLong());
            Timestamp timestamp2 = new Timestamp(byteBuffer.getLong());
            emf_0 emf_02 = new emf_0(n3, timestamp, timestamp2);
            this.d.s.add(emf_02);
        }
        this.d.q[1] = byteBuffer.getLong();
        this.d.v.b(byteBuffer);
    }

    @Override
    public int j() {
        int n = 0;
        n += 33 + 4 * emp_0.a();
        byte[] byArray = Cz.a(this.d.h);
        n += 1 + byArray.length;
        byte[] byArray2 = Cz.a(this.d.i);
        n += 1 + byArray2.length;
        n += 4;
        n += 4;
        n += this.d.s.size() * 20;
        n += 8;
        return n += this.d.v.a();
    }
}

