/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class cAk
extends ps_0 {
    private final List<bsa> a = new ArrayList<bsa>();
    private int b;
    private int c;
    private int d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        for (int k = byteBuffer.getInt(); k > 0; --k) {
            short s2 = byteBuffer.getShort();
            byte[] byArray2 = new byte[s2];
            byteBuffer.get(byArray2);
            String string = Cz.a(byArray2);
            int n = byteBuffer.getInt();
            xz_0 xz_02 = xz_0.a(n);
            List<Ow> list = Ow.c(byteBuffer.get());
            short s3 = byteBuffer.getShort();
            short s4 = byteBuffer.getShort();
            byte[] byArray3 = new byte[s4];
            byteBuffer.get(byArray3);
            dw_1 dw_12 = dw_1.a(byArray3);
            boolean bl = byteBuffer.get() == 1;
            boolean bl2 = byteBuffer.get() == 1;
            this.a.add(new bsa(string, xz_02, list, s3, dw_12, bl, bl2));
        }
        return true;
    }

    public List<bsa> b() {
        return this.a;
    }

    @Override
    public int a() {
        return 15710;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.b;
    }
}

