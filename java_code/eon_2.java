/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eOn
 */
class eon_2
implements Iterable<eor_2> {
    private final short a;
    private int b;
    private final List<eor_2> c = new ArrayList<eor_2>();

    public short a() {
        return this.a;
    }

    public boolean a(short s2) {
        return this.a < s2;
    }

    public void a(eor_2 eor_22) {
        this.c.add(eor_22);
    }

    public void a(int n) {
        if (n <= this.b) {
            ++this.b;
        }
    }

    public void b(int n) {
        if (n < this.b) {
            --this.b;
        }
    }

    public int b() {
        return this.b;
    }

    @Override
    @NotNull
    public Iterator<eor_2> iterator() {
        return this.c.iterator();
    }

    public int c() {
        int n = 8;
        for (eor_2 eor_22 : this.c) {
            n += eor_22.c();
        }
        return n;
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putShort((short)this.c.size());
        for (eor_2 eor_22 : this.c) {
            eor_22.a(byteBuffer);
        }
    }

    public static eon_2 a(vz_0 vz_02, long l, ByteBuffer byteBuffer) {
        short s2 = byteBuffer.getShort();
        int n = byteBuffer.getInt();
        eon_2 eon_22 = new eon_2(s2, n);
        int n2 = byteBuffer.getShort();
        for (int k = 0; k < n2; ++k) {
            eor_2 eor_22 = eor_2.a(vz_02, l, byteBuffer);
            eon_22.a(eor_22);
        }
        return eon_22;
    }

    eon_2(short s2, int n) {
        this.a = s2;
        this.b = n;
    }
}

