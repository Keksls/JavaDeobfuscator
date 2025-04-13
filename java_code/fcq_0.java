/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fcq
 */
public class fcq_0
extends fco_0
implements fbh_0 {
    private static final Logger j = Logger.getLogger(fcq_0.class);
    private final int k;
    private final fcu_0 l;
    private final fcz_0 m;

    public fcq_0(fcu_0 fcu_02, int n, long l, String string, short s2, byte by, long l2, String string2, int n2, float f2, eb eb2, fcz_0 fcz_02) {
        super(l, string, s2, by, l2, string2, n2, f2, eb2);
        this.l = fcu_02;
        this.k = n;
        this.m = fcz_02;
    }

    public fcq_0(fcf fcf2, fcu_0 fcu_02, int n, fcz_0 fcz_02) {
        this(fcu_02, n, fcf2.a(), fcf2.f(), fcf2.g(), fcf2.h(), fcf2.i(), fcf2.j(), fcf2.l(), fcf2.m(), fcf2.k(), fcz_02);
    }

    public fcq_0(fcq_0 fcq_02, fcu_0 fcu_02, fcz_0 fcz_02) {
        super(fcq_02.a, fcq_02.b, fcq_02.c, fcq_02.d, fcq_02.e, fcq_02.f, fcq_02.h, fcq_02.i, fcq_02.g);
        this.k = fcq_02.k;
        this.l = fcu_02;
        this.m = fcz_02;
    }

    public void a(int n) {
        this.h = n;
    }

    public void a(float f2) {
        this.i = f2;
    }

    public fcu_0 b() {
        return this.l;
    }

    @Override
    public int c() {
        return this.k;
    }

    public fcz_0 d() {
        return this.m;
    }

    public String toString() {
        return "{Government " + this.a + " " + this.b + "}";
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.l.a());
        byteBuffer.putInt(this.k);
        byteBuffer.putLong(this.a);
        byte[] byArray = Cz.a(this.b);
        byteBuffer.putShort((short)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.putShort(this.c);
        byteBuffer.put(this.d);
        byteBuffer.putLong(this.e);
        byte[] byArray2 = Cz.a(this.j());
        byteBuffer.putShort((short)byArray2.length);
        byteBuffer.put(byArray2);
        byteBuffer.putInt(this.h);
        byteBuffer.putFloat(this.i);
        byte[] byArray3 = this.g.toByteArray();
        byteBuffer.putShort((short)byArray3.length);
        byteBuffer.put(byArray3);
        wt_2 wt_22 = new wt_2();
        this.m.a(wt_22);
        wt_22.a(byteBuffer);
    }

    public static fcq_0 b(ByteBuffer byteBuffer) {
        fcu_0 fcu_02 = fcu_0.a(byteBuffer.getLong());
        int n = byteBuffer.getInt();
        long l = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray);
        short s2 = byteBuffer.getShort();
        byte by = byteBuffer.get();
        long l2 = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray2);
        int n2 = byteBuffer.getInt();
        float f2 = byteBuffer.getFloat();
        byte[] byArray3 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray3);
        eb eb2 = fcq_0.a(byArray3);
        wt_2 wt_22 = new wt_2();
        wt_22.b(byteBuffer);
        fcz_0 fcz_02 = fcz_0.a(fcu_02);
        fcz_02.b(wt_22);
        return new fcq_0(fcu_02, n, l, Cz.a(byArray), s2, by, l2, Cz.a(byArray2), n2, f2, eb2, fcz_02);
    }

    public int e() {
        byte[] byArray = Cz.a(this.f());
        byte[] byArray2 = Cz.a(this.j());
        wt_2 wt_22 = new wt_2();
        this.m.a(wt_22);
        return 22 + byArray.length + 2 + 1 + 8 + 2 + byArray2.length + 4 + 4 + 2 + this.g.getSerializedSize() + wt_22.b();
    }
}

