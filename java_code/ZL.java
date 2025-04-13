/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class ZL {
    private final int a;
    private ZT[] b;
    private final ArrayList<aaf> c = new ArrayList();

    public ZL(int n) {
        this.a = n;
    }

    public final int a() {
        return this.a;
    }

    public final void a(ByteBuffer byteBuffer, ZV zV) {
        int n;
        this.c.clear();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b = new ZT[n2];
        for (n = 0; n < n2; ++n) {
            ZT zT;
            int n3 = byteBuffer.getShort() & 0xFFFF;
            this.b[n] = zT = zV.a(n3, byteBuffer);
            if (zT.b() != ZU.c) continue;
            this.c.add((aaf)zT);
        }
        this.c.trimToSize();
        for (n = 0; n < this.b.length; ++n) {
            ZT zT = this.b[n];
            int n4 = zT.c();
            if (n4 == 0) continue;
            ZY[] zYArray = new ZY[n4];
            for (int k = 0; k < zYArray.length; ++k) {
                int n5 = byteBuffer.getShort() & 0xFFFF;
                zYArray[k] = (ZY)this.b[n5];
            }
            zT.a(zYArray);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        for (int k = 0; k < n; ++k) {
            int n6 = byteBuffer.getShort() & 0xFFFF;
            int n7 = byteBuffer.getShort() & 0xFFFF;
            aaf aaf2 = (aaf)this.b[n6];
            aaf2.a((ZY)this.b[n7]);
        }
    }

    public final void a(int n) {
        int n2;
        for (n2 = 0; n2 < this.b.length; ++n2) {
            this.b[n2].c(n);
        }
        for (n2 = 0; n2 < this.c.size(); ++n2) {
            this.c.get(n2).e();
        }
    }

    ArrayList<aaf> b() {
        return this.c;
    }
}

