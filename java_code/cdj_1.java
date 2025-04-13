/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.assistedinject.Assisted
 *  javax.inject.Inject
 */
import com.google.inject.assistedinject.Assisted;
import java.nio.ByteBuffer;
import javax.inject.Inject;

/*
 * Renamed from cdj
 */
public class cdj_1
extends esd_1<cdl_1> {
    private static int a = 0;
    private int b;

    @Inject
    public cdj_1(@Assisted(value="uid") long l, @Assisted(value="id") int n, @Assisted(value="itemId") int n2, @Assisted(value="cellX") short s2, @Assisted(value="cellY") short s3) {
        super(cdm_1.a, l, n, n2, s2, s3);
    }

    public cdj_1(ese_1 ese_12) {
        super(cdm_1.a, ese_12);
    }

    public cdj_1(short s2, int n, int n2) {
        this(--a, s2, 0, (short)n, (short)n2);
    }

    public int a() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public static esd_1 a(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        short s2 = byteBuffer.getShort();
        int n = byteBuffer.getInt();
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        return new cdj_1(l, s2, n, s3, s4);
    }
}

