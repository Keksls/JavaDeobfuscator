/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bIx
 */
public class bix_1
extends big_1 {
    private static final Logger a = Logger.getLogger(bix_1.class);
    private long g;
    private aff_1 h;

    public bix_1(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
        this.g = Long.parseLong(stringArray[0]);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        return bgp_1.a(this.g, exk_22, this::a);
    }

    public void a(long l, aff_1 aff_12) {
        this.h = aff_12;
        this.a(l);
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(this.h.d());
        byteBuffer.putInt(this.h.e());
        byteBuffer.putShort(this.h.f());
        return true;
    }

    @Override
    public int b() {
        return super.b() + 4 + 4 + 2;
    }

    @Override
    public void c() {
        this.h = null;
    }

    @Override
    public eyx_1 f() {
        return eyx_1.c;
    }

    public long g() {
        return this.g;
    }
}

